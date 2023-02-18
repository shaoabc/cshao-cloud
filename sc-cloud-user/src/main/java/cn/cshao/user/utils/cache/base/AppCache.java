package cn.cshao.user.utils.cache.base;

public interface AppCache<T> {

    final String DISTRICT = "district";

    final String SECTION = "section";

    final String HOSPITAL = "hospital";

    T getCache(String cacheId);

}
