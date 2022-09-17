package br.com.bdii.entities;

import java.io.Serializable;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;

@Entity(name = "ENDERECO")
public class Endereco implements Serializable {

	private static final long serialVersionUID = 1L;

	private int idCliente;
	
	@Column(nullable = false, name = "CIDADE")
	private String cidade;
	
	@Column(nullable = false, name = "RUA")
	private String rua;
	
	@Column(nullable = false, name = "BAIRRO")
	private String bairro;
	
	@Column(nullable = false, name = "CEP")
	private String cep;
	
	@Column(nullable = true, name = "COMPLEMENTO")
	private String complemento;
	
	public Endereco() {}

	public int getIdCliente() {
		return idCliente;
	}

	public void setIdCliente(int idCliente) {
		this.idCliente = idCliente;
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
