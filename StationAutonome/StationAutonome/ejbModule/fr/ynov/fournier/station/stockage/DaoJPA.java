package fr.ynov.fournier.station.stockage;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;

import fr.ynov.fournier.station.service.StationAutonomePOJO;



public class DaoJPA implements DaoRemote {

	@PersistenceContext(unitName="STATION_AUTONOME")
	private EntityManager em;
	
	@Override
	public List<StationAutonomePOJO> getAllStations() {
		// TODO Auto-generated method stub
		return em.createNamedQuery("getAllStations",StationAutonomePOJO.class).getResultList();
	}

	@Override
	public StationAutonomePOJO getStationById(int id) {
		// TODO Auto-generated method stub
		return em.createNamedQuery("getStationByid", StationAutonomePOJO.class).getSingleResult();
	}

	@Override
	public void ajoutStation(Object elt) {
		em.persist(elt);		
	}

	@Override
	public void supprimerStation(int id) {
		StationAutonomePOJO st = null;
		st = em.find(StationAutonomePOJO.class, id);
		em.remove(st);
		
	}

	@Override
	public void updateAppareil(int id, Object obj) {
		em.merge((StationAutonomePOJO)obj);
		
	}

	@Override
	public void updateAllAppareils(int id) {
		em.merge(id);
		
	}

}
