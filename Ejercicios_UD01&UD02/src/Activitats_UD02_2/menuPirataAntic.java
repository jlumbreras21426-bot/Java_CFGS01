package Activitats_UD02_2;

import java.util.Scanner;

public class menuPirataAntic {

	public static void main(String[] args) {

	    Scanner sc = new Scanner(System.in);

	    // Mostram les opcions disponibles del menú.
	    System.out.println("MENÚ DE NAVEGACIÓ");
	    System.out.println("\t 1. Consultar rumb");
	    System.out.println("\t 2. Consultar velocitat");
	    System.out.println("\t 3. Calcular temps de navegació");
	    System.out.println("\t 4. Mostrar estat del vaixell");
	    System.out.println("\t 5. Finalitzar navegació");

	    // Demanam a l'usuari quina opció vol seleccionar.
	    System.out.print("\n Tria una opció (1-5): \n");
	    int opcio = sc.nextInt();

	    switch (opcio) {
	        case 1:
	            System.out.println("Opció 1: Consultar rumb.");
	            break;
	        case 2:
	            System.out.println("Opció 2: Consultar velocitat.");
	            break;
	        case 3:
	            System.out.println("Opció 3: Calcular temps de navegació.");
	            break;
	        case 4:
	            System.out.println("Opció 4: Mostrar estat del vaixell.");
	            break;
	        case 5:
	            System.out.println("Opció 5: Finalitzar navegació.");
	            break;
	        default:
	            System.out.println("Opció no vàlida.");
	    }

	    sc.close();
	}

}
