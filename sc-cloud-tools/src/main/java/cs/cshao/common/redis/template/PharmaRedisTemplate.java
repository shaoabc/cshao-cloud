package cs.cshao.common.redis.template;

import cs.cshao.common.redis.RedisUtil;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.BeansException;
import org.springframework.data.redis.connection.RedisConnection;
import org.springframework.data.redis.connection.RedisConnectionFactory;
import org.springframework.data.redis.core.*;
import org.springframework.data.redis.serializer.StringRedisSerializer;
import org.springframework.util.Assert;
import org.springframework.util.CollectionUtils;

import java.util.*;
import java.util.concurrent.TimeUnit;

/**
 * Redis客户端操作类spring-data-redis实现
 */
@Slf4j
public class PharmaRedisTemplate implements IRedisBaseTemplate {


    private RedisTemplate<String, Object> redisTemplate;
    private StringRedisTemplate stringRedisTemplate;

    // ++++++++++++++++++++++++++++++++ redis hash 操作 ++++++++++++++++++++++++++++++++ //

    public PharmaRedisTemplate(RedisTemplate redisTemplate,
                               StringRedisTemplate stringRedisTemplate) {

        // 强制使用JDKSerializer保持原jedis序列化统一
        redisTemplate.setKeySerializer(new StringRedisSerializer());

        this.redisTemplate = redisTemplate;
        this.stringRedisTemplate = stringRedisTemplate;
    }

    @Override
    public void hmset(String key, Map<String, String> hash) {
        this.stringRedisTemplate.opsForHash().putAll(key, hash);
    }

    @Override
    public List<String> hmget(String key, String... fields) {
        return this.stringRedisTemplate.opsForHash()
            .multiGet(key, CollectionUtils.arrayToList(fields));
    }

    @Override
    public void hset(String key, String field, String value) {
        this.stringRedisTemplate.opsForHash().put(key, field, value);
    }

    @Override
    public void hsetObject(String key, String field, Object value) {
        this.redisTemplate.opsForHash().put(key, field, value);
    }

    @Override
    public String hget(String key, String field) {
        return (String) this.stringRedisTemplate.opsForHash().get(key, field);
    }

    @Override
    public <T> T hgetObject(String key, String field) {
        return (T) this.redisTemplate.opsForHash().get(key, field);
    }

    @Override
    public Long hdel(String key, String... fields) {
        return this.stringRedisTemplate.opsForHash().delete(key, fields);
    }

    @Override
    public Long hdelObject(String key, String... fields) {
        return this.redisTemplate.opsForHash().delete(key, fields);
    }

    @Override
    public boolean hexist(String key, String field) {
        return this.stringRedisTemplate.opsForHash().hasKey(key, field);
    }

    @Override
    public Map<String, String> hgetAll(String key) {
        BoundHashOperations<String, String, String> hashObject = this.stringRedisTemplate
            .boundHashOps(key);
        return hashObject.entries();
    }

    @Override
    public Map<String, Object> hgetAllObject(String key) {
        BoundHashOperations<String, String, Object> hashObject = this.redisTemplate
            .boundHashOps(key);
        return hashObject.entries();
    }

    @Override
    public Long hincrby(String key, String hashKey, Long incr) {
        return this.stringRedisTemplate.opsForHash().increment(key, hashKey, incr);
    }
    // ++++++++++++++++++++++++++++++++ redis value 操作 ++++++++++++++++++++++++++++++++ //

    @Override
    public Long hsetnx(String key, String field, String value) {
        BoundHashOperations<String, String, String> hashObject = this.stringRedisTemplate
            .boundHashOps(key);
        return hashObject.putIfAbsent(field, value) ? OPERATE_RESULT_TRUE : OPERATE_RESULT_FALSE;
    }

    @Override
    public void append(String key, String value) {
        this.stringRedisTemplate.opsForValue().append(key, value);
    }

    @Override
    public void set(String key, Object value) {
        Assert.notNull(value, "RedisUtil operate [set] ERROR ;");
        if (value instanceof String) {
            this.setString(key, (String) value);
        } else {
            this.setObject(key, value);
        }
    }

    @Override
    public void set(String key, Object value, int expire) {
        Assert.notNull(value, "RedisUtil operate [set] ERROR ;");
        if (value instanceof String) {
            this.setString(key, (String) value, expire);
        } else {
            this.setObject(key, value, expire);
        }
    }

    @Override
    public void setString(String key, String value) {
        this.stringRedisTemplate.opsForValue().set(key, value);
    }

    @Override
    public void setString(String key, String value, int expire) {
        this.setString(key, value, expire, TimeUnit.SECONDS);
    }

    @Override
    public void setString(String key, String value, int expire, TimeUnit timeUnit) {
        this.stringRedisTemplate.opsForValue().set(key, value, expire, timeUnit);
    }

    @Override
    public void setObject(String key, Object value) {
        this.redisTemplate.opsForValue().set(key, value);
    }

    @Override
    public void setObject(String key, Object value, int expire) {
        this.redisTemplate.opsForValue().set(key, value, expire, TimeUnit.SECONDS);
    }

    @Override
    public String getString(String key) {
        return this.stringRedisTemplate.opsForValue().get(key);
    }

