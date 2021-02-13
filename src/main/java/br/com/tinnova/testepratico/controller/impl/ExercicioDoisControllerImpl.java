package br.com.tinnova.testepratico.controller.impl;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import br.com.tinnova.testepratico.controller.ExercicioDoisController;
import br.com.tinnova.testepratico.service.ExercicioDoisService;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;

@Api(value="Endpoint exercicio 2", tags= {"ExercicioDois"})
@RestController
@RequestMapping("/v1/api/ex2")
public class ExercicioDoisControllerImpl implements ExercicioDoisController{
	private final ExercicioDoisService exercicioDoisService;

	public ExercicioDoisControllerImpl(ExercicioDoisService exercicioDoisService) {
		this.exercicioDoisService = exercicioDoisService;
	}

	@Override
	@GetMapping(value = "/ordenar")
	@ApiOperation(value="Endpoint para ordenação de vetores pelo algorítimo Bubble Sort")
	public String ordenarPorBubbleSort() {
		return exercicioDoisService.ordenarPorBubbleSort();
	}
}
