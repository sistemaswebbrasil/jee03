package br.com.siswbrasil.jee03.dao;

import java.util.List;

import br.com.siswbrasil.jee03.entity.Action;
import jakarta.enterprise.context.RequestScoped;
import jakarta.persistence.EntityManager;
import jakarta.persistence.PersistenceContext;

@RequestScoped
public class ActionDao {

	@PersistenceContext(name = "jpa-unit")
	private EntityManager em;

	public void createAction(Action action) {
		em.persist(action);
	}

	public Action readAction(int actionId) {
		return em.find(Action.class, actionId);
	}

	public void updateAction(Action action) {
		em.merge(action);
	}

	public void deleteAction(Action action) {
		em.remove(action);
	}

	public List<Action> readAllActions() {
		return em.createNamedQuery("Action.findAll", Action.class).getResultList();
	}

	public List<Action> findAction(String name) {
		return em.createNamedQuery("Action.findAction", Action.class)
				.setParameter("name", name)
				.getResultList();
	}

}
