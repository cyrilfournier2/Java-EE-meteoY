package fr.ynov.fournier.station.modele.metier;

import java.util.List;

public class StationAutonome extends Station{
	
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private Appareil appareil;

	
	public StationAutonome( String nom, int x, int y, List<Appareil> listeAppareil, Appareil appareil, String type) {
		super(nom, x, y, listeAppareil, type);
		this.appareil = appareil;
	}

	public Appareil getMateriel() {
		return appareil;
	}

	public void setMateriel(Appareil appareil) {
		this.appareil = appareil;
	}

}
