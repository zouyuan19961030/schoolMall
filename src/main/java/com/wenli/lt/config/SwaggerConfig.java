package com.wenli.lt.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import springfox.documentation.builders.RequestHandlerSelectors;
import springfox.documentation.service.ApiInfo;
import springfox.documentation.service.Contact;
import springfox.documentation.spi.DocumentationType;
import springfox.documentation.spring.web.plugins.Docket;
import springfox.documentation.swagger2.annotations.EnableSwagger2;

import java.util.ArrayList;

@Configuration
@EnableSwagger2
public class SwaggerConfig {

    //配置swagger docket的bean实例
    @Bean
    public Docket docket(){
        return new Docket(DocumentationType.SWAGGER_2)
                .apiInfo(apiInfo())
                .select()
                //配置要扫描接口的方式
                .apis(RequestHandlerSelectors.basePackage("com.sgcc.orgmanage.controller"))
                .build();
    }

    private ApiInfo apiInfo(){

        //作者信息
        Contact contact = new Contact("Shane", "http://localhost:8080/swagger-ui.html", "mxwm0729@163.com");
        return new ApiInfo(
                "二手商场API文档",
                "该API文档包含后台管理、商城展示相关接口",
                "1.0",
                "http://localhost:8080/swagger-ui.html",
                contact,
                "Apache 2.0",
                "http://www.apache.org/licenses/LICENSE-2.0",
                new ArrayList());
    }
}
