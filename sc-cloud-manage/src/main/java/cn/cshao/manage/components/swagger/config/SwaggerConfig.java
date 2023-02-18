package cn.cshao.manage.components.swagger.config;

import com.github.xiaoymin.knife4j.spring.annotations.EnableKnife4j;
import com.google.common.base.Predicate;
import com.google.common.base.Predicates;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Import;
import springfox.bean.validators.configuration.BeanValidatorPluginsConfiguration;
import springfox.documentation.builders.ApiInfoBuilder;
import springfox.documentation.builders.PathSelectors;
import springfox.documentation.builders.RequestHandlerSelectors;
import springfox.documentation.service.ApiInfo;
import springfox.documentation.service.AuthorizationScope;
import springfox.documentation.service.Contact;
import springfox.documentation.service.SecurityReference;
import springfox.documentation.spi.DocumentationType;
import springfox.documentation.spi.service.contexts.SecurityContext;
import springfox.documentation.spring.web.plugins.Docket;
import springfox.documentation.swagger2.annotations.EnableSwagger2;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

/**
 * @fileName: SwaggerConfig
 * @description: Swagger配置
 * @author: cshao
 * @create: 2022-12-27 22:52
 **/
@Configuration
@EnableSwagger2
@EnableKnife4j
@Import(BeanValidatorPluginsConfiguration.class)
public class SwaggerConfig {

    /**
     * 	默认的排除路径，排除Spring Boot默认的错误处理路径和端点
     */
    private static final List<String> DEFAULT_EXCLUDE_PATH = Arrays.asList("/error","/actuator/**");
    private static final String BASE_PATH = "/**";


    @Bean
    public Docket defaultApi2() {

        List<Predicate<String>> basePath = new ArrayList();
        basePath.add(PathSelectors.ant(BASE_PATH));

        List<Predicate<String>> excludePath = new ArrayList<>();
        DEFAULT_EXCLUDE_PATH.forEach(path -> excludePath.add(PathSelectors.ant(path)));

        Docket docket=new Docket(DocumentationType.SWAGGER_2)
                .host("")
                .apiInfo(apiInfo())
                //分组名称
                .groupName("1.0版本")
                .select()
                //这里指定Controller扫描包路径
                .apis(RequestHandlerSelectors.basePackage("cn.cshao.manage.controller"))
//                .paths(Predicates.and(Predicates.not(Predicates.or(excludePath)), Predicates.or(basePath)))
                .build()
//                .securityContexts(Collections.singletonList(securityContext()))
                .useDefaultResponseMessages(false)
                .pathMapping("/");
        return docket;
    }

    private ApiInfo apiInfo() {
        return new ApiInfoBuilder()
                .title("cshao springCloud API")
                .description("Created By Cshao")
                .license("Powered By Cshao")
                .contact(new Contact("Cshao", "", ""))
                .version("1.0")
                .build();
    }

    /**
     * 配置默认的全局鉴权策略的开关，通过正则表达式进行匹配；默认匹配所有URL
     *
     * @return
     */
    private SecurityContext securityContext() {
        return SecurityContext.builder()
                .securityReferences(defaultAuth())
                .forPaths(PathSelectors.regex("^.*$"))
                .build();
    }

    /**
     * 默认的全局鉴权策略
     *
     * @return
     */
    private List<SecurityReference> defaultAuth() {
        ArrayList<AuthorizationScope> authorizationScopeList = new ArrayList<>();
        authorizationScopeList.add(new AuthorizationScope("global","accessEverything"));

        AuthorizationScope[] authorizationScopes = new AuthorizationScope[authorizationScopeList.size()];
        return Collections.singletonList(SecurityReference.builder()
                .reference("OAuth")
                .scopes(authorizationScopeList.toArray(authorizationScopes))
                .build());
    }


}
