package cs.cshao.common.utils.thread;


import com.alibaba.fastjson.JSONObject;
import cs.cshao.common.exc.UserException;
import org.apache.commons.lang3.StringUtils;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.util.Map;
import java.util.Set;
import java.util.concurrent.ConcurrentHashMap;

/**
 * 全局设置/货物ID
 */
public class ThreadLocalUtils {
    private static final String USER_ID_KEY = "USER_ID";
    private static final ThreadLocal<HttpServletRequest> request = new ThreadLocal<>();
    private static final ThreadLocal<HttpServletResponse> response = new ThreadLocal<>();
    private static final ThreadLocal<ConcurrentHashMap<String, Object>> param = new ThreadLocal<>();

    public static void init(HttpServletRequest req, HttpServletResponse res) {
        request.set(req);
        response.set(res);
        param.set(new ConcurrentHashMap<>());
    }

    public static void initParam() {
        Set<Map.Entry<String, String[]>> entries = request.get().getParameterMap().entrySet();
        ConcurrentHashMap<String, Object> map = param.get();
        for (Map.Entry<String, String[]> entry : entries) {
            map.put(entry.getKey(), entry.getValue()[0]);
        }
    }

    public static Object getUserId() {
        if (param.get() == null) {
            throw new UserException("登录异常");
        }
        if (param.get().get(USER_ID_KEY) == null) {
            throw new UserException("权限不足");
        }
        return param.get().get(USER_ID_KEY);
    }

    public static void putUserId(Object userId) {
        param.get().remove(USER_ID_KEY);
        if (null != userId) {
            param.get().put(USER_ID_KEY, userId);
        }
    }

    public static String getUserName() {
        return param.get().get("UserName") == null ? null : param.get().get("UserName").toString();
    }

    public static void setUserName(String userName) {
        param.get().remove("UserName");
        if (StringUtils.isNotBlank(userName)) {
            param.get().put("UserName", userName);
        }
    }

    public static String getOpenId() {
        return param.get().get("OPEN_ID") == null ? null : param.get().get("OPEN_ID").toString();
    }

    public static void setOpenId(String userId) {
        param.get().remove("OPEN_ID");
        if (StringUtils.isNotBlank(userId)) {
            param.get().put("OPEN_ID", userId);
        }
    }

    public static String getToken() {
        if (param.get() == null) {
            throw new UserException("获取token异常");
        }
        if (param.get().get("TOKEN") == null) {
            throw new UserException("获取token为空");
        }
        return param.get().get("TOKEN").toString();
    }

    public static void setToken(String token) {
        param.get().remove("TOKEN");
        if (StringUtils.isNotBlank(token)) {
            param.get().put("TOKEN", token);
        }
    }

    public static String getSessionKey() {
        if (param.get() == null) {
            throw new UserException("获取secret异常");
        }
        if (param.get().get("SESSION_KEY") == null) {
            throw new UserException("获取secret为空");
        }
        return param.get().get("SESSION_KEY").toString();
    }

    public static void setSessionKey(String sessionKey) {
        param.get().remove("SESSION_KEY");
        if (StringUtils.isNotBlank(sessionKey)) {
            param.get().put("SESSION_KEY", sessionKey);
        }
    }

    // 获取用户的IP地址
    public static String getUserIPV4() {
        return param.get().get("IPV4") == null ? null : param.get().get("IPV4").toString();
    }

    // 设置用户的IP地址
    public static void setUserIPV4(String ipv4) {
        param.get().remove("IPV4");
        if (StringUtils.isNotBlank(ipv4)) {
            param.get().put("IPV4", ipv4);
        }
    }

    public static void setUserId(Object userId) {
        if (userId == null) {
            throw new UserException("ID为空！");
        }
        putUserId(userId);
    }


    public static HttpServletRequest getRequest() {
        return request.get();
    }

    public static Map<String, Object> getParams() {
        return param.get();
    }

    public static Object getParams(String key) {
        return param.get().get(key);
    }


    public static HttpServletResponse getResponse() {
        return response.get();
    }

    public static void remove() {
        request.remove();
        response.remove();
        param.remove();
    }


    /**
     * @接收参数
     * @param
     * @param <T>
     * @return
     */
    public static <T> T acceptParams(String jsonBody, Class<T> tClass) {
        return JSONObject.parseObject(jsonBody, tClass);
    }
}
