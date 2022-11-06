package at.fhtw.swen3;

import com.fasterxml.jackson.databind.Module;
import lombok.extern.slf4j.Slf4j;
import org.openapitools.jackson.nullable.JsonNullableModule;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;

@Slf4j
@SpringBootApplication
@ComponentScan(basePackages = {"org.openapitools", "at.fhtw.swen3.services" , "at.fhtw.swen3.configuration"})//org.openapitools.configuration
public class OpenApiGeneratorApplication {

    public static void main(String[] args) {
        log.info("SpringBoot [starting...]");
        SpringApplication.run(OpenApiGeneratorApplication.class, args);
        log.info("SpringBoot [starting...]");
    }

    @Bean
    public Module jsonNullableModule() {
        return new JsonNullableModule();
    }

}