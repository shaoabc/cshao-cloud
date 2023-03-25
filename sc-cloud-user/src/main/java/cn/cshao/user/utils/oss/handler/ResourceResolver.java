package cn.cshao.user.utils.oss.handler;

import cn.cshao.common.dao.slldb.SllImagesMapper;
import cn.cshao.common.model.slldb.SllImages;
import cn.cshao.common.model.slldb.SllImagesExample;
import cn.cshao.user.utils.oss.base.ResResolver;
import cn.cshao.user.utils.oss.entity.ResourceURI;
import cs.cshao.common.exc.UserException;
import org.apache.commons.collections4.CollectionUtils;
import org.apache.commons.lang3.StringUtils;
import org.springframework.beans.BeansException;
import org.springframework.beans.factory.config.BeanPostProcessor;
import org.springframework.stereotype.Component;
import org.springframework.util.Assert;

import javax.annotation.Resource;
import java.lang.reflect.Proxy;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import java.util.concurrent.atomic.AtomicInteger;
import java.util.stream.Collectors;

/**
 * @Desc 资源处理器
 * @Author hub5
 * @Date 2022/11/17 17:11
 **/
@Component
public class ResourceResolver implements ResResolver, BeanPostProcessor {

    @Resource
    private SllImagesMapper imagesMapper;

    @Resource
    private OssUploadClient client;

    // ==========================工具化设置==========================
    private static ResResolver proxy = null;

    public static final void init(ResourceResolver resolver) {
        Assert.notNull(resolver, "ResourceResolver not been populated already !!!");
        proxy = (ResResolver) Proxy.newProxyInstance(
                resolver.getClass().getClassLoader(),
                resolver.getClass().getInterfaces(), new ResResolverProxy(resolver));
    }

    static ResResolver getProxy() {
        Assert.notNull(proxy, "ResourceResolver proxy could not be null !!!");
        return proxy;
    }


    public static ResResolver resolver() {
        return ResourceResolver.getProxy();
    }


    @Override
    public Object postProcessAfterInitialization(Object bean, String beanName) throws BeansException {
        if (null == ResourceResolver.proxy) {
            ResourceResolver.init(this);
        }
        return bean;
    }

    @Override
    public ResourceURI getResourceURI(String resNo) {
        if (StringUtils.isBlank(resNo)) {
            throw new UserException("资源ID不能为空");
        }
        return this.client.getFileResourceURI(resNo);
    }

    @Override
    public List<ResourceURI> getResURIList(String srcNo) {
        if (StringUtils.isBlank(srcNo)) {
            throw new UserException("来源ID不能为空");
        }
        SllImagesExample example = new SllImagesExample();
        example.setOrderByClause("src_ord");
        example.createCriteria().andSrcNoEqualTo(srcNo);
        List<SllImages> images = imagesMapper.selectByExample(example);
        if (CollectionUtils.isNotEmpty(images)) {
            return this.client.queryFiles(images);
        }
        return new ArrayList<>(0);
    }

    @Override
    public Boolean saveOrUpdateResList(List<String> orderedResNoList, String srcNo) {
        if (StringUtils.isBlank(srcNo)) {
            throw new UserException("来源ID不能为空");
        }
        SllImagesExample example = new SllImagesExample();
        example.createCriteria().andSrcNoEqualTo(srcNo);
        List<SllImages> origImages = imagesMapper.selectByExample(example);
        if (CollectionUtils.isEmpty(origImages)) { // 没有业务历史关联资源
            if (CollectionUtils.isNotEmpty(orderedResNoList)) { // 为空说明为新资源
                List<Long> resNoLongList = orderedResNoList.stream()
                        .map(stringResNo -> {
                            return Long.parseLong(stringResNo);
                        }).collect(Collectors.toList());
                example.clear();
                example.createCriteria().andResNoIn(resNoLongList);
                // 查前端上传的资源
                List<SllImages> newImages = imagesMapper.selectByExample(example);
                if (CollectionUtils.isEmpty(newImages)
                        || orderedResNoList.size() != newImages.size()) {
                    throw new UserException("传入资源与实际上传资源不一致，into size:"
                            + orderedResNoList.size()
                            + " , actual size:" + newImages.size());
                } else {
                    AtomicInteger count = new AtomicInteger(); // 排序计数
                    newImages.forEach(img -> {
                        img.setSrcNo(srcNo);
                        img.setSrcOrd(count.addAndGet(1));
                        img.setUpdateTime(new Date());
                        this.imagesMapper.updateByPrimaryKeySelective(img);
                    });
                }
            }
        } else { // 有业务历史关联资源
            if (CollectionUtils.isEmpty(orderedResNoList)) {
                // 表示需要清除业务历史关联资源
                this.client.deleteFileBySrcNo(srcNo);
            } else {
                // 表示需要重新整理历史关联资源和新资源
                List<Long> resNoLongList = orderedResNoList.stream()
                        .map(stringResNo -> {
                            return Long.parseLong(stringResNo);
                        }).collect(Collectors.toList());
                example.clear();
                example.createCriteria().andResNoIn(resNoLongList);
                // 查前端传入的混合资源
                List<SllImages> mixImages = imagesMapper.selectByExample(example);
                if (CollectionUtils.isEmpty(mixImages)
                        || orderedResNoList.size() != mixImages.size()) {
                    throw new UserException("传入资源与实际上传资源不一致，into size:"
                            + orderedResNoList.size()
                            + " , actual size:" + mixImages.size());
                } else {
                    origImages.forEach(img -> { // 清除已废弃的资源
                        if (!resNoLongList.contains(img.getResNo())) {
                            this.client.deleteFileByResNo(img.getResNo());
                        }
                    });
                    // 重新关联混合资源给业务来源
                    AtomicInteger count = new AtomicInteger(); // 排序计数
                    mixImages.forEach(img -> {
                        img.setSrcNo(srcNo);
                        img.setSrcOrd(count.addAndGet(1));
                        img.setUpdateTime(new Date());
                        this.imagesMapper.updateByPrimaryKeySelective(img);
                    });
                }
            }
        }
        return true;
    }

    @Override
    public int deleteResBySrcNo(String srcNo) {
        if (StringUtils.isBlank(srcNo)) {
            throw new UserException("来源ID不能为空");
        }
        return this.client.deleteFileBySrcNo(srcNo);
    }

    @Override
    public int deleteResBySrcNoList(List<String> srcNoList) {
        if (CollectionUtils.isNotEmpty(srcNoList)) {
            return this.client.deleteFileBySrcNoList(srcNoList);
        }
        return 0;
    }
}