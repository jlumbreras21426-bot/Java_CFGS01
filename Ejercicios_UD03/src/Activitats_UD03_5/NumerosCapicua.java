package Activitats_UD03_5;

import java.util.Scanner;

public class NumerosCapicua {
    public static void main(String[] args) {
        
        /*
        Prendre l'últim dígit usant el mòdul 10 (num % 10).
        Construir el número invertit multiplicant l'acumulat (numInvertit) per 10 i sumant el dígit extret.
        Eliminar l'últim dígit del número original amb divisió sencera entre 10.
        Repetir fins que el número original sigui 0.
        Si el número original és igual al número invertit, és capicúa.
         */

        System.out.println("Comprovació de si un número és capicúa o no.");
        Scanner sc = new Scanner(System.in);
        System.out.print("Introdueix un número: ");
        int num = sc.nextInt();
        int numInvertit = 0;
        int residu;

        //num maxim 0-9999
        if (num >= 0 && num <= 9999) {
            while (num > 0) { // mentre el número sigui més gran que 0
                residu = num % 10; // agafar l'últim dígit
                numInvertit = numInvertit * 10 + residu; // construir el número invertit
                num = num / 10; // eliminar l'últim dígit del número original
            }

            if (num == numInvertit) {
                System.out.println(num + " es un número capicúa.");
            } else {
                System.out.println(num + " no es un número capicúa.");
            }
        }else {
            System.out.println("El número ha de ser entre 0 i 9999.");
        }

        sc.close();

    }

}
