import java.util.Scanner;

public class Examen3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner (System.in);
		System.out.println("[Tria una aposta] \n"
				+ "[PARELL\t\t | \t PER SELECCIONAR AQUESTA APOSTA MARCA 1] \n"
				+ "[SENAR\t\t | \t PER SELECCIONAR AQUESTA APOSTA MARCA 2] \n"
				+ "[SIS EXACTE\t | \t PER SELECCIONAR AQUESTA APOSTA MARCA 3] \n"
				+ "[QUINA APOSTA VOLS??]");
		
		int  dau = (int) (Math.random() * 6) + 1; //cream la variable Dau, a traves de Math.random, amb el *6 feim que dongui un valor de 0-5 i el +1 serveix per tenir un rang de 1 a 6.
		int aposta = sc.nextInt();
		int punts = 0;
		
		//El switch comprova la variable aposta per decidir que ha de fer
		switch (aposta) {
		
		case (1):
			//el %2 fa que es dividesqui en 2 el valor dau que es entre 1 i 6, 
			// despres extreu el resto i el == 0 compara el resto amb 0,
			// aixo serveix per sabre si el numero per el cual hem dividit es par o impar.
			if (dau %2 == 0) {
				System.out.println("Guanya");
				//canviam la variable punts, amb  =+ feim que sumi 2.
				punts =+ 2;
				
			}else {
				System.out.println("Has Perdut");
			}
		System.out.println("El dau es : " + dau + "\n"
				+ "Ha acoseguit " + punts + " Punts");
		//Talla el codi per que no es mostrin les seguents opcions
		break;
		case (2): 
			if (dau %2 == 1) {
				System.out.println("Guanya");
				punts =+ 2;
			}else {
				System.out.println("Has Perdut");				
			}
		System.out.println("El dau es : " + dau + "\n"
				+ "Ha acoseguit " + punts + " Punts");
		break;
		case (3):
			if (dau == 6) {
				System.out.println("Guanya");
				punts =+ 5;
			}else {
				System.out.println("Has Perdut");				
			}
		System.out.println("El dau es : " + dau + "\n"
				+ "Ha acoseguit " + punts + " Punts");
		break;
		default:
			System.out.println("Opcio no Valida");
		}		
		sc.close();
		
		
	}

}
