package cs.cshao.common.anno;

import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

@Target({ElementType.METHOD, ElementType.TYPE})
@Retention(RetentionPolicy.RUNTIME)
public @interface GlobalGenericAdvise {

    String originHeaderName() default "clientOrigin";

    String blankOriginErrMsg() default "须注明客户端请求参数【clientOrigin】";

    String mixedOriginErrMsg() default "未知的客户端请求参数【clientOrigin】";
}
