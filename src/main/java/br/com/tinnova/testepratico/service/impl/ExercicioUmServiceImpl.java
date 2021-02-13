package br.com.tinnova.testepratico.service.impl;

import org.springframework.stereotype.Service;

import br.com.tinnova.testepratico.service.ExercicioUmService;

@Service
public class ExercicioUmServiceImpl implements ExercicioUmService{

	@Override
	public Double calcularPercVotosValidosPorTotalEleitores(int totalEleitores, int votosValidos) {	
		return (double) (votosValidos * 100) / totalEleitores;
	}

	@Override
	public Double calcularPercVotosBrancosPorTotalEleitores(int totalEleitores, int votosBrancos) {
		return (double) (votosBrancos * 100) / totalEleitores;
	}

	@Override
	public Double calcularPercVotosNulosPorTotalEleitores(int totalEleitores, int votosNulos) {
		return (double) (votosNulos * 100) / totalEleitores;
	}

}
