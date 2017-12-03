package fr.ynov.fournier.station.modele.metier;

/**
 * Classe pluviometre fille de Appareil
 * @author Fourn
 *
 */
public class Pluviometre extends Appareil{
	
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	/**
	 * Constructeur par defaut
	 */	
	public Pluviometre(Long id, Long refstation, String statut, String nom, double valeur) {
		super(id, refstation, statut, nom, valeur);
		// TODO Auto-generated constructor stub
	}
	

}
