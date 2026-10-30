package UD_03;

public class BucleForDivisibles3No5 {
    
    public static void main(String[] args) {
        
        int suma = 0;
        
        for(int i = 1; i <= 100; i++) {
            
            if(i % 3 == 0 && i % 5 != 0) {
                suma += i;
            }
        }
        
        System.out.println("La suma dels nombres divisibles per 3 però no per 5 és: " + suma);
    }

}
