package cs.cshao.common.redis.template;

import java.util.List;

/**
 * Redis Lists Operation Template
 */
public interface IRedisListTemplate {

    // ++++++++++++++++++++++++++++++++ redis list 操作 ++++++++++++++++++++++++++++++++ //

    /**
     * 向存于 key 的列表的尾部插入所有指定的值
     * 如果 key 不存在，那么会创建一个空的列表然后再进行 push 操作
     * 当 key 保存的不是一个列表，那么会返回null
     *
     * @param key
     * @param value
     *
     * @return
     */
    Long rpush(String key, String value);

    /**
     * 将所有指定的值插入到存于 key 的列表的头部。如果 key 不存在，那么在进行 push 操作前会创建一个空列表
     * 如果 key 对应的值不是一个 list 的话，那么会返回null
     *
     * @param key
     * @param value
     *
     * @return
     */
    Long lpush(String key, String value);

    /**
     * 移除并且返回 key 对应的 list 的第一个元素
     *
     * @param key
     *
     * @return
     */
    String lpop(String key);

    /**
     * 移除并返回存于 key 的 list 的最后一个元素
     *
     * @param key
     *
     * @return
     */
    String rpop(String key);

    /**
     * 原子性地返回并移除存储在 source 的列表的最后一个元素（列表尾部元素）
     * 并把该元素放入存储在 destination 的列表的第一个元素位置（列表头部）
     *
     * @param srckey
     * @param dstkey
     *
     * @return
     */
    String rpoplpush(String srckey, String dstkey);

    /**
     * 返回存储在 key 里的list的长度。 如果 key 不存在，那么就被看作是空list，并且返回长度为 0
     * 当存储在 key 里的值不是一个list的话，会返回null
     *
     * @param key
     *
     * @return
     */
    Long llen(String key);

    /**
     * 返回存储在 key 的列表里指定范围内的元素
     * start 和 end 偏移量都是基于0的下标，即list的第一个元素下标是0（list的表头），第二个元素下标是1，以此类推
     *
     * @param key
     * @param start
     * @param end
     *
     * @return
     */
    List<String> lrange(String key, long start, long end);

    /**
     * 返回列表里的元素的索引 index 存储在 key 里面
     * 下标是从0开始索引的，所以 0 是表示第一个元素， 1 表示第二个元素，并以此类推
     * 负数索引用于指定从列表尾部开始索引的元素。在这种方法下，-1 表示最后一个元素，-2 表示倒数第二个元素，并以此往前推
     * 当 key 位置的值不是一个列表的时候,返回null
     *
     * @param key
     * @param index
     *
     * @return
     */
    String lindex(String key, int index);

}
