package cn.cshao.manage.config.properties;

import lombok.Data;
import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.stereotype.Component;

import java.io.Serializable;

/**
 * @author cshao
 * @desc
 * @company
 * @create 2023-02-17 6:54 下午
 */
@Data
@Component
@ConfigurationProperties(prefix = "spring.datasource.hsdb")
public class HsDbProperties implements Serializable {
    private String url;
    private String username;
    private String password;
    private String driverClass;
    private String filters;
    private Integer initialSize;
    private Integer maxActive;
    private Long maxWait;
}
