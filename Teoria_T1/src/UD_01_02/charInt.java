package UD_01_02;

public class charInt {

	public static void main(String[] args) {

//		char vs Int
		char lletra = 'A' ;
		System.out.println(lletra + 1); //Explicit
//		System.out.println((int)lletra);
		
		int numero = lletra; //implicit
		System.out.println(numero);
		
		//Aixo unicament es pot fer de manera explcita
		int numero2 = 99;
		char lletra2 = (char)numero2;
		System.out.println(lletra2);
		
		char lletra3 = '7';
		int numero3 = lletra3 - '0';
		System.out.println(numero3);

	}

}
