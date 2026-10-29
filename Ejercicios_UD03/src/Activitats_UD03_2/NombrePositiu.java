package Activitats_UD03_2;
import java.util.Scanner;

public class NombrePositiu {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int num;

        do {
            System.out.println("Introdueix un nombre positiu:");
            num = sc.nextInt();

        } while (num <= 0);

        System.out.println("El nombre introduit es positiu: " + num);

        sc.close();
    }
}
