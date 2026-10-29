package UD_01_02;

public class Condicionals {
	public static void main(String[] args) {
		//condicional simple: if
		int edat = 2;
		if (edat >= 18) {
			System.out.println("És Major d\'edat.");
			}
		
		//Coondiciona doble: if-else
		int preu =20;
		if (preu <= 20) {
			System.out.println("M'ho puc comprar");
		}else {
			System.out.println("es massa car!!");
		}
		
		//Condicional Múltiple : if-else if else
		double nota = 7.8;
		
		if(nota < 5) {
			System.out.println("suspes");
		}else if (nota < 6) {
			System.out.println("suficiente");
		}else if (nota < 7) {
			System.out.println( "Bé");
		}else if (nota >=7 && nota <= 8) {
			 System.out.println("Notable");
		}else if (nota >=9 && nota <= 10) {
			 System.out.println("Excelent");
		}else {
			System.out.println("Nota fora de rang");
		}
		
		//Condicionas Imbricats / Anidados
		int edat2 = 22;
		boolean teCarnet = true;
		
//		if (edat2 >= 18) {
//			if(teCarnet) {
//				System.out.println("Pot Conduir");
//			}else {
//				System.out.println(" es major d'edat pero no te carnet");
//				}
//			}else {
//				System.out.println("Es menor d\n'edat");
//				}
		
		if (edat2 >= 18 && teCarnet) {
			System.out.println("pot conduir");
		}else {
			System.out.println("es Menor d\' edad.");
			}
		
		// Operador Ternari
		// condicio ? vakirsuCert: ValorSiFals
		
		//Versio Basica
		
//		String resposta = ""; 
//		resposta = (edat2 >= 18 && teCarnet) ? "pot condcuir." : " es menor d'edat.";
//		System.out.println();
		
		//Versio Sense String
		
//		System.out.println((edat2 >= 18 && teCarnet) ? "pot condcuir." : " es menor d'edat."); // el text que hi ha entre "" es un String
		
		String resposta = ""; 
		
		resposta = (edat2 >= 18) ?
					((teCarnet ?
							"Pot conduir" : "És major d'edat, peró no pot conduir"))
					: "És menor d'edat.";
		System.out.println(resposta);
		}
	}

