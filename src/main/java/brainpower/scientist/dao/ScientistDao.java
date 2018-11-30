package brainpower.scientist.dao;

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
	
	public Scientist findById(Long id) {
		return em.find(Scientist.class, id);
	}

}
