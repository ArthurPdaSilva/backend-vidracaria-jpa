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
	@Column(name = "id_projecao")
	private int idProjecao;
	
	private int idEmpregado;
	
	@Column(nullable = false, name = "preco_da_fabrica", scale = 2)
	private Float precoDaFabrica;
	
	@Column(nullable = false, name = "quantidade_de_vidros")
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

	public Float getPrecoDaFabrica() {
		return precoDaFabrica;
	}

	public void setPrecoDaFabrica(Float precoDaFabrica) {
		this.precoDaFabrica = precoDaFabrica;
	}

	public int getQuantidadeDeVidros() {
		return quantidadeDeVidros;
	}

	public void setQuantidadeDeVidros(int quantidadeDeVidros) {
		this.quantidadeDeVidros = quantidadeDeVidros;
	}

}
