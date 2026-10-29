package Activitats_UD03_2;

import java.util.Scanner;

public class TemperaturesValides {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);

		int temperatura;
		int comptador = 0;

		do {
		    System.out.println("Introdueix una temperatura (999 per sortir):");
		    temperatura = sc.nextInt();

		    if (temperatura != 999) {
		        comptador++;
		    }

		} while (temperatura != 999);

		System.out.println("Has introduit " + comptador + " temperatures vàlides.");

		sc.close();

	}

}
