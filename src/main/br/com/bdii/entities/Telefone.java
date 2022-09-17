package br.com.bdii.entities;

import java.io.Serializable;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;

@Entity(name = "TELEFONE")
public class Telefone implements Serializable {

	private static final long serialVersionUID = 1L;

	private int idCliente;
	
	@Id
	@Column(nullable = false, name = "NUMERO")
	private String numero;
	
	public Telefone() {}

	public int getIdCliente() {
		return idCliente;
	}

	public void setIdCliente(int idCliente) {
		this.idCliente = idCliente;
	}

	public String getNumero() {
		return numero;
	}

	public void setNumero(String numero) {
		this.numero = numero;
	}
	
}
