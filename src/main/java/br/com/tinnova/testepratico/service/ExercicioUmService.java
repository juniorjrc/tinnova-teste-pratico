package br.com.tinnova.testepratico.service;

public interface ExercicioUmService {
	Double calcularPercVotosValidosPorTotalEleitores(int totalEleitores, int votosValidos);
	Double calcularPercVotosBrancosPorTotalEleitores(int totalEleitores, int votosBrancos);
	Double calcularPercVotosNulosPorTotalEleitores(int totalEleitores, int votosNulos);
}
