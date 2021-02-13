package br.com.tinnova.testepratico.repository;

import java.util.List;

import javax.transaction.Transactional;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import br.com.tinnova.testepratico.entity.Veiculo;

@Repository
public interface VeiculoRepository extends JpaRepository<Veiculo, Long>{
	
	@Transactional
	@Modifying
	@Query("UPDATE Veiculo v SET v.isVendido = true WHERE v.id =:id")
	void atualizarVeiculoParaVendido(@Param("id") Long idVeiculo);
	
	@Query("SELECT v FROM Veiculo v WHERE v.nomeVeiculo LIKE LOWER(CONCAT ('%', :nomeVeiculo, '%')) ")
	List<Veiculo> buscarVeiculoPorNome(@Param("nomeVeiculo") String nomeVeiculo);
}
