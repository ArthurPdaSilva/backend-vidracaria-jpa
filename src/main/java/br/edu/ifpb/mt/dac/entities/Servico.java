package br.edu.ifpb.mt.dac.entities;

import java.time.LocalDate;

import javax.persistence.Column;
import javax.persistence.Embeddable;
import javax.persistence.EmbeddedId;
import javax.persistence.Entity;
import javax.persistence.EnumType;
import javax.persistence.Enumerated;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;

import enumerables.Status;


@Embeddable
@Entity
public class Servico{



	@EmbeddedId
	@GeneratedValue(strategy = GenerationType.SEQUENCE)
	private ServicoId idServico;
	
	@Column(nullable = false, name = "ID_PROJECAO")
	private Projecao idProjecao;
	
	@Column(nullable = false, name = "STATUS_SERVICO")
	@Enumerated(EnumType.STRING)
	private Status status;
	
	@Column(nullable = false , name = "DATA_SERVICO")
	private LocalDate data;
	
	@Column(nullable = false , name = "MEDIDAS_LOCAL")
	private float Medidas_do_local;
	
	@Column(nullable = false, name = "PRECO_DE_FABRICA")
	private float precoDeFabrica;
	
	@Column(nullable = false, name = "QUANTIDADE_VIDROS")
	private int quantidadeVidros;
	
	public Servico() {}

	public Status getStatus() {
		return status;
	}

	public void setStatus(Status status) {
		this.status = status;
	}

	public LocalDate getData() {
		return data;
	}

	public void setData(LocalDate data) {
		this.data = data;
	}

	public float getMedidas_do_local() {
		return Medidas_do_local;
	}

	public void setMedidas_do_local(float medidas_do_local) {
		Medidas_do_local = medidas_do_local;
	}

	public float getPrecoDeFabrica() {
		return precoDeFabrica;
	}

	public void setPrecoDeFabrica(float precoDeFabrica) {
		this.precoDeFabrica = precoDeFabrica;
	}

	public int getQuantidadeVidros() {
		return quantidadeVidros;
	}

	public void setQuantidadeVidros(int quantidadeVidros) {
		this.quantidadeVidros = quantidadeVidros;
	}

	public ServicoId getIdServico() {
		return idServico;
	}

	public Projecao getIdProjecao() {
		return idProjecao;
	}

	
	
}
