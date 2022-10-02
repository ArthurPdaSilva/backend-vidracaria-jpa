package br.edu.ifpb.mt.dac;

import br.edu.ifpb.mt.dac.dao.EmpregadoDAO;
import br.edu.ifpb.mt.dac.dao.ServicoDAO;

public class MainDelete {

	public static void main(String[] args) {
		
		ServicoDAO sDao = new ServicoDAO();
		EmpregadoDAO eDao = new EmpregadoDAO();
		
		try {
			 
			sDao.delete(sDao.getByID(9)); // editar
		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			sDao.close();
		}
		
		try {
			eDao.delete(eDao.getByID(6)); // editar
		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			eDao.close();
		}
		
		

	}

}
