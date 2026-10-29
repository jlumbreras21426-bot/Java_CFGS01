package UD_01_02;
import java.util.Scanner;
public class CalculadorNota {
	//nota 3 trimestres amb scanner
	// 10% primer, 35% segon, 55% tercer, i mostrar si se ha aprovado o no (aprovado >= 5)
	//mostrar nota de cada trimetre i ponderado -> despues de aplicar el % 10 de 10% = 1
	
	public static void main(String[] args) {
		
		System.out.println("Calcularem la teva nota, segons el que has fet durant els trimestres");
		Scanner sc = new Scanner(System.in);
		
		 System.out.println("Introdueix la nota del primer trimestre:");
		    double primerTrimestre = sc.nextDouble();

		    System.out.println("Introdueix la nota del segon trimestre:");
		    double segonTrimestre = sc.nextDouble();

		    System.out.println("Introdueix la nota del tercer trimestre:");
		    double tercerTrimestre = sc.nextDouble();

		    double ponderada1 = 0.1;
		    double ponderada2 = 0.35;
		    double ponderada3 = 0.55;

		    if (primerTrimestre < 0 || primerTrimestre > 10 ||
		        segonTrimestre < 0 || segonTrimestre > 10 ||
		        tercerTrimestre < 0 || tercerTrimestre > 10) {
		        System.out.println("Les notes han d'estar entre 0 i 10.");
		    } else {
		    	double notaPonderada1 = primerTrimestre * ponderada1;
		    	double notaPonderada2 = segonTrimestre * ponderada2;
		    	double notaPonderada3 = tercerTrimestre * ponderada3;
		        double notaFinal = notaPonderada1 + notaPonderada2 + notaPonderada3;
		        
		        System.out.println("\n" + "LES NOTES DEL CURS 2026/2027" + "\n");
		        System.out.println("La nota del 1r Trimestre es:" + "\t" + primerTrimestre + "\n" +
		        					"Ponderada del 1r trimestre es:" + "\t" + notaPonderada1 + "\n");
		        System.out.println("La nota del 2n Trimestre es:" + "\t" + segonTrimestre + "\n" +
		        					"Ponderada del 2n trimestre es:" + "\t" + notaPonderada2 + "\n");
		        System.out.println("La nota del 3r Trimestre es:" + "\t" + tercerTrimestre + "\n" +
		        					"Ponderada del 3r trimestre es:" + "\t" + notaPonderada3 + "\n");
		        System.out.println("La teva nota final és: " + "\t" + "\t" + notaFinal);
		    }

		    sc.close();
	}

}
