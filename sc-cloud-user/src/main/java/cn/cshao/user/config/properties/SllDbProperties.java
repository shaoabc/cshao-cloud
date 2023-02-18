package cn.cshao.user.config.properties;

import lombok.Data;
import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.stereotype.Component;

/**
 * @author cshao
 * @desc
 * @company
 * @create 2023-02-18 12:09 上午
 */
@Data
@Component
@ConfigurationProperties(prefix = "spring.datasource.slldb")
public class SllDbProperties {
    private String url;
    private String username;
    private String password;
    private String driverClass;
    private String filters;
    private Integer initialSize;
    private Integer maxActive;
    private Long maxWait;
}
