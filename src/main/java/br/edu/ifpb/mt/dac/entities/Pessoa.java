package br.edu.ifpb.mt.dac.entities;

import java.io.Serializable;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.DiscriminatorColumn;
import javax.persistence.DiscriminatorType;
import javax.persistence.DiscriminatorValue;
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
	
	private static final long serialVersionUID = 2300838368307035239L;

	@Id
	@GeneratedValue(strategy = GenerationType.SEQUENCE)
	private int idPessoa;
	
	@Column(nullable = false, name = "NOME")
	private String nome;
	
	@Column(nullable = false, name = "CPF", length = 11, unique = true)
	private Long cpf;
	
	@Column(nullable = false, name = "RG", length = 9, unique = true)
	private Long rg;
	
	@Column(nullable = false, name = "EMAIL_CONTATO", unique = true)
	private String emailContato;
	
	@OneToOne(fetch = FetchType.EAGER, cascade = CascadeType.MERGE)
	@JoinColumn(name = "TELEFONE_FK")
	private Telefone telefone;
	
	@OneToOne(fetch = FetchType.EAGER, cascade = CascadeType.MERGE)
	@JoinColumn(name = "ENDERECO_FK")
	private Endereco endereco;
	
	public Pessoa() {}

	public int getId_pessoa() {
		return idPessoa;
	}

	public void setId_pessoa(int id_pessoa) {
		this.idPessoa = id_pessoa;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public long getCpf() {
		return cpf;
	}

	public void setCpf(Long i) {
		this.cpf = i;
	}

	public Long getRg() {
		return rg;
	}

	public void setRg(Long rg) {
		this.rg = rg;
	}

	public String getEmail_contato() {
		return emailContato;
	}

	public void setEmail_contato(String email_contato) {
		this.emailContato = email_contato;
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
