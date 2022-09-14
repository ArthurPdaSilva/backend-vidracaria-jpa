package br.edu.ifpb.mt.dac.entities;

import java.io.Serializable;
import java.util.Calendar;
import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

@Entity
@Table(name = "CAR")
public class Carro implements Serializable {

	private static final long serialVersionUID = -6518853480190451215L;

	@Id
	@GeneratedValue(strategy = GenerationType.SEQUENCE)
	@Column(name = "ID")
	private Integer id;

	@Column(name = "MARCA")
	private String marca;

	@Column(name = "PESO")
	private int peso;

	@Column(name = "PRECO")
	private float preco;

	public Carro() {

	}
	
	public Carro(String marca, int peso, float preco) {
		this.marca = marca;
		this.peso = peso;
		this.preco = preco;
	}

	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}


}
