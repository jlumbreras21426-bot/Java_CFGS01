package Activitats_UD03_1;

import java.util.Scanner;

public class Contrasenya {
	    public static void main(String[] args) {
	        Scanner sc = new Scanner(System.in);

	        System.out.println("Introdueix la contrasenya:");
	        String contrasenya = sc.nextLine();

	        while (!contrasenya.equals("Java123")) {
	            System.out.println("Contrasenya incorrecta. Torna-ho a provar:");
	            contrasenya = sc.nextLine();
	        }

	        System.out.println("Contrasenya correcta!");
	        sc.close();
	    }
	}

