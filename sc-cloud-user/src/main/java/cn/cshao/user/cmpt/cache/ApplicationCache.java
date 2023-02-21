package cn.cshao.user.cmpt.cache;

import cn.cshao.common.model.hsdb.HsDistrict;
import cn.cshao.user.feign.IGenericDataFeign;
import cn.cshao.user.utils.cache.base.AppCache;
import cn.cshao.user.utils.cache.proxy.AppCacheProxy;
import cn.cshao.user.vo.data.HospIdMapVO;
import cs.cshao.common.bean.RestResult;
import cs.cshao.common.exc.UserException;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.BeansException;
import org.springframework.beans.factory.config.BeanPostProcessor;
import org.springframework.boot.ApplicationArguments;
import org.springframework.boot.ApplicationRunner;
import org.springframework.stereotype.Component;
import org.springframework.util.Assert;

import javax.annotation.Resource;
import java.io.Serializable;
import java.lang.reflect.Proxy;
import java.util.List;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;

/**
 * @author shaochen
 * desc 医院和地区信息存进缓存
 */
@Component
@Slf4j
public class ApplicationCache<T> implements ApplicationRunner, BeanPostProcessor, AppCache, Serializable {
    private static final long serialVersionUID = 4894602650356040981L;
    private Map<String, Object> container = new ConcurrentHashMap<>();
    private static AppCache proxy = null;

    @Resource
    private IGenericDataFeign dataFeign;

    @Override
    public void run(ApplicationArguments args) throws Exception {
        List<HsDistrict> distRestResult = dataFeign.pullDistrict();
        List<HsDistrict> districts = null;
        if (null != distRestResult ) {
            districts = distRestResult ;
            log.info("distRestResult-size:{}", districts.size());
            container.put(AppCache.DISTRICT, districts);
        }

        RestResult<Map<String, HospIdMapVO>> hospRestResult = dataFeign.pullMapHospital();
        Map<String, HospIdMapVO> hospIdMap = null;
        if (null != hospRestResult && null != (hospIdMap = hospRestResult.getData())) {
            log.info("hospRestResult-size:{}", hospIdMap.size());
            container.put(AppCache.HOSPITAL, hospIdMap);
        }
    }

    @Override
    public Object postProcessAfterInitialization(Object bean, String beanName) throws BeansException {
        if (null == ApplicationCache.proxy) {
            ApplicationCache.init(this);
        }
        return bean;
    }

    public static final void init(ApplicationCache cache) {
        Assert.notNull(cache, "ApplicationCache not been populated already !!!");
        proxy = (AppCache) Proxy.newProxyInstance(
                cache.getClass().getClassLoader(),
                cache.getClass().getInterfaces(), new AppCacheProxy(cache));
    }

    static AppCache getProxy() {
        Assert.notNull(proxy, "ApplicationCache proxy could not be null !!!");
        return proxy;
    }

    public static AppCache builder() {
        return ApplicationCache.getProxy();
    }

    @Override
    public T getCache(String cacheId) {
        Object cache = container.get(cacheId);
        if (null == cache) {
            throw new UserException("缓存为空！");
        }
        return (T) cache;
    }

}
