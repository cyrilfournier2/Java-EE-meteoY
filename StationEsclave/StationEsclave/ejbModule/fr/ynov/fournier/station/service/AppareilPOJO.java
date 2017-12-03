package fr.ynov.fournier.station.service;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;


@Entity
@Table(name="APPAREIL")
public class AppareilPOJO implements Serializable{
	@Id
	@Column(name="ID")
	@GeneratedValue(strategy=GenerationType.AUTO)
	private int id;
	@ManyToOne
	@JoinColumn(name="IDSTATION")
	private int refstation;
	@Column
	private String statut;
	@Column
	private String nom;
	@Column
	private double valeur;
	
	
	public AppareilPOJO(int id, int refstation, String statut, String nom, double valeur) {
		super();
		this.id = id;
		this.refstation = refstation;
		this.statut = statut;
		this.nom = nom;
		this.valeur = valeur;
	}
	
	
	public AppareilPOJO() {
		super();
	}


	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public int getRefstation() {
		return refstation;
	}
	public void setRefstation(int refstation) {
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
