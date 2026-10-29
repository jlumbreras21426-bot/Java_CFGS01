package UD_03;

import java.util.Scanner;

public class Bucles {
	public static void main(String[] args) {
//		int segons = 5;
//		while (segons >= 0) {
//			System.out.println("segons "+ segons);
//			if(segons <0) {
//				System.out.println("Enlairament!!");
//				
//			} else if (segons == 3){
//				System.out.println("Ignició començada...");
//			
//			}
//			
//		}
		
//		int passos = 0;
//		int decreix = 100;
//		int creix = 0;
//		int suma = 0;
//		
//		while (passos < 50 ) {
//			
//			suma += decreix + creix; 
//			decreix--;
//			creix ++;
//			
//			passos++;
//		}
//		
//		suma +=50;
//		System.out.println("Suma:" + suma);
		
		 Scanner sc = new Scanner(System.in);
	        int edat;

	        System.out.println("Introdueix la teva edat:");
	        edat = sc.nextInt();

	        while (edat < 3 || edat > 99) {
	            System.out.println("L'edat és incorrecta.");
	            System.out.println("Torna a introduir la teva edat:");
	            edat = sc.nextInt();
	        }

	        System.out.println("L'edat és correcta.");

	        sc.close();
	    }
	}
