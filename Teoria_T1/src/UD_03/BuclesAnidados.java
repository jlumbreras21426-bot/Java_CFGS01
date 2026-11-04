package UD_03;

public class BuclesAnidados {
    public static void main(String[] args) {
        //BUCLES IMBRICATS (ANIDADOS) INDEPENDENTS.

        // for (int i = 1; i <= 3; i++) {
        //     for (int j = 1; j <= 4; j++) {
        //         System.out.println("i = " + i + "\t : : \t j = " + j);
        //     }
        // }

        // for (int fila = 1; fila <= 3; fila++) {
        //     for (int columna = 1; columna <= 5; columna++) {
        //         System.out.print(" * ");
        //     }
        //     System.out.println();

        // }

        //TABLA MULTIPLICAR 1-9

        // for (int i = 1; i <= 9; i++) {
        //     for (int j = 1; j <= 9; j++) {
        //         System.out.print(i * j + "\t");
        //     }
        //     System.out.println();
        // }

        //Tablero de ajedrez 8x8

        // for (int fila = 1; fila <= 8; fila++) {
        //     for (int columna = 1; columna <= 8; columna++) {
        //         if ((fila + columna) % 2 == 0) {
        //             System.out.print("[B]");
        //         } else {
        //             System.out.print("[N]");
        //         }
        //     }
        //     System.out.println();
        // }

        //Trobar els primer 50 numeros primers

        int NombreLimit = 50; // aixi si ens demanen un altre limit,
        //  nomes hem de canviar el valor d'aquesta variable i aixi evitam tocar el bucle.
        int contador = 0;
        int QuantitatElements = 0; // contam quants de numeros primers hi ha a cada linea.
        int ElementsPerLinea = 5; // quantitat de numeros primers que volem per linea.

        for (int i = 2; i <= NombreLimit; i ++){

            boolean esPrimer = true;

            for (int j = 2; j < i; j++){
                if (i % j == 0){
                    esPrimer = false;
                    break;
                }
            }
            if (esPrimer) {
                contador++;
                QuantitatElements++;
                System.out.print(i + " ");
                
                if (QuantitatElements == ElementsPerLinea) {
                    System.out.println("\n");
                    QuantitatElements = 0;
                }
            }
        }
        System.out.println("S'han trobat " + contador + " numeros primers");    
    }
}




