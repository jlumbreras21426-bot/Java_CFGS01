package Activitats_UD03_7;

import java.util.Scanner;

public class menuBinariDecimal {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("[Menu de conversio de binari a decimal i de decimal a binari] \n"
        + "[1] Marca 1 per convertir de binari a decimal \n" 
        + "[2] Marca 2 per convertir de decimal a binari ");

        switch (sc.nextInt()) {
            case 1:
                Scanner Scanner = new Scanner(System.in);
                System.out.print("Introdueix un número binari: ");
                String binari = Scanner.nextLine(); 
                int decimal = 0; 
                int potencia = 1; 

                for (int i = binari.length() - 1; i >= 0; i--) {
                    if (binari.charAt(i) == '1') {
                        decimal += potencia; 
                    }
                    potencia *= 2;
                }
                System.out.println("el número decimal és: " + decimal);

                sc.close();

                break;
                
            case 2:
                Scanner Scanner2 = new Scanner(System.in);
                System.out.print("Introdueix un número decimal: ");
                int num = Scanner2.nextInt();

                String binari2 = ""; 
                do {
                    binari2 = (num % 2) + binari2; 
                    num /= 2; 
                } while (num > 0);

                System.out.println("En binari: " + binari2);

                sc.close();

                break;
            default:
                System.out.println("Opcio no valida");
        }
    }

}
