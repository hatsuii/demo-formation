package eu.ensup.demoFormation.dao;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;

import eu.ensup.demoFormation.domaine.Formation;

public class FormationDao implements IFormationDao {

	private EntityManagerFactory emf;
	private EntityManager em;

	public FormationDao() {
		emf = Persistence.createEntityManagerFactory("demoformation");
		em = emf.createEntityManager();
	}

	@Override
	public boolean create(Formation pFormation) { // OK
		// TODO create -> persist()

		EntityTransaction tx = em.getTransaction();
		tx.begin();
		Formation formation = new Formation(pFormation.getTheme());
		em.persist(formation);
		tx.commit();
		return true;
	}

	@Override
	public Formation read(long idFormation) { // OK
		// TODO read -> find() / getReference()
		// retourne la formation correspondant � l'id
		Formation formation = em.find(Formation.class, idFormation);
		return formation;
	}

	@Override
	public List<Formation> getAll() {
		// TODO retourne la liste des formations
		return em.createQuery("Select t from " + Formation.class.getSimpleName() + " t").getResultList();
	}

	@Override
	public Formation update(Formation pFormation, long idFormation) {
		// TODO update -> find() + setAttribute()
		// retourne la formation apres modification
		Formation formation = read(idFormation);
		EntityTransaction tx = em.getTransaction();
		tx.begin();
		formation.setTheme(pFormation.getTheme());
		tx.commit();
		return formation;
	}

	@Override
	public boolean delete(long idFormation) { // OK
		// TODO delete -> find() + setAttribute()
		Formation formation = read(idFormation);
		EntityTransaction tx = em.getTransaction();
		tx.begin();
		em.remove(formation);
		tx.commit();
		return true;
	}

	public void closeEM() { // OK
		em.close();
		emf.close();
	}

}
