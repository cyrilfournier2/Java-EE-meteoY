package fr.ynov.fournier.station.modele.metier;

import java.io.Serializable;
import java.time.LocalDateTime;
import java.util.List;
	
/**
 * Classe station
 * @author Fourn
 *
 */
	public class Station implements Serializable{
		

		/**
		 * 
		 */
		private static final long serialVersionUID = 1L;
		private int id;
		private String nom;
		private int x;
		private int y;
		private List<Appareil> listeAppareils;
		private String dateRedemarrage;
		private String dateMiseEnService;
		private String typeStation;

		




		/**
		 * 
		 * Constructeur avec tous les paramètres

		 * @param nom
		 * @param x
		 * @param y
		 * @param temperature
		 * @param pluviometrie
		 * @param hygrometrie
		 * @param nebulosite
		 * @param anenometrie
		 */
		
		public Station( String nom, int x, int y, List<Appareil> listeAppareil, String type) {
			super();

			this.nom = nom;
			this.x = x;
			this.y = y;
			this.dateRedemarrage = "";
			this.dateMiseEnService = LocalDateTime.now().toString();
			this.typeStation = type;
		
			

		}
		
		
		
		public String getTypeStation() {
			return typeStation;
		}



		public void setTypeStation(String typeStation) {
			this.typeStation = typeStation;
		}
		public List<Appareil> getListeAppareils() {
			return listeAppareils;
		}



		public void setListeAppareils(List<Appareil> listeAppareils) {
			this.listeAppareils = listeAppareils;
		}



		public Station() {
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

		public Station initialiserStation(Station st) {
			Station station = new Station();
			station = st;
			return station;
		}



	}


