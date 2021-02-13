package br.com.tinnova.testepratico.model;

import lombok.Data;

@Data
public class ApuracaoEleicao {
	private int totalEleitores;
	private int votosValidos;
	private int votosBrancos;
	private int votosNulos;
}
