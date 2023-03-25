package cs.cshao.common.config;

import cs.cshao.common.utils.sequence.handler.SnowFlakeIDWorker;
import lombok.extern.slf4j.Slf4j;
import org.apache.commons.lang3.RandomUtils;
import org.apache.commons.lang3.StringUtils;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Primary;

import java.net.Inet4Address;
import java.net.UnknownHostException;

/**
 * @Desc: 分布式系统获取dataCenterId和workerId来做区分
 * @Author: hub5
 * @Date: 2022/9/8 10:43
 **/
@Configuration
@Slf4j
public class IDWorkerConfigure {

    @Value("${spring.application.name}")
    private String dataCenterId;

    @Bean
    @Primary
    public SnowFlakeIDWorker idWorker() {
        return new SnowFlakeIDWorker(getWorkFromConfig(), getDataFromConfig());
    }

    private Long getWorkFromConfig() {
        return getWorkId();
    }

    private Long getDataFromConfig() {
        return getDataCenterId();
    }

    private Long getWorkId() {
        try {
            String hostAddress = Inet4Address.getLocalHost().getHostAddress();
            int[] ints = StringUtils.toCodePoints(hostAddress);
            int sums = 0;
            for (int b : ints) {
                sums += b;
            }
            return (long) (sums % 32);
        } catch (UnknownHostException e) {
            // 如果获取失败，则使用随机数备用
            return RandomUtils.nextLong(0, 31);
        }
    }

    private Long getDataCenterId() {
        try {
            int[] ints = StringUtils.toCodePoints(dataCenterId);
            int sums = 0;
            for (int i : ints) {
                sums += i;
            }
            return (long) (sums % 32);
        } catch (Exception e) {
            // 如果获取失败，则使用随机数备用
            return RandomUtils.nextLong(0, 31);
        }
    }

}

