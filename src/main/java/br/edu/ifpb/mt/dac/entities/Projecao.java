package br.edu.ifpb.mt.dac.entities;

import java.io.Serializable;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity(name = "PROJECAO")
public class Projecao implements Serializable {


	/**
	 * 
	 */
	private static final long serialVersionUID = 3472109783719885923L;

	@Id
	@GeneratedValue(strategy = GenerationType.SEQUENCE)
	private int idProjecao;
	
	@Column(nullable = false, name = "PRECO_DA_FABRICA")
	private float precoDaFabrica;
	
	@Column(nullable = false, name = "QUANTIDADE_DE_VIDROS")
	private int quantidadeDeVidros;
	
	public Projecao() {}

	public int getIdProjecao() {
		return idProjecao;
	}

	public void setIdProjecao(int idProjecao) {
		this.idProjecao = idProjecao;
	}


	public float getPrecoDaFabrica() {
		return precoDaFabrica;
	}

	public void setPrecoDaFabrica(float precoDaFabrica) {
		this.precoDaFabrica = precoDaFabrica;
	}

	public int getQuantidadeDeVidros() {
		return quantidadeDeVidros;
	}

	public void setQuantidadeDeVidros(int quantidadeDeVidros) {
		this.quantidadeDeVidros = quantidadeDeVidros;
	}
	
}