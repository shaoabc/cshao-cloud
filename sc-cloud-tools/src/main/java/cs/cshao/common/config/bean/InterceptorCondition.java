package cs.cshao.common.config.bean;

import org.springframework.util.PathMatcher;
import org.springframework.web.servlet.HandlerInterceptor;

/**
 * @Desc 拦截器信息封装类 用与拦截器注入
 * @Author hub5
 * @Date 2022/12/12 8:26
 **/
public class InterceptorCondition {

    private HandlerInterceptor interceptor;

    /**
     * 拦截器匹配规则
     */
    private String[] excludePathPatterns;
    private PathMatcher pathMatcher;
    private String[] addPathPatterns;

    /**
     * 创建拦截器实例 InterceptorAddition.build()
     *
     * @param interceptor
     * @return
     * @Author mudou
     * @Date 2017年11月16日
     * @since 1.0.0
     */
    public static InterceptorCondition build(HandlerInterceptor interceptor) {
        InterceptorCondition addition = new InterceptorCondition();
        addition.interceptor = interceptor;
        return addition;
    }

    public InterceptorCondition excludePathPatterns(String... excludePathPatterns) {
        this.excludePathPatterns = excludePathPatterns;
        return this;
    }

    public InterceptorCondition pathMatcher(PathMatcher pathMatcher) {
        this.pathMatcher = pathMatcher;
        return this;
    }

    public InterceptorCondition addPathPatterns(String... addPathPatterns) {
        this.addPathPatterns = addPathPatterns;
        return this;
    }

    // ========================================

    public HandlerInterceptor getInterceptor() {
        return this.interceptor;
    }

    public String[] getExcludePathPatterns() {
        return this.excludePathPatterns;
    }

    public PathMatcher getPathMatcher() {
        return this.pathMatcher;
    }

    public String[] getAddPathPatterns() {
        return this.addPathPatterns;
    }
    // ========================================
}
