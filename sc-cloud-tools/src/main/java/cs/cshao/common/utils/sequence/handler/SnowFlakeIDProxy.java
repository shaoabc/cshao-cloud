package cs.cshao.common.utils.sequence.handler;

import lombok.extern.slf4j.Slf4j;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;
import java.util.Arrays;

/**
 * @Desc 代理类
 * @Author cshao
 * @Date 2022/11/17 9:37
 **/
@Slf4j
public class SnowFlakeIDProxy implements InvocationHandler {

    private SnowFlakeIDWorker snowFlakeIDWorker;

    public SnowFlakeIDProxy(SnowFlakeIDWorker snowFlakeIDWorker) {
        this.snowFlakeIDWorker = snowFlakeIDWorker;
    }

    @Override
    public Object invoke(Object o, Method method, Object[] objects) throws Throwable {
        this.doBefore(method, objects);
        Object handleResult = null;
        try {
            handleResult = method.invoke(this.snowFlakeIDWorker, objects);
        } catch (Throwable throwable) {
            log.error("idWorker operate ERROR : {}", throwable.getMessage());
        }
        return handleResult;
    }

    private void doBefore(Method method, Object[] objects) {
        log.info("idWorker operate INFO : method = {},params = {}", method.getName(), Arrays.toString(objects));
    }

    public String generateId(String prefix) {
        return snowFlakeIDWorker.generateId(prefix);
    }

}