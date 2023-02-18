package cn.cshao.user.cmpt.swagger.plugin;

import com.fasterxml.classmate.ResolvedType;
import com.google.common.base.Optional;
import io.swagger.annotations.ApiModelProperty;
import org.springframework.stereotype.Component;
import org.springframework.util.StringUtils;
import springfox.documentation.schema.Annotations;
import springfox.documentation.service.AllowableListValues;
import springfox.documentation.spi.DocumentationType;
import springfox.documentation.spi.schema.ModelPropertyBuilderPlugin;
import springfox.documentation.spi.schema.contexts.ModelPropertyContext;
import springfox.documentation.swagger.schema.ApiModelProperties;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

/**
 * @Desc 枚举属性转换插件
 * @Author cshao
 * @Date 2022/22/22 18:39
 **/
@Component
public class EnumValuePropertyPlugin implements ModelPropertyBuilderPlugin {
    @Override
    public void apply(ModelPropertyContext context) {
        Optional<ApiModelProperty> annotation = Optional.absent();

        if (context.getAnnotatedElement().isPresent()) {
            annotation = annotation.or(ApiModelProperties.findApiModePropertyAnnotation(context.getAnnotatedElement().get()));
        }
        if (context.getBeanPropertyDefinition().isPresent()) {
            annotation = annotation.or(Annotations.findPropertyAnnotation(
                    context.getBeanPropertyDefinition().get(),
                    ApiModelProperty.class));
        }
        final Class<?> rawPrimaryType = context.getBeanPropertyDefinition().get().getRawPrimaryType();
        //过滤得到目标类型
        if (annotation.isPresent() && Enum.class.isAssignableFrom(rawPrimaryType)) {
            //获取CodedEnum的code值
            Enum[] values = (Enum[]) rawPrimaryType.getEnumConstants();
            final List<String> displayValues = Arrays.stream(values).map(enumValue -> Integer.toString(enumValue.ordinal())).collect(Collectors.toList());
            // 如果注解没有设置允许的值，则固定设置为int类型
            if (!StringUtils.isEmpty(annotation.get().allowableValues())) {
                final String[] annotationAllowValues = annotation.get().allowableValues().split("\\,");
                final AllowableListValues allowableListValues = new AllowableListValues(Arrays.asList(annotationAllowValues), rawPrimaryType.getTypeName());
                final ResolvedType resolvedType = context.getResolver().resolve(int.class);
                context.getBuilder().allowableValues(allowableListValues).type(resolvedType);
            } else {
                final AllowableListValues allowableListValues = new AllowableListValues(displayValues, rawPrimaryType.getTypeName());
                final ResolvedType resolvedType = context.getResolver().resolve(int.class);
                context.getBuilder().allowableValues(allowableListValues).type(resolvedType);
            }
        }
    }

    @Override
    public boolean supports(DocumentationType documentationType) {
        return true;
    }
}

