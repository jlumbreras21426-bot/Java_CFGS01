
package UD_03;

import java.util.Scanner;

public class MitjanaNotes {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        double suma = 0;
        int valides = 0;

        for (int i = 1; i <= 10; i++) {

            System.out.println("Nota " + i + " (negativa per sortir):");
            double nota = sc.nextDouble();

            if (nota < 0) {
                break;
            }

            if (nota > 10) {
                System.out.println("Nota no valida");
                continue;
            }

            suma += nota;
            valides++;
        }

        if (valides > 0) {
            double mitjana = suma / valides;
            System.out.println("Mitjana: " + mitjana);
        } else {
            System.out.println("No s'han introduit notes valides.");
        }

        sc.close();
    }
}
