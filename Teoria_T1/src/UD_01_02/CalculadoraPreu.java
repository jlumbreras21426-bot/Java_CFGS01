package UD_01_02;

import java.util.Scanner;

public class CalculadoraPreu {
	
	/*
	 * ENUNCIAT:
	 *  pedirle a usuario precio producto, puede tener decimales (doubles) 
	 *  i la cantidad del producto ( solo enteros -> int) calcular el total 
	 *  i mostrar de manera formateada (2 decimales -> printf)
	 */
	
	public static void main(String[] args) {
		
		// Iniciam el programa e introduim el scanner
		System.out.println("Calculadora Supermercat");
		Scanner sc = new Scanner(System.in);
		
		// Demanem el preu del producte
		System.out.println("Introducir preció del producto");
		double preu = sc.nextDouble(); //preu del producte
		
		// Demanem quantiat del producte
		System.out.println("Introducir cantidad producto");
		int cantidad = sc.nextInt(); //cantidad del producte
		
		// Calcular preu final
		double total = preu * cantidad; //preu final del producte
		System.out.printf("El preu total del producte és: %.2f €%n", total);	
		
		sc.close();
	}
}
