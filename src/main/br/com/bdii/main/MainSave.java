package br.com.bdii.main;

import br.com.bdii.dao.ClienteDAO;
import br.com.bdii.entities.Cliente;

public class MainSave {

	public static void main(String[] args) {
		
		// àrea de testes
		ClienteDAO cDao = new ClienteDAO();
		Cliente c = new Cliente();
		c.setCpf("12345678901");
		c.setEmail("teste@rotimei.com");
		c.setNome("patricio");
		
		try {
			cDao.save(c);
		} catch (Exception e) {
			e.printStackTrace();
		}
		
		
	}

}
