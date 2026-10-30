package Activitats_UD03_3;

import java.util.Scanner;

public class BuclesForSumaFinsN {
    Scanner sc = new Scanner(System.in);
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Introdueix un numero per veure el resultat de la suma de 1 fins a aquest numero: ");
        int numero = sc.nextInt();
        int suma = 0;
        for (int i = 1; i <= numero; i++) {
            suma += i;
        }
        System.out.println("El resultat de la suma de 1 a " + numero + " es: " + suma);
        sc.close();
    }

}
