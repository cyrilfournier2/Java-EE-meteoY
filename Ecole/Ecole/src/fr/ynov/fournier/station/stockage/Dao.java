package fr.ynov.fournier.station.stockage;


import java.util.List;
/**
 * 
 * @author Fourn
 *
 * @param <T>
 */
public interface Dao<T> {
public List<T> getAllStations();
public T getStationById(int id);
public void ajoutStation(T elt);
public void updateAppareil(int id, T obj);
//JAVA 8
public void updateAllAppareils(T obj);
public void supprimerStation(int id);
}
