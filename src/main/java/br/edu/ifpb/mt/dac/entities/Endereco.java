package br.edu.ifpb.mt.dac.entities;

import java.io.Serializable;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity(name = "ENDERECO")
public class Endereco implements Serializable {

	private static final long serialVersionUID = 5909913417369209860L;

	@Id
	@GeneratedValue(strategy = GenerationType.SEQUENCE)
	private int idEndreco;
	
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
		return idEndreco;
	}

	public void setId_endreco(int id_endreco) {
		this.idEndreco = id_endreco;
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

	@Override
	public String toString() {
		return "Endereco [id_endreco=" + idEndreco + ", cidade=" + cidade + ", rua=" + rua + ", bairro=" + bairro
				+ ", cep=" + cep + ", complemento=" + complemento + "]";
	}
	
	
}
