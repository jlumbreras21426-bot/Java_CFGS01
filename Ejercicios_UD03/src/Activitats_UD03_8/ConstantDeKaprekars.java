
package Activitats_UD03_8;

import java.util.Scanner;

public class ConstantDeKaprekars {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.println("Constant de Kaprekar:");
        System.out.print("Introdueix un número de 4 dígits: ");

        int num = sc.nextInt();

        String numero = String.valueOf(num); // Convertim el número a String per poder treballar amb les xifres
       
        while(numero.length() < 4) {  // Afegim zeros a l'esquerra si el número té menys de 4 dígits
            numero = "0" + numero;
        }

        boolean diferents = false; // Variable per comprovar si almenys dues xifres són diferents

        for (int i = 1; i < 4; i++) { //El for comença a 1 perquè no cal comparar la primera xifra amb ella mateixa
            if (numero.charAt(i) != numero.charAt(0)) { // Comprovem si la xifra actual és diferent de la primera xifra
                diferents = true; // Si almenys dues xifres són diferents, canviem la variable a true
            }
        }

        if (!diferents) { // Si totes les xifres són iguals, mostrem un missatge d'error

            System.out.println("Error: almenys dues xifres han de ser diferents.");

        } else {

            int contador = 0; // Nessesitam l' int interaccions per comptar el nombre d'iteracions que fem fins arribar a 6174

            while (num != 6174 && contador < 7) { // El màxim d'iteracions és 7, ja que a partir d'aquí el resultat sempre serà 6174

                int Milers = num / 1000; // Dividim el número entre 1000 per obtenir la xifra dels milers
                int Centenes = (num / 100) % 10; // Dividim entre 100 per eliminar les desenes i unitats, i fem % 10 per obtenir les centenes
                int Decenes = (num / 10) % 10; // Dividim entre 10 per eliminar les unitats i fem % 10 per obtenir les desenes
                int Unitats = num % 10; // Fem % 10 per obtenir la xifra de les unitats
                int temporal = 0; // Variable temporal per intercanviar les xifres
                int menor = 0; // Variable per guardar el número ordenat de menor a major
                int major = 0; // Variable per guardar el número ordenat de major a menor

                for (int i = 0; i < 4; i++) { // Fem un bucle per ordenar les xifres de major a menor

                    if (Milers < Centenes) { // Si la xifra dels milers és menor que la de les centenes, les intercanviem
                        temporal = Milers;
                        Milers = Centenes;
                        Centenes = temporal;
                    }
                    if (Centenes < Decenes) { // Si la xifra de les centenes és menor que la de les desenes, les intercanviem
                        temporal = Centenes;
                        Centenes = Decenes;
                        Decenes = temporal;
                    }
                    if (Decenes < Unitats) { // Si la xifra de les desenes és menor que la de les unitats, les intercanviem
                        temporal = Decenes;
                        Decenes = Unitats;
                        Unitats = temporal;
                    }
                }

                major = Milers * 1000 + Centenes * 100 + Decenes * 10 + Unitats; // Guardem el número ordenat de major a major
                menor = Unitats * 1000 + Decenes * 100 + Centenes * 10 + Milers; // Guardem el número ordenat de menor a menor

                int diferncia = major - menor; // Restem el número major amb el menor per obtenir la diferència
                num = diferncia; // Assignem la diferència al número per a la següent iteració
                contador++; // Incrementem el comptador d'iteracions
                System.out.println(major + " - " + menor + " = " + diferncia);

            }

            System.out.println("Nombre d'iteracions: " + contador);
        }

        sc.close();
    }
}
