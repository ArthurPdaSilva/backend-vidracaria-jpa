package br.edu.ifpb.mt.dac.entities;

import java.time.LocalDate;
import javax.persistence.Basic;
import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Embeddable;
import javax.persistence.Entity;
import javax.persistence.EnumType;
import javax.persistence.Enumerated;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.OneToOne;

import enumerables.Status;


@Embeddable
@Entity(name = "SERVICO")
public class Servico{

	@Id
	@GeneratedValue(strategy = GenerationType.SEQUENCE)
	private int idServico;
	
	@Basic
	@ManyToOne(fetch = FetchType.EAGER, cascade = CascadeType.MERGE)
	@JoinColumn(name = "EMPREGADO_FK_PK")
	private Empregado idEmpregado;
	
	@Basic
	@ManyToOne(fetch = FetchType.EAGER, cascade = CascadeType.MERGE)
	@JoinColumn(name = "CLIENTE_FK_PK")
	private Cliente idCliente;
	
	@OneToOne(fetch = FetchType.EAGER, cascade = CascadeType.MERGE)
	@JoinColumn(name = "ID_PROECAO")
	private Projecao idProjecao;
	
	@ManyToOne(fetch = FetchType.EAGER, cascade = CascadeType.MERGE)
	@JoinColumn(nullable = true, name = "ACESSORIO_FK")
	private Acessorio acessorio;
	
	@Column(nullable = false, name = "STATUS_SERVICO")
	@Enumerated(EnumType.STRING)
	private Status status;
	
	@Column(nullable = false , name = "DATA_SERVICO")
	private LocalDate data;
	
	@Column(nullable = false , name = "MEDIDAS_LOCAL")
	private float MedidasDoLocal;
	
	public Servico() {}

	public int getIdServico() {
		return idServico;
	}

	public void setIdServico(int idServico) {
		this.idServico = idServico;
	}

	public Empregado getIdEmpregado() {
		return idEmpregado;
	}

	public void setIdEmpregado(Empregado idEmpregado) {
		this.idEmpregado = idEmpregado;
	}

	public Cliente getIdCliente() {
		return idCliente;
	}

	public void setIdCliente(Cliente idCliente) {
		this.idCliente = idCliente;
	}

	public Projecao getIdProjecao() {
		return idProjecao;
	}

	public void setIdProjecao(Projecao idProjecao) {
		this.idProjecao = idProjecao;
	}

	public Acessorio getAcessorio() {
		return acessorio;
	}

	public void setAcessorio(Acessorio acessorio) {
		this.acessorio = acessorio;
	}

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

	public float getMedidasDoLocal() {
		return MedidasDoLocal;
	}

	public void setMedidasDoLocal(float medidasDoLocal) {
		MedidasDoLocal = medidasDoLocal;
	}



	
	
}
