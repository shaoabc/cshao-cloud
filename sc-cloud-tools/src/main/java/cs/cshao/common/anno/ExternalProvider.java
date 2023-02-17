package cs.cshao.common.anno;

import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

@Target({ElementType.METHOD, ElementType.TYPE})
@Retention(RetentionPolicy.RUNTIME)
public @interface ExternalProvider {
    // 端来源变量名
    String name() default "origin";
    // 默认来源端
    String[] origins() default {};
    // 端来源缺失
    String errMsg() default "调用来源参数【origin】缺失";
    // 未知端来源
    String mixMsg() default "未知的调用来源【origin：$】";
}
