package com.Config;

import java.util.Collections;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.bind.annotation.RestController;
import springfox.documentation.builders.PathSelectors;
import springfox.documentation.builders.RequestHandlerSelectors;
import springfox.documentation.service.ApiInfo;
import springfox.documentation.service.Contact;
import springfox.documentation.spi.DocumentationType;
import springfox.documentation.spring.web.plugins.Docket;
import springfox.documentation.swagger2.annotations.EnableSwagger2;
/*
Configuracion Swagger  para la documentacion de la Api Rest
Con depedencia SpringFox Boot Starter
http://localhost:8080/swagger-ui/

*/


@Configuration
public class SwaggerConfig {
   
    @Bean
    public Docket api(){
        return  new Docket(DocumentationType.SWAGGER_2)
                .select()
                .apis(RequestHandlerSelectors.withClassAnnotation(RestController.class))
                .paths(PathSelectors.any())
                .build()
                .apiInfo(apiDetails());
                
    }
     private ApiInfo apiDetails(){
        return new ApiInfo("Spring Boot API REST",
                "Library Api rest docs",
                "1.0",
                "http://www.example.com",
                new Contact("Miguel Medel", "http://www.example.com", "miguel@url.com"),
                "MIT",
                "http://www.example.com",
                Collections.emptyList());
    }

    
}
