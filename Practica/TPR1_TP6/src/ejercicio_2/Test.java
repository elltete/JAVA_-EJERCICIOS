package ejercicio_2;

import interfaces.Cola;

public class Test {

	public static void main(String[] args) {
 
		BarajaEspaniola mazo = new BarajaEspaniola(true);  //Crea el mazo Español, asignando Cartas y mezcla.
		Cola<Naipe> monton = mazo.extraer(10);			   //Crea una cola, en la cual toma del mazo 10 naipes.
		
		boolean hayComodines = revisar(monton);			
		
		if (hayComodines) {
			System.out.println("Se encontraron comodines");
		} else {
			System.out.println("No se encontraron comodines");
		}
	}

	private static boolean revisar(Cola<Naipe> monton) {
		boolean hay = false;
		// creamos un naipe inexistente (con numero 0)
		NaipeNumerado extra = new NaipeNumerado(0, BarajaEspaniola.PaloEspaniol.BASTOS);
		// TODO Completar el metodo
		return hay;
	}

}