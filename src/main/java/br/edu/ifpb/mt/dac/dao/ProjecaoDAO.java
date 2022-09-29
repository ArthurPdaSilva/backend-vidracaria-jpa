package br.edu.ifpb.mt.dac.dao;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.EntityTransaction;
import javax.persistence.TypedQuery;
import br.edu.ifpb.mt.dac.entities.Projecao;

public class ProjecaoDAO extends DAO{
public void save(Projecao projecao) throws Exception {
		
		EntityManager em = getEntityManager();
		EntityTransaction transaction = em.getTransaction();
		transaction.begin();
		try {
			em.persist(projecao);
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

	public Projecao update(Projecao projecao) throws Exception {
		EntityManager em = getEntityManager();
		EntityTransaction transaction = em.getTransaction();
		transaction.begin();
		Projecao resultado = projecao;
		try {
			resultado = em.merge(projecao);
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

	public void delete(Projecao projecao) throws Exception {
		EntityManager em = getEntityManager();
		EntityTransaction transaction = em.getTransaction();
		transaction.begin();
		try {
			projecao = em.find(Projecao.class, projecao.getIdProjecao());
			em.remove(projecao);
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

	public Projecao getByID(int projecaoId) throws Exception {
		EntityManager em = getEntityManager();
		Projecao resultado = null;
		try {
			resultado = em.find(Projecao.class, projecaoId);
		} catch (Exception pe) {
			pe.printStackTrace();
			throw new Exception("Ocorreu algum erro ao tentar recuperar com base no ID.", pe);
		} finally {
			em.close();
		}

		return resultado;
	}

	public List<Projecao> getAll() throws Exception {
		EntityManager em = getEntityManager();
		List<Projecao> resultado = null;
		try {
			TypedQuery<Projecao> query = em.createQuery("SELECT u FROM PROJECAO u", Projecao.class);
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
