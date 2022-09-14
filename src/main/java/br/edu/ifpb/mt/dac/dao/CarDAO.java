package br.edu.ifpb.mt.dac.dao;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.EntityTransaction;
import javax.persistence.PersistenceException;
import javax.persistence.TypedQuery;

import br.edu.ifpb.mt.dac.entities.Carro;
import br.edu.ifpb.mt.dac.entities.User;

public class CarDAO extends DAO {

	public void save(Carro user) throws PersistenciaDacException {
		EntityManager em = getEntityManager();
		EntityTransaction transaction = em.getTransaction();
		transaction.begin();
		try {
			em.persist(user);
			transaction.commit();
		} catch (PersistenceException pe) {
			pe.printStackTrace();
			if (transaction.isActive()) {
				transaction.rollback();
			}
			throw new PersistenciaDacException("Ocorreu algum erro ao tentar salvar o usuário.", pe);
		} finally {
			em.close();
		}
	}

	public Carro update(Carro user) throws PersistenciaDacException {
		EntityManager em = getEntityManager();
		EntityTransaction transaction = em.getTransaction();
		transaction.begin();
		Carro resultado = user;
		try {
			resultado = em.merge(user);
			transaction.commit();
		} catch (PersistenceException pe) {
			pe.printStackTrace();
			if (transaction.isActive()) {
				transaction.rollback();
			}
			throw new PersistenciaDacException("Ocorreu algum erro ao tentar atualizar o usuário.", pe);
		} finally {
			em.close();
		}
		return resultado;
	}

	public void delete(Carro user) throws PersistenciaDacException {
		EntityManager em = getEntityManager();
		EntityTransaction transaction = em.getTransaction();
		transaction.begin();
		try {
			user = em.find(Carro.class, user.getId());
			em.remove(user);
			transaction.commit();
		} catch (PersistenceException pe) {
			pe.printStackTrace();
			if (transaction.isActive()) {
				transaction.rollback();
			}
			throw new PersistenciaDacException("Ocorreu algum erro ao tentar remover o usuário.", pe);
		} finally {
			em.close();
		}
	}

	public User getByID(int userId) throws PersistenciaDacException {
		EntityManager em = getEntityManager();
		User resultado = null;
		try {
			resultado = em.find(User.class, userId);
		} catch (PersistenceException pe) {
			pe.printStackTrace();
			throw new PersistenciaDacException("Ocorreu algum erro ao tentar recuperar o usuário com base no ID.", pe);
		} finally {
			em.close();
		}

		return resultado;
	}

	public List<User> getAll() throws PersistenciaDacException {
		EntityManager em = getEntityManager();
		List<User> resultado = null;
		try {
			TypedQuery<User> query = em.createQuery("SELECT u FROM User u", User.class);
			resultado = query.getResultList();
		} catch (PersistenceException pe) {
			pe.printStackTrace();
			throw new PersistenciaDacException("Ocorreu algum erro ao tentar recuperar todos os usuários.", pe);
		} finally {
			em.close();
		}
		return resultado;
	}
}
