package br.com.bdii.entities;

import java.io.Serializable;
import java.sql.Date;

import br.com.bdii.enumerables.Status;
import jakarta.persistence.Column;
import jakarta.persistence.Embeddable;
import jakarta.persistence.EmbeddedId;
import jakarta.persistence.Entity;
import jakarta.persistence.EnumType;
import jakarta.persistence.Enumerated;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToMany;
import jakarta.persistence.OneToOne;
import jakarta.persistence.Temporal;
import jakarta.persistence.TemporalType;

@Embeddable
@Entity
public class Servico implements Serializable{

	private static final long serialVersionUID = 5038928811975421403L;

	@EmbeddedId
	private int idServico;
	
	@EmbeddedId
	@ManyToMany
	@JoinColumn(name = "ID_EMPREGADO")
	private Empregado idEmpregado;
	
	@EmbeddedId
	@ManyToMany
	@JoinColumn(name = "ID_CLIENTE")
	private Cliente idCliente;
	
	@OneToOne
	@JoinColumn(name = "ID_PREJECAO")
	private Projecao idProjecao;
	
	@Column(nullable = false , name = "STATUS_SERVICO")
	@Enumerated(EnumType.STRING)
	private Status status;
	
	@Temporal(TemporalType.TIMESTAMP)
	@Column(nullable = false , name = "DATA_SERVICO")
	private Date data;
	
	@Column(nullable = false , name = "MEDIDAS_LOCAL")
	private float Medidas_do_local;
	
	@Column(nullable = false, name = "PRECO_DE_FABRICA")
	private float precoDeFabrica;
	
	@Column(nullable = false, name = "QUANTIDADE_VIDROS")
	private int quantidadeVidros;
	
	public Servico() {}
	
	public int getIdServico() {
		return idServico;
	}

	public void setIdServico(int idServico) {
		this.idServico = idServico;
	}

	public Status getStatus() {
		return status;
	}

	public void setStatus(Status status) {
		this.status = status;
	}

	public Date getData() {
		return data;
	}

	public void setData(Date data) {
		this.data = data;
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

	public float getMedidas_do_local() {
		return Medidas_do_local;
	}

	public void setMedidas_do_local(float medidas_do_local) {
		Medidas_do_local = medidas_do_local;
	}

	public static long getSerialversionuid() {
		return serialVersionUID;
	}

}
