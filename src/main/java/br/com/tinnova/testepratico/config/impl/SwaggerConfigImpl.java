package br.com.tinnova.testepratico.config.impl;

import java.util.Collections;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import br.com.tinnova.testepratico.config.SwaggerConfig;
import springfox.documentation.builders.PathSelectors;
import springfox.documentation.builders.RequestHandlerSelectors;
import springfox.documentation.service.ApiInfo;
import springfox.documentation.service.Contact;
import springfox.documentation.spi.DocumentationType;
import springfox.documentation.spring.web.plugins.Docket;
import springfox.documentation.swagger2.annotations.EnableSwagger2;

@Configuration
@EnableSwagger2
public class SwaggerConfigImpl implements SwaggerConfig{
	
	@Override
	@Bean
	public Docket api() {
		return new Docket(DocumentationType.SWAGGER_2)
				.select()
				.apis(RequestHandlerSelectors.basePackage("br.com.tinnova.testepratico"))
				.paths(PathSelectors.any())
				.build()
				.apiInfo(apiInfo());
	}

	@Override
	public ApiInfo apiInfo() {
		return new ApiInfo("API Tinnova",
				"API responsável pela estrutura do teste prático desenvolvido junto à tinnova",
				 "v1", 
				 "Licença",
				 new Contact("Tinnova", "www.tinnova.com.br", "rh@tinnova.com.br"),
				 "Free",
				 " ",
				 Collections.emptyList());
	}


}
