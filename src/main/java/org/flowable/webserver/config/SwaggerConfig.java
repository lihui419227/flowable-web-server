package org.flowable.webserver.config;

import com.google.common.base.Predicate;
import com.google.common.base.Predicates;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import springfox.documentation.RequestHandler;
import springfox.documentation.builders.ApiInfoBuilder;
import springfox.documentation.builders.ParameterBuilder;
import springfox.documentation.builders.PathSelectors;
import springfox.documentation.builders.RequestHandlerSelectors;
import springfox.documentation.schema.ModelRef;
import springfox.documentation.service.Contact;
import springfox.documentation.service.Parameter;
import springfox.documentation.spi.DocumentationType;
import springfox.documentation.spring.web.plugins.Docket;
import springfox.documentation.swagger2.annotations.EnableSwagger2;

import java.util.ArrayList;
import java.util.List;
@Configuration
@EnableSwagger2
public class SwaggerConfig {
    @Bean
    public Docket swaggerPluggin() {
        Predicate<RequestHandler> selector1=RequestHandlerSelectors.basePackage("org.flowable.rest");
        Predicate<RequestHandler> selector2=RequestHandlerSelectors.basePackage("org.flowable.webserver");
        return new Docket(DocumentationType.SWAGGER_2)
        		.globalOperationParameters(createGlobalParams())
                .select()
                .apis(Predicates.or(selector1,selector2))
                .paths(PathSelectors.any())
                .build()
                .apiInfo(new ApiInfoBuilder()
                        .title("流程服务客户端v3列表")
                        .description("©2018 Copyright. Powered By Resource Link Ltd.")
                        .contact(new Contact("admin", "http://www.crc.com.cn", "admin@crc.com.hk"))
                        .license("报账3.0升级小组")
                        .build())
                .useDefaultResponseMessages(false);
    }

    private List<Parameter> createGlobalParams(){
        List<Parameter> aParameters = new ArrayList<Parameter>();

        //可以添加多个header或参数
        ParameterBuilder aParameterBuilder = new ParameterBuilder();
        aParameterBuilder
                .parameterType("header") //参数类型支持header, cookie, body, query etc
                .name("crctoken") //参数名
                .defaultValue("crctoken#000") //默认值
                .description("header中crctoken字段")
                .modelRef(new ModelRef("string"))//指定参数值的类型
                .required(false).build(); //非必需，这里是全局配置，然而在登陆的时候是不用验证的

        aParameters.add(aParameterBuilder.build());

        return aParameters;
    }
}
