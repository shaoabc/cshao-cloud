package cn.cshao.user.cmpt.security.handler;

import org.springframework.security.access.AccessDeniedException;
import org.springframework.security.web.access.AccessDeniedHandler;
import org.springframework.stereotype.Component;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

/**
 * @fileName: JwtAccessDeniedHandler
 * @description: Spring security权限不足处理类
 * 只有登录后（即接口有传token）接口权限不足才会进入AccessDeniedHandler，
 * 如果是未登陆或者会话超时等，不会触发AccessDeniedHandler，而是会直接跳转到登陆页面
 * @author: 李阳
 * @create: 2020-04-27 23:43
 **/
@Component
public class JwtAccessDeniedHandler implements AccessDeniedHandler {
    @Override
    public void handle(HttpServletRequest request, HttpServletResponse response, AccessDeniedException e) throws IOException {
        //登陆状态下，权限不足执行该方法
        response.sendError(HttpServletResponse.SC_FORBIDDEN, "AccessDenied");
    }
}
