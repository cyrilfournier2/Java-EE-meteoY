package fr.ynov.fournier.station.stockage;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;

import fr.ynov.fournier.station.service.StationPOJO;



public class DaoJPA implements DaoRemote {

	@PersistenceContext(unitName="STATION")
	private EntityManager em;
	
	@Override
	public List<StationPOJO> getAllStations() {
		// TODO Auto-generated method stub
		return em.createNamedQuery("getAllStations",StationPOJO.class).getResultList();
	}

	@Override
	public StationPOJO getStationById(int id) {
		// TODO Auto-generated method stub
		return em.createNamedQuery("getStationByid", StationPOJO.class).getSingleResult();
	}

	@Override
	public void ajoutStation(Object elt) {
		em.persist(elt);		
	}

	@Override
	public void supprimerStation(int id) {
		StationPOJO st = null;
		st = em.find(StationPOJO.class, id);
		em.remove(st);
		
	}

	@Override
	public void updateAppareil(int id, Object obj) {
		em.merge((StationPOJO)obj);
		
	}

	@Override
	public void updateAllAppareils(int id) {
		em.merge(id);
		
	}

}
