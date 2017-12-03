package fr.ynov.fournier.station.stockage;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;

import fr.ynov.fournier.station.service.StationPOJO;
/**
 * 
 * @author Fourn
 *
 */
public class DaoFactory {

	/**
	 * Chemin vers le fichier acces.properties
	 */
	public final static String FICHIER="acces.properties";
	private static DaoFactory instance = null;
	private DaoFactory() {

	}
	public static DaoFactory getInstance() {
		if (instance == null)
		{
			instance=new DaoFactory();
		}
		return instance;
	}
	@SuppressWarnings("unchecked")
	public Dao<StationPOJO> getDao(){
/*
		Class<?> laClasse = null;
		try {
			laClasse = Class.forName("fr.ynov.vincensini.zoo.stockage.DaoJPA");
			return (Dao<CagePOJO>) laClasse.newInstance();
		} catch (ClassNotFoundException e) {
			e.printStackTrace();
		} catch (InstantiationException e) {
			e.printStackTrace();
		} catch (IllegalAccessException e) {
			e.printStackTrace();
		}
*/
		return new DaoJPA();
//		return new DaoDur();
//		return null;
	}
	private String getNomDao()
	{
		String ret = "";
		Properties prop = null;
		prop = new Properties();
		try {
			prop.load(new FileInputStream(FICHIER));
			ret = prop.getProperty("package")+prop.getProperty("dao");
		} catch (FileNotFoundException e) {
			// FIXME Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return ret;
	}
}
