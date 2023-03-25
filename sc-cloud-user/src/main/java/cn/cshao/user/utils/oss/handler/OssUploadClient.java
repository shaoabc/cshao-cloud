package cn.cshao.user.utils.oss.handler;

import cn.cshao.common.dao.slldb.SllImagesMapper;
import cn.cshao.common.model.slldb.SllImages;
import cn.cshao.common.model.slldb.SllImagesExample;
import cn.cshao.user.utils.oss.entity.OssProperties;
import cn.cshao.user.utils.oss.entity.ResourceURI;
import com.aliyun.oss.ClientException;
import com.aliyun.oss.OSS;
import com.aliyun.oss.OSSClientBuilder;
import com.aliyun.oss.OSSException;
import com.aliyun.oss.model.DeleteObjectsRequest;
import com.aliyun.oss.model.ObjectMetadata;
import com.aliyun.oss.model.PutObjectResult;
import cs.cshao.common.exc.UserException;
import cs.cshao.common.utils.sequence.SnowFlakeIDUtils;
import lombok.AllArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.apache.commons.collections4.CollectionUtils;
import org.apache.commons.lang3.StringUtils;
import org.springframework.stereotype.Component;
import org.springframework.web.multipart.MultipartFile;

import javax.annotation.Resource;
import java.io.IOException;
import java.io.InputStream;
import java.net.URL;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;

/**
 * @Desc 文件上传组件
 * @Author cshao
 * @Date
 * @Return {@link }
 **/
@Component
@AllArgsConstructor
@Slf4j
public class OssUploadClient {

    @Resource
    private OssProperties ossProperties;

    @Resource
    private SllImagesMapper imagesMapper;
    /**
     * @Desc 无目录上传
     * @Author cshao
     * @Date 2022/4/24 21:21
     * @Return {@link }
     **/
    public Long fileUpload(MultipartFile file)  throws IOException {
        return this.fileUpload(file, null);
    }

    /**
     * @Desc 指定目录上传
     * @Author cshao
     * @Date 2022/4/24 21:21
     * @Return {@link }
     **/
    public Long fileUpload(MultipartFile file, String dir) {
        if (file.getSize() > 1024 * 1024 * 20) {
            throw new UserException("限制文件大小20M以内");
        }
        String origName = file.getOriginalFilename();
        log.info("fileUpload-fileSize:{}, origName:{}"
                , file.getSize(), origName);
        assert origName != null;
        int index = StringUtils.lastIndexOf(origName, ".");
        // 过滤上传文件类型
        String postfix = origName.substring(index).toLowerCase();
        if (StringUtils.isBlank(getContentType(postfix))) {
            throw new UserException("未知的文件类型,上传中断");
        }
        // 生成唯一长整型编码
        Long fileName = SnowFlakeIDUtils.nextLongId();
        String fileCtl = StringUtils.isNotBlank(dir)
                ? (dir.endsWith("/") ? dir : (dir + "/"))
                : StringUtils.EMPTY;
        // oss桶bucketKey
        String bucketKey = fileCtl + fileName + postfix;
        // 获取ossClient
        OSS ossClient = new OSSClientBuilder().build(
                ossProperties.getEndpoint(),
                ossProperties.getAccessKeyId(),
                ossProperties.getAccessKeySecret()
        );
        InputStream inStream = null;
        try {
            inStream = file.getInputStream();
            ObjectMetadata metadata = new ObjectMetadata();
            metadata.setContentLength(inStream.available());
            metadata.setCacheControl("no-cache");
            metadata.setHeader("Pragma", "no-cache");
            PutObjectResult result = ossClient.putObject(
                    ossProperties.getBucketName(),
                    bucketKey, inStream, metadata);
            // 该值不为空并且不发生异常则表示上传成功
            if (null != result.getETag()) {
                // 文件上传记录到images表里，方便后续管理
                SllImages image = new SllImages();
                image.setResNo(fileName);
                image.setResCtl(fileCtl);
                image.setResExt(postfix);
                image.setCreateTime(new Date());
                this.imagesMapper.insert(image);
            }
        } catch (IOException var1) {
            log.error("IOException-fileUpload-error:{}", var1.getMessage());
            throw new UserException("文件上传失败，原因：" + var1.getMessage());
        } catch (OSSException var2) {
            log.error("OSSException-fileUpload-error:{}", var2.getMessage());
            throw new UserException("文件上传失败，原因：" + var2.getMessage());
        } catch (ClientException var3) {
            log.error("ClientException-fileUpload-error:{}", var3.getMessage());
            throw new UserException("文件上传失败，原因：" + var3.getMessage());
        } finally {
            try {
                if (null != inStream) {
                    inStream.close();
                }
            } catch (IOException e) {
                e.printStackTrace();
            }
            try {
                if (null != ossClient) {
                    ossClient.shutdown();
                }
            } catch (Exception e) {
                e.printStackTrace();
            }
        }
        return fileName;
    }

