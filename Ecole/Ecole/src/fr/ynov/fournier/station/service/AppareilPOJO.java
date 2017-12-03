package fr.ynov.fournier.station.service;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;


@Entity
@Table(name="APPAREIL")
public class AppareilPOJO implements Serializable{
	@Id
	@Column(name="ID")
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
	@Column
	private String typeStation;
	



	public AppareilPOJO(int id, int refstation, String statut, String nom, double valeur, String type) {
		super();
		this.id = id;
		this.refstation = refstation;
		this.statut = statut;
		this.nom = nom;
		this.valeur = valeur;
		this.typeStation = type;
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
	public String getTypeStation() {
		return typeStation;
	}


	public void setTypeStation(String typeStation) {
		this.typeStation = typeStation;
	}
}
