package fr.ynov.fournier.station.controleur;

import java.util.List;
import java.util.Properties;
import java.util.Vector;

import javax.naming.Context;
import javax.naming.InitialContext;
import javax.naming.NamingException;

import fr.ynov.fournier.station.modele.metier.Station;
import fr.ynov.fournier.station.modele.technique.StationManagee;
import fr.ynov.fournier.station.service.StationPOJO;
import fr.ynov.fournier.station.stockage.DaoFactory;
import fr.ynov.fournier.station.stockage.DaoRemote;


/**
 * Singleton Manager
 * @author Fourn
 *
 */
public class Manager {
	
	private static Manager instance = null;
	private Vector<StationManagee> lesStations;

	/**
	 * Constructeur
	 */
	private void init()
	{
		List<StationPOJO> st = null;
		st = DaoFactory.getInstance().getDao().getAllStations();
		for (StationPOJO sp : st) {
			lesStations.add(new StationManagee(sp, DaoFactory.getInstance().getDao()));
		}
	}
		
	/**
	 * Initialisation des EJBS
	 */
	private void initEJB()
	{
		List<Station> listStation = null;
		InitialContext contexteWildFly = null;
		Properties env = null;
		DaoRemote daoLocal  =null;
		
		env = new Properties();
		env.put("jboss.naming.client.ejb.context", true); 
	     env.put(Context.INITIAL_CONTEXT_FACTORY,
	    		 "org.jboss.naming.remote.client.InitialContextFactory");
		env.put(Context.PROVIDER_URL, "http-remoting://localhost:8080");

		try {
			contexteWildFly = new InitialContext(env);
			daoLocal = (DaoRemote) contexteWildFly.lookup("//ecole/DaoJPA!fr.ynov.angelini.stationmeteo.stockage.DaoRemote");
		} catch (NamingException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

		listStation = daoLocal.getAllStations();
		for (Station station : listStation) {
			lesStations.add(new StationManagee());
		}

	}

}
