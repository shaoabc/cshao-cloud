package cn.cshao.user.cmpt.security.filter;

import cn.cshao.user.cmpt.security.configure.properties.JwtProperties;
import cn.cshao.user.cmpt.security.utils.JwtTokenUtil;
import cs.cshao.common.exc.FailTokenException;
import cs.cshao.common.utils.thread.ThreadLocalUtils;
import lombok.extern.slf4j.Slf4j;
import org.apache.commons.lang3.StringUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.util.AntPathMatcher;
import org.springframework.util.PathMatcher;
import org.springframework.web.filter.OncePerRequestFilter;

import javax.servlet.FilterChain;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

/**
 * @Desc: 主拦截器
 * @Author: hub5
 * @Date: 2022/11/9 9:16
 **/
@Component
@Slf4j
public class PharmaAuthenticationFilter extends OncePerRequestFilter {

    private static final PathMatcher PATHMATCHER = new AntPathMatcher();

    @Autowired
    private JwtTokenUtil jwtTokenUtil;

    @Override
    protected void doFilterInternal(HttpServletRequest request
            , HttpServletResponse response, FilterChain filterChain) throws ServletException, IOException {
        if (this.isProtectedRequest(request)) {
            JwtProperties jwtProperties = jwtTokenUtil.getJwtProperties();
            String authHeader = request.getHeader(jwtProperties.getHeader());
            if (StringUtils.isBlank(authHeader)) {
                throw new FailTokenException("未携带令牌");
            }
            String authToken = authHeader.trim();
            if (authToken.startsWith(jwtProperties.getTokenPrefix())) {
                authToken = authToken.replace(jwtProperties.getTokenPrefix(), StringUtils.EMPTY);
            }
            ThreadLocalUtils.init(request, response);
            ThreadLocalUtils.setToken(authToken.trim());
        }
        filterChain.doFilter(request, response);
    }

    private Boolean isProtectedRequest(HttpServletRequest httpServletRequest) {
        return PATHMATCHER.match("/api/**", httpServletRequest.getServletPath())
                && !PATHMATCHER.match("/api/*/login/sendSms", httpServletRequest.getServletPath())
                && !PATHMATCHER.match("/api/*/login/codeAuth", httpServletRequest.getServletPath())
                && !PATHMATCHER.match("/api/*/login/acctAuth", httpServletRequest.getServletPath());
    }

}
