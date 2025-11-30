package com.sellit.config;

import io.swagger.v3.oas.models.OpenAPI;
import io.swagger.v3.oas.models.info.Contact;
import io.swagger.v3.oas.models.info.Info;
import io.swagger.v3.oas.models.info.License;
import io.swagger.v3.oas.models.servers.Server;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import java.util.List;

@Configuration
public class OpenApiConfig {

    @Bean
    public OpenAPI sellitOpenAPI() {
        return new OpenAPI()
                .info(new Info()
                        .title("Sellit API")
                        .version("1.0.0")
                        .description("Simple REST API for a small shop application")
                        .contact(new Contact()
                                .name("Sellit Team")
                                .email("equipediscord@sellit.com")
                        )
                        .license(new License()
                                .name("MIT License")
                                .url("https://opensource.org/licenses/MIT")
                        )
                )
                .servers(List.of(
                        new Server()
                                .url("http://localhost:8081")
                                .description("Development server")
                ));
    }
}
