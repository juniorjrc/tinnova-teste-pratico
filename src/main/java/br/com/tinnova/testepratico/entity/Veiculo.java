package br.com.tinnova.testepratico.entity;

import java.io.Serializable;
import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

import lombok.Data;

@Data
@Entity
@Table(name="TB_VEICULO")
public class Veiculo implements Serializable{

	private static final long serialVersionUID = 1L;
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "ID_VEICULO", nullable = false)
	private Long id;
	
	@Column(name = "NM_VEICULO", length = 100)
	private String nomeVeiculo;
	
	@ManyToOne(fetch = FetchType.EAGER)
	@JoinColumn(name = "ID_MARCA")
	private Marca marca;
	
	@Column(name = "ANO")
	private int ano;
	
	@Column(name = "DESCRICAO", length = 250)
	private String descricao;
	
	@Column(name = "VENDIDO")
	private Boolean isVendido;
	
	@Column(name = "CREATED_AT")
	private Date dtCriacao;
	
	@Column(name = "UPDATED_AT")
	private Date dtAtualizacao;
}
