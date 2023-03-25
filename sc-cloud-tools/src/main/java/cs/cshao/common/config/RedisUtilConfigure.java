package cs.cshao.common.config;


import cs.cshao.common.redis.template.IRedisBaseTemplate;
import cs.cshao.common.redis.template.PharmaRedisTemplate;
import lombok.extern.slf4j.Slf4j;
import org.springframework.boot.autoconfigure.condition.ConditionalOnMissingBean;
import org.springframework.cache.Cache;
import org.springframework.cache.annotation.CachingConfigurerSupport;
import org.springframework.cache.annotation.EnableCaching;
import org.springframework.cache.interceptor.CacheErrorHandler;
import org.springframework.cache.interceptor.KeyGenerator;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.data.redis.cache.RedisCacheConfiguration;
import org.springframework.data.redis.cache.RedisCacheManager;
import org.springframework.data.redis.cache.RedisCacheWriter;
import org.springframework.data.redis.connection.RedisConnectionFactory;
import org.springframework.data.redis.core.RedisTemplate;
import org.springframework.data.redis.core.StringRedisTemplate;

import java.time.Duration;
import java.util.Arrays;

@Slf4j
@EnableCaching
@Configuration
public class RedisUtilConfigure extends CachingConfigurerSupport {

  @Bean
  public IRedisBaseTemplate redisBaseTemplate(RedisTemplate redisTemplate, StringRedisTemplate stringRedisTemplate) {
    return new PharmaRedisTemplate(redisTemplate, stringRedisTemplate);
  }

  @Bean
  @Override
  public KeyGenerator keyGenerator() {
    // 设置自动key的生成规则，配置spring boot的注解，进行方法级别的缓存
    // 使用：进行分割，可以很多显示出层级关系 // 这里其实就是new了一个KeyGenerator对象，
    // 只是这是lambda表达式的写法，我感觉很好用，大家感兴趣可以去了解下
    //
    return (target, method, params) -> {
      StringBuilder sb = new StringBuilder();
      sb.append(target.getClass().getName());
      sb.append(":");
      sb.append(method.getName());
      Arrays.stream(params).map(obj -> ":" + obj).forEach(sb::append);
      String rsToUse = String.valueOf(sb);
      log.debug("自动生成Redis Key -> [{}]", rsToUse);
      return rsToUse;
    };
  }

  @Override
  @Bean
  public CacheErrorHandler errorHandler() {
    // 异常处理，当Redis发生异常时，打印日志，但是程序正常走
    log.debug("初始化 -> [{}]", "Redis CacheErrorHandler");
    return new CacheErrorHandler() {
      @Override
      public void handleCacheGetError(RuntimeException e, Cache cache, Object key) {
        log.error("Redis occur handleCacheGetError：key -> [{}]", key, e);
      }

      @Override
      public void handleCachePutError(RuntimeException e, Cache cache, Object key, Object value) {
        log.error("Redis occur handleCachePutError：key -> [{}]；value -> [{}]", key, value, e);
      }

      @Override
      public void handleCacheEvictError(RuntimeException e, Cache cache, Object key) {
        log.error("Redis occur handleCacheEvictError：key -> [{}]", key, e);
      }

      @Override
      public void handleCacheClearError(RuntimeException e, Cache cache) {
        log.error("Redis occur handleCacheClearError：", e);
      }
    };
  }

  /**
   * 最新版，设置redis缓存过期时间
   */
  @Bean
  @ConditionalOnMissingBean
  public RedisCacheManager cacheManager(RedisConnectionFactory redisConnectionFactory) {
    RedisCacheConfiguration redisCacheConfiguration = RedisCacheConfiguration.defaultCacheConfig().entryTtl(Duration.ofHours(12));
    return new RedisCacheManager(RedisCacheWriter.nonLockingRedisCacheWriter(redisConnectionFactory), redisCacheConfiguration);
  }

}
