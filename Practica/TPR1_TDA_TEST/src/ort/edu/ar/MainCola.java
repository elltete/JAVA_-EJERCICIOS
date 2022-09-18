package ort.edu.ar;

import edu.ort.tp1.u5.tda.Cola;
import edu.ort.tp1.u5.tda.nodos.ColaNodos;

public class MainCola {

	public static void main(String[] args) {
		Cola<String> cola = new ColaNodos<String>(); //CREO COLA
		cola.add("MATEO"); // AGREGO NOMBRES
		cola.add("JUAN");
		cola.add("MATEO");
		cola.add("MATEO");
		cola.add("PEDRO");
		cola.add("MATEO");

		eliminarMateo(cola);
	}

	private static void eliminarMateo(Cola<String> cola) {
		String comodin = ""; // CREO COMODIN
		String aux;
		cola.add(comodin); // AGREGO EL COMODIN A LA COLA
		aux = cola.remove(); // OBTENGO EL PRIMER ELEMENTO DE LA COLA
		while (!aux.equals(comodin)) { // PREGUNTO SI EL ELEMENTO QUE OBTUVE ES EL COMODIN
			System.out.println(aux);
			if (!aux.equals("MATEO")) { // PREGUNTO SI EL ELEMENTO NO ES MATEO
				cola.add(aux);
			}
			aux = cola.remove(); // OBTENGO OTRO ELEMENTO DE LA COLA
		}

		System.out.println("------------------- MUESTRO LA COLA LIMPIA");
		
		cola.add(comodin);
		aux = cola.remove();
		while (!aux.equals(comodin)) {
			System.out.println(aux);
			aux = cola.remove();
		}
	}

}
