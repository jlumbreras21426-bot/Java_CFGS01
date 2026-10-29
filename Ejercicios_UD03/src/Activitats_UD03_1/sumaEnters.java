package Activitats_UD03_1;

import java.util.Scanner;

public class sumaEnters {
	public static void main(String[] args) {
		System.out.println("introdueix un numero entrer positiu");
		Scanner sc = new Scanner (System.in);
		int num  = sc.nextInt();
		int operador = 0;
		int resultat = 0;
		
		System.out.println("Suma dels nombres enters desde" +"["+num+"]"+ " fins [1] \n");
		while(num >= 1 ){	
			
			operador = num;
			resultat = resultat + operador;
			num = num - 1;	
		}
		
		System.out.println("El Resultat es " + resultat );	
		
		sc.close();
		
	}	

}
