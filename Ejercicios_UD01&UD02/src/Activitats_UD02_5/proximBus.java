package Activitats_UD02_5;

import java.util.Scanner;

public class proximBus {

	public static void main(String[] args) {
		System.out.println("Averigua quan arriba el Proxim Bus!!");
		System.out.println("Intoduiex quin minut es");
		Scanner sc = new Scanner(System.in);
		
		int minut = sc.nextInt();
		int restant;
		
		if(minut %12 == 0) {
			restant = 0;
			
		}else {
			restant = 12 - (minut%12) ;
		}
		System.out.println("Minut Introduit: " + minut + "\n");
		System.out.println("Minuts Fins a la proxima sortida: " + restant);
		sc.close();
	}

}
