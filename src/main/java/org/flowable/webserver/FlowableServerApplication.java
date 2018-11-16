package org.flowable.webserver;

import org.flowable.app.properties.FlowableModelerAppProperties;
import org.flowable.webserver.config.SwaggerConfig;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.liquibase.LiquibaseAutoConfiguration;
import org.springframework.boot.autoconfigure.security.servlet.UserDetailsServiceAutoConfiguration;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;
import org.springframework.cloud.openfeign.EnableFeignClients;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Import;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurer;


/**
 * @author: create by lisl
 * @version: v1.0
 * @description:
 * @date:2018/11/9
 */
@SpringBootApplication(
        exclude= {
                org.flowable.spring.boot.SecurityAutoConfiguration.class,
                org.springframework.boot.autoconfigure.security.servlet.SecurityAutoConfiguration.class,
                UserDetailsServiceAutoConfiguration.class,
                LiquibaseAutoConfiguration.class
        }
)
@EnableEurekaClient
@EnableFeignClients
public class FlowableServerApplication {
    public FlowableServerApplication() {
    }

    public static void main(String[] args) {
        SpringApplication.run(FlowableServerApplication.class, args);
    }
    @Bean
    public FlowableModelerAppProperties flowableModelerAppProperties() {
        FlowableModelerAppProperties flowableModelerAppProperties=new FlowableModelerAppProperties();
        return flowableModelerAppProperties;
    }

}
