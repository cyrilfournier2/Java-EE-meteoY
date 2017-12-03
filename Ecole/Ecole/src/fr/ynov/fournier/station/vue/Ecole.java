package fr.ynov.fournier.station.vue;
/**
 * 
 * @author Fourn
 *
 */
public class Ecole {
	/**
	 * Liste d'�coles correspondant � une station
	 */
	private  Ecole []lesEcoles;
	
	
	/**
	 * M�thode d'initialisation de l'application
	 */
	public void init() {
		lesEcoles[0] = new Ecole();
		lesEcoles[1] = new Ecole();
		lesEcoles[2] = new Ecole();
		
	}
	/**
	 * Constructeur
	 */
	public Ecole() {
		lesEcoles = new Ecole[3];
		init();
	}
	
	/**
	 * Affichage des stations
	 */
	public void afficher() {
		for (Ecole e : lesEcoles) {
			e.afficher();
		}
	}
	
	public static void main(String[] args) {
	}
	
	}


