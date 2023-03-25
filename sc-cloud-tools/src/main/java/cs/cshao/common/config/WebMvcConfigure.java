package cs.cshao.common.config;

import com.google.common.collect.Lists;
import cs.cshao.common.config.bean.InterceptorCondition;
import org.apache.commons.lang3.ArrayUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.servlet.config.annotation.*;

import java.util.List;

@Configuration
public class WebMvcConfigure extends WebMvcConfigurationSupport {

    @Autowired(required = false)
    private List<InterceptorCondition> interceptorConditions = Lists.newArrayList();

    @Override
    public final void addInterceptors(InterceptorRegistry registry) {
        /**
         * 业务服务拦截器
         */
        this.interceptorConditions.forEach(addition -> {
            InterceptorRegistration registration = registry.addInterceptor(addition.getInterceptor());
            if (ArrayUtils.isNotEmpty(addition.getAddPathPatterns())) {
                registration.addPathPatterns(addition.getAddPathPatterns());
            }
            if (ArrayUtils.isNotEmpty(addition.getExcludePathPatterns())) {
                registration.excludePathPatterns(addition.getExcludePathPatterns());
            }
            if (null != addition.getPathMatcher()) {
                registration.pathMatcher(addition.getPathMatcher());
            }
            registry.addInterceptor(addition.getInterceptor()).excludePathPatterns("/doc.html");
        });

    }

    @Override
    public void configurePathMatch(PathMatchConfigurer configurer) {
        //如果设置true "/user" 就会匹配 "/user.*",也就是说,"/user.html" 的请求会被 "/user" 的 Controller所拦截.
        configurer.setUseSuffixPatternMatch(false);
    }

    @Override
    public void addResourceHandlers(ResourceHandlerRegistry registry) {
        registry.addResourceHandler("/**").addResourceLocations(
                "classpath:/static/");
        registry.addResourceHandler("doc.html").addResourceLocations(
                "classpath:/META-INF/resources/");
        registry.addResourceHandler("/webjars/**").addResourceLocations(
                "classpath:/META-INF/resources/webjars/");
        super.addResourceHandlers(registry);
    }
}
