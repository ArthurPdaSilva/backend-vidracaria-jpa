package br.edu.ifpb.mt.dac.entities;

import java.io.Serializable;
import java.math.BigInteger;

import javax.persistence.Column;
import javax.persistence.Embeddable;
import javax.persistence.Entity;
import javax.persistence.Id;

@Embeddable
public class Telefone implements Serializable {
	
	/**
	 * 
	 */
	private static final long serialVersionUID = -8901722890848295974L;

	@Column(nullable = false, name = "NUMERO", length = 11, unique = true)
	public BigInteger numero;
	
	public Telefone() {}
	
	public Telefone(BigInteger n) {
		this.numero = n;
	}

	public BigInteger getNumero() {
		return numero;
	}

	public void setNumero(BigInteger numero) {
		this.numero = numero;
	}
	
	
}
