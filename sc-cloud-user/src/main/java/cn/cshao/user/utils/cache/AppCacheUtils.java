package cn.cshao.user.utils.cache;


import cn.cshao.user.cmpt.cache.ApplicationCache;

/**
 * @author shaochen
 * 缓存工具类
 */
public class AppCacheUtils {

    public static <T> T getCache(String cacheId) {
        return (T) ApplicationCache.builder().getCache(cacheId);
    }

}
