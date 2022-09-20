package entities;

import javax.persistence.Column;
import javax.persistence.Embeddable;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToMany;

@Embeddable
public class ServicoId {

	@Column(name = "ID_SERVICO")
	private int idServico;
	
	@ManyToMany
	@JoinColumn(name = "ID_EMPREGADO")
	private Empregado idEmpregado;
	
	@ManyToMany
	@JoinColumn(name = "ID_CLIENTE")
	private Cliente idCliente;

	public ServicoId() {}
	
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
	
	
}
