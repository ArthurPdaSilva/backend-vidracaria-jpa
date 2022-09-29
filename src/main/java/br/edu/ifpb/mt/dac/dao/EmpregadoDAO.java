package br.edu.ifpb.mt.dac.dao;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.EntityTransaction;
import javax.persistence.TypedQuery;

import br.edu.ifpb.mt.dac.entities.Acessorio;
import br.edu.ifpb.mt.dac.entities.Empregado;

public class EmpregadoDAO extends DAO{

public void save(Empregado empregado) throws Exception {
		
		EntityManager em = getEntityManager();
		EntityTransaction transaction = em.getTransaction();
		transaction.begin();
		try {
			em.persist(empregado);
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

	public Empregado update(Empregado empregado) throws Exception {
		EntityManager em = getEntityManager();
		EntityTransaction transaction = em.getTransaction();
		transaction.begin();
		Empregado resultado = empregado;
		try {
			resultado = em.merge(empregado);
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

	public void delete(Empregado empregado) throws Exception {
		EntityManager em = getEntityManager();
		EntityTransaction transaction = em.getTransaction();
		transaction.begin();
		try {
			empregado = em.find(Empregado.class, empregado.getId_pessoa());
			em.remove(empregado);
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

	public Empregado getByID(int empregadoId) throws Exception {
		EntityManager em = getEntityManager();
		Empregado resultado = null;
		try {
			resultado = em.find(Empregado.class, empregadoId);
		} catch (Exception pe) {
			pe.printStackTrace();
			throw new Exception("Ocorreu algum erro ao tentar recuperar com base no ID.", pe);
		} finally {
			em.close();
		}

		return resultado;
	}

	public List<Empregado> getAll() throws Exception {
		EntityManager em = getEntityManager();
		List<Empregado> resultado = null;
		try {
			TypedQuery<Empregado> query = em.createQuery("SELECT u FROM EMPREGADO u", Empregado.class);
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
