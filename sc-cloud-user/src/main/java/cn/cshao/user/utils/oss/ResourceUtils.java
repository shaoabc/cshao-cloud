package cn.cshao.user.utils.oss;


import cn.cshao.user.utils.oss.entity.ResourceURI;
import cn.cshao.user.utils.oss.handler.ResourceResolver;

import java.util.List;

/**
 * 提取工具类
 * @author cshao
 */
public class ResourceUtils {

    /**
     * @Desc 根据资源ID查询资源
     * @Author cshao
     * @Date 2022/11/17 18:01
     **/
    public static ResourceURI getResourceURI(String resNo) {
        return ResourceResolver.resolver().getResourceURI(resNo);
    }

    /**
     * @Desc 根据来源ID查询所有资源
     * @Author cshao
     * @Date 2022/11/17 18:01
     **/
    public static List<ResourceURI> getResURIList(String srcNo) {
        return ResourceResolver.resolver().getResURIList(srcNo);
    }

    /**
     * @Desc 保存或更新资源到来源下
     * @Author cshao
     * @Date 2022/11/17 18:01
     **/
    public static Boolean saveOrUpdateResList(List<String> orderedResNoList, String srcNo) {
        return ResourceResolver.resolver().saveOrUpdateResList(orderedResNoList, srcNo);
    }

    /**
     * @Desc 根据来源ID删除来源下所有资源
     * @Author cshao
     * @Date 2022/12/1 10:42
     **/
    public static int deleteResBySrcNo(String srcNo) {
        return ResourceResolver.resolver().deleteResBySrcNo(srcNo);
    }

    /**
     * @Desc 根据来源ID删除来源下所有资源
     * @Author cshao
     * @Date 2022/12/1 10:42
     **/
    public static int deleteResBySrcNoList(List<String> srcNoList) {
        return ResourceResolver.resolver().deleteResBySrcNoList(srcNoList);
    }

}
