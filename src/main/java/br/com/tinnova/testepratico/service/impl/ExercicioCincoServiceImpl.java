package br.com.tinnova.testepratico.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import br.com.tinnova.testepratico.entity.Veiculo;
import br.com.tinnova.testepratico.exception.FalhaTransacaoException;
import br.com.tinnova.testepratico.repository.VeiculoRepository;
import br.com.tinnova.testepratico.service.ExercicioCincoService;

@Service
public class ExercicioCincoServiceImpl implements ExercicioCincoService{
	
	@Autowired
	VeiculoRepository veiculoRepository;
	
	private static final String MENSAGEM_FALHA_COMUNICACAO = "Falha na comunicação com o banco de dados";

	@Override
	public List<Veiculo> buscarTodosVeiculos() {
		try {
			return veiculoRepository.findAll();
		} catch (Exception e) {
			e.printStackTrace();
			throw new FalhaTransacaoException(MENSAGEM_FALHA_COMUNICACAO, e);
		}
	}

	@Override
	public List<Veiculo> buscarVeiculoPorNome(String nomeParaBusca) {
		try {
			return veiculoRepository.buscarVeiculoPorNome(nomeParaBusca);
		} catch (Exception e) {
			e.printStackTrace();
			throw new FalhaTransacaoException(MENSAGEM_FALHA_COMUNICACAO, e);
		}
	}

	@Override
	public Veiculo buscarVeiculoPorId(Long idVeiculo) {
		try {
			return veiculoRepository.findById(idVeiculo).orElse(null);
		} catch (Exception e) {
			e.printStackTrace();
			throw new FalhaTransacaoException(MENSAGEM_FALHA_COMUNICACAO, e);
		}
	}

	@Override
	public Veiculo criarVeiculo(Veiculo veiculo) {
		try {
			return veiculoRepository.save(veiculo);
		} catch (Exception e) {
			e.printStackTrace();
			throw new FalhaTransacaoException(MENSAGEM_FALHA_COMUNICACAO, e);
		}
	}

	@Override
	public Veiculo atualizarVeiculo(Veiculo veiculo) {
		try {
			return veiculoRepository.save(veiculo);
		} catch (Exception e) {
			e.printStackTrace();
			throw new FalhaTransacaoException(MENSAGEM_FALHA_COMUNICACAO, e);
		}
	}

	@Override
	public String atualizarVeiculoParaVendido(Long idVeiculo) {
		try {
			veiculoRepository.atualizarVeiculoParaVendido(idVeiculo);
			return "Veiculo atualizado com sucesso";
		} catch (Exception e) {
			e.printStackTrace();
			throw new FalhaTransacaoException(MENSAGEM_FALHA_COMUNICACAO, e);
		}
	}

	@Override
	public String apagarVeiculo(Long idVeiculo) {
		try {
			veiculoRepository.delete(buscarVeiculoPorId(idVeiculo));
			return "Veiculo apagado com sucesso!!";
		} catch (Exception e) {
			e.printStackTrace();
			throw new FalhaTransacaoException(MENSAGEM_FALHA_COMUNICACAO, e);
		}
	}

}
