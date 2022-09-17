package br.com.bdii.entities;

import java.io.Serializable;
import java.sql.Date;

import br.com.bdii.enumerables.Status;
import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.EnumType;
import jakarta.persistence.Enumerated;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.OneToOne;
import jakarta.persistence.Temporal;
import jakarta.persistence.TemporalType;

@Entity
public class Servico implements Serializable{

	private static final long serialVersionUID = 5038928811975421403L;

	@Id
	@GeneratedValue(strategy = GenerationType.SEQUENCE)
	private int idServico;
	
	
	private int idEmpregado;
	
	
	private int idCliente;
	
	@OneToOne
	@JoinColumn(name = "ID_PREJECAO")
	private Projecao idProjecao;
	
	@Column(nullable = false , name = "STATUS_SERVICO")
	@Enumerated(EnumType.STRING)
	private Status status;
	
	@Temporal(TemporalType.TIMESTAMP)
	@Column(nullable = false , name = "DATA_SERVICO")
	private Date data;
	
	// ver o tipo e configs
	private String Medidas_do_local;
	
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

	public int getIdEmpregado() {
		return idEmpregado;
	}

	public void setIdEmpregado(int idEmpregado) {
		this.idEmpregado = idEmpregado;
	}

	public int getIdCliente() {
		return idCliente;
	}

	public void setIdCliente(int idCliente) {
		this.idCliente = idCliente;
	}

	public int getIdProjecao() {
		return idProjecao;
	}

	public void setIdProjecao(int idProjecao) {
		this.idProjecao = idProjecao;
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

	public String getMedidas_do_local() {
		return Medidas_do_local;
	}

	public void setMedidas_do_local(String medidas_do_local) {
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

	
}
