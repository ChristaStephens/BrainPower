package brainpower.scientist.dao;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.transaction.Transactional;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import brainpower.scientist.model.Review;


@Repository
@Transactional
public class ReviewDao {
	
	@Autowired
	@PersistenceContext
	private EntityManager em;
	
	//strength of the scientist
	public List<Review> findById(Long id) {
		return em.createQuery("FROM Review where scientist =: scientist")
				.setParameter("scientist", id).getResultList();
	}
	
	public void create( Review review) {
		em.persist(review);
	}

}
