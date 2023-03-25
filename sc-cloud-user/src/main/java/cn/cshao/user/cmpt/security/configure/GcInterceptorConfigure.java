package cn.cshao.user.cmpt.security.configure;


import cn.cshao.user.cmpt.security.interceptor.GenericInterceptor;
import cn.cshao.user.cmpt.security.utils.JwtTokenUtil;
import cs.cshao.common.config.bean.InterceptorCondition;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

/**
 * @Desc 拦截器配置
 * @Author hub5
 * @Date 2022/12/12 8:30
 **/
@Configuration
public class GcInterceptorConfigure {

    @Autowired
    private JwtTokenUtil jwtTokenUtil;

    @Bean
    public InterceptorCondition genericInterceptor() {
        return InterceptorCondition.build(new GenericInterceptor(jwtTokenUtil)).addPathPatterns("/api/**");
    }

}