package br.edu.ifpb.mt.dac;

import java.util.List;

import br.edu.ifpb.mt.dac.dao.UserDAO;
import br.edu.ifpb.mt.dac.entities.User;

public class MainGetAll {

	public static void main(String[] args) throws DacException {

		UserDAO dao = new UserDAO();
		try {
			List<User> usuarios = dao.getAll();

			for (User user : usuarios) {
				System.out.println(user);
			}

		} finally {
			dao.close();
		}
	}

}
