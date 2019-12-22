package com.explorecountry.explorecountry.config;

import com.fasterxml.jackson.databind.ObjectMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.client.RestTemplate;
import springfox.documentation.builders.RequestHandlerSelectors;
import springfox.documentation.service.ApiInfo;
import springfox.documentation.service.Contact;
import springfox.documentation.spi.DocumentationType;
import springfox.documentation.spring.web.plugins.Docket;
import springfox.documentation.swagger2.annotations.EnableSwagger2;

import static springfox.documentation.builders.PathSelectors.any;

@Configuration
@EnableSwagger2
public class RestConfig {

    @Bean
    public RestTemplate restTemplate() {
        return  new RestTemplate();
    }
    @Autowired
    public ObjectMapper  objectMapper(){
        return new ObjectMapper();
    }


    @Bean
    public Docket api(){
        return new Docket(DocumentationType.SWAGGER_2).groupName("College").select()
                .apis(RequestHandlerSelectors.basePackage("com.explorecountry.explorecountry.controller"))
                .paths(any()).build().apiInfo(new ApiInfo("College Services",
                        "A set of services to provide data access to College through the zip code", "1.0.0", null,
                        new Contact("Medor Rodrigue", "https://www.altimetrik.com/", null),null, null));
    }

}
