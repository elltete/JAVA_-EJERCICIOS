package tp1_act1;

import java.util.Scanner;

public class ejercicio_2 {
	
	private static Scanner input = new Scanner(System.in);

	public static void main(String[] args) {
		float nota1, nota2, nota3;
		
		System.out.println("Ingrese nota 1: ");
		nota1 = Float.parseFloat(input.nextLine());
		
		System.out.println("Ingrese nota 2: ");
		nota2 = Float.parseFloat(input.nextLine());
		
		System.out.println("Ingrese nota 3: ");
		nota3 = Float.parseFloat(input.nextLine());
		
	
		System.out.println("La nota promedio es: " + (nota1+nota2+nota3)/3);
	}

}
