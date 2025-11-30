package com.sellit;

import io.swagger.v3.oas.annotations.OpenAPIDefinition;
import io.swagger.v3.oas.annotations.info.Contact;
import io.swagger.v3.oas.annotations.info.Info;
import io.swagger.v3.oas.annotations.info.License;
import io.swagger.v3.oas.annotations.servers.Server;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
@OpenAPIDefinition(
    info = @Info(
        title = "Sellit API",
        version = "1.0.0",
        description = "Simple REST API for a small shop application",
        contact = @Contact(
            name = "Sellit Team",
            email = "contact@sellit.com"
        ),
        license = @License(
            name = "MIT License",
            url = "https://opensource.org/licenses/MIT"
        )
    ),
    servers = {
        @Server(
            url = "http://localhost:8080",
            description = "Development server"
        )
    }
)
public class SellitApplication {

    public static void main(String[] args) {
        SpringApplication.run(SellitApplication.class, args);
    }

}
