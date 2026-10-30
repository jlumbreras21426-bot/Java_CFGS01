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

        for (int i = 1; i <= 9; i++) {
            for (int j = 1; j <= 9; j++) {
                System.out.print(i * j + "\t");
            }
            System.out.println();
        }

    }

}
