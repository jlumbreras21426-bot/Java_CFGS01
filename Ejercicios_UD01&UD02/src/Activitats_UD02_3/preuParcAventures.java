package Activitats_UD02_3;

import java.util.Scanner;

public class preuParcAventures {
	  public static void main(String[] args) {
		System.out.println("\t Parc D'Aventures!! \n \t Per entrar has de insertar les dades seguents: \n");
		System.out.println("Quina es la teva edad? \n");
		Scanner sc = new Scanner(System.in);
		int edad = sc.nextInt();
		System.out.println("Quantes Entrades Vols? \n");
		int nEntrades = sc.nextInt();
		double preuEntrades = 24.0;
		double descompteJove  = 0.25;
		double descompteMajor = 0.4;
		double descompteExtra = 0.1;
		double PreuFinal = 0;
	
		// S'emplea double per poder mltiplicar-lo per el descompte que es un decimal (0.25)
	
		if (edad < 0 || nEntrades <= 0) { //comprovam que els valors son valids
			System.out.println("Dades no valides: l'edat no pot ser negativa i has de comprar almenys 1 entrada.");
		} else {
			double preuEntradaEdat = preuEntrades; //volem sabre quin es el preu real depenguent de la Edad
	
			if (edad < 6) {
				preuEntradaEdat = 0;
			} else if (edad >= 6 && edad <= 17) {
				preuEntradaEdat = preuEntrades - (preuEntrades * descompteJove);
			} else if (edad >= 65) {
				preuEntradaEdat = preuEntrades - (preuEntrades * descompteMajor);
			}
	
			double preuTotal = preuEntradaEdat * nEntrades; //Per Sabre el preu Total (Preu entrada * nº entrades)
			boolean teDescompteExtra = preuTotal > 100; //Per Sabre si s'aplica el Descomptre
	
			if (teDescompteExtra) {
				PreuFinal = preuTotal - (preuTotal * descompteExtra);
			} else {
				PreuFinal = preuTotal;
			}
	
			System.out.println( "\n \t Preu d'una entrada amb descompte per edat: " + preuEntradaEdat + " €"+ 
								"\n \t Preu de totes les entrades (abans del descompte addicional): " + preuTotal + " €" +
								"\n \t Descompte addicional del 10% aplicat: " + (teDescompteExtra ? "Si" : "No") + 
								// Mostra Si, si te Descomtre es true, sino mostra no
								"\n \t Preu final total: " + PreuFinal + " €");
		}
		sc.close();
	}

}
