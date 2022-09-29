package br.edu.ifpb.mt.dac.entities;

import java.io.Serializable;
import java.util.Objects;

import javax.persistence.Basic;
import javax.persistence.Column;
import javax.persistence.Embeddable;
import javax.persistence.FetchType;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;

@Embeddable
public class ServicoId implements Serializable{

	/**
	 * 
	 */
	private static final long serialVersionUID = -917557784564672876L;

	@Basic
	@Column(name = "ID_SERVICO")
	private int idServico;
	
	@Basic
	@ManyToOne(fetch = FetchType.EAGER)
	@JoinColumn(name = "EMPREGADO_FK_PK")
	private Empregado id_empregado;
	
	@Basic
	@ManyToOne(fetch = FetchType.EAGER)
	@JoinColumn(name = "CLIENTE_FK_PK")
	private Cliente idCliente;

	public ServicoId() {}
	
	public int getIdServico() {
		return idServico;
	}

	public void setIdServico(int idServico) {
		this.idServico = idServico;
	}
	
	public Empregado getId_empregado() {
		return id_empregado;
	}

	public void setId_empregado(Empregado id_empregado) {
		this.id_empregado = id_empregado;
	}

	public Cliente getIdCliente() {
		return idCliente;
	}

	public void setIdCliente(Cliente idCliente) {
		this.idCliente = idCliente;
	}

	@Override
	public int hashCode() {
		return Objects.hash(idCliente, idServico, id_empregado);
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		ServicoId other = (ServicoId) obj;
		return Objects.equals(idCliente, other.idCliente) && idServico == other.idServico
				&& Objects.equals(id_empregado, other.id_empregado);
	}
	
	
	
}