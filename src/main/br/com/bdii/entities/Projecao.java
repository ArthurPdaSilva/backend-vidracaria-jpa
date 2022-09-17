package br.com.bdii.entities;

import java.io.Serializable;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;

@Entity(name = "Projecao")
public class Projecao implements Serializable {

	private static final long serialVersionUID = 1L;

	@Id
	@GeneratedValue(strategy = GenerationType.SEQUENCE)
	@Column(name = "ID_PROJECAO")
	private int idProjecao;
	
	private int idEmpregado;
	
	@Column(nullable = false, name = "PRECO_DA_FABRICA")
	private String precoDaFabrica;
	
	@Column(nullable = false, name = "QUANTIDADE_DE_VIDROS")
	private int quantidadeDeVidros;
	
	public Projecao() {}

	public int getIdProjecao() {
		return idProjecao;
	}

	public void setIdProjecao(int idProjecao) {
		this.idProjecao = idProjecao;
	}

	public int getIdEmpregado() {
		return idEmpregado;
	}

	public void setIdEmpregado(int idEmpregado) {
		this.idEmpregado = idEmpregado;
	}

	public String getPrecoDaFabrica() {
		return precoDaFabrica;
	}

	public void setPrecoDaFabrica(String precoDaFabrica) {
		this.precoDaFabrica = precoDaFabrica;
	}

	public int getQuantidadeDeVidros() {
		return quantidadeDeVidros;
	}

	public void setQuantidadeDeVidros(int quantidadeDeVidros) {
		this.quantidadeDeVidros = quantidadeDeVidros;
	}
	
}
