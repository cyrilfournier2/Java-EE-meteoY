package fr.ynov.fournier.station.stockage;

import java.util.List;

import javax.ejb.Remote;

import fr.ynov.fournier.station.service.StationPOJO;

@Remote
public interface DaoRemote {

		//Liste de toutes les stations 
		public List<StationPOJO> getAllStations();
		//fonction de recherche par id 
		public StationPOJO getStationById(int id);
		//Cr�ation Station
		public void ajoutStation(Object elt);
		//Suppresion Station
		public void supprimerStation(int id);
		//R�initialise appareil
		public void updateAppareil(int id, Object obj);
		//reinitialise tous 
		public void updateAllAppareils(int id);
		//public void update(Object obj);

}
