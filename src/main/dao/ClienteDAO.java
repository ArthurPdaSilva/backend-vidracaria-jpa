package dao;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.EntityTransaction;
import javax.persistence.TypedQuery;

import entities.Cliente;

public class ClienteDAO extends DAO{
	
	public void save(Cliente cliente) throws Exception {
		
		EntityManager em = getEntityManager();
		EntityTransaction transaction = em.getTransaction();
		transaction.begin();
		try {
			em.persist(cliente);
			transaction.commit();
		} catch (Exception e) {
			e.printStackTrace();
			if (transaction.isActive()) {
				transaction.rollback();
			}
			throw new Exception("Ocorreu algum erro ao tentar inserir o usuário.", e);
		} finally {
			em.close();
		}
	}

	public Cliente update(Cliente cliente) throws Exception {
		EntityManager em = getEntityManager();
		EntityTransaction transaction = em.getTransaction();
		transaction.begin();
		Cliente resultado = cliente;
		try {
			resultado = em.merge(cliente);
			transaction.commit();
		} catch (Exception e) {
			e.printStackTrace();
			if (transaction.isActive()) {
				transaction.rollback();
			}
			throw new Exception("Ocorreu algum erro ao tentar atualizar o usuário.", e);
		} finally {
			em.close();
		}
		return resultado;
	}

	public void delete(Cliente cliente) throws Exception {
		EntityManager em = getEntityManager();
		EntityTransaction transaction = em.getTransaction();
		transaction.begin();
		try {
			cliente = em.find(Cliente.class, cliente.getIdCliente());
			em.remove(cliente);
			transaction.commit();
		} catch (Exception pe) {
			pe.printStackTrace();
			if (transaction.isActive()) {
				transaction.rollback();
			}
			throw new Exception("Ocorreu algum erro ao tentar remover o usuário.", pe);
		} finally {
			em.close();
		}
	}

	public Cliente getByID(int userId) throws Exception {
		EntityManager em = getEntityManager();
		Cliente resultado = null;
		try {
			resultado = em.find(Cliente.class, userId);
		} catch (Exception pe) {
			pe.printStackTrace();
			throw new Exception("Ocorreu algum erro ao tentar recuperar o usuário com base no ID.", pe);
		} finally {
			em.close();
		}

		return resultado;
	}

	public List<Cliente> getAll() throws Exception {
		EntityManager em = getEntityManager();
		List<Cliente> resultado = null;
		try {
			TypedQuery<Cliente> query = em.createQuery("SELECT u FROM User u", Cliente.class);
			resultado = query.getResultList();
		} catch (Exception e) {
			e.printStackTrace();
			throw new Exception("Ocorreu algum erro ao tentar recuperar todos os usuários.", e);
		} finally {
			em.close();
		}
		return resultado;
	}
	
}
