package Activitats_UD02_7;

import java.util.Scanner;

public class endevinallaNumeros {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int secret = (int) (Math.random() * 100) + 1;

        System.out.println("=== ENDEVINA EL NÚMERO === \n"
                + "He pensat un número secret entre 1 i 100 (ambdós inclosos). \n"
                + "Tens 4 intents per endevinar-lo. Et donaré una pista després de cada intent.");

        System.out.print("---------- Intent 1 de 4: ");
        int intent1 = sc.nextInt();
        System.out.println(intent1 == secret ? "Correcte!!" : "Incorrecte!! \n");

        System.out.print("---------- Intent 2 de 4: ");
        int intent2 = sc.nextInt();
        System.out.println(intent2 == secret ? "Correcte!!" : "Incorrecte!! \n");

        System.out.print("---------- Intent 3 de 4: ");
        int intent3 = sc.nextInt();
        System.out.println(intent3 == secret ? "Correcte!!" : "Incorrecte!! \n");

        System.out.print("---------- Intent 4 de 4: ");
        int intent4 = sc.nextInt();
        System.out.println(intent4 == secret ? "Correcte!!" : "Incorrecte!! \n");

        System.out.println((intent1 == secret || intent2 == secret || intent3 == secret || intent4 == secret)
        		? "\n FELICITATS!!!! Has endevinat el número secret: " + secret 
                : "\n HAS PERDUT!!!! Has esgotat els 4 intents. El número secret era: " + secret );
        
        sc.close();
    }
}
