package cs.cshao.common.utils;

import javax.servlet.http.HttpServletRequest;
import java.net.InetAddress;
import java.net.UnknownHostException;

/**
 * @author cshao
 * @createTime 2020-4-2
 * @desc ip地址工具类
 * @updateTime
 * @updateDesc
 **/
public class IPV4Utils {

    /**
     * @desc 获取用户的ip地址
     *
     * */
    public static String getIpAddress(HttpServletRequest request) {

        String ip = request.getHeader("x-forwarded-for");
//        if (ip != null && ip.length() != 0 && !"unknown".equalsIgnoreCase(ip)) {
//            // 多次反向代理后会有多个ip值，第一个ip才是真实ip
//            if (ip.indexOf(",") != -1) {
//                ip = ip.split(",")[0];
//            }
//        }
        if (ip == null || ip.length() == 0 || "unknown".equalsIgnoreCase(ip)) {
            ip = request.getHeader("Proxy-Client-IP");
        }
        if (ip == null || ip.length() == 0 || "unknown".equalsIgnoreCase(ip)) {
            ip = request.getHeader("WL-Proxy-Client-IP");
        }
        if (ip == null || ip.length() == 0 || "unknown".equalsIgnoreCase(ip)) {
            ip = request.getHeader("HTTP_CLIENT_IP");
        }
        if (ip == null || ip.length() == 0 || "unknown".equalsIgnoreCase(ip)) {
            ip = request.getHeader("HTTP_X_FORWARDED_FOR");
        }
        if (ip == null || ip.length() == 0 || "unknown".equalsIgnoreCase(ip)) {
            ip = request.getRemoteAddr();
            if ("127.0.0.1".equals(ip) || "0:0:0:0:0:0:0:1".equals(ip)) {
                //根据网卡取本机配置的IP
                InetAddress network = null;
                try {
                    network = InetAddress.getLocalHost();
                } catch (UnknownHostException e) {
                    e.printStackTrace();
                }
                ip = network != null ? network.getHostAddress() : null;
            }
        }
        return ip;
    }
}
