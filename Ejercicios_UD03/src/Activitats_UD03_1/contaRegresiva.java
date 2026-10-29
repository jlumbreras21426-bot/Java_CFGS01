package Activitats_UD03_1;

import java.util.Scanner;

public class contaRegresiva {
	public static void main(String[] args) {
		System.out.println("introdueix un numero entrer positiu");
		Scanner sc = new Scanner (System.in);
		int num  = sc.nextInt();
		
		System.out.println("Conta Regressiva desde" +"["+num+"]"+ "\n" + num);
		while(num > 0 ){			
			num --;
			System.out.println(num);		
		}
		
		sc.close();
		
	}	
	

}
