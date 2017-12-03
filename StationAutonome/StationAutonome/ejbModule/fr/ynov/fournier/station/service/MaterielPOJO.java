package fr.ynov.fournier.station.service;

import java.time.LocalDateTime;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="MATERIEL")
public class MaterielPOJO {
	
	@Id
	@Column(name="IDMATERIEL")
	@GeneratedValue(strategy=GenerationType.AUTO)
	private int id;
	@Column(name="NOM")
	private String nom;
	@Column(name="REFERENCE")
	private String reference;
	@Column(name="DATEMISEENSERVICE")
	private String dateMiseEnService;
		
	public MaterielPOJO() {
		super();
	}
	public MaterielPOJO(String nom, String reference) {
		super();
		this.nom = nom;
		this.reference = reference;
		this.dateMiseEnService =  LocalDateTime.now().toString();
	}
	public String getNom() {
		return nom;
	}
	public void setNom(String nom) {
		this.nom = nom;
	}
	public String getReference() {
		return reference;
	}
	public void setReference(String reference) {
		this.reference = reference;
	}
	public String getDateMiseEnService() {
		return dateMiseEnService;
	}
	public void setDateMiseEnService(String dateMiseEnService) {
		this.dateMiseEnService = dateMiseEnService;
	}
	
	

}