    /**
     * @Desc 根据资源ID查看文件
     * @Author cshao
     * @Date 2022/4/24 21:21
     * @Return {@link }
     **/
    public String queryFile(Long resNo) {
        SllImages image = Optional.ofNullable(this
                        .imagesMapper.selectByPrimaryKey(resNo))
                .orElseThrow(() -> new UserException("资源ID不能为空"));
        if (null != image) {
            String resCtl = Optional.of(image)
                    .map(SllImages::getResCtl)
                    .orElse(StringUtils.EMPTY);
            String resExt = Optional.of(image)
                    .map(SllImages::getResExt)
                    .orElse(StringUtils.EMPTY);
            String bucketKey = resCtl + resNo + resExt;
            return this.getResourceURL(bucketKey).toString();
        }
        return null;
    }

    /**
     * @Desc 获取资源列表
     * @Author cshao
     * @Date 2023/2/3 17:22
     **/
    public List<ResourceURI> queryFiles(List<SllImages> dbImages) {
        if (CollectionUtils.isNotEmpty(dbImages)) {
            return dbImages.stream().map(dbImg -> {
                String resCtl = Optional.of(dbImg)
                        .map(SllImages::getResCtl)
                        .orElse(StringUtils.EMPTY);
                String resExt = Optional.of(dbImg)
                        .map(SllImages::getResExt)
                        .orElse(StringUtils.EMPTY);
                String bucketKey = resCtl + dbImg.getResNo() + resExt;
                return new ResourceURI(
                        dbImg.getResNo().toString(),
                        this.getResourceURL(bucketKey).toString(),
                        dbImg.getResExt(), dbImg.getSrcOrd());
            }).collect(Collectors.toList());
        }
        return new ArrayList<>(0);
    }

    /**
     * @Desc 根据资源ID查看资源
     * @Author cshao
     * @Date 2022/4/24 21:21
     * @Return {@link }
     **/
    public ResourceURI getFileResourceURI(String resNo) {
        return Optional.ofNullable(resNo).map(id -> {
            SllImages image = Optional.ofNullable(this.imagesMapper
                            .selectByPrimaryKey(Long.parseLong(id)))
                    .orElseThrow(() -> new UserException("资源记录已消失"));
            String resCtl = Optional.of(image)
                    .map(SllImages::getResCtl)
                    .orElse(StringUtils.EMPTY);
            String resExt = Optional.of(image)
                    .map(SllImages::getResExt)
                    .orElse(StringUtils.EMPTY);
            String bucketKey = resCtl + id + resExt;
            String resURI = this.getResourceURL(bucketKey).toString();
            return new ResourceURI(id, resURI, resExt,image.getSrcOrd());
        }).orElse(null);
    }

    /**
     * @Desc 根据资源唯一标识删除文件
     * @Author cshao
     * @Date 2022/4/24 14:53
     * @Return {@link }
     **/
    public int deleteFileByResNo(Long resNo) {
        SllImages image = Optional.ofNullable(resNo)
                .map(id -> this.imagesMapper.selectByPrimaryKey(id))
                .orElseThrow(() -> new UserException("资源ID不能为空"));
        if (null != image) {
            String resCtl = Optional.of(image)
                    .map(SllImages::getResCtl)
                    .orElse(StringUtils.EMPTY);
            String resExt = Optional.of(image)
                    .map(SllImages::getResExt)
                    .orElse(StringUtils.EMPTY);
            String bucketKey = resCtl + resNo + resExt;
            OSS ossClient = new OSSClientBuilder().build(
                    ossProperties.getEndpoint(),
                    ossProperties.getAccessKeyId(),
                    ossProperties.getAccessKeySecret());
            try {
                ossClient.deleteObject(ossProperties.getBucketName(), bucketKey);
            } catch (OSSException var2) {
                log.error("OSSException-deleteFileByResNo-errMsg:{}"
                        , var2.getMessage());
                throw new UserException("文件删除失败，原因：" + var2.getMessage());
            } catch (ClientException var3) {
                log.error("ClientException-deleteFileByResNo-errMsg:{}"
                        , var3.getMessage());
                throw new UserException("文件删除失败，原因：" + var3.getMessage());
            } finally {
                try {
                    if (null != ossClient) {
                        ossClient.shutdown();
                    }
                } catch (Exception var4) {
                    log.error("CloseException-deleteFileByResNo-errMsg:{}"
                            , var4.getMessage());
                }
            }
            // 删除images表记录
            return this.imagesMapper.deleteByPrimaryKey(resNo);
        }
        return 0;
    }

