package br.com.bdii.entities;

import java.io.Serializable;

import jakarta.persistence.Entity;

@Entity(name = "POSSUI")
public class Possui implements Serializable{

	private static final long serialVersionUID = -1593794658322272360L;

	// FK's serão implementadas posteriormente
	private int idServico;
	
	private int idEmpregado;
	
	private int idCliente;
	
	private int idAcessorio;

	public Possui() {}
	
	public int getIdServico() {
		return idServico;
	}

	public void setIdServico(int idServico) {
		this.idServico = idServico;
	}

	public int getIdEmpregado() {
		return idEmpregado;
	}

	public void setIdEmpregado(int idEmpregado) {
		this.idEmpregado = idEmpregado;
	}

	public int getIdCliente() {
		return idCliente;
	}

	public void setIdCliente(int idCliente) {
		this.idCliente = idCliente;
	}

	public int getIdAcessorio() {
		return idAcessorio;
	}

	public void setIdAcessorio(int idAcessorio) {
		this.idAcessorio = idAcessorio;
	}
	
	

}
