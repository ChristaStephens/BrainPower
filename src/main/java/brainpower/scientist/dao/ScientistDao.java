package brainpower.scientist.dao;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.transaction.Transactional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import brainpower.scientist.model.Scientist;

@Repository
@Transactional
public class ScientistDao {

	@Autowired
	@PersistenceContext
	private EntityManager em;

	public List<Scientist> findAll() {

		return em.createQuery("FROM Scientist", Scientist.class).getResultList();
	}

	public Scientist findById(Long id) {
		return em.find(Scientist.class, id);
	}

	public List<Scientist> findByName(String name) {
		return em.createQuery("FROM Scientist WHERE name = :name", Scientist.class)
				.setParameter("regex", "%" + name.toLowerCase() + "%").getResultList();
	}

	public List<Scientist> findByStrength() {
		return em.createQuery("FROM Scientist ORDER BY strength DESC", Scientist.class)
				.getResultList();
	}

	public List<Scientist> findByField(String field) {
		return em.createQuery("FROM Scientist WHERE LOWER(field) LIKE :regex", Scientist.class)
				.setParameter("regex", "%" + field.toLowerCase() + "%").getResultList();
	}
	
	public void create(Scientist scientist) {
		em.persist(scientist);
	}

}
