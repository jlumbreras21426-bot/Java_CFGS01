package Activitats_UD01_2;

public class correccioFloatCharBoolean {
	
	public static void main(String[] args) {
		
		// float necessita una f al final, perquè 3.5 per defecte és un double
		float preu = 3.5f;

		// char va amb cometes simples (les dobles són per a String)
		char lletra = 'A';

		// boolean només accepta true o false, no nombres
		boolean esTrue = true;

		System.out.println("preu = " + preu);
		System.out.println("lletra = " + lletra);
		System.out.println("estaActiu = " + esTrue);
	}

}
