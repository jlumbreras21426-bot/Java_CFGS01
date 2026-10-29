package Activitats_UD02_1;

public class Booleans_01 {
	public static void main(String[] args) {
		boolean esCapital = true;
		int nombreDeCiutadans = 50000;
		double extensio = 100;
	
		// La ciutat és una metròpolis si és una capital amb més de 50.000 ciutadans
		// i més de 100 km2, o si té més de 100.000 ciutadans.
		boolean esMetropolis = (
				(esCapital && nombreDeCiutadans >= 50000 && extensio >= 100) || 
				(nombreDeCiutadans >= 100000)); 
		//He posat >= per considerar metropolis una ciutat amb 100.000 habitants.
		//Aunque l'enunciat posa "Té més de 100000 ciutadans." i no "100.000 o més"
		
		
		if (esMetropolis) {
			System.out.println("És una metròpolis!!");
		} else {
			
			System.out.println("No és una metròpolis!!");
		}		
	
	}
}
