package br.com.tinnova.testepratico.controller.impl;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import br.com.tinnova.testepratico.controller.ExercicioTresController;
import br.com.tinnova.testepratico.service.ExercicioTresService;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;

@Api(value="Endpoint exercicio 3", tags= {"ExercicioTres"})
@RestController
@RequestMapping("/v1/api/ex3")
public class ExercicioTresControllerImpl implements ExercicioTresController{
	
	private final ExercicioTresService exercicioTresService;

	public ExercicioTresControllerImpl(ExercicioTresService exercicioTresService) {
		this.exercicioTresService = exercicioTresService;
	}

	@Override
	@GetMapping(value = "/calcular-fatorial/{numeroParaFatorar}")
	@ApiOperation(value="Endpoint para cálculo do fatorial de acordo com o número informado")
	public int calcularFatorial(@PathVariable("numeroParaFatorar") int numeroParaFatorar) {
		return exercicioTresService.calcularFatorial(numeroParaFatorar);
	}

}
