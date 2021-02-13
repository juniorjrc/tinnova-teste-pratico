package br.com.tinnova.testepratico.service.impl;

import java.util.Arrays;

import org.springframework.stereotype.Service;

import br.com.tinnova.testepratico.model.VetorBubbleSort;
import br.com.tinnova.testepratico.service.ExercicioDoisService;

@Service
public class ExercicioDoisServiceImpl implements ExercicioDoisService {

	@Override
	public String ordenarPorBubbleSort() {
		VetorBubbleSort vetorBubbleSort = new VetorBubbleSort();
		return ordenar(vetorBubbleSort.getVetor());
	}

	@Override
	public String ordenar(int[] vetor) {
		StringBuilder vetorOrdenado = new StringBuilder();
		for (int i = 0; i < vetor.length - 1; i++) {
			for (int j = 0; j < vetor.length - 1 - i; j++) {
				vetorOrdenado.append(Arrays.toString(vetor));
				if (vetor[j] > vetor[j + 1]) {
					int auxiliar = vetor[j];
					vetor[j] = vetor[j + 1];
					vetor[j + 1] = auxiliar;
				}
				vetorOrdenado.append(System.lineSeparator());
			}
			vetorOrdenado.append(System.lineSeparator());
			vetorOrdenado.append(System.lineSeparator());
		}
		return vetorOrdenado.toString();
	}

}
