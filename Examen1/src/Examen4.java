import java.util.Scanner;

public class Examen4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("Traductor de Idiomas \n"); //M'he equivocat ho he començat en castella, ara es un traductor de castella a altres idiomes

		String Paraula1 = "Espejo";
		String Paraula2 = "Teclado";
		String Paraula3 = "Libro";
		String Paraula4 = "Raton";
		String Paraula5 = "Amigo";
		System.out.println("Lista de Palabras Disponibles: \n"
		+ " Paraula 1 " + Paraula2 + "\n"
		+ " Paraula 2 " + Paraula2 + "\n"
		+ " Paraula 3 " + Paraula3 + "\n"
		+ " Paraula 4 " + Paraula4 + "\n"
		+ " Paraula 5 " + Paraula5);
		
		String idioma1 = "Catalan";
		String idioma2 = "ingles";
		
		String Traduccion1 ="Espill";
		String Traduccion2 ="Teclat";
		String Traduccion3 ="Llibre";
		String Traduccion4 ="Ratoli";
		String Traduccion5 ="Amic";
		String Traduccion6 ="Mirror";
		String Traduccion7 ="Keyboard";
		String Traduccion8 ="Book";
		String Traduccion9 ="Mouse";
		String Traduccion10 ="Friend";
		
		System.out.println("\n" + "Introduce a que idioma quieres traduccion (1 = Catalan) (2=Ingles)");
		Scanner sc = new Scanner (System.in);
		int idioma = sc.nextInt();
		switch (idioma) {
		case (1):
			sc.nextInt();
			System.out.println("\n" + "Introduce el numero de la palabra que quieres traducir");
			String paraula = sc.nextLine();
			
			if(paraula.equals(Paraula1)) {
				System.out.println("Idioma" + idioma1 +"\n"
						+ "Traducció" + Traduccion1);
				
			}else if (paraula.equals(Paraula2)){
				System.out.println("Idioma" + idioma1 +"\n"
						+ "Traducció" + Traduccion2);
				
			}else if (paraula.equals(Paraula3)) {
				System.out.println("Idioma" + idioma1 +"\n"
						+ "Traducció" + Traduccion3);
				
			}else if (paraula.equals(Paraula4)) {
				System.out.println("Idioma" + idioma1 +"\n"
						+ "Traducció" + Traduccion4);
				
			}else if (paraula.equals(Paraula5)) {
				System.out.println("Idioma" + idioma1 +"\n"
						+ "Traducció" + Traduccion5);
				
			}else {
				System.out.println("La palabra es Desconocida");
			}
				
			break;
		case (2):
			sc.nextInt();
			System.out.println("\n" + "Introduce el numero de la palabra que quieres traducir");
			String paraula2 = sc.nextLine();
			if(paraula2.equals(Paraula1)) {
				System.out.println("Idioma" + idioma2 +"\n"
						+ "Traducció" + Traduccion6);
				
			}else if (paraula2.equals(Paraula2)){
				System.out.println("Idioma" + idioma2 +"\n"
						+ "Traducció" + Traduccion7);
				
			}else if (paraula2.equals(Paraula3)) {
				System.out.println("Idioma" + idioma2 +"\n"
						+ "Traducció" + Traduccion8);
				
			}else if (paraula2.equals(Paraula4)) {
				System.out.println("Idioma" + idioma2 +"\n"
						+ "Traducció" + Traduccion9);
				
			}else if (paraula2.equals(Paraula5)) {
				System.out.println("Idioma" + idioma2 +"\n"
						+ "Traducció" + Traduccion10);
				
			}else {
				System.out.println("La palabra es Desconocida");
			}
			break;
		default:
			System.out.println("Idioma no Valid!!");
		}
			
		sc.close();

	}

}
