package fr.ynov.fournier.station.modele.metier;
/**
 * Classe nebulosite fille d'appareil
 * @author Fourn
 *
 */
public class Nebulosite extends Appareil {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	
	/**
	 * Constructeur par defaut
	 * @param id
	 * @param refstation
	 * @param statut
	 * @param nom
	 * @param valeur
	 */
	public Nebulosite(Long id, Long refstation, String statut, String nom, double valeur)  {
		super(id, refstation, statut, nom, valeur);
		// TODO Auto-generated constructor stub
	}
	

}
