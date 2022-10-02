package br.edu.ifpb.mt.dac;

import java.time.LocalDate;
import java.util.ArrayList;

import br.edu.ifpb.mt.dac.dao.AcessorioDAO;
import br.edu.ifpb.mt.dac.dao.ClienteDAO;
import br.edu.ifpb.mt.dac.dao.EmpregadoDAO;
import br.edu.ifpb.mt.dac.dao.EnderecoDAO;
import br.edu.ifpb.mt.dac.dao.ProjecaoDAO;
import br.edu.ifpb.mt.dac.dao.ServicoDAO;
import br.edu.ifpb.mt.dac.dao.TelefoneDAO;
import br.edu.ifpb.mt.dac.entities.Acessorio;
import br.edu.ifpb.mt.dac.entities.Cliente;
import br.edu.ifpb.mt.dac.entities.Empregado;
import br.edu.ifpb.mt.dac.entities.Endereco;
import br.edu.ifpb.mt.dac.entities.Projecao;
import br.edu.ifpb.mt.dac.entities.Servico;
import br.edu.ifpb.mt.dac.entities.Telefone;
import enumerables.Status;

public class MainSave {

	public static void main(String[] args) throws Exception {
		ClienteDAO cDao = new ClienteDAO();
		EmpregadoDAO fDao =  new EmpregadoDAO();
		ServicoDAO sDao = new ServicoDAO();
		AcessorioDAO aDao = new AcessorioDAO();
		TelefoneDAO tDao = new TelefoneDAO();
		EnderecoDAO eDao =  new EnderecoDAO();
		ProjecaoDAO pDao = new ProjecaoDAO();
		
		Telefone t = new Telefone(199450789142l);
		
		Endereco endereco = new Endereco();
		endereco.setBairro("cemitério");
		endereco.setCep("58500000");
		endereco.setCidade("Monteiro");
		endereco.setRua("sua da lona");
		endereco.setComplemento("lona");
		
		Cliente cliente = new Cliente();
		cliente.setNome("Eduardo Camarro");
		cliente.setCpf(12345678910l);
		cliente.setRg(123456789l);
		cliente.setEmail_contato("edu@gmail.com");
		
		cliente.setEndereco(endereco);
		cliente.setTelefone(t);
		
		Endereco endFunc = new Endereco();
		endFunc.setBairro("bairro xyz");
		endFunc.setCep("63210000");
		endFunc.setCidade("Mauriti");
		endFunc.setComplemento("casa");
		endFunc.setRua("Rua da lama");
		
		Telefone telFunc = new Telefone(12345678910l);
		
		Empregado funcionario = new Empregado();
		funcionario.setCpf(22225678910l);
		funcionario.setEmail_contato("fulano@hotmail.com");
		funcionario.setNome("fulano");
		funcionario.setEndereco(endFunc);
		funcionario.setHorarioServico("12h-14h");
		
		
		Projecao projecao = new Projecao();
		projecao.setPrecoDaFabrica(25.000f);
		projecao.setQuantidadeDeVidros(15);
		
		ArrayList<Projecao> projecoes = new ArrayList<Projecao>();
		projecoes.add(projecao);
		
		funcionario.setRg(999999999l);
		funcionario.setSalario(2555);
		funcionario.setTelefone(telFunc);
		funcionario.setTipo("Metaleiro");

		Acessorio acessorio = new Acessorio();
		acessorio.setModelo("Glass");
		acessorio.setNome("Vrido");
		
		Servico servico = new Servico();
		servico.setMedidasDoLocal(5);
		servico.setStatus(Status.EmExecucao);
		servico.setIdProjecao(projecao);
		servico.setData(LocalDate.now());
		servico.setIdEmpregado(funcionario);
		servico.setIdCliente(cliente);
		servico.setAcessorio(acessorio);
		
		try {
			tDao.save(t);
			tDao.save(telFunc);
			
			eDao.save(endereco);
			
			eDao.save(endFunc);
			
			cDao.save(cliente);
			fDao.save(funcionario);
			
			pDao.save(projecao);
			
			aDao.save(acessorio);
			
			sDao.save(servico);
			
		} finally {
			sDao.close();
		} 
	}

}
