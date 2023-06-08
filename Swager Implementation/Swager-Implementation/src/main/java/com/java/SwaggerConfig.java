package com.java;


import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import springfox.documentation.builders.ApiInfoBuilder;
import springfox.documentation.builders.ApiListingBuilder;
import springfox.documentation.builders.PathSelectors;
import springfox.documentation.builders.RequestHandlerSelectors;
import springfox.documentation.service.ApiInfo;
import springfox.documentation.spi.DocumentationType;
import springfox.documentation.spring.web.plugins.Docket;
import springfox.documentation.swagger2.annotations.EnableSwagger2;

@Configuration

public class SwaggerConfig<ApiInfo> {
    @Bean
    public Docket api() {
        return new Docket(DocumentationType.SWAGGER_2)
                .select()
                .apis(RequestHandlerSelectors.basePackage("com.javaguides.springbootapplication"))
                .paths(PathSelectors.any())
                .build()
                .apiInfo(apiInfo());
    }


    private springfox.documentation.service.ApiInfo apiInfo() {
        return new ApiInfoBuilder()
                .title("Swagger Application")
                .description("API documentation for My Spring Boot Application")
                .version("1.0.0")
                .build();
    }


}
