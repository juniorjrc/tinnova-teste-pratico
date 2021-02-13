package br.com.tinnova.testepratico.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import br.com.tinnova.testepratico.entity.Marca;

public interface MarcaRepository extends JpaRepository<Marca, Long>{
	
}
