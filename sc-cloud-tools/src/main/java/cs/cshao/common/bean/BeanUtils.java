package cs.cshao.common.bean;

import java.lang.reflect.Field;
import java.lang.reflect.Method;
import java.util.*;

/*
 * @author SmallDays
 * @time 2019/12/19
 * @desc BeanUtils
 */
public class BeanUtils {

    /*
     * @desc 复制属性带返回 List
     * @param list
     * @param clazz list里面的对象
     * @return List<T>
     */
    public static <T> List<T> copyProperties(List list, Class<T> clazz) {
        if (list == null)
            return null;
        List<T> result = new ArrayList<>();
        try {
            for (Object obj : list) {
                T t = copyProperties(obj, clazz.newInstance());
                result.add(t);
            }
        } catch (Exception e) {
            throw new RuntimeException(e);
        }
        return result;
    }

    /*
     * 复制属性带返回值
     * @param source 资源
     * @param target 目标
     * @param <T> 返回值
     */
    public static <T> T copyProperties(Object source, T target) {
        org.springframework.beans.BeanUtils.copyProperties(source, target);
        return target;
    }

    public static <T> T getBean(Class<T> clazz, Properties prop) {
        Map<String, Object> map = new HashMap<>();
        for (Map.Entry<Object, Object> entrySet : prop.entrySet()) {
            String key = (String) entrySet.getKey();
            Object value = entrySet.getValue();
            map.put(key, value);
        }
        return getBean(clazz, map);
    }

    //将properties中的数据放入对应的类中
    public static <T> T getBean(Class<T> clazz, Map<String, Object> map) {
        T bean = null;
        String prefix = "";
        try {
            bean = clazz.newInstance();
            prefix = (String) clazz.getField("prefix").get(bean);
        } catch (Exception ignored) {
        }
        Field[] fields = clazz.getDeclaredFields();
        for (Field field : fields) {
            String name = field.getName();
            try {
                if ("prefix".equals(name)) {
                    continue;
                }
                Method method = clazz.getMethod("set" + name.substring(0, 1).toUpperCase() + name.substring(1), field.getType());
                method.invoke(bean, map.get(prefix + name));
            } catch (Exception ignored) {
            }
        }
        return bean;
    }

    public static boolean isBaseType(Class<?> clazz) {
        if (clazz.isPrimitive()) {
            return true;
        }
        return clazz.getPackage().getName().startsWith("java.lang");
    }


}
