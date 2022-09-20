package main;

import dao.ClienteDAO;
import entities.Cliente;

public class MainTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Cliente c = new Cliente();
		ClienteDAO cDao = new ClienteDAO();
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
