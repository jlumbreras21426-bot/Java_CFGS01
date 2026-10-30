package UD_03;

import java.util.Scanner;

public class BucleForMenuDivisbles3_5 {
    public static void main(String[] args) {
        System.out.println("Menú de opcions:");
        System.out.println(   "\t 1. nombres de 0-100 divisibles per 3 però no per 5 \n"
                            + "\t 2. nombres de 0-100 divisibles per 5 però no per 3 \n"
                            + "\t 3. nombres de 0-100 divisibles per 3 i per 5 \n");

        Scanner sc = new Scanner(System.in);
        System.out.println("Introdueix una opció: ");
        int opcio = sc.nextInt();

        switch (opcio) {
            case 1:
                System.out.println("Nombres de 0-100 divisibles per 3 però no per 5:");
                for (int i = 0; i <= 100; i++) {
                    if (i % 3 == 0 && i % 5 != 0) {
                        System.out.println(i + " ");
                    }
                }
                break;
            case 2:
                System.out.println("Nombres de 0-100 divisibles per 5 però no per 3:");
                for (int i = 0; i <= 100; i++) {
                    if (i % 5 == 0 && i % 3 != 0) {
                        System.out.println(i + " ");
                    }
                }
                break;
            case 3:
                System.out.println("Nombres de 0-100 divisibles per 3 i per 5:");
                for (int i = 0; i <= 100; i++) {
                    if (i % 3 == 0 && i % 5 == 0) {
                        System.out.println(i + " ");
                    }
                }
                break;
            default:
                System.out.println("Opció no vàlida.");
        }
        sc.close();
    }

}
