package tp1_act2;

import java.util.Scanner;

public class ejercicio_14 {
	
	private static Scanner input = new Scanner(System.in);
	
	private static final double ALTURA_MINIMA = 1.5;
	private static final byte EDAD_MINIMA = 7;

	public static void main(String[] args) {
		String nombre;
		byte edad;
		double altura;
		
		System.out.println("Ingrese nombre de la persona: ");
		nombre = input.nextLine();

		System.out.println("Ingrese la edad de " + nombre + ": ");
		edad = Byte.parseByte(input.nextLine());

		System.out.println("Ingrese la altura de " + nombre + ": ");
		altura = Double.parseDouble(input.nextLine());
		
		System.out.println("CALCULANDO VALORES");
		
		if (edad >= EDAD_MINIMA && altura > ALTURA_MINIMA)
			System.out.println(nombre + " puede entra al juego.");
		else
			System.out.println(nombre + " no puede entra al juego.");
		input.close();
	}
}