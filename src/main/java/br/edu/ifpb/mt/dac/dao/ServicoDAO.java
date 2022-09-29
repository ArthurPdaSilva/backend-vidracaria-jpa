package br.edu.ifpb.mt.dac.dao;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.EntityTransaction;
import javax.persistence.TypedQuery;
import br.edu.ifpb.mt.dac.entities.Servico;

public class ServicoDAO extends DAO{

public void save(Servico servico) throws Exception {
		
		EntityManager em = getEntityManager();
		EntityTransaction transaction = em.getTransaction();
		transaction.begin();
		try {
			em.persist(servico);
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

	public Servico update(Servico servico) throws Exception {
		EntityManager em = getEntityManager();
		EntityTransaction transaction = em.getTransaction();
		transaction.begin();
		Servico resultado = servico;
		try {
			resultado = em.merge(servico);
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

	public void delete(Servico servico) throws Exception {
		EntityManager em = getEntityManager();
		EntityTransaction transaction = em.getTransaction();
		transaction.begin();
		try {
			servico = em.find(Servico.class, servico.getIdServico());
			em.remove(servico);
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

	public Servico getByID(int servicoId) throws Exception {
		EntityManager em = getEntityManager();
		Servico resultado = null;
		try {
			resultado = em.find(Servico.class, servicoId);
		} catch (Exception pe) {
			pe.printStackTrace();
			throw new Exception("Ocorreu algum erro ao tentar recuperar com base no ID.", pe);
		} finally {
			em.close();
		}

		return resultado;
	}

	public List<Servico> getAll() throws Exception {
		EntityManager em = getEntityManager();
		List<Servico> resultado = null;
		try {
			TypedQuery<Servico> query = em.createQuery("SELECT u FROM SERVICO u", Servico.class);
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
