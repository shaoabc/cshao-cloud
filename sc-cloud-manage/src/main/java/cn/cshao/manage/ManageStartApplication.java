package cn.cshao.manage;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.jdbc.DataSourceAutoConfiguration;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
import org.springframework.cloud.openfeign.EnableFeignClients;
import org.springframework.scheduling.annotation.EnableScheduling;
import org.springframework.transaction.annotation.EnableTransactionManagement;

/**
 * @author cshao
 * @desc
 * @company
 * @create 2023-02-17 6:42 下午
 */
@SpringBootApplication(exclude = DataSourceAutoConfiguration.class)
@EnableTransactionManagement
@EnableScheduling
@EnableFeignClients
@EnableDiscoveryClient
public class ManageStartApplication {
    public static void main(String[] args) {
        SpringApplication.run(ManageStartApplication.class,args);
    }
}
