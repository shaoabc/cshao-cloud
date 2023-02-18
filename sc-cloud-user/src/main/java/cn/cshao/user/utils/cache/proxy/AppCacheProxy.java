package cn.cshao.user.utils.cache.proxy;

import cn.cshao.user.cmpt.cache.ApplicationCache;
import lombok.extern.slf4j.Slf4j;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;
import java.util.Arrays;

@Slf4j
public class AppCacheProxy implements InvocationHandler {

    private ApplicationCache cache;

    public AppCacheProxy(ApplicationCache cache) {
        this.cache = cache;
    }

    @Override
    public Object invoke(Object o, Method method, Object[] objects) throws Throwable {
        this.doBefore(method, objects);
        Object handleResult = null;
        try {
            handleResult = method.invoke(this.cache, objects);
        } catch (Throwable throwable) {
            log.error("cache operate ERROR : {}", throwable.getMessage());
        }
        return handleResult;
    }

    private void doBefore(Method method, Object[] objects) {
        log.info("cache operate INFO : method = {},params = {}", method.getName(), Arrays.toString(objects));
    }

}
