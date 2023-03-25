package cs.cshao.common.redis.template;

import java.util.Collection;
import java.util.List;
import java.util.concurrent.TimeUnit;

/**
 * Redis Keys Operation Template
 */
public interface IRedisKeyTemplate {

    // ++++++++++++++++++++++++++++++++ redis key 操作 ++++++++++++++++++++++++++++++++ //

    /**
     * 删除指定key，如果key不存在，则直接忽略
     *
     * @param key
     */
    void delete(String key);

    /**
     * 删除指定的一批keys，如果删除中的某些key不存在，则直接忽略
     *
     * @param keys
     */
    void delete(Collection<String> keys);

    /**
     * 返回key是否存在
     *
     * @param key
     * @return
     */
    boolean existsKey(String key);

    /**
     * 设置key的过期时间(秒)，超过时间后，将会自动删除该key
     *
     * @param key
     * @param seconds
     * @return
     */
    Long expire(String key, int seconds);

    Long expire(String key, long timeout, TimeUnit timeUnit);

    /**
     * 自动将key对应到value并且返回原来key对应的value。如果key存在但是对应的value不是字符串，就返回错误
     *
     * @param key
     * @param value
     * @return
     */
    String getSet(String key, String value);

    /**
     * 对存储在指定key的数值执行原子加1 如果指定的key不存在，那么在执行incr操作之前，会先将它的值设定为0 如果key的value类型错误或者是个不能表示成数字的字符串，就返回null
     * 操作仅限于64位的有符号整型数据
     *
     * @param key
     * @return
     */
    Long incr(String key);

    /**
     * 类似incr(String),将key对应的数字原子加by
     *
     * @param key
     * @param by
     * @return
     */
    Long incrBy(String key, Integer by);

    /**
     * 对key对应的数字做原子减1操作 如果key不存在，那么在操作之前，这个key对应的值会被置为0 如果指定的key中存储的值不是字符串类型（fix：）或者存储的字符串类型不能表示为一个整数，返回null
     * 操作仅限于64位的有符号整型数据
     *
     * @param key
     * @return
     */
    Long decr(String key);

    /**
     * 类似decr(String),将key对应的数字原子减by
     *
     * @param key
     * @param by
     * @return
     */
    Long decrBy(String key, Integer by);

    /**
     * 根据 key 获取过期时间
     *
     * @param key 键 不能为null
     * @return 时间(秒) 返回0代表为永久有效
     */
    long getExpire(String key);

    /**
     * 查找匹配key
     *
     * @param pattern key
     * @return /
     */
    List<String> scan(String pattern);
}
