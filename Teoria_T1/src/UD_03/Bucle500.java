package UD_03;



public class Bucle500 {
	public static void main(String[] args) {
		long contador500 = 0;
		long contador = 0;
		int num = 500;

		

	    while (contador500 < 5) {
	    	long endevinador= (long) (Math.random() * 1000) + 1;
	    	if (endevinador == num) {
	    		contador500 ++;
	    		System.out.println("Ha trobat el numero secret +1");
	    	}
	    	
	    	contador ++;
	    	System.out.println("ha fet una volta");
	    }
	    System.out.println("Abans de trobar el numero secret 5 vegades ha fet " + contador + " voltes");
	}
		
}
