package br.edu.ifpb.mt.dac.dao;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.EntityTransaction;
import javax.persistence.TypedQuery;

import br.edu.ifpb.mt.dac.entities.Endereco;

public class EnderecoDAO extends DAO{

public void save(Endereco endereco) throws Exception {
		
		EntityManager em = getEntityManager();
		EntityTransaction transaction = em.getTransaction();
		transaction.begin();
		try {
			em.persist(endereco);
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

	public Endereco update(Endereco endereco) throws Exception {
		EntityManager em = getEntityManager();
		EntityTransaction transaction = em.getTransaction();
		transaction.begin();
		Endereco resultado = endereco;
		try {
			resultado = em.merge(endereco);
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

	public void delete(Endereco endereco) throws Exception {
		EntityManager em = getEntityManager();
		EntityTransaction transaction = em.getTransaction();
		transaction.begin();
		try {
			endereco = em.find(Endereco.class, endereco.getId_endreco());
			em.remove(endereco);
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

	public Endereco getByID(int enderecoId) throws Exception {
		EntityManager em = getEntityManager();
		Endereco resultado = null;
		try {
			resultado = em.find(Endereco.class, enderecoId);
		} catch (Exception pe) {
			pe.printStackTrace();
			throw new Exception("Ocorreu algum erro ao tentar recuperar com base no ID.", pe);
		} finally {
			em.close();
		}

		return resultado;
	}

	public List<Endereco> getAll() throws Exception {
		EntityManager em = getEntityManager();
		List<Endereco> resultado = null;
		try {
			TypedQuery<Endereco> query = em.createQuery("SELECT u FROM ENDERECO u", Endereco.class);
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
