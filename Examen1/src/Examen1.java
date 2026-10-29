
public class Examen1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String nomJugador = "Jordi";
		int edad = 19;
		double puntuacio = 8.5;
		char incialNom = 'J';
		int puntuacioInt = (int)puntuacio; 
		int incialInt = (int)incialNom;
//		String edatString = (); No segueix el mateix metode.
		
		System.out.printf("\t Dades Original: \n"
				+ "Nom del Jugador : " + nomJugador + " \n" 
				+ "Edad (Original) :" + edad + "\n"
				+ "Puntiacio (Original) :" + puntuacio + "\n"
				+ "Inicial del Nom (Original) :" + incialNom + "\n"
				+ "Puntuacio (Variable Modificada) : :" + puntuacioInt + "\n"
				+ "Inicial del Nom (Variable Modificada) : :" + incialInt );

	}

}
