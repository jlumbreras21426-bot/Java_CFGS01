package UD_01_02;

public class ExpressionsLogiques {

	public static void main(String[] args) {
		//bolean
		boolean esMajorDeEdat = false; //sempre es sol nombrar als booleans com a preguntes "Es Major d'Edad?"
		boolean tePermis = true;
		int edat = 20;
		esMajorDeEdat = edat >=18;
		System.out.println(esMajorDeEdat);
		int temperatura = 30;
		int nota = 10;
		
		System.out.println("te permis?" + " " + tePermis);
		
		/* OPERADORS RELACIONATS
		 * 
		 * ==			edat == 18; //false
		 * != 			nota != 0;  //false
		 * >			temperatura >10  //true
		 * <			temperatura <10 //false
		 * <=			edat <=  // false
		 * >=			edat >=  // true
		 */
		
		/* OPERADORS	&&	(and)
		 * 
		 * A		B		A && B
		 * TRUE		TRUE	TRUE
		 * TRUE		FALSE	FALSE
		 * FALSE	TRUE	FALSE
		 * FALSE 	FALSE	FALSE
		 */
		
		/* OPERADORS	||	(or)	
		 * 
		 * A		B		A && B
		 * TRUE		TRUE	TRUE
		 * TRUE		FALSE	TRUE
		 * FALSE	TRUE	TRUE
		 * FALSE 	FALSE	FALSE
		 */
		
		boolean faFred = ((temperatura >= 5) && (temperatura <=20));	//si la primera es false, s'atura perquè sap que es fals i no continua
		boolean faFred2 = ((temperatura >= 5) || (temperatura <=20)); 	//si la primera es true, s'atura perquè sap que es true i no continua
																		//cada cosa que que doni resposta a un boolea, s'ha de posar entre parentesis
																		//aixo es per entrendre millor el codi, no te cap funció més
		System.out.println("Fa fred?"+ " " + faFred);
		System.out.println("Fa fred?"+ " " + faFred2);
		
		//OPERADORS	!	(NOT)	
		boolean esBonito = true;
		System.out.println(!esBonito);
		
		/* es per dir que no es X, abans asignam que algo si esBonito,
		 * però per dir que no ho es, posam !, aixi no hem de fer 2 variables 
		 * basta 1 per el si i un altre per el no
		 */ 
		
		boolean teEntrada = false;
		boolean esConvidat = true;
		boolean potAccedir = ((edat > 18) && (teEntrada || esConvidat));
		System.out.println("Pot accedir?" + " " + potAccedir);
		
		//NOTA VALIDA (LA NOTA HA DE SER ENTRE 0 I 10)
		
		boolean notaValida = (nota >= 0) && (nota <=10);
		System.out.println("te nota valida?" + " " + !notaValida);
		
		//NOTA NO VALIDA CON OPERADOR OR ||
		
		boolean notaNoValida = nota > 10 || nota < 0;
		System.out.println("La nota, es una no valida?" + " " + notaNoValida);
		
		// boolean notaNoValida = !notaValida;
		// boolean notaNoValida = !(nota >= 0) && (nota <=10);
		
		// AVALUACIO DE CURTCIRCUIT
		int divisor = 0;
		boolean correcte = (divisor != 0) && ((10 / divisor)>2);
		System.out.println("HI HA CURTCIRCUIT?" + " " + correcte);
		
		// AVALUACIO DE CURTCIRCUIT AMB OR ||
		int divisor2 = 0;
		boolean correcte2 = (divisor2 == 0) || ((10 / divisor2)>2);
		System.out.println("HI HA CURTCIRCUIT?"+ " " + correcte2);
	}

}
