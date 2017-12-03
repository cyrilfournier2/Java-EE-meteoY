package fr.ynov.fournier.station.stockage;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.Persistence;
import javax.persistence.PersistenceContext;
import javax.persistence.TypedQuery;

import fr.ynov.fournier.station.service.StationPOJO;

/**
 * 
 * @author Fourn
 *
 */
public class DaoJPA implements Dao<StationPOJO> {
	@PersistenceContext(unitName="ecole")

	private EntityManager em;
	/**
	 * Construction du contexte JPA
	 */
	public DaoJPA() {
	em = Persistence.createEntityManagerFactory("ecole").createEntityManager();
	}
	@Override
	public List<StationPOJO> getAllStations() {
		// TODO Auto-generated method stub
		return em.createNamedQuery("getAllStations",StationPOJO.class).getResultList();
	}
	@Override
	public StationPOJO getStationById(int id) {
		return em.createNamedQuery("getStationByIdS",StationPOJO.class).getSingleResult();
	}
	@Override
	public void ajoutStation(StationPOJO elt) {
		// TODO Auto-generated method stub
		em.persist(elt);
	}
	@Override
	public void updateAppareil(int id, StationPOJO obj) {
		em.merge((StationPOJO)obj);
		
	}
	@Override
	public void supprimerStation(int id) {
		StationPOJO station = null;
//		em.getTransaction().begin();
		station = em.find(StationPOJO.class, id);
		em.remove(station);
	}
	@Override
	public void updateAllAppareils(StationPOJO obj) {
		em.merge(obj);
		
	}


}
