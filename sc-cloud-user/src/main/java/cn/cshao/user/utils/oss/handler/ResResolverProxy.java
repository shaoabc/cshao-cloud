package cn.cshao.user.utils.oss.handler;

import lombok.extern.slf4j.Slf4j;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;
import java.util.Arrays;

/**
 * @Desc 资源处理代理
 * @Author cshao
 * @Date
 **/
@Slf4j
public class ResResolverProxy implements InvocationHandler {

    private ResourceResolver resolver;

    public ResResolverProxy(ResourceResolver resolver) {
        this.resolver = resolver;
    }

    @Override
    public Object invoke(Object o, Method method, Object[] objects) throws Throwable {
        this.doBefore(method, objects);
        Object handleResult = null;
        try {
            handleResult = method.invoke(this.resolver, objects);
        } catch (Throwable throwable) {
            log.error("resolver operate ERROR : {}", throwable.getMessage());
        }
        return handleResult;
    }

    private void doBefore(Method method, Object[] objects) {
        log.info("resolver operate INFO : method = {},params = {}", method.getName(), Arrays.toString(objects));
    }

}