package br.edu.ifpb.mt.dac.entities;

import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.DiscriminatorValue;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.OneToMany;

@Entity(name = "EMPREGADO")
@DiscriminatorValue("C")
public class Empregado extends Pessoa {
	
	/**
	 * 
	 */
	private static final long serialVersionUID = -5344101819756721547L;

	@Column(nullable = false, name = "HORARIO_SERVICO")
	private String horarioServico;
	
	@Column(nullable = false, name = "SALARIO_EMPREGADO")
	private float salario;
	
	@Column(nullable = false, name = "TIPO_EMPREGADO")
	private String tipo;
	
	@OneToMany(fetch = FetchType.EAGER, cascade = {CascadeType.ALL}, mappedBy = "id_empregado")
	private List<Projecao> projecoes;
	
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

	public List<Projecao> getProjecoes() {
		return projecoes;
	}

	public void setProjecoes(List<Projecao> projecoes) {
		this.projecoes = projecoes;
	}
	
}
