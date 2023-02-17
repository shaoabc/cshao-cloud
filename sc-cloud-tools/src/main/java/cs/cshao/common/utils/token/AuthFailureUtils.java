package cs.cshao.common.utils.token;

import com.alibaba.fastjson.JSONObject;
import cs.cshao.common.cons.Constants;
import org.springframework.http.MediaType;

import javax.servlet.http.HttpServletResponse;
import java.io.PrintWriter;

/**
 * @Desc: AuthFailureUtils
 * @Author: cshao
 * @Date: 2022/9/30 16:33
 **/
public class AuthFailureUtils {

    public static void doResponse401(HttpServletResponse response, String msg) {
        JSONObject jsonObject = new JSONObject();
        PrintWriter out = null;
        try {
            response.setStatus(Constants.UNAUTHORIZED_ERROR_CODE);
            response.setContentType(MediaType.APPLICATION_JSON_VALUE);
            response.setCharacterEncoding("UTF-8");
            jsonObject.put("code", response.getStatus());
            jsonObject.put("msg", msg);
            out = response.getWriter();
            out.println(jsonObject);
        } catch (Exception e) {
            e.printStackTrace();
        } finally {
            if (null != out) {
                out.flush();
                out.close();
            }
        }
    }

}
