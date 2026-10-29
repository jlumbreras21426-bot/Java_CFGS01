package UD_03;

import java.util.Scanner;

public class BucleDoWhile {
	public static void main(String[] args) {
//		int comptador = 10;
//		
//		do {
//			System.out.println("Comptador:" + comptador);
//			comptador ++;
//		}while(comptador <= 5);
		
		Scanner sc = new Scanner (System.in);
//		double nota = -1;
//		
//		do {
//			System.out.println("Introdueix  una nota de  0 - 10");
//			nota = sc.nextDouble();
//			
//		}while (nota< 0 || nota > 10);
		
//		MENU

        int opcio = -1;
        int opcio2 = -1;

        String resposta1 = "Hola";
        String resposta2 = "El meu nom es Jordi";
        String resposta0 = "Sortir";

        do {
            System.out.println("Opció 1. Saludar");
            System.out.println("Opció 2. Mostrar un missatge");
            System.out.println("Opció 3. Tria A o B");
            System.out.println("Opció 0. Sortir");

            opcio = sc.nextInt();

            switch (opcio) {
                case 1 -> System.out.println(resposta1);
                case 2 -> System.out.println(resposta2);

                case 3 -> {
                    do { //crea un block per programar dintre
                        System.out.println("Opció 1. A");
                        System.out.println("Opció 2. B");
                        System.out.println("Opció 0. Sortir");

                        opcio2 = sc.nextInt();

                        switch (opcio2) {
                            case 1 -> System.out.println("Has triat A");
                            case 2 -> System.out.println("Has triat B");
                            case 0 -> System.out.println(resposta0);
                            default -> System.out.println("Error");
                        }

                    } while (opcio2 != 0 && opcio2 !=1 && opcio !=2); //
                }

                case 0 -> System.out.println(resposta0);
                default -> System.out.println("Error");
            }

        } while (opcio != 0);

        sc.close();
		
	}
}
