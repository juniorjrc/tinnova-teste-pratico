package br.com.tinnova.testepratico.controller;

import org.springframework.http.ResponseEntity;

import br.com.tinnova.testepratico.dto.ResponseDto;
import br.com.tinnova.testepratico.entity.Veiculo;

public interface ExercicioCincoController {
	ResponseEntity<ResponseDto> buscarTodosVeiculos();
	ResponseEntity<ResponseDto> buscarVeiculoPorNome(String nomeParaBusca);
	ResponseEntity<ResponseDto> buscarVeiculoPorId(Long idVeiculo);
	ResponseEntity<ResponseDto> criarVeiculo(Veiculo veiculo);
	ResponseEntity<ResponseDto> atualizarVeiculo(Veiculo veiculo);
	ResponseEntity<ResponseDto> atualizarVeiculoParaVendido(Long idVeiculo);
	ResponseEntity<ResponseDto> apagarVeiculo(Long idVeiculo);
}
