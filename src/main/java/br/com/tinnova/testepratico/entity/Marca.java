package br.com.tinnova.testepratico.entity;

import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

import lombok.Data;

@Data
@Entity
@Table(name="TB_MARCA")
public class Marca {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "ID_MARCA", nullable = false)
	private Long id;
	
	@Column(name = "NM_MARCA", nullable = false, length = 100)
	private String nomeMarca;
	
	@Column(name = "CREATED_AT")
	private Date dataCriacao;
	
}
