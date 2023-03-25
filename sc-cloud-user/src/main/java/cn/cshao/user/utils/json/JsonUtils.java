package cn.cshao.user.utils.json;

import com.alibaba.fastjson.JSON;
import com.alibaba.fastjson.TypeReference;
import com.alibaba.fastjson.parser.ParserConfig;
import com.alibaba.fastjson.parser.deserializer.ObjectDeserializer;
import com.alibaba.fastjson.serializer.ObjectSerializer;
import com.alibaba.fastjson.serializer.SerializeConfig;
import com.alibaba.fastjson.serializer.SerializerFeature;

import java.lang.reflect.Type;
import java.util.List;
import java.util.Map;

/**
 * @copyright (C), 2018-2020
 * @fileName: JsonUtils
 * @author: cshao
 * @date: 2022/4/28 3:39 下午
 * @description: FastJson帮助类
 * @history: <author>          <time>          <version>          <desc> 作者姓名           修改时间           版本号
 * 描述
 */
public class JsonUtils {


    /**
     * Json 日期默认格式
     */
    public static final String JSON_DEFAULT_FORMAT = "yyyy-MM-dd HH:mm:ss";

    /**
     * 标准的输出格式
     */
    public static final SerializerFeature[] SERIALIZER_FEATURE_STANDARD = new SerializerFeature[]{
            // 输出key时是否使用双引号
            SerializerFeature.QuoteFieldNames,
            // 值为 null 的字段也输出，统一接口处理
            SerializerFeature.WriteMapNullValue,
            // 全局日期默认格式(即 getJsonDateDefaultFormat() 的值)
            SerializerFeature.WriteDateUseDateFormat,
            // 如果字符格式为 null 时输出为空白值""
            SerializerFeature.WriteNullStringAsEmpty,
            // 如果 Boolean 为 null 时，输出为 false
            SerializerFeature.WriteNullBooleanAsFalse,
            // 如查 List 为 null 时输出 []
            SerializerFeature.WriteNullListAsEmpty,
            // 禁止出现 $ref,但对象中不可存在循环引用现象
            SerializerFeature.DisableCircularReferenceDetect};

    /**
     * 格式化的输出格式
     */
    public static final SerializerFeature[] SERIALIZER_FEATURE_PRETTYFORMAT = new SerializerFeature[]{
            // 结果是否格式化
            SerializerFeature.PrettyFormat,
            // 输出key时是否使用双引号
            SerializerFeature.QuoteFieldNames,
            // 值为 null 的字段也输出，统一接口处理
            SerializerFeature.WriteMapNullValue,
            // 全局日期默认格式(即 getJsonDateDefaultFormat() 的值)
            SerializerFeature.WriteDateUseDateFormat,
            // 如果字符格式为 null 时输出为空白值""
            SerializerFeature.WriteNullStringAsEmpty,
            // 如果 Boolean 为 null 时，输出为 false
            SerializerFeature.WriteNullBooleanAsFalse,
            // 如查 List 为 null 时输出 []
            SerializerFeature.WriteNullListAsEmpty,
            // 禁止出现 $ref,但对象中不可存在循环引用现象
            SerializerFeature.DisableCircularReferenceDetect};

    /**
     *
     */
    static {
        initialize();
    }

    private static boolean isInitialize = false;

    /**
     * 初始化,指定全局日期格式默认格式，自定义序列与返序列化
     * <p>
     * 2017-12-06 12:14:38
     */
    public synchronized static void initialize() {
        if (!isInitialize) {
            JSON.DEFFAULT_DATE_FORMAT = JSON_DEFAULT_FORMAT;
            isInitialize = true;
        }
    }

    /**
     * 注册序列化器
     *
     * @param type       类型
     * @param serializer 序列化处理器
     */
    public static void registerSerialize(Type type, ObjectSerializer serializer) {
        SerializeConfig.getGlobalInstance().put(type, serializer);
    }

    /**
     * 注册反序列化器
     *
     * @param type         类型
     * @param deserializer 反序列化处理器
     */
    public static void registerDeserializer(Type type, ObjectDeserializer deserializer) {
        ParserConfig.getGlobalInstance().putDeserializer(type, deserializer);
    }

    /**
     * Json 转换
     *
     * @param value          值类型
     * @param isPrettyFormat 是否格式化
     * @return
     */
    public static String toJSONString(Object value, boolean isPrettyFormat) {
        if (isPrettyFormat) {
            return JSON.toJSONString(value, SERIALIZER_FEATURE_PRETTYFORMAT);
        }
        return JSON.toJSONString(value, SERIALIZER_FEATURE_STANDARD);
    }

    /**
     * Json 转换
     *
     * @param value 值类型
     * @return
     */
    public static String toJSONString(Object value) {
        return toJSONString(value, false);
    }

    /**
     * Json 转换数组
     *
     * @param object         对象
     * @param isPrettyFormat 是否格式化
     * @return
     */
    public static byte[] toJSONBytes(Object object, boolean isPrettyFormat) {
        if (isPrettyFormat) {
            return JSON.toJSONBytes(object, SERIALIZER_FEATURE_PRETTYFORMAT);
        }
        return JSON.toJSONBytes(object, SERIALIZER_FEATURE_STANDARD);
    }

    /**
     * Json 转换数组
     *
     * @param object 对象
     * @return
     */
    public static byte[] toJSONBytes(Object object) {
        return toJSONBytes(object, false);
    }

    /**
     * 解析对象
     *
     * @param json
     * @param clazz
     * @return
     */
    public static <T> T parseObject(String json, Class<T> clazz) {
        return JSON.parseObject(json, clazz);
    }

    /**
     * 解析列表
     *
     * @param json
     * @param clazz
     * @return
     */
    public static <T> List<T> parseList(String json, Class<T> clazz) {
        return JSON.parseArray(json, clazz);
    }

    /**
     * 解析对象
     *
     * @param json json对象
     * @param type 类型
     * @return
     */
    public static <T> T parseObject(String json, Type type) {
        return JSON.parseObject(json, type);
    }

    /**
     * 解析对象
     *
     * @param json json对象
     * @param type 类型
     * @return
     */
    public static <T> T parseObject(String json, TypeReference<T> type) {
        return JSON.parseObject(json, type);
    }

    /**
     * 解析Map对象
     *
     * @param json json对象
     * @return
     */
    @SuppressWarnings("unchecked")
    public static Map<String, Object> parseMap(String json) {
        return parseObject(json, Map.class);

    }
}
