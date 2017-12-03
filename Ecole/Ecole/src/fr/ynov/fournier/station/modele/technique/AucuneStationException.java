package fr.ynov.fournier.station.modele.technique;
/**
 * Exception aucunes staions disponible
 * @author Fourn
 *
 */
public class AucuneStationException extends Exception{
	
	private static final long serialVersionUID = 1L;
	
	public AucuneStationException() {
		super("Aucune station n'est disponible");
	}
	
	public AucuneStationException(String s) {
		super(s);
	}
}
