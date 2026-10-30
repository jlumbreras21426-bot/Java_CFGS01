package Activitats_UD03_3;

import java.util.Scanner;

public class BuclesForTaulaMultiplicar {
    Scanner sc = new Scanner(System.in);
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Introdueix un número per veure la seva taula de multiplicar: ");
        int numero = sc.nextInt();

        System.out.println("Taula de multiplicar del " + numero + ":");
        for (int i = 1; i <= 10; i++) {
            int resultat = numero * i;
            System.out.println(numero + " x " + i + " = " + resultat);
        }
        sc.close();
    }

}
