package cn.cshao.user.cmpt.security.interceptor;

import cn.cshao.user.cmpt.security.utils.JwtTokenUtil;
import com.alibaba.fastjson.JSON;
import cs.cshao.common.anno.DisableAuthToken;
import cs.cshao.common.anno.ExternalProvider;
import cs.cshao.common.anno.GlobalGenericAdvise;
import cs.cshao.common.enums.ClientExtEnum;
import cs.cshao.common.enums.ClientOriginEnum;
import cs.cshao.common.exc.UserException;
import cs.cshao.common.utils.thread.ThreadLocalUtils;
import lombok.extern.slf4j.Slf4j;
import org.apache.commons.lang3.StringUtils;
import org.springframework.web.method.HandlerMethod;
import org.springframework.web.servlet.HandlerInterceptor;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.lang.reflect.Method;
import java.util.Arrays;

@Slf4j
public class GenericInterceptor implements HandlerInterceptor {

    private JwtTokenUtil jwtTokenUtil;

    public GenericInterceptor(JwtTokenUtil jwtTokenUtil) {
        this.jwtTokenUtil = jwtTokenUtil;
    }

    @Override
    public boolean preHandle(HttpServletRequest request
            , HttpServletResponse response, Object handler) throws Exception {
        request.setCharacterEncoding("UTF-8");
        response.setCharacterEncoding("UTF-8");
        if (!(handler instanceof HandlerMethod)) {
            return true;
        }
        HandlerMethod handlerMethod = (HandlerMethod) handler;
        Method method = handlerMethod.getMethod();
        // 不需要令牌
        if (null == method.getAnnotation(DisableAuthToken.class)
                && null == handlerMethod.getBeanType()
                .getAnnotation(DisableAuthToken.class)) {
            // 端令牌校验
            if (null != method.getAnnotation(GlobalGenericAdvise.class)
                    || null != handlerMethod.getBeanType()
                    .getAnnotation(GlobalGenericAdvise.class)) {
                GlobalGenericAdvise gcAnno = method.getAnnotation(GlobalGenericAdvise.class);
                //获取token并判断是否为空
                log.info("GenericInterceptor-gcAnno:{}", JSON.toJSONString(gcAnno));
                String origin = request.getHeader(gcAnno.originHeaderName());
                log.info("GenericInterceptor-origin:{}", JSON.toJSONString(origin));
                String secret = null;
                if (StringUtils.isBlank(origin) || StringUtils.isBlank(origin.trim())) {
                    throw new UserException(gcAnno.blankOriginErrMsg());
                } else if (null != (secret = ClientOriginEnum.getSecretByCode(origin))) {
                    return !jwtTokenUtil.isTokenExpired(ThreadLocalUtils.getToken(), secret);
                } else {
                    throw new UserException(gcAnno.mixedOriginErrMsg());
                }
            }
            // 对外接口调用端令牌校验
            if (null != method.getAnnotation(ExternalProvider.class)
                    || null != handlerMethod.getBeanType()
                    .getAnnotation(ExternalProvider.class)) {
                ExternalProvider ep = method.getAnnotation(ExternalProvider.class);
                String origin = request.getHeader(ep.name());
                // 缺失来源参数
                if (StringUtils.isBlank(origin)) {
                    throw new UserException(ep.errMsg());
                }
                // 未知来源参数
                if (!Arrays.stream(ep.origins())
                        .anyMatch(ogn -> origin.equals(ogn))) {
                    throw new UserException(StringUtils
                            .replace(ep.mixMsg(), "$", origin));
                }
                return !jwtTokenUtil.isTokenExpired(ThreadLocalUtils
                        .getToken(), ClientExtEnum.getSecretByCode(origin));
            }
        }
        return true;
    }

}
