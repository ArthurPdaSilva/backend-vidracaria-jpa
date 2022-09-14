package br.edu.ifpb.mt.dac;

import java.util.Date;

import br.edu.ifpb.mt.dac.dao.CarDAO;
import br.edu.ifpb.mt.dac.dao.UserDAO;
import br.edu.ifpb.mt.dac.entities.Carro;
import br.edu.ifpb.mt.dac.entities.User;

public class MainSave {

	public static void main(String[] args) throws DacException {
		//UserDAO dao = new UserDAO();
		CarDAO dao = new CarDAO();
		try {
			Carro car = new Carro("riundei", 1000, 87);
			dao.save(car);
		} finally {
			dao.close();
		}
	}

}
