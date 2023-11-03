package org.edu.fabs.formacaojavapadroesprojetospring;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.openfeign.EnableFeignClients;

/**
 * projeto Spring Boot gerado via Spring Initializr.
 * os seguintes módulos foram selecionados:
 * - Spring Data JPA
 * - Spring Web
 * - H2 Database
 * - OpenFeign
 *
 */
@EnableFeignClients
@SpringBootApplication
public class FormacaoJavaPadroesProjetoSpringApplication {

	public static void main(String[] args) {
		SpringApplication.run(FormacaoJavaPadroesProjetoSpringApplication.class, args);
	}

}
