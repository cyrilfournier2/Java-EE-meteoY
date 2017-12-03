package fr.ynov.fournier.station.modele.metier;

import java.io.Serializable;

/**
 * Class Mère Appareil
 * @author Fourn
 *
 */
public abstract class Appareil implements Serializable{

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private Long id;
	private Long refstation;
	private String statut;
	private String nom;
	private double valeur;
	
	
	public Appareil(Long id, Long refstation, String statut, String nom, double valeur) {
		super();
		this.id = id;
		this.refstation = refstation;
		this.statut = statut;
		this.nom = nom;
		this.valeur = valeur;
	}
	
	
	public Appareil() {
		super();
	}


	public Long getId() {
		return id;
	}
	public void setId(Long id) {
		this.id = id;
	}
	public Long getRefstation() {
		return refstation;
	}
	public void setRefstation(Long refstation) {
		this.refstation = refstation;
	}
	public String getStatut() {
		return statut;
	}
	public void setStatut(String statut) {
		this.statut = statut;
	}
	public String getNom() {
		return nom;
	}
	public void setNom(String nom) {
		this.nom = nom;
	}
	public double getValeur() {
		return valeur;
	}
	public void setValeur(double valeur) {
		this.valeur = valeur;
	}
}