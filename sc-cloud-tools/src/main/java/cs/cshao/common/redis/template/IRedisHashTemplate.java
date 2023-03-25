package cs.cshao.common.redis.template;

import java.util.List;
import java.util.Map;

/**
 * Redis Hashs Operation Template
 */
public interface IRedisHashTemplate {

    // ++++++++++++++++++++++++++++++++ redis hash 操作

    /**
     * 设置 key 指定的哈希集中指定字段的值
     * 该命令将重写所有在哈希集中存在的字段
     * 如果 key 指定的哈希集不存在，会创建一个新的哈希集并与 key 关联
     *
     * @param key
     * @param hash
     */
    void hmset(String key, Map<String, String> hash);

    /**
     * 返回 key 指定的哈希集中指定字段的值。对于哈希集中不存在的每个字段，返回 null 值
     * 因为不存在的keys被认为是一个空的哈希集，对一个不存在的 key 执行 HMGET 将返回一个只含有 null 值的list
     *
     * @param key
     * @param fields
     *
     * @return
     */
    List<String> hmget(String key, String... fields);

    /**
     * 设置 key 指定的哈希集中指定字段的值
     * 如果 key 指定的哈希集不存在，会创建一个新的哈希集并与 key 关联
     * 如果字段在哈希集中存在，它将被重写
     *
     * @param key
     * @param field
     * @param value
     */
    void hset(String key, String field, String value);

    /**
     * 设置 key 指定的哈希集中指定字段的值
     * 如果 key 指定的哈希集不存在，会创建一个新的哈希集并与 key 关联
     * 如果字段在哈希集中存在，它将被重写
     *
     * @param key
     * @param field
     * @param value
     */
    void hsetObject(String key, String field, Object value);

    /**
     * 返回 key 指定的哈希集中该字段所关联的值
     *
     * @param key
     * @param field
     *
     * @return
     */
    String hget(String key, String field);

    /**
     * 返回 key 指定的哈希集中该字段所关联的值
     *
     * @param key
     * @param field
     *
     * @return
     */
    <T> T hgetObject(String key, String field);

    /**
     * 从 key 指定的哈希集中移除指定的域。在哈希集中不存在的域将被忽略，返回成功移除的filed的数量
     * 如果 key 指定的哈希集不存在，它将被认为是一个空的哈希集，该命令将返回0
     *
     * @param key
     * @param fields
     *
     * @return
     */
    Long hdel(String key, String... fields);

    /**
     * 从 key 指定的哈希集中移除指定的域。在哈希集中不存在的域将被忽略，返回成功移除的filed的数量
     * 如果 key 指定的哈希集不存在，它将被认为是一个空的哈希集，该命令将返回0
     *
     * @param key
     * @param fields
     *
     * @return
     */
    Long hdelObject(String key, String... fields);

    /**
     * 返回hash里面field是否存在
     *
     * @param key
     * @param field
     *
     * @return
     */
    boolean hexist(String key, String field);

    /**
     * 返回 key 指定的哈希集中所有的字段和值
     *
     * @param key
     *
     * @return
     */
    Map<String, String> hgetAll(String key);

    /**
     * 返回 key 指定的哈希集中所有的字段和值
     *
     * @param key
     *
     * @return
     */
    Map<String, Object> hgetAllObject(String key);

    /**
     * 只在 key 指定的哈希集中不存在指定的字段时，设置字段的值
     * 如果 key 指定的哈希集不存在，会创建一个新的哈希集并与 key 关联
     * 如果字段已存在，该操作无效果
     * 返回：
     * 1：如果字段是个新的字段，并成功赋值
     * 0：如果哈希集中已存在该字段，没有操作被执行
     *
     * @param key
     * @param field
     * @param value
     *
     * @return
     */
    Long hsetnx(String key, String field, String value);

    /**
     * 增加 key 指定的哈希集中指定字段的数值
     * 如果 key 不存在，会创建一个新的哈希集并与 key 关联
     * 如果字段不存在，则字段的值在该操作执行前被设置为 0
     * HINCRBY 支持的值的范围限定在 64位 有符号整数
     *
     * @param key
     * @param hashKey
     * @param incr
     *
     * @return
     */
    Long hincrby(String key, String hashKey, Long incr);
}
