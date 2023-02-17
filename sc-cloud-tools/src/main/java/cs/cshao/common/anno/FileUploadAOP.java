package cs.cshao.common.anno;

/*
 * @author cshao
 * @time 2020-4-03
 * @desc FileUploadAOP 文件上传
 */


import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

@Target({ElementType.METHOD})
@Retention(RetentionPolicy.RUNTIME)
public @interface FileUploadAOP {
}