    /**
     * @Desc 按上传记录列表删除
     * @Author cshao
     * @Date 2022/5/2 18:36
     * @Return {@link }
     **/
    public int deleteFileByImages(List<SllImages> deleteImages) {
        if (CollectionUtils.isNotEmpty(deleteImages)) {
            List<String> bucketKeys = deleteImages.stream().map(img -> {
                String resCtl = Optional.ofNullable(img)
                        .map(SllImages::getResCtl).orElse(StringUtils.EMPTY);
                String resExt = Optional.ofNullable(img)
                        .map(SllImages::getResExt).orElse(StringUtils.EMPTY);
                return resCtl + Optional.ofNullable(img.getResNo())
                        .orElseThrow(() -> new UserException("资源ID不能为空"))
                        + resExt;
            }).distinct().collect(Collectors.toList());
            // 执行删除oss文件
            OSS ossClient = new OSSClientBuilder().build(
                    ossProperties.getEndpoint(),
                    ossProperties.getAccessKeyId(),
                    ossProperties.getAccessKeySecret());
            try {
                DeleteObjectsRequest request = new DeleteObjectsRequest(
                        ossProperties.getBucketName()).withKeys(bucketKeys);
                ossClient.deleteObjects(request);
            } catch (OSSException var2) {
                log.error("OSSException-deleteFileByImages-errMsg:{}"
                        , var2.getMessage());
                throw new UserException("文件删除失败，原因：" + var2.getMessage());
            } catch (ClientException var3) {
                log.error("ClientException-deleteFileByImages-errMsg:{}"
                        , var3.getMessage());
                throw new UserException("文件删除失败，原因：" + var3.getMessage());
            } finally {
                try {
                    if (null != ossClient) {
                        ossClient.shutdown();
                    }
                } catch (Exception var4) {
                    log.error("CloseException-deleteFileByResNo-errMsg:{}"
                            , var4.getMessage());
                }
            }
            // 再执行删除images表记录
            deleteImages.forEach(img -> {
                this.imagesMapper.deleteByPrimaryKey(img.getResNo());
            });
            return deleteImages.size();
        }
        return 0;
    }

    /**
     * @Desc 按来源标识列表删除
     * @Author cshao
     * @Date 2022/5/2 18:36
     * @Return {@link }
     **/
    public int deleteFileBySrcNoList(List<String> srcNoList) {
        if (CollectionUtils.isNotEmpty(srcNoList)) {
            SllImagesExample example = new SllImagesExample();
            example.createCriteria().andSrcNoIn(srcNoList);
            List<SllImages> deleteImages = this.imagesMapper.selectByExample(example);
            if (CollectionUtils.isNotEmpty(deleteImages)) {
                List<String> bucketKeys = deleteImages.stream().map(img -> {
                    String resCtl = Optional.ofNullable(img)
                            .map(SllImages::getResCtl).orElse(StringUtils.EMPTY);
                    String resExt = Optional.ofNullable(img)
                            .map(SllImages::getResExt).orElse(StringUtils.EMPTY);
                    return resCtl + img.getResNo() + resExt;
                }).collect(Collectors.toList());
                // 执行删除oss文件
                OSS ossClient = new OSSClientBuilder().build(
                        ossProperties.getEndpoint(),
                        ossProperties.getAccessKeyId(),
                        ossProperties.getAccessKeySecret());
                try {
                    DeleteObjectsRequest request = new DeleteObjectsRequest(
                            ossProperties.getBucketName()).withKeys(bucketKeys);
                    ossClient.deleteObjects(request);
                } catch (OSSException var2) {
                    log.error("OSSException-deleteFileBySrcNoList-errMsg:{}"
                            , var2.getMessage());
                    throw new UserException("文件删除失败，原因：" + var2.getMessage());
                } catch (ClientException var3) {
                    log.error("ClientException-deleteFileBySrcNoList-errMsg:{}"
                            , var3.getMessage());
                    throw new UserException("文件删除失败，原因：" + var3.getMessage());
                } finally {
                    try {
                        if (null != ossClient) {
                            ossClient.shutdown();
                        }
                    } catch (Exception var4) {
                        log.error("CloseException-deleteFileByResNo-errMsg:{}"
                                , var4.getMessage());
                    }
                }
                // 删除images表记录
                return this.imagesMapper.deleteByExample(example);
            }
        }
        return 0;
    }

