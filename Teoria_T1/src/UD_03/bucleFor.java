package UD_03;

//import java.util.Scanner;

public class bucleFor {

	public static void main(String[] args) {
		// Un bucle que controlles amb un Contador << For >>
		
		/*
		 *  for ( inicializació; condició; actualicació ){
		 *  //Instruccions
		 *  
		 *  } 
		 */
		
//		for (int i = 1; i<=5; i++){
//			
//			System.out.println("i : " + i);
//		}
		
//		for (int i = 5; i >= 1; i--){
//			
//			System.out.println("i : " + i);
//		}
		
//		for(int i = 1; i<=10; i += 2) {
//			System.out.println("i (senars) :" + i);
//		}
		
//		int suma = 0 ;
//		
//		for(int i = 1; i<=5; i ++) {
//			suma += i;
//			System.out.println(suma);
//		}
		
//		----------------------- 	[For amb Scanner] 	------------------------------
		
//		Scanner sc = new Scanner (System.in);
//		double suma = 0 ;
//		
//		for(int i = 1; i<=4; i ++) {
//			System.out.println("nota" + i + ": ");
//			double nota = sc.nextDouble();
//			suma += nota;
//		}
//		
//		double mitjana = suma / 4;
//		System.out.println("Mitjana: " + mitjana);
//		
//	sc.close();	
	
//		-------------------   for(;;) { [Aixo es l'unic que fa falta per un For] --------------------
	
		int index = 1;
	
		for(;index <=5;) {
			System.out.println("index: " + index);			
			index++;
		
		}
//		System.out.println("index: " + index);
		
	}
	

}
