package br.com.bdii.entities;

import java.io.Serializable;

import jakarta.persistence.Entity;
import jakarta.persistence.JoinColumn;

@Entity(name = "POSSUI")
public class Possui implements Serializable{

	private static final long serialVersionUID = -1593794658322272360L;

	// FK's serão implementadas posteriormente
	
	private Servico idServico;
	private Empregado idEmpregado;
	
	private Cliente idCliente;
	
	private Acessorio idAcessorio;

	public Possui() {}

	public Servico getIdServico() {
		return idServico;
	}

	public void setIdServico(Servico idServico) {
		this.idServico = idServico;
	}

	public Empregado getIdEmpregado() {
		return idEmpregado;
	}

	public void setIdEmpregado(Empregado idEmpregado) {
		this.idEmpregado = idEmpregado;
	}

	public Cliente getIdCliente() {
		return idCliente;
	}

	public void setIdCliente(Cliente idCliente) {
		this.idCliente = idCliente;
	}

	public Acessorio getIdAcessorio() {
		return idAcessorio;
	}

	public void setIdAcessorio(Acessorio idAcessorio) {
		this.idAcessorio = idAcessorio;
	}

}
