package br.com.tinnova.testepratico.controller.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import br.com.tinnova.testepratico.controller.ExercicioUmController;
import br.com.tinnova.testepratico.model.ApuracaoEleicao;
import br.com.tinnova.testepratico.service.ExercicioUmService;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;

@Api(value="Endpoint exercicio 1", tags= {"ExercicioUm"})
@RestController
@RequestMapping("/v1/api/ex1")
public class ExercicioUmControllerImpl implements ExercicioUmController{
	
	private final ExercicioUmService exercicioUmService;
	
	private ApuracaoEleicao apuracaoEleicao = new ApuracaoEleicao();
	
	@Autowired
	public ExercicioUmControllerImpl(ExercicioUmService exercicioUmService) {
		apuracaoEleicao.setTotalEleitores(1000);
		apuracaoEleicao.setVotosValidos(800);
		apuracaoEleicao.setVotosBrancos(150);
		apuracaoEleicao.setVotosNulos(50);
		this.exercicioUmService = exercicioUmService;
	}

	@Override
	@GetMapping(value = "/perc-validos-total-eleitores")
	@ApiOperation(value="Endpoint para cálculo percentual dos votos validos por total de eleitores")
	public Double calcularPercVotosValidosPorTotalEleitores() {
		return exercicioUmService.calcularPercVotosValidosPorTotalEleitores(apuracaoEleicao.getTotalEleitores(), apuracaoEleicao.getVotosValidos());
	}

	@Override
	@GetMapping(value = "/perc-brancos-total-eleitores")
	@ApiOperation(value="Endpoint para cálculo percentual dos votos brancos por total de eleitores")
	public Double calcularPercVotosBrancosPorTotalEleitores() {
		return exercicioUmService.calcularPercVotosBrancosPorTotalEleitores(apuracaoEleicao.getTotalEleitores(), apuracaoEleicao.getVotosBrancos());
	}

	@Override
	@GetMapping(value = "/perc-nulos-total-eleitores")
	@ApiOperation(value="Endpoint para cálculo percentual dos votos nulos por total de eleitores")
	public Double calcularPercVotosNulosPorTotalEleitores() {
		return exercicioUmService.calcularPercVotosNulosPorTotalEleitores(apuracaoEleicao.getTotalEleitores(), apuracaoEleicao.getVotosNulos());
	}

}
