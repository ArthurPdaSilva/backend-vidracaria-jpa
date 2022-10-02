package br.edu.ifpb.mt.dac.entities;

import javax.persistence.Column;
import javax.persistence.DiscriminatorValue;
import javax.persistence.Entity;


@Entity(name = "EMPREGADO")
@DiscriminatorValue("C")
public class Empregado extends Pessoa {
	
	private static final long serialVersionUID = -5344101819756721547L;

	@Column(nullable = false, name = "HORARIO_SERVICO")
	private String horarioServico;
	
	@Column(nullable = false, name = "SALARIO_EMPREGADO")
	private float salario;
	
	@Column(nullable = false, name = "TIPO_EMPREGADO")
	private String tipo;
	
	public Empregado() {}

	public String getHorarioServico() {
		return horarioServico;
	}

	public void setHorarioServico(String horarioServico) {
		this.horarioServico = horarioServico;
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
