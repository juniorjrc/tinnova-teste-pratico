package br.com.tinnova.testepratico.controller.impl;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import br.com.tinnova.testepratico.controller.ExercicioQuatroController;
import br.com.tinnova.testepratico.service.ExercicioQuatroService;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;

@Api(value="Endpoint exercicio 4", tags= {"ExercicioQuatro"})
@RestController
@RequestMapping("/v1/api/ex4")
public class ExercicioQuatroControllerImpl implements ExercicioQuatroController{
	
	private final ExercicioQuatroService exercicioQuatroService;

	public ExercicioQuatroControllerImpl(ExercicioQuatroService exercicioQuatroService) {
		this.exercicioQuatroService = exercicioQuatroService;
	}

	@Override
	@GetMapping(value = "/multiplos")
	@ApiOperation(value="Endpoint para cálculo dos múltiplos de 3 e 5 a partir de determinado número inteiro")
	public String calcularMultiplosDeTresECinco(int numeroParaCalcular) {
		return String.format("A soma dos multiplos de 3 e 5 abaixo de %s é %s", numeroParaCalcular, exercicioQuatroService.calcularMultiplosDeTresECinco(numeroParaCalcular));
	}

}
