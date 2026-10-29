package Activitats_UD01_2;

public class descompteProducte {
	
	public static void main(String[] args) {
		System.out.println("Definiu una constant DESCOMPTE i calculau el preu final d’un producte.");
		double DESCOMPTE = 0.3;
		double preuProducte = 100;
		double preuFinal = preuProducte-(preuProducte*DESCOMPTE);
		System.out.println("El preu de producte era de:" + preuProducte + 
							"\n" + "i el preu final es :" + preuFinal);
		
	}

}
