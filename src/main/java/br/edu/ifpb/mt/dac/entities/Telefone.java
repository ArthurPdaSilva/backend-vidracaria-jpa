package br.edu.ifpb.mt.dac.entities;

import java.io.Serializable;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToOne;

@Entity(name = "TELEFONE")
public class Telefone implements Serializable {
	
	private static final long serialVersionUID = -8901722890848295974L;

	@Id
	@GeneratedValue(strategy = GenerationType.SEQUENCE)
	private int idTelefone;
	
	@OneToOne(fetch = FetchType.EAGER, mappedBy = "telefone")
	private Pessoa pessoa;
	
	@Column(nullable = false, name = "NUMERO", length = 11)
	public Long numero;
	
	public Telefone() {}
	
	public Telefone(Long n) {
		this.numero = n;
	}

	public Long getNumero() {
		return numero;
	}

	public void setNumero(Long numero) {
		this.numero = numero;
	}

	public int getIdTelefone() {
		return idTelefone;
	}

	public Pessoa getPessoa() {
		return pessoa;
	}

	public void setPessoa(Pessoa pessoa) {
		this.pessoa = pessoa;
	}
	
	
}