    /**
     * @Desc 根据资源来源标识删除文件
     * @Author cshao
     * @Date 2022/4/24 14:53
     * @Return {@link }
     **/
    public int deleteFileBySrcNo(String srcNo) {
        if (StringUtils.isNotBlank(srcNo)) {
            SllImagesExample example = new SllImagesExample();
            example.createCriteria().andSrcNoEqualTo(srcNo);
            List<SllImages> deleteImages = this.imagesMapper.selectByExample(example);
            if (CollectionUtils.isNotEmpty(deleteImages)) {
                List<String> bucketKeys = deleteImages.stream().map(img -> {
                    String resCtl = Optional.ofNullable(img)
                            .map(SllImages::getResCtl).orElse(StringUtils.EMPTY);
                    String resExt = Optional.ofNullable(img)
                            .map(SllImages::getResExt).orElse(StringUtils.EMPTY);
                    return resCtl + img.getResNo() + resExt;
                }).collect(Collectors.toList());
                // 删除云文件系统文件
                OSS ossClient = new OSSClientBuilder().build(
                        ossProperties.getEndpoint(),
                        ossProperties.getAccessKeyId(),
                        ossProperties.getAccessKeySecret());
                try {
                    DeleteObjectsRequest request = new DeleteObjectsRequest(
                            ossProperties.getBucketName()).withKeys(bucketKeys);
                    ossClient.deleteObjects(request);
                } catch (OSSException var2) {
                    log.error("OSSException-deleteFileBySrcNo-errMsg:{}"
                            , var2.getMessage());
                    throw new UserException("文件查询失败，原因：" + var2.getMessage());
                } catch (ClientException var3) {
                    log.error("ClientException-deleteFileBySrcNo-errMsg:{}"
                            , var3.getMessage());
                    throw new UserException("文件查询失败，原因：" + var3.getMessage());
                } finally {
                    try {
                        if (null != ossClient) {
                            ossClient.shutdown();
                        }
                    } catch (Exception var4) {
                        log.error("CloseException-deleteFileByResNo-errMsg:{}"
                                , var4.getMessage());
                    }
                }
                // 删除images表记录
                return this.imagesMapper.deleteByExample(example);
            }
        }
        return 0;
    }

    /**
     * @Desc 获得资源链接
     * @Author cshao
     * @Date 2022/5/2 15:27
     * @Return {@link }
     **/
    public URL getResourceURL(String bucketKey) {
        // 设置URL过期时间为10年  3600l* 1000*24*365*10
        Date expiration = new Date(new Date().getTime() + 3600L * 1000 * 24 * 365 * 10);
        // 生成URL
        OSS ossClient = new OSSClientBuilder().build(
                ossProperties.getEndpoint(),
                ossProperties.getAccessKeyId(),
                ossProperties.getAccessKeySecret());
        try {
            return ossClient.generatePresignedUrl(
                    ossProperties.getBucketName(), bucketKey, expiration);
        } catch (OSSException var2) {
            log.error("OSSException-getResourceURL-errMsg:{}"
                    , var2.getMessage());
            throw new UserException("文件查询失败，原因：" + var2.getMessage());
        } catch (ClientException var3) {
            log.error("ClientException-getResourceURL-errMsg:{}"
                    , var3.getMessage());
            throw new UserException("文件查询失败，原因：" + var3.getMessage());
        } finally {
            try {
                if (null != ossClient) {
                    ossClient.shutdown();
                }
            } catch (Exception var4) {
                log.error("CloseException-deleteFileByResNo-errMsg:{}"
                        , var4.getMessage());
            }
        }
    }

    /**
     * @Desc 处理ContentType
     * @Author cshao
     * @Date 2022/5/2 15:34
     * @Return {@link }
     **/
    public static String getContentType(String FilenameExtension) {
        if (FilenameExtension.equalsIgnoreCase(".bmp")) {
            return "image/bmp";
        }
        if (FilenameExtension.equalsIgnoreCase(".gif")) {
            return "image/gif";
        }
        if (FilenameExtension.equalsIgnoreCase(".jpeg") ||
                FilenameExtension.equalsIgnoreCase(".jpg") ||
                FilenameExtension.equalsIgnoreCase(".png")) {
            return "image/jpeg";
        }
        if (FilenameExtension.equalsIgnoreCase(".html")) {
            return "text/html";
        }
        if (FilenameExtension.equalsIgnoreCase(".txt")) {
            return "text/plain";
        }
        if (FilenameExtension.equalsIgnoreCase(".vsd")) {
            return "application/vnd.visio";
        }
        if (FilenameExtension.equalsIgnoreCase(".pptx") ||
                FilenameExtension.equalsIgnoreCase(".ppt")) {
            return "application/vnd.ms-powerpoint";
        }
        if (FilenameExtension.equalsIgnoreCase(".xls") ||
                FilenameExtension.equalsIgnoreCase(".xlsx")) {
            return "application/vnd.ms-excel";
        }
        if (FilenameExtension.equalsIgnoreCase(".docx") ||
                FilenameExtension.equalsIgnoreCase(".doc")) {
            return "application/msword";
        }
        if (FilenameExtension.equalsIgnoreCase(".xml")) {
            return "text/xml";
        }
        if (FilenameExtension.equalsIgnoreCase(".pdf")) {
            return "application/pdf";
        }
        return "";
    }

}
