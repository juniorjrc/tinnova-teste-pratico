package br.com.tinnova.testepratico.service.impl;

import org.springframework.stereotype.Service;

import br.com.tinnova.testepratico.service.ExercicioQuatroService;

@Service
public class ExercicioQuatroServiceImpl implements ExercicioQuatroService{

	@Override
	public int calcularMultiplosDeTresECinco(int numeroParaCalcular) {
		int somaTres = 0;
		int somaCinco = 0;
		int resultado;
		
		for(int i = 1; i < numeroParaCalcular; i++) {
	        if(i % 3 == 0) {
	        	somaTres += i;
	        }
	    }
	    for(int i = 1; i < numeroParaCalcular; i++) {
	        if(i % 5 == 0) {
	        	somaCinco += i;
	        }
	    }
	    
	    resultado = somaTres + somaCinco;
	    
	    return resultado;
	}

}
