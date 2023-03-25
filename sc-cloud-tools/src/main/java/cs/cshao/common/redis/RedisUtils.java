package cs.cshao.common.redis;

import java.util.*;

/**
 * Redis工具类封装
 * <p>
 * File name : RedisUtils.java
 * </P>
 * <p>
 * Author : zhouyanxin
 * </P>
 * <p>
 * Date : 2015年7月2日
 * </P>
 */
public final class RedisUtils {


    // 添加数据至缓存
    public static void set(String key, Object value, int timeout) {
        RedisUtil.valueOps().set(key, value, timeout);
    }

    // 添加数据至缓存(添加字符串类型缓存)
    public static void set(String key, String value) {
        RedisUtil.valueOps().set(key, value);
    }

    // 添加数据至缓存
    public static void set(String key, Object value) {
        RedisUtil.valueOps().set(key, value);
    }

    public static List<String> hmget(String key, String... fields) {
        return RedisUtil.hashOps().hmget(key, fields);
    }

    // 从缓存中获取数据
    public static Object get(String key) {
        return RedisUtil.valueOps().getObject(key);
    }

    public static String getString(String key) {
        return RedisUtil.valueOps().getString(key);
    }

    // 从缓存中获取数据
    public static Map<String, Object> mGet(List<String> keys) {
        Map<String, Object> map = new HashMap<>();
        for (String k : keys) {
            map.put(k, get(k));
        }
        return map;
    }

    // 从缓存中删除指定数据
    public static void delete(String key) {
        RedisUtil.keyOps().delete(key);
    }

    // 从缓存中批量删除
    public static void delete(Collection<String> keys) {
        if (null == keys || keys.isEmpty()) {
            return;
        }
        for (String key : keys) {
            RedisUtil.keyOps().delete(key);
        }
    }

    // 判断缓存中是否存在指定的KEY
    public static boolean existsKey(String key) {
        return RedisUtil.keyOps().existsKey(key);
    }

    // 自增方法
    public static long incre(String key) {
        return RedisUtil.keyOps().incr(key);
    }

    // 取出整个map
    public static Map<String, String> hgetAll(String key) {
        return RedisUtil.hashOps().hgetAll(key);
    }

    public static void hmset(String key, Map<String, String> hash) {
        RedisUtil.hashOps().hmset(key, hash);
    }

    // 获取map中的entry
    public static String hget(String key, String field) {
        return RedisUtil.hashOps().hget(key, field);
    }

    // 设置map中key,value
    public static void hset(String key, String field, String value) {
        RedisUtil.hashOps().hset(key, field, value);
    }

    // 删除map中
    public static void hdel(String key, String... fields) {
        RedisUtil.hashOps().hdel(key, fields);
    }

    // rpush
    public static void rpush(String key, String signDetailId) {
        RedisUtil.listOps().rpush(key, signDetailId);
    }

    // lpush
    public static void lpush(String key, String value) {
        RedisUtil.listOps().lpush(key, value);
    }

    // lrange
    public static List<String> lrange(String key, long start, long end) {
        return RedisUtil.listOps().lrange(key, start, end);
    }

    // sismember
    public static boolean sismember(String key, String member) {
        return RedisUtil.setOps().sismember(key, member);
    }

    // smember
    public static Set<String> smember(String key) {
        return RedisUtil.setOps().smembers(key);
    }

    // sadd
    public static void sadd(String key, String... members) {
        RedisUtil.setOps().sadd(key, members);
    }

    // srem
    public static void srem(String key, String... members) {
        RedisUtil.setOps().srem(key, members);
    }

    // llen
    public static Long llen(String key) {
        return RedisUtil.listOps().llen(key);
    }

    // lpop
    public static String lpop(String key) {
        return RedisUtil.listOps().lpop(key);
    }

    // expire
    public static Long expire(String key, int seconds) {
        return RedisUtil.keyOps().expire(key, seconds);
    }

}
