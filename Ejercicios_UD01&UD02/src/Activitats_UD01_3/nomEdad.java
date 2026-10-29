package Activitats_UD01_3;
import java.util.Scanner;


public class nomEdad {
	public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Demanam el nom (String)
        System.out.println("Introdueix el teu nom:");
        String nom = sc.nextLine();

        // Demanam l'edat (int)
        System.out.println("Introdueix la teva edat:");
        int edat = sc.nextInt();

        // Mostram una frase amb les dues dades
        System.out.println("Em dic " + nom + " i tenc " + edat + " anys.");

        sc.close();
    }

}
