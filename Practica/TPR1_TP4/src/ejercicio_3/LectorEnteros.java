package ejercicio_3;

import java.util.Scanner;

public class LectorEnteros {

	private static final String MENSAJE_ERROR_SCANNER_NULL = "Debe recibirse un Scanner.";
	private static final String MENSAJE_FUERA_DE_RANGO = "El valor ingresado esta fuera del rango aceptable";
	private static final String INGRESE_NOTA = "Ingrese nota de alumno.";
	private static final String MENSAJE_RANGO = "El rango es entre %d y %d.";

	private Scanner scanner;

	public LectorEnteros(Scanner scanner) {
		if(scanner == null) {
			throw new IllegalArgumentException(MENSAJE_ERROR_SCANNER_NULL);
		}
		this.scanner = new Scanner(System.in);
	}

	private int cargar(String mensaje) {
		int numero = 0;
		System.out.println(mensaje);
		try {
			numero = Integer.parseInt(scanner.nextLine());
		} catch (Exception e) {
			System.out.println(e.getMessage());
		}
		return numero;
	}
	
	public int pedir(String mensaje) {
		return cargar(mensaje);
	}

	public int pedir(String mensaje, int limiteA, int limiteB){
		int num = cargar(mensaje);
		System.out.printf(MENSAJE_RANGO, limiteA, limiteB);
		return num;
	}

	public int pedir(String mensaje, RangoDeEnteros rangoValido){
		int num = cargar(mensaje);
		return num;
	}
}
