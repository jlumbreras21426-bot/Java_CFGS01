package Activitats_UD02_4;

import java.util.Scanner;

public class LloguerDeBicicletes {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Lloguer de bicicletes \n" + "Per Llogar una bicicleta has de insertar les dades seguents: \n");
        System.out.println("Nombre d'hores? \n");
        int hores = sc.nextInt();

        System.out.println("Tipus de Bicicleta disponibles: \t Normal \t o \t Electrica \n");
        String tipusBicicleta = sc.next().toUpperCase(); //evitam que doni error per minuscules

        System.out.println("Contractar Asegurança:  \t SI \t o \t NO \n ");
        String volAsseguraça = sc.next().toUpperCase();

        int preuBase;
        if (hores <= 2) {
            preuBase = 8;
        } else if (hores <= 5) {
            preuBase = 15;
        } else {
            preuBase = 25;
        }

        int suplementElectrica = 0;
        if (tipusBicicleta.equals("ELECTRICA")) {
            suplementElectrica = 12;
        } else if (tipusBicicleta.equals("NORMAL")) {
            suplementElectrica = 0;
        } else {
            System.out.println("ERROR!! El tipus ha de ser Normal o Electrica.");
        }

        int suplementAssegurança = 0;
        if (volAsseguraça.equals("SI")) {
            suplementAssegurança = 5;
        } else if (volAsseguraça.equals("NO")) {
            suplementAssegurança = 0;
        } else {
            System.out.println("ERROR!! L'assegurança ha de ser SI o NO.");
        }

        int preuFinal = preuBase + suplementElectrica + suplementAssegurança;
        System.out.println("El preu final del lloguer es: " + preuFinal + " euros");
        sc.close();
    }
}