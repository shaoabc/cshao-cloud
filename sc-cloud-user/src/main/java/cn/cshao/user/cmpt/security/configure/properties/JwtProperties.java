package cn.cshao.user.cmpt.security.configure.properties;

import lombok.Data;
import org.springframework.boot.context.properties.ConfigurationProperties;

/**
 * @fileName: JwtProperties
 * @description: Jwt参数配置
 * @author: 李阳
 * @create: 2020-04-27 22:42
 **/
@Data
@ConfigurationProperties("jwt")
public class JwtProperties {

    /**
     * 验证Token请求头
     */
    private String header = "Authorization";

    /**
     * token密钥
     **/
    private String tokenSecret = "b9e01a7f087f34d4f02c0a324f06bfb";

    /**
     * token有效期半小时
     */
    private Long expiration = 1800L;

    /**
     * Token头
     */
    private String tokenPrefix = "Bearer ";

    /**
     * 客户端Token头
     */
    private String clientTokenHead="Basic ";
}
