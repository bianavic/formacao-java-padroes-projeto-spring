package org.edu.fabs.formacaojavapadroesprojetospring.config;

import io.swagger.v3.oas.models.ExternalDocumentation;
import io.swagger.v3.oas.models.OpenAPI;
import io.swagger.v3.oas.models.info.Info;
import io.swagger.v3.oas.models.info.License;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class SwaggerConfig {

    @Bean
    public OpenAPI apiDetail() {

        return new OpenAPI()
                .info(new Info().title("Rest API")
                        .contact(new io.swagger.v3.oas.models.info.Contact().name("Exemplo").email("exemplo@email.com"))
                        .description("API - exemplo de Springboot REST API aplicando conceitos de padroes de projeto")
                        .version("1.0")
                        .license(new License().name("Apache 2.0").url("http://springdoc.org")))
                .externalDocs(new ExternalDocumentation());
    }

}