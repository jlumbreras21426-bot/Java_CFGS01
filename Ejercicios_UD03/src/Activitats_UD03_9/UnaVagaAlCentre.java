package Activitats_UD03_9;

import java.util.Scanner;

public class UnaVagaAlCentre {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Gestio Jornada Vaga \n" +
        "Hi ha 4 Grups ( 1rDAM, 2nDAM, 1rDAW, 2nDAW )\n" +
        "Cada grup te un nombre deiferents de alumnes.");

        int opcio;
        do {
            System.out.println("[MENU DE SELECCIO] \n" +
            "\t 1. Registrar la jornada de vaga \n" +
            "\t 2. Mostrar el resum de la jornada \n" +
            "\t 3. Consultar l'estat general \n" +
            "\t 4. Sortir \n" );
            
            System.out.println("[Marca una opció entre 1 i 4] : ");
            opcio = sc.nextInt();

            switch (opcio) {
                case 1:
                    System.out.println( "\n[Advertencia !!] [Les classes estan formades per grups de 1 a 35 alumnes] \n");
                    System.out.println("Introdueix el nombre de alumnes que hi ha a la classe de 1r DAM :");
                    int DAM1 = sc.nextInt();
                    System.out.println("Introdueix el nombre de alumnes que hi ha a la classe de 2n DAM :");
                    int DAM2 = sc.nextInt();
                    System.out.println("Introdueix el nombre de alumnes que hi ha a la classe de 1r DAW :");
                    int DAW1 = sc.nextInt();
                    System.out.println("Introdueix el nombre de alumnes que hi ha a la classe de 2n DAW :");
                    int DAW2 = sc.nextInt();
                    
                    if (DAM1 > 35 || DAM1 < 1 &&
                        DAM2 > 35 || DAM2 < 1 && 
                        DAW1 > 35 || DAW1 < 1 && 
                        DAW2 > 35 || DAW2 < 1  ) {System.out.println( "Error S'ha intodir algun valor incorrecte");
                    } else{

                    }

                    break;
                case 2:
                    System.out.println("opcio 2");

                    break;
                case 3:
                    System.out.println("opcio 3");

                    break;
                case 4:
                    System.out.println("opcio 4");

                    break;
                default:
                    System.out.println(" Error, el valor no es apte... Introdueix un valor de nou :");
                    break;
            }
        } while (opcio != 4);

        

        sc.close();
    }

}
