package com.simplon.Bean;

public class Logement {
	private int Id;
	private Proprietaire proprio;
	private String rue;
	private String ville;
	private String description;
	private String photo;
	private double montant;
	
	public Proprietaire getProprio() {
		return proprio;
	}
	public void setProprio(Proprietaire proprio){
		this.proprio = proprio;
	}
	public String getRue() {
		return rue;
	}
	public void setRue(String rue) {
		this.rue = rue;
	}
	public String getVille() {
		return ville;
	}
	public void setVille(String ville) {
		this.ville = ville;
	}
	public String getDescription() {
		return description;
	}
	public void setDescription(String description) {
		this.description = description;
	}
	public String getPhoto() {
		return photo;
	}
	public void setPhoto(String photo) {
		this.photo = photo;
	}
	public  double getMontant() {
		return montant;
	}
	public void setMontant(double montant) {
		this.montant = montant;
	}
	public int getId() {
		return Id;
	}
	public void setId(int id) {
		Id = id;
	}
	
}
