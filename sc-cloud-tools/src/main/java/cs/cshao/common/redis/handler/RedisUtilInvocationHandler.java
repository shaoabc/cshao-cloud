package cs.cshao.common.redis.handler;

import cs.cshao.common.redis.template.IRedisBaseTemplate;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;
import java.util.Arrays;

/**
 * Redis 操作统一日志处理
 */
public class RedisUtilInvocationHandler implements InvocationHandler {

    private static final Logger LOGGER = LoggerFactory.getLogger(RedisUtilInvocationHandler.class);

    private IRedisBaseTemplate redisBaseTemplate;

    public RedisUtilInvocationHandler(IRedisBaseTemplate redisBaseTemplate) {
        this.redisBaseTemplate = redisBaseTemplate;
    }

    @Override
    public Object invoke(Object proxy, Method method, Object[] args) {

        this.doBefore(method, args);
        Object handleResult = null;
        try {
            handleResult = method.invoke(this.redisBaseTemplate, args);
        } catch (Throwable throwable) {
            LOGGER.error("Redis operate ERROR : {}", throwable.getMessage());
        }
        return handleResult;
    }

    private void doBefore(Method method, Object[] args) {
        LOGGER.debug("Redis operate INFO : method = {},params = {}", method.getName(), Arrays.toString(args));
    }

}