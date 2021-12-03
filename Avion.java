package gestionVehicules.java;

public class Avion extends Vehicule {
	private String type;
	private int nbHeuresVol;
	private double prixCourant;
	
	// Constructeur par défaut
	public  Avion() {
		type = "helices";
		nbHeuresVol = 365;
	}
		
	public Avion(String marque, int dateAchat, double prixAchat, String type, int nbHeuresVol) {
		super(marque, dateAchat, prixAchat);
		this.type = type;
		this.nbHeuresVol = nbHeuresVol;
	}

	public String getType() {
		return type;
	}

	public void setType(String type) {
		this.type = type;
	}

	public int getNbHeuresVol() {
		return nbHeuresVol;
	}

	public void setNbHeuresVol(int nbHeuresVol) {
		this.nbHeuresVol = nbHeuresVol;
	}	
	public double getPrixCourant() {
		return prixCourant;
	}
	public void calculPrix(int anneeActuelle) {
		if(type == "reaction") {
			prixCourant = getPrixAchat() - getPrixAchat() * 0.1 * Math.floor(nbHeuresVol/1000);
		}
		if(type == "helices") {
			prixCourant = getPrixAchat() - getPrixAchat() * 0.1 * Math.floor(nbHeuresVol/100);
		}
		if(prixCourant < 0) {
			prixCourant = 0;
		}
		System.out.println("Prix courant de l'avion : "+prixCourant);
	}
	
	@Override
	public String toString() {
		return "Avion de marque : "+getMarque()+" ,date d'achat : "+getDateAchat()+" , prix d'achat : "+getPrixAchat()+", type : " + type + ", nbHeuresVol=" + nbHeuresVol;
	}
	
}