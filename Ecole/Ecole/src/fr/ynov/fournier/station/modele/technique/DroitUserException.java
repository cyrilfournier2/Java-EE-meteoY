package fr.ynov.fournier.station.modele.technique;
/**
 * Exception quand l'user n'a pas les droits recquis pour effectuer l'action demandée
 * @author Fourn
 *
 */
public class DroitUserException extends Exception{
	
	private static final long serialVersionUID = 1L;
	
	public DroitUserException() {
		super("Vous n'avez pas les droits pour cette action");
	}
	
	public DroitUserException(String s) {
		super(s);
	}
}