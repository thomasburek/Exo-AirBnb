package com.simplon.Bean;

public class Dispo {
	private int id;
	private String dateDebut;
	private String dateFin;
	private Logement logement;
	
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getDateDebut() {
		return dateDebut;
	}
	public void setDateDebut(String dateDebut) {
		this.dateDebut = dateDebut;
	}
	public String getDateFin() {
		return dateFin;
	}
	public void setDateFin(String dateFin) {
		this.dateFin = dateFin;
	}
	public Logement getLogement() {
		return logement;
	}
	public void setLogement(Logement logement) {
		this.logement = logement;
	}
}
