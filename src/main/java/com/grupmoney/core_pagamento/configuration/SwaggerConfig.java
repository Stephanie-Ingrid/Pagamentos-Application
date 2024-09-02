package com.grupmoney.core_pagamento.configuration;

import io.swagger.v3.oas.models.ExternalDocumentation;
import io.swagger.v3.oas.models.OpenAPI;
import io.swagger.v3.oas.models.info.Info;
import io.swagger.v3.oas.models.info.License;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class SwaggerConfig {

    @Bean
    public OpenAPI springShopOpenAPI() {
        return new OpenAPI()
                .info(new Info().title("Pagamentos API")
                        .description("Simula Pagamentos")
                        .version("v0.0.1")
                        .license(new License().name("Linkedin Stephanie Oliveira").url("https://www.linkedin.com/in/stephanie-ingrid-oliveira/")))
                .externalDocs(new ExternalDocumentation()
                        .description("Código Fonte GitHUb")
                        .url("https://github.com/Stephanie-Ingrid/Pagamentos-Application"));
    }
}
