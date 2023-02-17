package cs.cshao.common.anno;

import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

/**
 * @desc 不需要通过token验证的地方可自行添加该注解
 * @author shaochen
 * @time 2022-12-24
 *
 * */
@Target({ElementType.METHOD, ElementType.TYPE})
@Retention(RetentionPolicy.RUNTIME)
public @interface DisableAuthToken {

}