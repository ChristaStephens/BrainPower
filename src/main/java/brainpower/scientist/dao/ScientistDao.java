package brainpower.scientist.dao;

import java.util.ArrayList;
import java.util.List;
import java.util.Set;
import java.util.TreeSet;

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

		return em.createQuery("FROM Scientist ORDER BY name ASC", Scientist.class).getResultList();
	}

	public Scientist findById(Long id) {
		return em.find(Scientist.class, id);
	}

	public List<Scientist> findByName(String name) {
		return em.createQuery("FROM Scientist WHERE name = :name", Scientist.class)
				.setParameter("regex", "%" + name.toLowerCase() + "%").getResultList();
	}

	public List<Scientist> findByStrength() {
		return em.createQuery("FROM Scientist ORDER BY strength DESC", Scientist.class).getResultList();
	}

	public List<Scientist> findByWeakness() {
		return em.createQuery("FROM Scientist ORDER BY strength ASC", Scientist.class).getResultList();
	}

	public List<Scientist> findNumber() {
		return em.createQuery("FROM Scientist ORDER BY strength DESC", Scientist.class).setMaxResults(15)
				.getResultList();

	}
	public List<Scientist> findByCountry(String country) {
		return em.createQuery("FROM Scientist WHERE LOWER(country) LIKE :regex ORDER BY name ASC", Scientist.class)
				.setParameter("regex",  "%" + country.toLowerCase() + "%").getResultList();
	}

	public List<Scientist> findByField(String field) {
		List<Scientist> list =  em.createQuery("FROM Scientist WHERE LOWER(field) LIKE :regex ORDER BY name ASC", Scientist.class)
				.setParameter("regex", "%" + field.toLowerCase() + "%").getResultList();

		return list;
	}

	public void create(Scientist scientist) {
		em.persist(scientist);
	}
	
	public List<Scientist> findByCountryAndField(String country, String field){
		return em.createQuery("FROM Scientist WHERE country =: country AND field =: field", Scientist.class)
				.setParameter("country", country).setParameter("field", field).getResultList();
	}

	public Set<String> findAllCountries() {
		// This query returns a list of Strings
		List<String> countryList = em.createQuery("SELECT DISTINCT country FROM Scientist ORDER BY country ASC", String.class)
				.getResultList();
		List<String> newList = new ArrayList<>();
		for (String s : countryList) {
			String[] a = s.split(",");

			for (String str : a) {
				newList.add(str);
			}
		}
	
		// Convert the List to a Set.
		return new TreeSet<>(newList);

	}
	
	public List<Scientist> fillTournament(){
		List<Scientist> all = findByStrength();
		List<Scientist> list = new ArrayList<>();
		
		for (int i = 0; i < 16; i++) {
			list.add(all.get(i));
		}
		
		return list;
	}
	public Set<String> findAllFields() {
		// This query returns a list of Strings
		List<String> fieldList = em.createQuery("SELECT DISTINCT field FROM Scientist ORDER BY field ASC", String.class).getResultList();
		List<String> newList = new ArrayList<>();
		for (String s : fieldList) {
			String[] a = s.split(",");

			for (String str : a) {
				newList.add(str);
			}
		}
		// Convert the List to a Set.
		return new TreeSet<>(newList);

	}

	public void update(Scientist scientist) {
		em.merge(scientist);
	}
	
//	public List<Scientist> findByAlphabet() {
//		List<Scientist> list = null;
//		char[] arr = {'a', 'b', 'c', 'd', 'e', 'f', 'h', 'i', 'j', 'k', 'l', 'm', 'n', 'o', 'p', 
//				'q', 'r', 's', 't', 'u', 'v', 'w', 'x', 'y', 'z'};
//		for(int i = 0; i< arr.length; i++) {
//			list =  em.createQuery("FROM Scientist WHERE LOWER(name) LIKE'" + arr[i] + "%'", Scientist.class).getResultList();
//			System.out.println(list);
//		}
//	
//		return list;
//	
//		
//	}
	
	public List<Scientist> findByAlphabet(char letter) {
		List<Scientist> list =  em.createQuery("FROM Scientist WHERE LOWER(name) LIKE'" + letter + "%'", Scientist.class).getResultList();
		System.out.println(list);
		return list;
	
		
	}

}
