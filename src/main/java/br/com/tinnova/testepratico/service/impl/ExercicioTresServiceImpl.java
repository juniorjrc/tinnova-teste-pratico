package br.com.tinnova.testepratico.service.impl;

import org.springframework.stereotype.Service;

import br.com.tinnova.testepratico.service.ExercicioTresService;

@Service
public class ExercicioTresServiceImpl implements ExercicioTresService {

	@Override
	public int calcularFatorial(int numeroParaFatorar) {
		int numeroFatorado = 1;
		for (int i = 1; i <= numeroParaFatorar; i++) {
			numeroFatorado *= i;
		}
		return numeroFatorado;
	}

}
