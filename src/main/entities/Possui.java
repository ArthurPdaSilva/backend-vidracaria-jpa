package entities;

import java.io.Serializable;

import javax.persistence.EmbeddedId;
import javax.persistence.Entity;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToMany;

@Entity(name = "POSSUI")
public class Possui implements Serializable{

	private static final long serialVersionUID = -1593794658322272360L;
	
	@ManyToMany
	@JoinColumn
	@EmbeddedId
	private Servico idServico;
	
	@ManyToMany
	@JoinColumn
	@EmbeddedId
	private Servico idEmpregado;
	
	@ManyToMany
	@JoinColumn
	@EmbeddedId
	private Servico idCliente;
	
	@ManyToMany
	@JoinColumn
	@EmbeddedId
	private Acessorio idAcessorio;

	public Possui() {}

	public Servico getIdServico() {
		return idServico;
	}

	public void setIdServico(Servico idServico) {
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

	public Acessorio getIdAcessorio() {
		return idAcessorio;
	}

	public void setIdAcessorio(Acessorio idAcessorio) {
		this.idAcessorio = idAcessorio;
	}

}
