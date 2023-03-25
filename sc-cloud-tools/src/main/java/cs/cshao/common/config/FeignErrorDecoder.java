package cs.cshao.common.config;

import cs.cshao.common.exc.SystemException;
import feign.Response;
import feign.Util;
import feign.codec.ErrorDecoder;
import lombok.extern.slf4j.Slf4j;
import org.springframework.context.annotation.Configuration;

import java.io.IOException;

/**
 * @Desc: 自定义错误解码器
 * @Author: hub5
 * @Date: 2022/8/19 22:54
 **/
@Slf4j
@Configuration
public class FeignErrorDecoder implements ErrorDecoder {
    @Override
    public Exception decode(String s, Response response) {
        try {
            if (response.body() != null) {
                String errorContent = Util.toString(response.body().asReader());
                throw new SystemException(errorContent);
            }
        } catch (IOException e) {
            log.error("FeignErrorDecoder decode exception:{}.", e);
            return e;
        }
        return new Exception("服务端未知异常！");
    }
}