    @Override
    public Object getObject(String key) {
        return this.redisTemplate.opsForValue().get(key);
    }

    @Override
    public void setEx(String key, String value, int second) {
        this.stringRedisTemplate.opsForValue().set(key, value, second, TimeUnit.SECONDS);
    }

    public Long setnx(String key, String value) {
        return this.stringRedisTemplate.opsForValue().setIfAbsent(key, value) ? OPERATE_RESULT_TRUE
            : OPERATE_RESULT_FALSE;
    }

    @Override
    public Long setNx(String key, String value) {
        return this.stringRedisTemplate.opsForValue().setIfAbsent(key, value) ? OPERATE_RESULT_TRUE
            : OPERATE_RESULT_FALSE;
    }

    // ++++++++++++++++++++++++++++++++ redis set 操作 ++++++++++++++++++++++++++++++++ //

    @Override
    public void sadd(String key, String... members) {
        this.stringRedisTemplate.opsForSet().add(key, members);
    }

    @Override
    public void srem(String key, String... members) {
        this.stringRedisTemplate.opsForSet().remove(key, members);
    }

    @Override
    public Set<String> smembers(String key) {
        return this.stringRedisTemplate.opsForSet().members(key);
    }

    // ++++++++++++++++++++++++++++++++ redis list 操作 ++++++++++++++++++++++++++++++++ //

    @Override
    public boolean sismember(String key, String member) {
        return this.stringRedisTemplate.opsForSet().isMember(key, member);
    }

    @Override
    public Long rpush(String key, String value) {
        return this.stringRedisTemplate.opsForList().rightPush(key, value);
    }

    @Override
    public Long lpush(String key, String value) {
        return this.stringRedisTemplate.opsForList().leftPush(key, value);
    }

    @Override
    public String lpop(String key) {
        return this.stringRedisTemplate.opsForList().leftPop(key);
    }

    @Override
    public String rpop(String key) {
        return this.stringRedisTemplate.opsForList().rightPop(key);
    }

    @Override
    public String rpoplpush(String srckey, String dstkey) {
        return this.stringRedisTemplate.opsForList().rightPopAndLeftPush(srckey, dstkey);
    }

    @Override
    public Long llen(String key) {
        return this.stringRedisTemplate.opsForList().size(key);
    }

    // ++++++++++++++++++++++++++++++++ redis key 操作 ++++++++++++++++++++++++++++++++ //

    @Override
    public List<String> lrange(String key, long start, long end) {
        return this.stringRedisTemplate.opsForList().range(key, start, end);
    }

    @Override
    public String lindex(String key, int index) {
        return this.stringRedisTemplate.opsForList().index(key, index);
    }

    @Override
    public void delete(String key) {
        this.redisTemplate.delete(key);
    }

    @Override
    public void delete(Collection<String> keys) {
        this.redisTemplate.delete(keys);
    }

    @Override
    public boolean existsKey(String key) {
        return this.redisTemplate.hasKey(key);
    }

    @Override
    public Long expire(String key, int seconds) {
        return this.expire(key, seconds, TimeUnit.SECONDS);
    }

    @Override
    public Long expire(String key, long timeout, TimeUnit timeUnit) {
        return this.redisTemplate.expire(key, timeout, timeUnit) ? OPERATE_RESULT_TRUE
            : OPERATE_RESULT_FALSE;
    }

    @Override
    public String getSet(String key, String value) {
        return this.stringRedisTemplate.opsForValue().getAndSet(key, value);
    }

    @Override
    public Long incr(String key) {
        return this.redisTemplate.opsForValue().increment(key, 1L);
    }

    @Override
    public Long incrBy(String key, Integer by) {
        return this.redisTemplate.opsForValue().increment(key, by);
    }

    @Override
    public Long decr(String key) {
        return this.redisTemplate.opsForValue().increment(key, -1L);
    }

    // ++++++++++++++++++++++++++++++++ redis zset 操作 ++++++++++++++++++++++++++++++++ //

    @Override
    public Long decrBy(String key, Integer by) {
        return this.redisTemplate.opsForValue().increment(key, -1 * by);
    }

    @Override
    public long getExpire(String key) {
        return this.redisTemplate.getExpire(key, TimeUnit.SECONDS);
    }

    @Override
    public List<String> scan(String pattern) {
        ScanOptions options = ScanOptions.scanOptions().match(pattern).build();
        RedisConnectionFactory factory = this.redisTemplate.getConnectionFactory();
        RedisConnection rc = Objects.requireNonNull(factory).getConnection();
        Cursor<byte[]> cursor = rc.scan(options);
        List<String> result = new ArrayList<>();
        while (cursor.hasNext()) {
            result.add(new String(cursor.next()));
        }
        try {
            RedisConnectionUtils.releaseConnection(rc, factory);
        } catch (Exception e) {
            log.error(e.getMessage(), e);
        }
        return result;
    }

    // ++++++++++++++++++++++++++++++++ postProcessBeforeInitialization ++++++++++++++++++++++++++++++++ //
    @Override
    public Object postProcessBeforeInitialization(Object bean, String beanName) throws BeansException {
        if (RedisUtil.isNull()) {
            RedisUtil.init(this);
        }
        return bean;
    }
}
