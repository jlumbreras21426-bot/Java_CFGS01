import java.util.Scanner;

public class Examen2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner (System.in);
		System.out.println("Quina edat tens??");
		int edat = sc.nextInt();//Demanam per Scanner la Edat, domes aceptam valors int (enters)
		System.out.println("Quantes Entrades Vols??");
		int entrades = sc.nextInt(); //Demanam per Scanner quantes entrades, domes aceptam valors int (enters)
		double preuTotal; //inicam la variable preuTotal
		
		if(edat <0 || entrades <= 0) { //demanam (SI) l'edat es menor a 0 (valors negatius) o si les entrades son 0 o menys
			System.out.println("Error, les dades son Incorrectes");
			
		} else if (edat<12){ //comprovam el valor de la variable edat per decidir que ha de fer el programa
			double preu = 6; //cream varaible preu i li otorgam un valor
			preuTotal = preu * entrades;
			System.out.println("el preu de la entrada es " + preu + "€");
			System.out.println("el preu Total es " + preuTotal  + "€");
		
		} else if (edat >=12 || edat <= 64) { //comprovam el valor de la variable edat per decidir que ha de fer el programa
			double preu = 12; //cream varaible preu i li otorgam un valor
			preuTotal = preu * entrades;
			System.out.println("el preu de la entrada es " + preu  + "€");
			System.out.println("el preu Total es " + preuTotal  + "€");
			
		} else { // si no entra en cap dels anteriors signica que es major de 65, per tant no hem de fer un nou else if, basta amb un else.
			double preu = 8; //cream varaible preu i li otorgam un valor
			preuTotal = preu * entrades;
			System.out.println("el preu de la entrada es " + preu  + "€");
			System.out.println("el preu Total es " + preuTotal  + "€");
			
		}
		sc.close(); //Tanca l'escaner pq no quedi obert

	}

}


