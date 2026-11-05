package Activitats_UD03_7;

import java.util.Scanner;

public class BinariToDecimal {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Introdueix un número binari: ");
        String binari = sc.nextLine(); // llegir el número binari com a cadena de text
        int decimal = 0; // inicialitzar el número decimal a 0
        int potencia = 1; // inicialitzar la potència de 2 a 1 (2^0)

        // recorrem la cadena de text del número binari des de l'últim dígit fins al primer
        for (int i = binari.length() - 1; i >= 0; i--) {
            if (binari.charAt(i) == '1') {
                decimal += potencia; // si el dígit és 1, sumem la potència de 2 corresponent al número decimal
            }
            potencia *= 2; // actualitzem la potència de 2 per a l'iteració següent
        }
        System.out.println("el número decimal és: " + decimal);

        sc.close();

    }

}
