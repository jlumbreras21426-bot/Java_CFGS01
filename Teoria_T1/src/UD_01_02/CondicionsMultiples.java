package UD_01_02;

import java.util.Scanner;

public class CondicionsMultiples {

	public static void main(String[] args) {
		 //------------------------------------------------------
		 
//switch
//		int expressio = sc.nextInt();
//		switch(expressio){
//			case 10: 
//				// instruccions
//				break;
//			case 20:
//				// instruccions
//				break;
//			default:
//				//instruccions per defecte.
//		}
		 
		 //------------------------------------------------------
		
//		System.out.println("introduieix un valor enter, Averigurarem el dia de la setmana");
//		 Scanner sc = new Scanner(System.in);
//		 
//		 int diaSetmana = sc.nextInt();
//		 diaSetmana	 = diaSetmana % 7;
//		 switch (diaSetmana) {
//		 
//		 	case 1:
//			    System.out.println("Dilluns");
//			    break;
//			case 2:
//			    System.out.println("Dimarts");
//			    break;
//			case 3:
//			    System.out.println("Dimecres");
//			    break;
//			case 4:
//			    System.out.println("Dijous");
//			    break;
//			case 5:
//			    System.out.println("Divendres");
//			    break;
//			case 6:
//			    System.out.println("Dissabte");
//			    break;
//			case 0:
//			    System.out.println("Diumenge");
//			    break;
//			default:
//				System.out.println("Quin numero has introduit??!! Ets un ase!!!");
	
			
			 //------------------------------------------------------
							
//
//if(cadena == otra){ 
//System.out.println("Son iguales"); 
//Mai comparar 2 cadenes amb ==; perque cada cadena es un objecte i cada objecte ocupa un espai diferent
//Aixo significa que estas comparant l'espai que ocupen i per aixó el switch els detecte com a diferents.		
//
				
//String cadena = new String ("hola");
//String otra = new String ("hola");
			
//			 if(cadena.equals(otra)){ 
//			 System.out.println("Son iguales"); 
//
//			}else {
//				System.out.println("No Son iguales");
//			}
				
//Valors que acepta un Switch:
			
//byte, short, char, int
//Byte,	Short, Character, Integer
//String
//Tipos Enumerats
			 

			 //SWITCH MODERN:
			 
			 //------------------------------------------------------
			 
//			 int dia1 = 1;
//			 switch(dia1) {
//				 case 1 -> System.out.println("Dilluns");
//				 case 2 -> System.out.println("Dimarts");
//				 case 3 -> System.out.println("Dimecres");
//				 default -> System.out.println("Valor Incorrecte");
//			 }
			 
			 //------------------------------------------------------
			
//			 int dia2 = 2;
//			 switch(dia2) {
//			 case 1,2,3,4,5 -> System.out.println("Dia laboralble");
//			 case 6,7 -> System.out.println("Cap de setmana");
//			 }
			 
			 //------------------------------------------------------
			
//			 int dia3 = 2;
//			 String tipusDia = switch(dia3) {
//			 case 1,2,3,4,5 -> "Dia laboralble";
//			 case 6,7 -> "Cap de setmana";
//			 default -> "Valor Incorrecte!";
//			 };
			 			 
			 //------------------------------------------------------
			 
//			 System.out.println("\n");
//			 
//			 int opcio = 2;
//			 String missatge = switch (opcio) {
//			 case 1 -> "consulta selceccionada";
//			 case 2 -> { 
//				 System.out.println("Preparant modificació...");
//				 yield "modificacio seleccionada"; // indica que es el que surt
//				 }
//			 case 3 -> "sortir";
//			 default -> "opcio no valida";
//			 };
//			 
//			 System.out.println(missatge);
//			 
//			 System.out.println("\n");
			 
			 //------------------------------------------------------
			
			System.out.println(" Que vols Fer?? Sumar o Restar \n Escriu el que vols fer: ");
			 Scanner sc = new Scanner(System.in);
			 
			 String calculadora = sc.nextLine();
			 switch (calculadora.toLowerCase()) {
			 	case "sumar" :
				    System.out.println("Introduiex el primer Valor");
				    int valorSuma1 = sc.nextInt();
				    System.out.println("Introduiex el segon Valor");
				    int valorSuma2 = sc.nextInt();
				    int resultatSuma = valorSuma1 + valorSuma2;
				    System.out.println(" El Resultat es \t" + valorSuma1 + "\t + \t" + valorSuma2 + "\t = \t" + resultatSuma);
				    break;
				    
				case "restar" :
				    System.out.println("Introduiex el primer Valor");
				    int valorResta1 = sc.nextInt();
				    System.out.println("Introduiex el segon Valor");
				    int valorResta2 = sc.nextInt();
				    int resultatResta = valorResta1 + valorResta2;
				    System.out.println(" El Resultat es \t" + valorResta1 + "\t + \t" + valorResta2 + "\t = \t" + resultatResta);

				default:
					System.out.println("Quin numero has introduit??!! Ets un ase!!!");
				
			//------------------------------------------------------

	 }
		 
	sc.close();	

	}

}
