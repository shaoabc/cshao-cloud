package cn.cshao.user.cmpt.security.filter;

import cn.cshao.user.cmpt.security.model.AuthUser;
import cn.cshao.user.cmpt.security.utils.JwtTokenUtil;
import cs.cshao.common.enums.ClientOriginEnum;
import cs.cshao.common.exc.FailTokenException;
import cs.cshao.common.utils.thread.ThreadLocalUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.authentication.UsernamePasswordAuthenticationToken;
import org.springframework.security.core.GrantedAuthority;
import org.springframework.security.core.context.SecurityContextHolder;
import org.springframework.security.web.authentication.WebAuthenticationDetailsSource;
import org.springframework.stereotype.Component;
import org.springframework.util.AntPathMatcher;
import org.springframework.util.PathMatcher;
import org.springframework.web.filter.OncePerRequestFilter;

import javax.servlet.FilterChain;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.util.Collection;

/**
 * @Desc: 患者端鉴权
 * @Author: cshao
 * @Date: 2022/11/9 9:15
 **/
@Component
public class PatientAuthenticationFilter extends OncePerRequestFilter {

    private static final PathMatcher PATHMATCHER = new AntPathMatcher();

    @Autowired
    private JwtTokenUtil jwtTokenUtil;

    @Override
    protected void doFilterInternal(HttpServletRequest request, HttpServletResponse response, FilterChain filterChain) throws ServletException, IOException {
        if (this.isProtectedRequest(request)) {
            String authToken = ThreadLocalUtils.getToken();
            if (jwtTokenUtil.isTokenExpired(authToken, ClientOriginEnum.SLL_PTS.getSecret())) {
                throw new FailTokenException("令牌已过期，请重新登录");
            } else {
                final AuthUser platUser = jwtTokenUtil.toAuthUser(authToken, ClientOriginEnum.SLL_PTS.getSecret());
                final Collection<? extends GrantedAuthority> authorities = jwtTokenUtil.getAuthorities(authToken, ClientOriginEnum.SLL_PTS.getSecret());
                // 这里只要告诉SpringSecurity权限即可，账户密码就不用提供验证了，这里我们把UserDetails传给SpringSecurity，以便以后我们获取当前登录用户
                UsernamePasswordAuthenticationToken authentication = new UsernamePasswordAuthenticationToken(platUser, null, authorities);
                authentication.setDetails(new WebAuthenticationDetailsSource().buildDetails(request));
                SecurityContextHolder.getContext().setAuthentication(authentication);
                ThreadLocalUtils.setUserId(platUser.getUserId());
            }
        }
        filterChain.doFilter(request, response);
    }

    private Boolean isProtectedRequest(HttpServletRequest httpServletRequest) {
        return PATHMATCHER.match("/api/patient/**", httpServletRequest.getServletPath())
                && !PATHMATCHER.match("/api/*/login/sendSms", httpServletRequest.getServletPath())
                && !PATHMATCHER.match("/api/*/login/codeAuth", httpServletRequest.getServletPath())
                && !PATHMATCHER.match("/api/*/login/acctAuth", httpServletRequest.getServletPath());
    }
}
