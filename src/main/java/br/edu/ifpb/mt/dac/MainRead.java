package br.edu.ifpb.mt.dac;

import java.util.List;

import br.edu.ifpb.mt.dac.dao.ServicoDAO;
import br.edu.ifpb.mt.dac.entities.Servico;

public class MainRead {
	public static void main(String[] args) throws Exception {
		ServicoDAO sDao = new ServicoDAO();
		
		List<Servico> ss = sDao.getAll();
		System.out.println("Serviços cadastrados:");
		for(Servico s : ss ) {
			System.out.println("-------------------------------------");
			System.out.println("Serviço ID: " + s.getIdServico());
			System.out.println("Nome do cliente: " + s.getIdCliente().getNome());
			System.out.println("CPF do cliente: " + s.getIdCliente().getCpf());
			System.out.println("Telefone do cliente: " + s.getIdCliente().getTelefone().getNumero());
			System.out.println("Endereço do cliente: " + s.getIdCliente().getEndereco());
			System.out.println("Nome do funcionário: " + s.getIdEmpregado().getNome());
			System.out.println("CPF do funcionário: " + s.getIdEmpregado().getCpf());
			System.out.println("Telefone do funcionário: " + s.getIdEmpregado().getTelefone().getNumero());
			System.out.println("Cargo do funcionário responsável: " + s.getIdEmpregado().getTipo());
			System.out.println("Medidas do local: " + s.getMedidasDoLocal());
			System.out.println("Modelo de acessório utilizado: " +s.getAcessorio().getModelo());
			System.out.println("Total: " + s.getIdProjecao().getPrecoDaFabrica() * s.getIdProjecao().getQuantidadeDeVidros());
			System.out.println("Status: " + s.getStatus());
			System.out.println("--------------------------------");
		}
	}
}
