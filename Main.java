package gestionVehicules.java;

public class Main extends Vehicule{

	public static void main(String[] args) {
		
		//Voiture par défaut
		Voiture voiture = new Voiture();
		//Avion par défaut
		Avion avion = new Avion();
		
		System.out.println(voiture);
		System.out.println(avion);
		voiture.calculPrix(2021);
		avion.calculPrix(2021);
		Voiture peugeot308 = new Voiture("Peugeot", 2015, 28400, "1800", 5, 280, 18500);
		System.out.println(peugeot308);
		Avion mirage2000 = new Avion("Dassault",1997, 1500000.33, "reaction", 1588);
		System.out.println(mirage2000);
		peugeot308.calculPrix(2021);
		mirage2000.calculPrix(2021);
	}

}