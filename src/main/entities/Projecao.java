package entities;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Embeddable;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToOne;

@Embeddable
@Entity(name = "Projecao")
public class Projecao implements Serializable {

	private static final long serialVersionUID = 1L;

	@Id
	@GeneratedValue(strategy = GenerationType.SEQUENCE)
	@Column(name = "ID_PROJECAO")
	private int idProjecao;
	
	@OneToOne
	@JoinColumn
	private Empregado idEmpregado;
	
	@Column(nullable = false, name = "PRECO_DA_FABRICA")
	private String precoDaFabrica;
	
	@Column(nullable = false, name = "QUANTIDADE_DE_VIDROS")
	private int quantidadeDeVidros;
	
	public Projecao() {}

	public int getIdProjecao() {
		return idProjecao;
	}

	public void setIdProjecao(int idProjecao) {
		this.idProjecao = idProjecao;
	}

	public Empregado getIdEmpregado() {
		return idEmpregado;
	}

	public void setIdEmpregado(Empregado idEmpregado) {
		this.idEmpregado = idEmpregado;
	}

	public String getPrecoDaFabrica() {
		return precoDaFabrica;
	}

	public void setPrecoDaFabrica(String precoDaFabrica) {
		this.precoDaFabrica = precoDaFabrica;
	}

	public int getQuantidadeDeVidros() {
		return quantidadeDeVidros;
	}

	public void setQuantidadeDeVidros(int quantidadeDeVidros) {
		this.quantidadeDeVidros = quantidadeDeVidros;
	}
	
}
