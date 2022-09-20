package entities;


import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Embeddable;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Embeddable
@Entity(name = "EMPREGADO")
public class Empregado implements Serializable{

	private static final long serialVersionUID = 1L;

	@Id
	@GeneratedValue(strategy = GenerationType.SEQUENCE)
	@Column(name = "ID_EMPREGADO")
	private int idEmpregado;
	
	@Column(nullable = false, name = "NOME_EMPREGADO", length = 120)
	private String nome;
	
	// verificar tipo e configs
	@Column(nullable = false, name = "HORARIO_SERVICO")
	private String horarioServico;
	
	@Column(nullable = false, name = "CPF_EMPREGADO", length = 11, unique = true)
	private String cpf;
	
	@Column(nullable = false, name = "EMAIL_EMPREGADO", unique = true)
	private String email;
	
	@Column(nullable = false, name = "SALARIO_EMPREGADO")
	private float salario;
	
	@Column(nullable = false, name = "TIPO_EMPREGADO")
	private String tipo;

	public Empregado() {}
	
	public int getIdEmpregado() {
		return idEmpregado;
	}

	public void setIdEmpregado(int idEmpregado) {
		this.idEmpregado = idEmpregado;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public String getHorarioServico() {
		return horarioServico;
	}

	public void setHorarioServico(String horarioServico) {
		this.horarioServico = horarioServico;
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

	public float getSalario() {
		return salario;
	}

	public void setSalario(float salario) {
		this.salario = salario;
	}

	public String getTipo() {
		return tipo;
	}

	public void setTipo(String tipo) {
		this.tipo = tipo;
	}
	
	
}