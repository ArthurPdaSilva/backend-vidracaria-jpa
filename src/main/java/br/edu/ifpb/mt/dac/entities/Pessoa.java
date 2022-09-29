package br.edu.ifpb.mt.dac.entities;

import java.io.Serializable;
import java.math.BigInteger;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.DiscriminatorColumn;
import javax.persistence.DiscriminatorType;
import javax.persistence.DiscriminatorValue;
import javax.persistence.Embedded;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Inheritance;
import javax.persistence.InheritanceType;
import javax.persistence.JoinColumn;
import javax.persistence.OneToOne;

@Entity(name = "PESSOA")
@Inheritance(strategy = InheritanceType.JOINED)
@DiscriminatorColumn(name = "DISC", discriminatorType = DiscriminatorType.CHAR)
@DiscriminatorValue("A")
public class Pessoa implements Serializable  {
	
	/**
	 * 
	 */
	private static final long serialVersionUID = 2300838368307035239L;

	@Id
	@GeneratedValue(strategy = GenerationType.SEQUENCE)
	@Column(name = "ID_PESSOA")
	private int id_pessoa;
	
	@Column(nullable = false, name = "NOME")
	private String nome;
	
	@Column(nullable = false, name = "CPF", length = 11, unique = true)
	private BigInteger cpf;
	
	@Column(nullable = false, name = "RG", length = 9, unique = true)
	private BigInteger rg;
	
	@Column(nullable = false, name = "EMAIL_CONTATO", unique = true)
	private String email_contato;
	
	@Embedded
	private Telefone telefone;
	
	@OneToOne(fetch = FetchType.EAGER, cascade = {CascadeType.ALL})
	@JoinColumn(name = "ENDERECO_FK", nullable = false)
	private Endereco endereco;
	
	public Pessoa() {}

	public int getId_pessoa() {
		return id_pessoa;
	}

	public void setId_pessoa(int id_pessoa) {
		this.id_pessoa = id_pessoa;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public BigInteger getCpf() {
		return cpf;
	}

	public void setCpf(BigInteger i) {
		this.cpf = i;
	}

	public BigInteger getRg() {
		return rg;
	}

	public void setRg(BigInteger rg) {
		this.rg = rg;
	}

	public String getEmail_contato() {
		return email_contato;
	}

	public void setEmail_contato(String email_contato) {
		this.email_contato = email_contato;
	}

	public Telefone getTelefone() {
		return telefone;
	}

	public void setTelefone(Telefone telefone) {
		this.telefone = telefone;
	}

	public Endereco getEndereco() {
		return endereco;
	}

	public void setEndereco(Endereco endereco) {
		this.endereco = endereco;
	}
	
}
