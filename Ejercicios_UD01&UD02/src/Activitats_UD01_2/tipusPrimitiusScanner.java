package Activitats_UD01_2;
import java.util.Scanner;

public class tipusPrimitiusScanner{
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
				System.out.println("Varaibles primitives");
		
		System.out.println("Introdueix el valor de la varaibale Byte, ha de ser entre -128 i 127");
		byte valorByte = sc.nextByte();
		
		System.out.println("Introdueix el valor de la varaibale Short, ha de ser entre -32,768 a 32,767.");
		short valorShort = sc.nextShort();
		
		System.out.println("Introdueix el valor de la varaibale Int, ha de ser un valor enter, però petit");
		int	valorInt= sc.nextInt();
		
		System.out.println("Introdueix el valor de la varaibale Long, ha de ser un Valor enter, pot ser gros");
		long valorLong = sc.nextLong();
		
		System.out.println("Introdueix el valor de la varaibale Float, Pot ser un valor amb decimals, però petit");
		float valorFloat = sc.nextFloat();
		
		System.out.println("Introdueix el valor de la varaibale Double, Pot ser un valor amb decimals, pot ser gros");
		double valorDouble = sc.nextDouble();
		
		sc.nextLine();
		
		System.out.println("Introdueix una cadena de Text:");
		String valorString = sc.nextLine();
	
		char valorChar= valorString.charAt(0);
		
		sc.close();
		
		boolean valorBoolean = true;
		
		System.out.println(
						valorByte 		+ 	"\r" +
						valorShort 		+	"\r" +
						valorInt 		+	"\r" +
						valorLong 		+	"\r" +
						valorFloat 		+	"\r" +
						valorDouble 	+ 	"\r" +
						valorChar 		+ 	"\r" +
						valorBoolean 	+	"\r" );
		
	}
}

