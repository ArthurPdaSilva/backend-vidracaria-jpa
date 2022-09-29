package br.edu.ifpb.mt.dac.entities;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity(name = "ACESSORIO")
public class Acessorio implements Serializable{

	/**
	 * 
	 */
	private static final long serialVersionUID = -7934643889563207677L;

	@Id
	@GeneratedValue(strategy = GenerationType.SEQUENCE)
	private int idAcessorio;
	
	@Column(nullable = false, name = "MODELO_ACESSORIO")
	private String modelo;
	
	@Column(nullable = false, name = "NOME_ACESSORIO")
	private String nome;
	
	public Acessorio() {}
	
	public int getIdAcessorio() {
		return idAcessorio;
	}

	public void setIdAcessorio(int idAcessorio) {
		this.idAcessorio = idAcessorio;
	}

	public String getModelo() {
		return modelo;
	}

	public void setModelo(String modelo) {
		this.modelo = modelo;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

}
