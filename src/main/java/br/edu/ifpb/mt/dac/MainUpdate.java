package br.edu.ifpb.mt.dac;

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

public class MainUpdate {
	public static void main(String[] args) throws Exception { 
		ClienteDAO cDao = new ClienteDAO();
		EmpregadoDAO fDao =  new EmpregadoDAO();
		ServicoDAO sDao = new ServicoDAO();
		AcessorioDAO aDao = new AcessorioDAO();
		TelefoneDAO tDao = new TelefoneDAO();
		EnderecoDAO eDao =  new EnderecoDAO();
		ProjecaoDAO pDao = new ProjecaoDAO();

		Telefone t1 = tDao.getByID(1);// editar
		Telefone t2 = tDao.getByID(2);// editar
		t1.setNumero(98765432122l);
		t2.setNumero(12345612322l);
		
		Cliente c = cDao.getByID(5);// editar
		c.setNome("Francisco");
		c.setTelefone(t1);
		
		Empregado e = fDao.getByID(6);// editar
		e.setTipo("Funcionário superior");
		e.setEmail_contato("newperson@gmail.com");
		e.setTelefone(t2);
		
		Acessorio a = aDao.getByID(8);// editar
		a.setNome("Fechadura");
		a.setModelo("Modelo A15");
		
		Endereco en = eDao.getByID(3);// editar
		en.setComplemento("Esquina do Seu Zé");
		en.setBairro("Jacaré Paguá");
		
		Projecao p = pDao.getByID(7);// editar
		p.setPrecoDaFabrica(23.22f);
		
		Servico s = sDao.getByID(9);// editar
		s.setIdEmpregado(e);
		s.setIdCliente(c);
		s.setStatus(Status.Finalizado);
		s.setAcessorio(a);
		s.setIdProjecao(p);
		
		c.setEndereco(en);
		
		try {
			
			tDao.update(t1);
			tDao.update(t2);
			
			eDao.update(en);
			
			cDao.update(c);
			fDao.update(e);
			
			pDao.update(p);
			
			aDao.update(a);
			
			sDao.update(s);
			
		} finally {
			sDao.close();
		} 
	}
}
