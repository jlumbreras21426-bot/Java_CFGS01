package Activitats_UD03_3;

import java.util.Scanner;

public class BucleForNFactorial0_12 {
    Scanner sc = new Scanner(System.in);
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Introdueix un número entre 0 i 12 per calcular el seu factorial: ");
        int num = sc.nextInt();
        if (num >= 0 && num <= 12) {
            int factorial = 1;

            for (int i = 1; i <= num; i++) {
                factorial *= i;
            }

            System.out.println("El factorial de " + num + " és: " + factorial);
        } else {
            System.out.println("Error: introdueix un número entre 0 i 12.");
        }
        sc.close();
    }

}
