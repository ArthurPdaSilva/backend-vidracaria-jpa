package entities;

import java.io.Serializable;

import jakarta.persistence.Column;
import jakarta.persistence.Embeddable;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;

@Embeddable
@Entity(name = "ACESSORIOS")
public class Acessorio implements Serializable{

	private static final long serialVersionUID = 5356983711993059764L;

	@Id
	@GeneratedValue(strategy = GenerationType.SEQUENCE)
	private int idAcessorio;
	
	@Column(nullable = false, name = "MODELO_ACESSORIO")
	private String modelo;
	
	@Column(nullable = false, name = "NOME_ACESSORIO")
	private String nome;
	
	public Acessorio() {}
	
	public int getIdAcessorio() {
		return idAcessorio;
	}

	public void setIdAcessorio(int idAcessorio) {
		this.idAcessorio = idAcessorio;
	}

	public String getModelo() {
		return modelo;
	}

	public void setModelo(String modelo) {
		this.modelo = modelo;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

}
