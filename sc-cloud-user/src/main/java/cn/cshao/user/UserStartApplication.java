package cn.cshao.user;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
import org.springframework.cloud.openfeign.EnableFeignClients;
import org.springframework.scheduling.annotation.EnableScheduling;
import org.springframework.transaction.annotation.EnableTransactionManagement;

/**
 * @author cshao
 * @desc
 * @company
 * @create 2023-02-18 4:45 下午
 */
@SpringBootApplication
@EnableTransactionManagement
@EnableScheduling
@EnableFeignClients
@EnableDiscoveryClient
public class UserStartApplication {
    public static void main(String[] args) {
        SpringApplication.run(UserStartApplication.class, args);
    }
}
