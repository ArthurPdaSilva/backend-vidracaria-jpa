package entities;

import javax.persistence.Column;
import javax.persistence.Embeddable;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Embeddable
@Entity(name = "CLIENTE")
public class Cliente {


	@Id
	@GeneratedValue(strategy = GenerationType.SEQUENCE)
	@Column(name = "ID_CLIENTE")
	private int idCliente;
	
	@Column(nullable = false, name = "NOME_CLIENTE", length = 120)
	private String nome;
	
	@Column(nullable = false, name = "CPF_CLIENTE", length = 11, unique = true)
	private String cpf;
	
	@Column(nullable = false, name = "EMAIL_CONTATO", unique = true)
	private String email;
	
	public Cliente() {}

	public int getIdCliente() {
		return idCliente;
	}

	public void setIdCliente(int idCliente) {
		this.idCliente = idCliente;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public String getCpf() {
		return cpf;
	}

	public void setCpf(String cpf) {
		this.cpf = cpf;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}
}
