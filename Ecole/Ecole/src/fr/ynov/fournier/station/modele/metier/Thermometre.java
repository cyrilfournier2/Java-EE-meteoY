package fr.ynov.fournier.station.modele.metier;

/**
 * Classe thermometre fille d'appareil
 * @author Fourn
 *
 */
public class Thermometre extends Appareil{
	
	 
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	/**
	 * Constructeur
	 * @param id
	 * @param refstation
	 * @param statut
	 * @param nom
	 * @param valeur
	 */
	public Thermometre(Long id, Long refstation, String statut, String nom, double valeur) {
		super(id, refstation, statut, nom, valeur);
		// TODO Auto-generated constructor stub
	}
}