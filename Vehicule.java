package gestionVehicules.java;

public abstract class Vehicule {
	private String marque;
	private int dateAchat;
	private double prixAchat;
	private double prixCourant;
	
	// Constructeur par défaut
	public Vehicule() {
		marque = "Moussamobile";
		dateAchat = 2020;
		prixAchat = 33500;
		prixCourant = 32750;
	}
			
	// Constructeur d'initialisation
	public Vehicule(String marque, int dateAchat, double prixAchat) {
		super();
		this.marque = marque;
		this.dateAchat = dateAchat;
		this.prixAchat = prixAchat;
	}
	public String getMarque() {
		return marque;
	}
	public void setMarque(String marque) {
		this.marque = marque;
	}
	public int getDateAchat() {
		return dateAchat;
	}
	public void setDateAchat(int dateAchat) {
		this.dateAchat = dateAchat;
	}
	public double getPrixAchat() {
		return prixAchat;
	}
	public void setPrixAchat(int prixAchat) {
		this.prixAchat = prixAchat;
	}
	public double getPrixCourant() {
		return prixCourant;
	}
	public void calculPrix(int anneeActuelle) {
		prixCourant = prixAchat * 0.01 * (dateAchat-anneeActuelle);
	}
}
