// package Activitats_UD02_9;

// import java.util.Scanner;

// public class activitatParelles {
	


//     public static void main(String[] args) {
//         Scanner teclat = new Scanner(System.in);

//         int vidaJugador = 100, vidaEnemic = 100;
//         String ordre, missatgeAccio;
//         int danyJugador = 0, atacEnemic, danyRebut;
//         boolean defensa = false;

//         // ---------- RONDA 1: PART A ----------

//         System.out.println("Tria una accio: \n"
//         		+ "A - Atacar \n"
//         		+ "D - Defensar \n"
//         		+ "R - Reparar \n"
//         		+ "La teva ordre:");
        
//         ordre = teclat.nextLine().toUpperCase();

//         switch (ordre) {
//             case "A":
//                 danyJugador = (int) (Math.random() * 16) + 15;
//                 defensa = false;
//                 missatgeAccio = "Has triat atacar!";
//                 break;

//             case "D":
//                 danyJugador = 0;
//                 defensa = true;
//                 missatgeAccio = "Has triat defensar!";
//                 break;

//             case "R":
//                 danyJugador = 0;
//                 defensa = false;
//                 vidaJugador = vidaJugador + 12;

//                 if (vidaJugador > 100) {
//                     vidaJugador = 100;
//                 }

//                 missatgeAccio = "Has triat reparar: recuperes 12 punts!";
//                 break;

//             default:
//                 danyJugador = 0;
//                 defensa = false;
//                 missatgeAccio = "Ordre incorrecta!";
//                 break;
                
//         }

//         System.out.println(missatgeAccio);

//         // -----------------
//         // INSERTAR CODI B
//         // -----------------

//         teclat.close();
//     }
// }

