package cs.cshao.common.redis.template;

import java.util.Set;

/**
 * Redis Sets Operation Template
 */
public interface IRedisSetTemplate {

    // ++++++++++++++++++++++++++++++++ redis set 操作 ++++++++++++++++++++++++++++++++ //

    /**
     * 添加一个或多个指定的member元素到集合的 key中
     * 指定的一个或者多个元素member 如果已经在集合key中存在则忽略
     * 如果集合key 不存在，则新建集合key,并添加member元素到集合key中
     * 如果key 的类型不是集合则返回错误
     *
     * @param key
     * @param members
     */
    void sadd(String key, String... members);

    /**
     * 在key集合中移除指定的元素
     * 如果指定的元素不是key集合中的元素、key的类型不是一个集合、key集合不存则忽略
     *
     * @param key
     * @param members
     */
    void srem(String key, String... members);

    /**
     * 返回key集合所有的元素
     *
     * @param key
     *
     * @return
     */
    Set<String> smembers(String key);

    /**
     * 返回成员 member 是否是存储的集合 key的成员
     *
     * @param key
     * @param member
     *
     * @return
     */
    boolean sismember(String key, String member);

}
