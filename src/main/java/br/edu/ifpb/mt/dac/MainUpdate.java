package br.edu.ifpb.mt.dac;

import java.util.Date;

import br.edu.ifpb.mt.dac.dao.UserDAO;
import br.edu.ifpb.mt.dac.entities.User;

public class MainUpdate {

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

			System.out.println(user);

			// Depois atualizar
			user.setFirstName("Beltrano");

			dao.update(user);

			System.out.println(user);
		} finally {
			dao.close();
		}
	}

}
