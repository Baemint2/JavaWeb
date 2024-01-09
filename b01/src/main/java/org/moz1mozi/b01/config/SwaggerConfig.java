package org.moz1mozi.b01.config;

import org.springdoc.core.models.GroupedOpenApi;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class SwaggerConfig {

    @Bean
    public GroupedOpenApi restApi(){

        return GroupedOpenApi.builder()
                .pathsToMatch("/replies/**")
                .group("REST API")
                .build();
    }

    @Bean
    public GroupedOpenApi commonApi() {

        return GroupedOpenApi.builder()
                .pathsToMatch("/**/*")
                .pathsToExclude("/replies/**/*")
                .group("COMMON API")
                .build();
    }
}
