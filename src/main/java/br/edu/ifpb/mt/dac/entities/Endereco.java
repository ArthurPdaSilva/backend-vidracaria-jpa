package br.edu.ifpb.mt.dac.entities;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToOne;

@Entity(name = "ENDERECO")
public class Endereco implements Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = 5909913417369209860L;

	@Id
	@GeneratedValue(strategy = GenerationType.SEQUENCE)
	@Column(nullable = false, name = "ID_ENDERECO")
	private int id_endreco;
	
	@OneToOne(fetch = FetchType.EAGER, mappedBy = "endereco")
	private Pessoa pessoa;
	
	@Column(nullable = false, name = "CIDADE")
	private String cidade;
	
	@Column(nullable = false, name = "RUA")
	private String rua;
	
	@Column(nullable = false, name = "BAIRRO")
	private String bairro;
	
	@Column(nullable = false, name = "CEP", length = 8)
	private String cep;
	
	@Column(nullable = true, name = "COMPLEMENTO")
	private String complemento;
	
	public Endereco() {}

	public int getId_endreco() {
		return id_endreco;
	}

	public void setId_endreco(int id_endreco) {
		this.id_endreco = id_endreco;
	}

	public Pessoa getPessoa() {
		return pessoa;
	}

	public void setPessoa(Pessoa pessoa) {
		this.pessoa = pessoa;
	}

	public String getCidade() {
		return cidade;
	}

	public void setCidade(String cidade) {
		this.cidade = cidade;
	}

	public String getRua() {
		return rua;
	}

	public void setRua(String rua) {
		this.rua = rua;
	}

	public String getBairro() {
		return bairro;
	}

	public void setBairro(String bairro) {
		this.bairro = bairro;
	}

	public String getCep() {
		return cep;
	}

	public void setCep(String cep) {
		this.cep = cep;
	}

	public String getComplemento() {
		return complemento;
	}

	public void setComplemento(String complemento) {
		this.complemento = complemento;
	}
}
