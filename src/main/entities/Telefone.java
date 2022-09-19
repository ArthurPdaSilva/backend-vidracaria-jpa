package entities;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Embeddable;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;





@Embeddable
@Entity(name = "TELEFONE")
public class Telefone implements Serializable {

	private static final long serialVersionUID = 1L;

	@ManyToOne
	@JoinColumn
	private Cliente idCliente;
	
	@Id
	@Column(nullable = false, name = "NUMERO", unique = true)
	private String numero;
	
	public Telefone() {}


	public Cliente getIdCliente() {
		return idCliente;
	}


	public void setIdCliente(Cliente idCliente) {
		this.idCliente = idCliente;
	}


	public String getNumero() {
		return numero;
	}

	public void setNumero(String numero) {
		this.numero = numero;
	}
	
}
