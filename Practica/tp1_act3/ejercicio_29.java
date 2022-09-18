package tp1_act3;

import java.util.Scanner;

public class ejercicio_29 {
	
	private static Scanner input = new Scanner(System.in);

	public static void main(String[] args) {

		int nota;
		
		do {
			System.out.println("Ingrese nota de examen: ");
			nota = Integer.parseInt(input.nextLine());
		} while ((nota < 0 ) || (nota > 10));
		
		System.out.println("Nota ingresada correctamente.");
		
		input.close();
		}
}