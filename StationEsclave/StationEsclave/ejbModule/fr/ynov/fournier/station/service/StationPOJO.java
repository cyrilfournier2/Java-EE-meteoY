package fr.ynov.fournier.station.service;

import java.io.Serializable;
import java.time.LocalDateTime;
import java.util.List;

import javax.ejb.Stateless;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.NamedQueries;
import javax.persistence.NamedQuery;
import javax.persistence.Table;



@Stateless
@Entity
@Table(name="STATION")
//@NamedQueries({ @NamedQuery(name = "allStations", query = "SELECT u FROM STATION u"),
//@NamedQuery(name = "getStationByid", query = "SELECT u FROM STATION u WHERE u.id = :id") })
public class StationPOJO implements Serializable{
	
	@Id
	@Column(name="IDSTATION")
	@GeneratedValue(strategy=GenerationType.AUTO)
	private int id;
	@Column(name="NAME")
	private String nom;
	@Column(name="X")
	private int x;
	@Column(name="Y")
	private int y;
	@Column(name="LISTEAPPAREILS")
	private List<AppareilPOJO> listeAppareils;
	@Column(name="DATEREDEMARRAGE")
	private String dateRedemarrage;
	@Column(name="DATEMISEENSERVICE")
	private String dateMiseEnService;

	
	
	/**
	 * 
	 * Constructeur avec tous les paramètres
	 * @param id
	 * @param nom
	 * @param x
	 * @param y
	 * @param temperature
	 * @param pluviometrie
	 * @param hygrometrie
	 * @param nebulosite
	 * @param anenometrie
	 */
	
	public StationPOJO( String nom, int x, int y, List<AppareilPOJO> listeAppareil) {
		super();
	
		this.nom = nom;
		this.x = x;
		this.y = y;
		this.dateRedemarrage = "";
		this.dateMiseEnService = LocalDateTime.now().toString();
	
		

	}
	
	
	
	public List<AppareilPOJO> getListeAppareils() {
		return listeAppareils;
	}



	public void setListeAppareils(List<AppareilPOJO> listeAppareils) {
		this.listeAppareils = listeAppareils;
	}



	public StationPOJO() {
	super();
}



	public int getId() {
		return id;
	}
	
	public void setId(int id) {
		this.id = id;
	}
	
	public String getNom() {
		return nom;
	}
	
	public void setNom(String nom) {
		this.nom = nom;
	}
	
	public int getX() {
		return x;
	}
	
	public void setX(int x) {
		this.x = x;
	}
	
	public int getY() {
		return y;
	}
	
	public void setY(int y) {
		this.y = y;
	}



	public String getDateRedemarrage() {
		return dateRedemarrage;
	}



	public void setDateRedemarrage(String dateRedemarrage) {
		this.dateRedemarrage = dateRedemarrage;
	}



	public String getDateMiseEnService() {
		return dateMiseEnService;
	}



	public void setDateMiseEnService(String dateMiseEnService) {
		this.dateMiseEnService = dateMiseEnService;
	}





}
