package entities;

import java.io.Serializable;
import java.sql.Date;

import javax.persistence.Column;
import javax.persistence.Embeddable;
import javax.persistence.EmbeddedId;
import javax.persistence.Entity;
import javax.persistence.EnumType;
import javax.persistence.Enumerated;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToMany;
import javax.persistence.OneToOne;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

import enumerables.Status;


@Embeddable
@Entity
public class Servico implements Serializable{

	private static final long serialVersionUID = 5038928811975421403L;

	@EmbeddedId
	@GeneratedValue(strategy = GenerationType.SEQUENCE)
	private ServicoId idServico;
	
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
	
	public ServicoId getIdServico() {
		return idServico;
	}

	public void setIdServico(ServicoId idServico) {
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
