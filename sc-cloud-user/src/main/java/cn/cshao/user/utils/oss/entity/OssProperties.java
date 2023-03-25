package cn.cshao.user.utils.oss.entity;

import lombok.Data;
import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.stereotype.Component;
import org.springframework.validation.annotation.Validated;

/**
 * @Desc 获取上传参数
 * @Author cshao
 * @Date
 * @Return {@link }
 **/
@Component
@ConfigurationProperties(prefix = "oss")
@Validated
@Data
public class OssProperties {

    private String endpoint;

    private String accessKeyId;

    private String accessKeySecret;

    private String bucketName;
}
