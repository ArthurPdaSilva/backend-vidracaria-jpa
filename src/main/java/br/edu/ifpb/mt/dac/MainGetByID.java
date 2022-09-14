package br.edu.ifpb.mt.dac;

import java.util.Date;

import br.edu.ifpb.mt.dac.dao.UserDAO;
import br.edu.ifpb.mt.dac.entities.User;

public class MainGetByID {

	public static void main(String[] args) throws DacException {
		UserDAO dao = new UserDAO();
		try {
			// Primeiro salvar
			User user = new User();

			user.setBirthday(new Date());
			user.setEmail("email@gmail.com");
			user.setFirstName("Sicrano");
			user.setLastName("Silva");

			dao.save(user);

			// Depois recuperar pelo identificador

			User resultado = dao.getByID(user.getId());

			System.out.println(user.equals(resultado));
		} finally {
			dao.close();
		}
	}

}
