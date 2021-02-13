package br.com.tinnova.testepratico.config;

import springfox.documentation.service.ApiInfo;
import springfox.documentation.spring.web.plugins.Docket;

public interface SwaggerConfig {
	Docket api();
	ApiInfo apiInfo();
}
