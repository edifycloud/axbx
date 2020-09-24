package net.sk32.axbx.gateway;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import springfox.documentation.oas.annotations.EnableOpenApi;

@EnableOpenApi
@SpringBootApplication
public class AxbxGatewayApplication {

    public static void main(String[] args) {
        SpringApplication.run(AxbxGatewayApplication.class, args);
    }

}
