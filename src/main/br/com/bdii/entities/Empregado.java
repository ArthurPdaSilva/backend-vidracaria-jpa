package br.com.bdii.entities;

import org.hibernate.annotations.Table;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.UniqueConstraint;

//@Entity(name = "EMPREGADO")
public class Empregado {

	@Id
	@GeneratedValue(strategy = GenerationType.SEQUENCE)
	@Column(name = "ID_EMPREGADO")
	private int id;
	
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
	
	
}
