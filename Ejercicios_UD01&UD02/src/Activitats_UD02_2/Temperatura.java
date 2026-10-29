package Activitats_UD02_2;

import java.util.Scanner;

public class Temperatura {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        // Demanam la temperatura en graus Celsius.
        // Utilitzam double perquè pot tenir decimals.
        System.out.print("Introdueix la temperatura en graus Celsius: ");
        double temperatura = sc.nextDouble();

        // Comprovam a quin interval pertany la temperatura.
	    // Utilitzam printf per mostrar la temperatura amb dos decimals.
	    // %.2f indica el format del número i %n fa un salt de línia.
	    // La variable temperatura va després del text perquè substitueix %.2f.
        if (temperatura < 0) {
            System.out.printf("%.2f °C : Temperatura sota zero.%n", temperatura);
        } else if (temperatura < 15) {
            System.out.printf("%.2f °C : Fa fred.%n", temperatura);
        } else if (temperatura < 25) {
            System.out.printf("%.2f °C : Temperatura agradable.%n", temperatura);
        } else {
            System.out.printf("%.2f °C : Fa calor.%n", temperatura);
        }

        // %.2f mostra la temperatura amb dos decimals.
        // %n fa un salt de línia.
        sc.close();
    }
}

