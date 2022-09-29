package br.edu.ifpb.mt.dac.entities;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;

@Entity(name = "PROJECAO")
public class Projecao implements Serializable {


	/**
	 * 
	 */
	private static final long serialVersionUID = 3472109783719885923L;

	@Id
	@GeneratedValue(strategy = GenerationType.SEQUENCE)
	@Column(name = "ID_PROJECAO")
	private int idProjecao;
	
	@ManyToOne(fetch = FetchType.EAGER)
	@JoinColumn(name = "EMPREGADO_FK", nullable = true)
	private Empregado id_empregado;
	
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

	public Empregado getId_empregado() {
		return id_empregado;
	}

	public void setId_empregado(Empregado id_empregado) {
		this.id_empregado = id_empregado;
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
