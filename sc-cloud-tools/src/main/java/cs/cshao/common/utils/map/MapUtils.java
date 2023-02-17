package cs.cshao.common.utils.map;

import org.apache.commons.beanutils.BeanMap;

import java.beans.BeanInfo;
import java.beans.Introspector;
import java.beans.PropertyDescriptor;
import java.lang.reflect.Method;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Set;

/**
 * @author cshao
 * @time 2019/12/19
 * @desc MapUtils
 */
public class MapUtils {

    /**
     * @desc map to bean
     * @param map  :待转换的map
     * @param beanClass :bean
     * @return
     * @throws Exception
     */
    public static <T> T mapToBean(Map<String, T> map, Class<T> beanClass) throws Exception {
        if (map == null) {
            return null;
        }
        T t = beanClass.newInstance();
        org.apache.commons.beanutils.BeanUtils.populate(t, map);
        return t;
    }


    public static <T> T mapToBean(Map<String, Object> map, T t) {
        if (map == null) {
            return null;
        }
        try {
            t = (T) t.getClass().newInstance();
            org.apache.commons.beanutils.BeanUtils.populate(t, map);
        } catch (Exception e) {
            e.printStackTrace();
        }
        return t;
    }

    /**
     * @desc bean to map
     * @param
     * @return
     */
    public static <T> BeanMap beanToMap(T t) {
        if (t == null) {
            return null;
        }
        return new BeanMap(t);
    }

    /**
     * 把JavaBean转化为map
     * @param bean
     * @return
     * @throws Exception
     */
    public static Map<String, Object> ObjToMap(Object bean) throws Exception {
        Map<String, Object> map = new HashMap<>();
        //获取JavaBean的描述器
        BeanInfo b = Introspector.getBeanInfo(bean.getClass(), Object.class);
        //获取属性描述器
        PropertyDescriptor[] pds = b.getPropertyDescriptors();
        //对属性迭代
        for (PropertyDescriptor pd : pds) {
            //属性名称
            String propertyName = pd.getName();
            //属性值,用getter方法获取
            Method m = pd.getReadMethod();
            Object properValue = m.invoke(bean);//用对象执行getter方法获得属性值
            //把属性名-属性值 存到Map中
            map.put(propertyName, properValue);
        }
        return map;
    }

    public static <T> Map<String, String> beanToMapStr(T t) {
        Map<String, String> map = new HashMap<>();
        if (t == null) {
            return map;
        }
        BeanMap beanMap = beanToMap(t);
        for (Object k : beanMap.keySet()) {
            if (beanMap.get(k) != null) {
                map.put(k.toString(), beanMap.get(k).toString());
            }
        }
        map.remove("class");
        return map;
    }
    /**为空则返回true，不否则返回false*/
    public static boolean isEmpty(Object s){
        if (s instanceof Map){
            return  ((Map)s).size()==0;
        }else if(s instanceof List){
            return  ((List)s).size()==0;
        }else if(s instanceof Set){
            return  ((Set)s).size()==0;
        }else if(s instanceof Object []){
            return ((Object[])s).length==0;
        }
        return s==null || "".equals(s) || "null".equals(s);
    }
    /**对象不为null*/
    public static boolean isNotEmpty(Object s){return !isEmpty(s);}
    public static boolean isNotEmptyMap(Map map,String keys){
        if (isNotEmpty(map) && isNotEmpty(keys)){
            for (String object : keys.split(",")) {
                if(isEmpty(map.get(object.trim()))){
                    return false;
                }
            }
            return true;
        }
        return false;
    }


}
