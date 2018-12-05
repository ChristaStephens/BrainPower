package brainpower.scientist.dao;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.transaction.Transactional;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import brainpower.scientist.model.Review;
import brainpower.scientist.model.Scientist;

@Repository
@Transactional
public class ReviewDao {

	@Autowired
	@PersistenceContext
	private EntityManager em;

	// strength of the scientist
	public double findAverage(Scientist scientist) {
		List<Review> average = em.createQuery("FROM Review where scientist =: scientist").setParameter("scientist", scientist)
				.getResultList();
		double strength = 0.0;
		for (Review r : average) {
			strength = strength + r.getStrength();
		}
		return strength / average.size();
	}

	public void create(Review review) {
		em.persist(review);
	}

}
