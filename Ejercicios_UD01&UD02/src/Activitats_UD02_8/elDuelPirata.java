package Activitats_UD02_8;

import java.util.Scanner;

public class elDuelPirata {

    public static void main(String[] args) {

        System.out.println("BATALLA NAVAL!!! \n"
                + "Vaixell de DAM vs Vaixell de DAW \n"
                + "Ajuda al vaixell de DAM a guanyar!!\n");

        int vidaVaixell1 = 100;
        int vidaVaixell2 = 100;
        int atacEnemic = 0;
        int atacJugador = 0;
        int danyRebut = 0;
        int danyFet = 0;

        Scanner sc = new Scanner(System.in);

        // ==================== RONDA 1 ====================

        System.out.println("===== RONDA 1 =====\n"
                + "Decideix: Atacar (A) o Defensar (D)");

        String ordre1 = sc.nextLine().toUpperCase();

        switch (ordre1) {

            case "A":
                atacEnemic = (int) (Math.random() * 21) + 10;
                atacJugador = (int) (Math.random() * 21) + 15;

                danyFet = atacJugador;
                danyRebut = atacEnemic;

                if (atacJugador == 35) {
                    danyFet = atacJugador + 10;
                    System.out.println("CRITIC!! + 10 DE MAL");
                }

                vidaVaixell1 = vidaVaixell1 - danyRebut;
                vidaVaixell2 = vidaVaixell2 - danyFet;

                break;

            case "D":
                atacEnemic = (int) (Math.random() * 21) + 10;
                atacJugador = 0;

                danyRebut = atacEnemic / 2;
                danyFet = atacJugador;

                vidaVaixell1 = vidaVaixell1 - danyRebut;
                vidaVaixell2 = vidaVaixell2 - danyFet;

                break;

            default:
                System.out.println(
                        "ERROR!! UNICAMENT POTS INTRODUIR (A) O (D)");

                break;
        }


        // Mostram la informació de la ronda 1
        System.out.println("\nINFO RONDA 1:\n"
                + "\tAtac de l'enemic: " + "-" +  atacEnemic + "\n"
                + "\tDany fet pel jugador: " + "-" + danyFet + "\n"
                + "\tVida restant (JUGADOR): " + vidaVaixell1 + "\n"
                + "\tVida restant (ENEMIC): " + vidaVaixell2 + "\n");


        // ==================== RONDA 2 ====================

        System.out.println("===== RONDA 2 =====\n"
                + "Decideix: Atacar (A) o Defensar (D)");

        String ordre2 = sc.nextLine().toUpperCase();

        switch (ordre2) {

            case "A":
                atacEnemic = (int) (Math.random() * 21) + 10;
                atacJugador = (int) (Math.random() * 21) + 15;

                danyFet = atacJugador;
                danyRebut = atacEnemic;

                if (atacJugador == 35) {
                    danyFet = atacJugador + 10;
                    System.out.println("CRITIC!! + 10 DE MAL");
                }

                vidaVaixell1 = vidaVaixell1 - danyRebut;
                vidaVaixell2 = vidaVaixell2 - danyFet;

                break;

            case "D":
                atacEnemic = (int) (Math.random() * 21) + 10;
                atacJugador = 0;

                danyRebut = atacEnemic / 2;
                danyFet = atacJugador;

                vidaVaixell1 = vidaVaixell1 - danyRebut;
                vidaVaixell2 = vidaVaixell2 - danyFet;

                break;

            default:
                System.out.println(
                        "ERROR!! UNICAMENT POTS INTRODUIR (A) O (D)");

                break;
        }


        // Mostram la informació de la ronda 2
        System.out.println("\nINFO RONDA 2:\n"
                + "\tAtac de l'enemic: " + "-" +  atacEnemic + "\n"
                + "\tDany fet pel jugador: " + "-" + danyFet + "\n"
                + "\tVida restant (JUGADOR): " + vidaVaixell1 + "\n"
                + "\tVida restant (ENEMIC): " + vidaVaixell2 + "\n");


        // ==================== RONDA 3 ====================

        System.out.println("===== RONDA 3 =====\n"
                + "Decideix: Atacar (A) o Defensar (D)");

        String ordre3 = sc.nextLine().toUpperCase();

        switch (ordre3) {

            case "A":
                atacEnemic = (int) (Math.random() * 21) + 10;
                atacJugador = (int) (Math.random() * 21) + 15;

                danyFet = atacJugador;
                danyRebut = atacEnemic;

                if (atacJugador == 35) {
                    danyFet = atacJugador + 10;
                    System.out.println("CRITIC!! + 10 DE MAL");
                }

                vidaVaixell1 = vidaVaixell1 - danyRebut;
                vidaVaixell2 = vidaVaixell2 - danyFet;

                break;

            case "D":
                atacEnemic = (int) (Math.random() * 21) + 10;
                atacJugador = 0;

                danyRebut = atacEnemic / 2;
                danyFet = atacJugador;

                vidaVaixell1 = vidaVaixell1 - danyRebut;
                vidaVaixell2 = vidaVaixell2 - danyFet;

                break;

            default:
                System.out.println(
                        "ERROR!! UNICAMENT POTS INTRODUIR (A) O (D)");

                break;
        }

        // Si les vides son negatives feim que passin a ser 0.
        if (vidaVaixell1 < 0) {
            vidaVaixell1 = 0;
        }

        if (vidaVaixell2 < 0) {
            vidaVaixell2 = 0;
        }

        // Mostram la informació de la ronda 3
        System.out.println("\nINFO RONDA 3:\n"
                + "\tAtac de l'enemic: " + "-" +  atacEnemic + "\n"
                + "\tDany fet pel jugador: " + "-" + danyFet + "\n"
                + "\tVida restant (JUGADOR): " + vidaVaixell1 + "\n"
                + "\tVida restant (ENEMIC): " + vidaVaixell2 + "\n");


        // ==================== RESULTAT FINAL ====================

        System.out.println("\n===== RESULTAT FINAL =====");

        if (vidaVaixell1 > vidaVaixell2) {
            System.out.println("VICTORIA!! DAM sempre guanya");

        } else if (vidaVaixell1 < vidaVaixell2) {
            System.out.println(
                    "DERROTA!! No has aconseguit derrotar a DAW");

        } else {
            System.out.println("EMPAT!! Hee... i ara que?");
        }

        sc.close();
    }
}