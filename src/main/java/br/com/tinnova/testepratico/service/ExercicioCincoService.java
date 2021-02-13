package br.com.tinnova.testepratico.service;

import java.util.List;

import br.com.tinnova.testepratico.entity.Veiculo;

public interface ExercicioCincoService {
	List<Veiculo> buscarTodosVeiculos();
	List<Veiculo> buscarVeiculoPorNome(String nomeParaBusca);
	Veiculo buscarVeiculoPorId(Long idVeiculo);
	Veiculo criarVeiculo(Veiculo veiculo);
	Veiculo atualizarVeiculo(Veiculo veiculo);
	String atualizarVeiculoParaVendido(Long idVeiculo);
	String apagarVeiculo(Long idVeiculo);
}
