package fr.ynov.fournier.station.modele.metier;
/**
 * Classe fille d'appareil
 * @author Fourn
 *
 */
public class Hygrometre extends Appareil{

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	/**
	 * Constructeur par defaut
	 */	
	public Hygrometre(Long id, Long refstation, String statut, String nom, double valeur) {
		super(id, refstation, statut, nom, valeur);
		// TODO Auto-generated constructor stub
	}
 
	
	
}
