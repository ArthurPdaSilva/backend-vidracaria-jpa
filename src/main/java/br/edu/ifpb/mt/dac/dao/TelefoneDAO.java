package br.edu.ifpb.mt.dac.dao;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.EntityTransaction;
import javax.persistence.TypedQuery;

import br.edu.ifpb.mt.dac.entities.Servico;
import br.edu.ifpb.mt.dac.entities.Telefone;

public class TelefoneDAO extends DAO{

public void save(Telefone telefone) throws Exception {
		
		EntityManager em = getEntityManager();
		EntityTransaction transaction = em.getTransaction();
		transaction.begin();
		try {
			em.persist(telefone);
			transaction.commit();
		} catch (Exception e) {
			e.printStackTrace();
			if (transaction.isActive()) {
				transaction.rollback();
			}
			throw new Exception("Ocorreu algum erro ao tentar inserir.", e);
		} finally {
			em.close();
		}
	}

	public Telefone update(Telefone telefone) throws Exception {
		EntityManager em = getEntityManager();
		EntityTransaction transaction = em.getTransaction();
		transaction.begin();
		Telefone resultado = telefone;
		try {
			resultado = em.merge(telefone);
			transaction.commit();
		} catch (Exception e) {
			e.printStackTrace();
			if (transaction.isActive()) {
				transaction.rollback();
			}
			throw new Exception("Ocorreu algum erro ao tentar atualizar.", e);
		} finally {
			em.close();
		}
		return resultado;
	}

	public void delete(Telefone telefone) throws Exception {
		EntityManager em = getEntityManager();
		EntityTransaction transaction = em.getTransaction();
		transaction.begin();
		try {
			telefone = em.find(Telefone.class, telefone.getNumero());
			em.remove(telefone);
			transaction.commit();
		} catch (Exception pe) {
			pe.printStackTrace();
			if (transaction.isActive()) {
				transaction.rollback();
			}
			throw new Exception("Ocorreu algum erro ao tentar remover.", pe);
		} finally {
			em.close();
		}
	}

	public Telefone getByID(int telefoneId) throws Exception {
		EntityManager em = getEntityManager();
		Telefone resultado = null;
		try {
			resultado = em.find(Telefone.class, telefoneId);
		} catch (Exception pe) {
			pe.printStackTrace();
			throw new Exception("Ocorreu algum erro ao tentar recuperar com base no ID.", pe);
		} finally {
			em.close();
		}

		return resultado;
	}

	public List<Telefone> getAll() throws Exception {
		EntityManager em = getEntityManager();
		List<Telefone> resultado = null;
		try {
			TypedQuery<Telefone> query = em.createQuery("SELECT u FROM TELEFONE u", Telefone.class);
			resultado = query.getResultList();
		} catch (Exception e) {
			e.printStackTrace();
			throw new Exception("Ocorreu algum erro ao tentar recuperar todos os registros.", e);
		} finally {
			em.close();
		}
		return resultado;
	}
}
