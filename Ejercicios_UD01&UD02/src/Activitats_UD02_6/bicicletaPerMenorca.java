package Activitats_UD02_6;

import java.util.Scanner;

public class bicicletaPerMenorca {

	public static void main(String[] args) {
	    Scanner scanner = new Scanner(System.in);

	    System.out.print("Distància (km): ");
	    int distanciaInt = scanner.nextInt();
	    System.out.print("Temps estimat (hores): ");
	    double tempsDouble = scanner.nextDouble();
	    System.out.print("Dificultat (F/M/D): ");
	    char dificultatChar = scanner.next().toUpperCase().charAt(0);

	    // Conversions
	    
	    //● Converteix la distància (int) i el temps (double) a String.
	    String distanciaString = "" + distanciaInt;
	    String tempsString = "" + tempsDouble;
	    
	    //● Converteix el caràcter de dificultat (char) a int per mostrar-ne el valor numèric Unicode.
	    int dificultatInt = 0 + dificultatChar;
	    
	    //● Converteix la dificultat de char a String i, després, de String a char.
	    String dificultatString = "" + dificultatChar;
	    char dificultatChar2 = dificultatString.charAt(0);
	    
	    //● Converteix el valor numèric Unicode obtingut de nou a char.
	    char dificultatUnicode = (char)dificultatInt;
	    
	    //● Utilitza l’operador ternari per determinar el text de la dificultat; pots emprar ternari imbricats.
	    String dificultatText = 
	    		  (dificultatChar == 'F') ? "Fàcil"
	            : (dificultatChar == 'M') ? "Mitjana"
	            : (dificultatChar == 'D') ? "Difícil"
	            : "Desconeguda";
	    
	    System.out.println("\n \t Ruta: Menorca en bicicleta");
	    System.out.println("\n \t Distància (int a String): " + distanciaString);
	    System.out.println("\n \t Temps (double a String): " + tempsString);
	    System.out.println("\n \t Dificultat: " + dificultatText);
	    System.out.println("\n \t Dificultat (char a int): " + dificultatInt);
	    System.out.println("\n \t Dificultat (char a String): " + dificultatString);
	    System.out.println("\n \t Dificultat (String a char): " + dificultatChar2);
	    System.out.println("\n \t Dificultat (int a char): " + dificultatUnicode);
	    
	    scanner.close();
	}

}
