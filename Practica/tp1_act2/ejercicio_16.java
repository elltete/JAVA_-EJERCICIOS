package tp1_act2;

import java.util.Scanner;

public class ejercicio_16 {
	
	private static Scanner input = new Scanner(System.in);

	public static void main(String[] args) {
		int cantInscriptos, cantAsientos;
		
		System.out.println("Ingrese cantidad de Inscriptos: ");
		cantInscriptos = Integer.parseInt(input.nextLine());

		System.out.println("Ingrese cantidad de asientos de la sala: ");
		cantAsientos = Integer.parseInt(input.nextLine());
		
		System.out.println("*********************");
		
		if (cantInscriptos<=cantAsientos)
			System.out.println("Alcanza los asientos para los inscriptos");
		else
			System.out.println("No alcanzan los asientos para los inscriptos. Faltan " + (cantInscriptos-cantAsientos) + " asientos.");
		input.close();
	}
}