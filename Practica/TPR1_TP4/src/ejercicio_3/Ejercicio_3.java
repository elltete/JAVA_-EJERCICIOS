package ejercicio_3;

import java.util.Scanner;

public class Ejercicio_3 {
	
	private static final String MENSAJE_CARGA_ENTERO = "Ingrese un numero entero cualquiera";
	private static final String INGRESE_NOTA = "Ingrese nota de alumno.";
	
	final static RangoDeEnteros RANGO_VALIDO = new RangoDeEnteros(0, 10);

	public static void main(String[] args) {
		
		int nacimiento = 0;
		int fallecimiento = 0;
		int limiteA = 0;
		int limiteB = 10;
		LectorEnteros lector = null;
		Scanner input = new Scanner(System.in);
		//Scanner input = null;
		try {
			lector = new LectorEnteros(input);
		} catch (Exception e) {
			System.out.println(e.getMessage());
		}
	
		if (input != null) {
			lector.pedir(MENSAJE_CARGA_ENTERO);
			lector.pedir(INGRESE_NOTA, limiteA, limiteB);			
			lector.pedir(INGRESE_NOTA, RANGO_VALIDO);
			
			
			input.close();
		}
		
	}
}