package cs.cshao.common.utils.map;


import cs.cshao.common.ext.Action_2;
import org.modelmapper.Converter;
import org.modelmapper.ModelMapper;
import org.modelmapper.PropertyMap;
import org.modelmapper.TypeMap;
import org.modelmapper.convention.MatchingStrategies;
import org.modelmapper.convention.NameTransformers;
import org.modelmapper.convention.NamingConventions;

import java.util.*;

import static org.apache.commons.collections.MapUtils.safeAddToMap;

/**
 * @Desc 对象映射工具类
 * @Author cshao
 * @Date 2022/11/8 13:21
 **/
public class ModelMapUtils {
    private static final ModelMapper MODEL_MAPPER = new ModelMapper();

    static {
        MODEL_MAPPER.getConfiguration().setSourceNamingConvention(NamingConventions.JAVABEANS_ACCESSOR)
                .setDestinationNamingConvention(NamingConventions.JAVABEANS_MUTATOR)
                .setSourceNameTransformer(NameTransformers.JAVABEANS_ACCESSOR)
                .setDestinationNameTransformer(NameTransformers.JAVABEANS_MUTATOR)
                .setMatchingStrategy(MatchingStrategies.STRICT);
    }

    /**
     * 转换(只是兼容老函数重载)
     *
     * @param source      源
     * @param targetClass 目标类型
     * @return
     */
    public static <Target> Target mapTo(Class<Target> targetClass, Object source) {
        if (source == null) {
            return null;
        }
        if (source instanceof Map) {
            Map newSource = toCamelCaseMap((Map) source);
            return MODEL_MAPPER.map(newSource, targetClass);
        }
        return MODEL_MAPPER.map(source, targetClass);
    }

    /**
     * 转换
     *
     * @param source      源对象
     * @param destination 被赋值的对象
     */
    public static void map(Object source, Object destination) {
        if (source instanceof Map) {
            Map newSource = toCamelCaseMap((Map) source);
            MODEL_MAPPER.map(newSource, destination);
        }
        MODEL_MAPPER.map(source, destination);
    }

    /**
     * 转换
     *
     * @param source      源
     * @param targetClass 目标类型
     * @return
     */
    public static <Target> Target map(Object source, Class<Target> targetClass) {
        if (source == null) {
            return null;
        }
        if (source instanceof Map) {
            Map newSource = toCamelCaseMap((Map) source);
            return MODEL_MAPPER.map(newSource, targetClass);
        }

        return MODEL_MAPPER.map(source, targetClass);
    }

    /**
     * 转换为列表
     *
     * @param sourceList  源列表
     * @param targetClass 目标类型
     * @return
     */
    public static <TSource, Target> List<Target> mapList(Collection<TSource> sourceList, Class<Target> targetClass) {
        return mapList(sourceList, targetClass, null);
    }

    /**
     * 转换为列表
     *
     * @param sourceList
     * @param targetClass
     * @param setAction
     * @return
     */
    public static <TSource, Target> List<Target> mapList(Collection<TSource> sourceList, Class<Target> targetClass,
                                                         Action_2<TSource, Target> setAction) {
        List<Target> items = new ArrayList<Target>();
        if (sourceList == null) {
            return items;
        }
        Action_2<TSource, Target> act = setAction;
        if (act != null) {
            for (TSource source : sourceList) {
                Target item = map(source, targetClass);
                act.apply(source, item);
                items.add(item);
            }
        } else {
            for (TSource source : sourceList) {
                Target item = map(source, targetClass);
                items.add(item);
            }
        }
        return items;
    }

    /**
     * 转换
     *
     * @param source      源
     * @param targetClass 目标类型
     * @param typeMapName 类型映射名称
     * @return 转换对象
     */
    public <Target> Target map(Object source, Class<Target> targetClass, String typeMapName) {
        if (source == null) {
            return null;
        }
        if (source instanceof Map) {
            Map newSource = toCamelCaseMap((Map) source);
            return MODEL_MAPPER.map(newSource, targetClass, typeMapName);
        }
        return MODEL_MAPPER.map(source, targetClass, typeMapName);
    }

    /**
     * 将Map的Keys去下划线<br> (例:branch_no -> branchNo )<br>
     *
     * @param map 待转换Map
     * @return 转换后的map
     */
    public static <V> Map<String, V> toCamelCaseMap(Map<String, V> map) {
        Map<String, V> newMap = new HashMap<String, V>();
        for (String key : map.keySet()) {
            safeAddToMap(newMap, toCamelCaseString(key, false), map.get(key));
        }
        return newMap;
    }

    /**
     * 将驼峰字段转成属性字符串<br> (例:branch_no -> branchNo )<br>
     *
     * @param inputString             输入字符串
     * @param firstCharacterUppercase 是否首字母大写
     * @return 驼峰字符串
     */
    private static String toCamelCaseString(String inputString, boolean firstCharacterUppercase) {
        if (inputString == null) {
            return null;
        }
        StringBuilder sb = new StringBuilder();
        boolean nextUpperCase = false;
        for (int i = 0; i < inputString.length(); i++) {
            char c = inputString.charAt(i);

            switch (c) {
                case '_':
                case '-':
                case '@':
                case '$':
                case '#':
                case ' ':
                case '/':
                case '&':
                    if (sb.length() > 0) {
                        nextUpperCase = true;
                    }
                    break;

                default:
                    if (nextUpperCase) {
                        sb.append(Character.toUpperCase(c));
                        nextUpperCase = false;
                    } else {
                        sb.append(Character.toLowerCase(c));
                    }
                    break;
            }
        }

        if (firstCharacterUppercase) {
            sb.setCharAt(0, Character.toUpperCase(sb.charAt(0)));
        }

        return sb.toString();
    }

    /**
     * 添加转换
     *
     * @param converter 转换器
     */
    public static <S, D> void addConverter(Converter<S, D> converter) {
        MODEL_MAPPER.addConverter(converter);
    }

    /**
     * 添加映射
     *
     * @param propertyMap 映射规则
     * @return TypeMap
     */
    public <S, D> TypeMap<S, D> addMappings(PropertyMap<S, D> propertyMap) {
        return MODEL_MAPPER.addMappings(propertyMap);
    }

}
