package fr.ynov.fournier.station.modele.technique;

import fr.ynov.fournier.station.modele.metier.Station;
import fr.ynov.fournier.station.service.StationPOJO;
import fr.ynov.fournier.station.stockage.Dao;
import fr.ynov.fournier.station.utilitaire.Conversion;


/**
 * Station Managee
 * @author Fourn
 *
 */
public class StationManagee {
	/**
	 * Objet station
	 */
	private Station station;
	/**
	 * POJO station
	 */
	private StationPOJO sp;
	
	private Dao<StationPOJO> dao;
	
	/**
	 * Identifiant
	 */
	private int id;
	
	/**
	 * Constructeur
	 */
	public StationManagee() {
		id = 1;
		station= null;
		sp = null;
		dao = null;
	}
	
	/**
	 * Méthode d'initialisation
	 */
	private void init()
	{
		sp = dao.getStationById(id);
		station = Conversion.pojoToStation(sp);
	}
	
	public StationManagee(int id, Dao<StationPOJO> d)
	{
		id = id;
		dao = d;
		init();
	}
	public StationManagee(StationPOJO s,  Dao<StationPOJO> d)
	{
		id = s.getId();
		sp = s;
		dao = d;
		station = Conversion.pojoToStation(s);
	}
	
	public StationPOJO getPOJO() 
	{
		// TODO Auto-generated method stub
		return sp;
	}
	
	@Override
	public String toString() {
		return String.join(" ", "id:",(""+id),station.toString());
	}
	
	public String reinitialiserStation() {
		/*Todo if user a les droits, réinitialiser
		if()
		*/
		return null;	
	}
	
	public String reinitialiserMateriel() {
		/*Todo if user a les droits, réinitialiser
		if()
		*/
		return null;
	}
	
	public void reinitialiserAppareil() {
		//TODO
		
	}
	
	public void redemarrerStation() {
		//todo
	}
}
