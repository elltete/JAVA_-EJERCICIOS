package ort.edu.ar;

import edu.ort.tp1.u5.tda.Pila;
import edu.ort.tp1.u5.tda.nodos.PilaNodos;

public class MainPila {

	public static void main(String[] args) {
		Pila<String> pila = new PilaNodos<String>(); // CREO PILA
		pila.push("MATEO"); // INGRESO NOMBRES
		pila.push("PEDRO");
		pila.push("MATEO");
		pila.push("JUAN");
		pila.push("MATEO");
		pila.push("MATEO");

		eliminarMateo(pila);
	}

	private static void eliminarMateo(Pila<String> pila) {
		Pila<String> pilaAux = new PilaNodos<String>(); // CREO UNA PILA AUXILIAR
		String aux = "";
		while (!pila.isEmpty()) { // PREGUNTO SI LA PILA ESTA VACIA
			aux = pila.pop(); // SACO UN ELEMENTO DE LA PILA
			if (!aux.equals("MATEO")) { // PREGUNTO SI EL ELEMENTO NO ES MATEO
				pilaAux.push(aux);   // INGRESO A LA PILA AUX EL ELEMENTO QUE NO ES MATEO
			}
		}

		//ORDENO LA PILA COMO ESTABA ORIGINALMENTE
		
		while (!pilaAux.isEmpty()) { // PREGUNTO SI LA PILA AUXILIAR NO ESTA VACIA
			pila.push(pilaAux.pop());  // PASO LOS ELEMENTOS DE LA PILA AUXILIAR A LA PILA ORIGINAL
		}
		
		// MUESTRO LOS ELEMENTOS EN EL ORDEN ORIGINAL Y CON LOS DATOS LIMPIOS (SIN MATEO)
		
		while (!pila.isEmpty()) { 
			System.out.println(pila.pop()); // MUESTRO EL ELEMENTO Y NO LO VUELVO A INGRESAR  A LA PILA
		}
		
		// EN ESTA INSTANCIA LA PILA YA ESTA VACIA
	}

}
