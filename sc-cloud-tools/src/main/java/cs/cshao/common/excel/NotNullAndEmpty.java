package cs.cshao.common.excel;

import java.lang.annotation.*;

/**
 * @Desc 空注解
 * @Author cshao
 * @Date 2023/2/24 9:07
 **/
@Target({ElementType.FIELD})
@Retention(RetentionPolicy.RUNTIME)
@Documented
public @interface NotNullAndEmpty {

    String message() default "不可为Null或空";

}
