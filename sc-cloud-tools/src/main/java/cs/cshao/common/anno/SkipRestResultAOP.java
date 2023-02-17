package cs.cshao.common.anno;

/*
 * @author cshao
 * @time 2019/12/26
 * @desc SkipRestResultAOP
 */


import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

@Target({ElementType.METHOD})
@Retention(RetentionPolicy.RUNTIME)
public @interface SkipRestResultAOP {
}
