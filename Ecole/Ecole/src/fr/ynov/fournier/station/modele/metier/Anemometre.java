package fr.ynov.fournier.station.modele.metier;

/**
 * Class Anemometre enfant d'appareil
 * @author Fourn
 *
 */
public class Anemometre extends Appareil{

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	/**
	 * Constructeur apr defaut
	 * @param id
	 * @param refstation
	 * @param statut
	 * @param nom
	 * @param valeur
	 */
	public Anemometre(Long id, Long refstation, String statut, String nom, double valeur) {
		super(id, refstation, statut, nom, valeur);
		// TODO Auto-generated constructor stub
	}
	
	

	
	
}
