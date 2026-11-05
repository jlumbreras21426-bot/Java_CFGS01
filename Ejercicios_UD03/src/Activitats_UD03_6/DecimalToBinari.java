package Activitats_UD03_6;

import java.util.Scanner;

public class DecimalToBinari {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Introdueix un número decimal: ");
        int num = sc.nextInt();

        String binari = ""; // cadena per acumular el resultat en binari
        do {
            binari = (num % 2) + binari; // el bit nou va al davant
            num /= 2; // dividir el número per 2 per continuar amb el següent bit
        } while (num > 0); // repetir fins que el número sigui 0

        System.out.println("En binari: " + binari);

        sc.close();
    }
}