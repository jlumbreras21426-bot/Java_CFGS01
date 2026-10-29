package Activitats_UD01_2;

public class MinMaxValue {

	public static void main(String[] args) {

		// Valor mínim que pot guardar un int
		int minim = Integer.MIN_VALUE;
		// Valor màxim que pot guardar un int
		int maxim = Integer.MAX_VALUE;

		// Mostram el mínim
		System.out.println("Integer.MIN_VALUE = " + minim);   // -2147483648
		// Mostram el màxim
		System.out.println("Integer.MAX_VALUE = " + maxim);   // 2147483647

		// Sumam 1 al màxim: com que no hi ha més valors, dona la volta i torna al mínim
		int resultat = maxim + 1;
		// Mostram el resultat de sumar 1 al màxim
		System.out.println("Integer.MAX_VALUE + 1 = " + resultat);  // -2147483648

	}

}
