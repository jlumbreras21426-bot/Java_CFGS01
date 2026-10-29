package Activitats_UD03_2;
import java.util.Scanner;

public class MenuBucle {
	public static void main(String[] args) {
	        Scanner sc = new Scanner(System.in);

	        int opcio;

	        do {
	            System.out.println("Opció 1. Sumar dos nombres");
	            System.out.println("Opció 2. Mostrar una frase");
	            System.out.println("Opció 0. Sortir");

	            opcio = sc.nextInt();

	            switch (opcio) {
	                case 1 -> {
	                    int resultat = 0;

	                    System.out.println("Introdueix el primer nombre:");
	                    int num1 = sc.nextInt();

	                    System.out.println("Introdueix el segon nombre:");
	                    int num2 = sc.nextInt();

	                    resultat = num1 + num2;

	                    System.out.println("El resultat es: " + resultat);
	                }

	                case 2 -> System.out.println("El meu nom es Jordi");

	                case 0 -> System.out.println("Adeu");

	                default -> System.out.println("Opció incorrecta");
	            }

	        } while (opcio != 0);

        sc.close();
    }
}
