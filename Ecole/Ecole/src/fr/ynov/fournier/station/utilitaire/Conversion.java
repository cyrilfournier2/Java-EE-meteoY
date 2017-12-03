package fr.ynov.fournier.station.utilitaire;

import java.util.List;

import fr.ynov.fournier.station.modele.metier.Appareil;
import fr.ynov.fournier.station.modele.metier.Station;
import fr.ynov.fournier.station.modele.metier.StationAutonome;
import fr.ynov.fournier.station.modele.technique.AucuneStationException;
import fr.ynov.fournier.station.service.StationAutonomePOJO;
import fr.ynov.fournier.station.service.StationPOJO;
/**
 * 
 * @author Fourn
 *
 */
public class Conversion {
	
	public final static String CHEMIN = "fr.ynov.fournier.station.modele.metier.";
	
	/**
	 * Création d'une station
	 * @param pojo
	 * @return
	 */
	public static Station pojoToStation(StationPOJO pojo) {
		Station st = new Station();
		 Class<?> laClasse =null;

			
			st = new Station("maStation", pojo.getX(), pojo.getY(), null, null);
			try {
				if(pojo.getTypeStation() != null) 
				{
					laClasse = Class.forName(CHEMIN+pojo.getTypeStation());
					st.setId(pojo.getId());
					st.setNom(pojo.getNom());
					st.setListeAppareils((List<Appareil>)(pojo.getListeAppareils()));
					st.setX(pojo.getX());
					st.setY(pojo.getY());
					st.setTypeStation(pojo.getTypeStation());
					st.setDateMiseEnService(pojo.getDateMiseEnService());
					st.setDateRedemarrage(pojo.getDateRedemarrage());
					if(pojo.getTypeStation().equals("Autonome"))
					{
						((StationAutonome)st).setTypeStation(pojo.getTypeStation());
					}
					st.initialiserStation(st);
					//ret.entrer(tmp);
				}
			} catch (ClassNotFoundException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			} 
			return st;
				}

}
