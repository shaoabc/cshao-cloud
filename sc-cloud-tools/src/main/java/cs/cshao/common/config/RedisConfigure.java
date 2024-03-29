package cs.cshao.common.config;

import cs.cshao.common.redis.RedisUtils;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.data.redis.connection.RedisConnectionFactory;
import org.springframework.data.redis.core.RedisTemplate;
import org.springframework.data.redis.serializer.GenericJackson2JsonRedisSerializer;
import org.springframework.data.redis.serializer.StringRedisSerializer;

/**
 * @author wangjian
 * @createTime 2019-12-24 18:11
 * @desc redis配置类
 * @updateTime
 * @updateDesc
 **/
@Configuration
public class RedisConfigure {

    /**
     * 实例化 RedisTemplate 对象
     * 提供给 RedisUtil 使用
     *
     * @param redisConnectionFactory SpringBoot配置好的连接工厂
     * @return RedisTemplate
     * @autor wangjian
     * @createTime 2019-12-24 18:11
     */
    @Bean(name = "redisTemplate")
    public RedisTemplate<String, Object> RedisTemplate(RedisConnectionFactory redisConnectionFactory) {
        RedisTemplate<String, Object> redisTemplate = new RedisTemplate<>();
        initRedisTemplate(redisTemplate, redisConnectionFactory);
        return redisTemplate;
    }

    /*
     * @desc 设置数据存入 redis 的序列化方式,并开启事务
     * @param redisTemplate
     * @param factory
     * @autor wangjian
     * @createTime 2019-12-24 18:11
     */
    private void initRedisTemplate(RedisTemplate<String, Object> redisTemplate, RedisConnectionFactory factory) {
        //如果不配置Serializer，那么存储的时候缺省使用String，如果用User类型存储，那么会提示错误User can't cast to String！
        redisTemplate.setKeySerializer(new StringRedisSerializer());
        redisTemplate.setHashKeySerializer(new StringRedisSerializer());
        redisTemplate.setHashValueSerializer(new GenericJackson2JsonRedisSerializer());
        redisTemplate.setValueSerializer(new GenericJackson2JsonRedisSerializer());
        // 开启事务
        redisTemplate.setEnableTransactionSupport(true);
        redisTemplate.setConnectionFactory(factory);
    }

    /*
     * @desc 注入封装RedisTemplate 给RedisUtil提供操作类
     * @param redisTemplate
     * @return RedisUtil
     * @autor wangjian
     * @createTime 2019-12-24 18:11
     */
    @Bean(name = "redisUtil")
    public RedisUtils redisUtil(RedisTemplate<String, Object> redisTemplate) {
        RedisUtils redisUtils = new RedisUtils();
        return redisUtils;
    }

}