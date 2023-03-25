package cs.cshao.common.redis;

import cs.cshao.common.redis.handler.RedisUtilInvocationHandler;
import cs.cshao.common.redis.template.*;
import org.springframework.util.Assert;

import java.lang.reflect.Proxy;

/**
 * RedisUtil 工具类
 */
public class RedisUtil {

    // ------------------- Redis template 注入 ------------------- //

    private static IRedisBaseTemplate proxy = null;

    /**
     * @param template
     *
     * @see IRedisBaseTemplate
     */
    public static final void init(IRedisBaseTemplate template) {
        Assert.notNull(template, "RedisBaseTemplate not been populated already !!!");
        proxy = (IRedisBaseTemplate) Proxy.newProxyInstance(template.getClass().getClassLoader(), template.getClass().getInterfaces(),
                                                            new RedisUtilInvocationHandler(template));
    }

    /**
     * 获取RedisBaseTemplate代理类，处理统一操作日志输出、耗时操作警告
     *
     * @return
     */
    static IRedisBaseTemplate getProxy() {
        Assert.notNull(proxy, "RedisBaseTemplate proxy could not be null !!!");
        return proxy;
    }

    /**
     * @Desc 判空加载
     * @Author hub5
     * @Date 2022/11/17 11:30
     **/
    public static Boolean isNull() {
        if (null == proxy) {
            return true;
        }
        return false;
    }

    // ------------------- Redis 操作实例 ------------------- //

    /**
     * 获取Redis Hash 操作实例
     *
     * @return
     */
    public static IRedisHashTemplate hashOps() {
        return RedisUtil.getProxy();
    }

    /**
     * 获取Redis Key 操作实例
     *
     * @return
     */
    public static IRedisKeyTemplate keyOps() {
        return RedisUtil.getProxy();
    }

    /**
     * 获取Redis List 操作实例
     *
     * @return
     */
    public static IRedisListTemplate listOps() {
        return RedisUtil.getProxy();
    }

    /**
     * 获取Redis Set 操作实例
     *
     * @return
     */
    public static IRedisSetTemplate setOps() {
        return RedisUtil.getProxy();
    }

    /**
     * 获取Redis Value 操作实例
     *
     * @return
     */
    public static IRedisValueTemplate valueOps() {
        return RedisUtil.getProxy();
    }

}