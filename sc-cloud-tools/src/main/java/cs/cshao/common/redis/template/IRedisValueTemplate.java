package cs.cshao.common.redis.template;

import java.util.concurrent.TimeUnit;

/**
 * Redis Values Operation Template
 */
public interface IRedisValueTemplate {

    // ++++++++++++++++++++++++++++++++ redis value 操作 ++++++++++++++++++++++++++++++++ //

    /**
     * 如果 key 已经存在，并且值为字符串，那么这个命令会把 value 追加到原来值（value）的结尾。 如果 key 不存在，那么它将首先创建一个空字符串的key，再执行追加操作，这种情况
     * APPEND 将类似于 SET 操作
     *
     * @param key
     * @param value
     */
    void append(String key, String value);

    /**
     * @param key
     * @param value
     */
    void set(String key, Object value);

    /**
     * @param key
     * @param value
     * @param expire
     */
    void set(String key, Object value, int expire);

    /**
     * 将键key设定为指定的“字符串”值。如果 key 已经保存了一个值，那么这个操作会直接覆盖原来的值，并且忽略原始类型 当setString命令执行成功之后，之前设置的过期时间都将失效
     *
     * @param key
     * @param value
     */
    void setString(String key, String value);

    /**
     * 同set(String,String),添加超时时间expire参数(秒)
     *
     * @param key
     * @param value
     * @param expire
     */
    void setString(String key, String value, int expire);

    void setString(String key, String value, int expire, TimeUnit timeUnit);

    /**
     * 类似set(String,String),Object对象通过指定的序列化方式，序列化后存储
     *
     * @param key
     * @param value
     */
    void setObject(String key, Object value);

    /**
     * 同set(String,Object),添加超时设置expire参数(秒)
     *
     * @param key
     * @param value
     * @param expire
     */
    void setObject(String key, Object value, int expire);

    /**
     * 返回key的value 如果key不存在，返回特殊值null 如果key的value类型不是string，返回null 如果key的value类型为Object，本方法返回序列化字符串
     *
     * @param key
     * @return
     */
    String getString(String key);

    /**
     * 类似getString(String),返回反序列化Object
     *
     * @param key
     * @return
     */
    Object getObject(String key);

    /**
     * 设置key对应字符串value，并且设置key在给定的seconds时间之后超时过期 等效于multi/exec执行：set(String,String),expire(String,String)
     *
     * @param key
     * @param value
     * @param second
     */
    void setEx(String key, String value, int second);

    /**
     * 将key设置值为value 如果key不存在，这种情况下等同SET命令。 当key存在时，什么也不做。SETNX是”SET if Not eXists”的简写
     *
     * @param key
     * @param value
     * @return 1 如果key被设置了,0 如果key没有被设置
     */
    Long setNx(String key, String value);

}
