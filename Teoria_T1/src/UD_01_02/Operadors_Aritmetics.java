package UD_01_02;

public class Operadors_Aritmetics {

	public static void main(String[] args) {

				/*
				 * OPERADORS ARITMETICS
				 * 
				 * 	+	=	SUMA
				 * 	-	=	RESTA
				 * 	/	= 	DIVISIO
				 * 	%	= 	RESTO DIVISIO
				 *  * 	=	MULTIPLICACIÓ
				 */
				
				int calc = 9 % 3;
				System.out.println(calc);
				
				/*
				 * 	OPERADORS D'ASIGNACIÓ
				 */
				
				int x = 10;
				
				x = x + 5;
				System.out.println(x);
				
				/*
				 * 	OPERADORS D'COMBINATS
				 */
				
				int y = 10;
				y += 5; // y = y + 5;
				System.out.println(y);
				
				/*
				 * PRECEDÈNCIA I PARENTESIS
				 */
				
				int a = 2 + 3 * 4;
				int b = (2+3)*4;
				System.out.println(a + " " + b);
				
				/*
				 *  CONVERSIÓ DE TIPUS
				 */
				
				//IMPLICITA = La Maquina hace el canvio sola.
				int p = 25;
				System.out.println(p);
				double d = p;
				System.out.println(d);
				
				//EXPLICITA = Nosotros Forzamos  el canvio.
				
				double temp = 23.8d;
//				int  graus = temp;  // no hi ha memoria porque pasa de 64b a 32b asi que da error.
				int graus = (int)temp;
				System.out.println(graus);
				
				int suma  = 7;
				int quantitat = 2;
				double mitjana = suma / quantitat;
				//com empleam int's trunka la resposta i mostra 3.0 (mitjana es un double per aixo .0)
				double mitjana2 = (double)suma / quantitat;
				// el (double)suma, transforma la primera dada en un double i per aixo dona 3.5 (resposta correcte).
				System.out.println(mitjana);
				System.out.println(mitjana2);
				
	}

}
