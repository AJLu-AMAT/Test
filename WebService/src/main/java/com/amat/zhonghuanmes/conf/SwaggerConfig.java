package com.amat.zhonghuanmes.conf;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import springfox.documentation.builders.PathSelectors;
import springfox.documentation.builders.RequestHandlerSelectors;
import springfox.documentation.service.ApiInfo;
import springfox.documentation.service.Contact;
import springfox.documentation.spi.DocumentationType;
import springfox.documentation.spring.web.plugins.Docket;
import springfox.documentation.swagger2.annotations.EnableSwagger2;

import java.util.Collections;

@Configuration
@EnableSwagger2
public class SwaggerConfig {
    @Bean
    public Docket api(){
        return new Docket(DocumentationType.SWAGGER_2)
                .select()
                .apis(RequestHandlerSelectors.any())
                .paths(PathSelectors.any())
                .build()
                //.useDefaultResponseMessages(false) //自定义响应消息
                .apiInfo(apiInfo());
    }

    //Add customer API info
    private ApiInfo apiInfo() {
        return new ApiInfo(
                "ZhongHuan Webservice",
                "AMAT Url: https://amat.com ",
                "API V1.0",
                "AMAT Terms of Webservice",
                new Contact("amat", "https://amat.com", "support@amat.com"),
                "Apache",
                "http://wwww.apache.org/",
                Collections.emptyList());

    }
}
