package Activitats_UD02_1;

public class Booleans_02 {
	public static void main(String[] args) {
		boolean esCapital = true;
		int nombreDeCiutadans = 100000;
		double impostPerCiutada = 720000000;
	
		boolean esMetropolis = (
				(esCapital && nombreDeCiutadans >= 100000) || 
				(nombreDeCiutadans >= 200000 && impostPerCiutada >= 720000000)); 
		
		if (esMetropolis) {
			System.out.println("És una metròpolis!!");
		} else {	
			System.out.println("No és una metròpolis!!");
		}		
	
	}
}