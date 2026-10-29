package UD_03;

import java.util.Scanner;

public class numeroSecreto {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int comptador = 0;
		int resposta;
		int numSecret;
		numSecret = (int) (Math.random() * 100) + 1;

		System.out.println("Adivina el Numero entre 1-100");
		resposta = sc.nextInt();

		while ((numSecret != resposta) && (comptador < 5)) {
			comptador++;

			if (resposta > numSecret) {
				System.out.println("el numero es menor");
			} else if (resposta < numSecret) {
				System.out.println("el numero es major");
			}

			System.out.println("Nombre de intents " + comptador + "/5");

			if (comptador == 5) {
				System.out.println("T'has quedat sense intents");
			} else {
				System.out.println("Torna a intentar-ho:");
				resposta = sc.nextInt();
			}
		}

		if (numSecret == resposta) {
			System.out.println("L'has endevinat");
		} else {
			System.out.println("El numero secret era: " + numSecret);
		}

		sc.close();
	}

}