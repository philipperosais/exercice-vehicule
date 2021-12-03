package gestionVehicules.java;

public class Voiture extends Vehicule {
	private String cylindree;
	private int nbPortes;
	private int puissance;
	private int kilometrage;
	private double prixCourant;
	
	// Constructeur par défaut
	public  Voiture() {
		cylindree = "1800";
		nbPortes = 3;
		puissance = 280;
		kilometrage = 2350;
	}
	
	public Voiture(String marque, int dateAchat, double prixAchat, String cylindree, int nbPortes, int puissance, int kilometrage) {
		super(marque, dateAchat, prixAchat);
		this.cylindree = cylindree;
		this.nbPortes = nbPortes;
		this.puissance = puissance;
		this.kilometrage = kilometrage;	
	}
	
	public String getCylindree() {
		return cylindree;
	}
	public void setCylindree(String cylindree) {
		this.cylindree = cylindree;
	}
	public int getNbPortes() {
		return nbPortes;
	}
	public void setNbPortes(int nbPortes) {
		this.nbPortes = nbPortes;
	}
	public int getPuissance() {
		return puissance;
	}
	public void setPuissance(int puissance) {
		this.puissance = puissance;
	}
	public int getKilometrage() {
		return kilometrage;
	}
	public void setKilometrage(int kilometrage) {
		this.kilometrage = kilometrage;
	}
	public double getPrixCourant() {
		return prixCourant;
	}
	public void calculPrix(int anneeActuelle) {
		prixCourant = getPrixAchat() - (0.02 * (getDateAchat()-anneeActuelle) + 0.05 * Math.floor(kilometrage/10000))*getPrixAchat();
		if(getMarque() == "Renault" || getMarque() == "Fiat") {
			prixCourant = prixCourant - 0.9 * getPrixAchat();
		}
		if(getMarque() == "Ferrari" || getMarque() == "Porsche") {
			prixCourant = prixCourant- 0.8 * getPrixAchat();
		}
		if(prixCourant < 0) {
			prixCourant = 0;
		}
		System.out.println("Prix courant de la voiture : "+prixCourant);
	}
	@Override
	public String toString() {
		return "Voiture de marque : "+ getMarque()+", date d'achat : "+ getDateAchat() + ", prix d'achat : "+ getPrixAchat() +"€, cylindrée : " + cylindree + ", nbPortes=" + nbPortes + ", puissance=" + puissance
				+ ", kilometrage=" + kilometrage;
	}
	
}