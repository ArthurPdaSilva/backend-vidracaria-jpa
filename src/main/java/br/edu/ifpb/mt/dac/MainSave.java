package br.edu.ifpb.mt.dac;

import java.math.BigInteger;
import java.util.Date;

import br.edu.ifpb.mt.dac.dao.ClienteDAO;
import br.edu.ifpb.mt.dac.dao.TelefoneDAO;
import br.edu.ifpb.mt.dac.entities.Cliente;
import br.edu.ifpb.mt.dac.entities.Endereco;
import br.edu.ifpb.mt.dac.entities.Telefone;

public class MainSave {

	public static void main(String[] args) throws Exception {
		ClienteDAO dao = new ClienteDAO();
		
		Cliente cliente = new Cliente();
		cliente.setNome("Magalzão");
		cliente.setCpf(new BigInteger("12345678910"));
		cliente.setRg(new BigInteger("123456789"));
		cliente.setEmail_contato("asdsa@gmail.com");
		
		Telefone t = new Telefone(new BigInteger("12345678910"));
		
		Endereco endereco = new Endereco();
		endereco.setBairro("cemitério");
		endereco.setCep("58500000");
		endereco.setCidade("monteiro");
		endereco.setComplemento("lona");
		endereco.setPessoa(cliente);
		endereco.setRua("sua da lona");
		
		cliente.setEndereco(endereco);
		cliente.setTelefone(t);

		System.out.println(cliente);
		try {
			dao.save(cliente);
			
			System.out.println(cliente);
		} finally {
			dao.close();
		}
	}

}
