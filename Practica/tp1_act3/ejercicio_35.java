package tp1_act3;

import java.util.Scanner;

public class ejercicio_35 {
	
	private static Scanner input = new Scanner(System.in);
	private static final char ASTERISCO = '*';

	public static void main(String[] args) {
		
		String nombre, nombreJoven=" ";
		int edad, menorEdad=Integer.MAX_VALUE;
		char c;
		
		System.out.println("Ingrese nombre (*=Fin): ");
		nombre = input.nextLine();
		c = nombre.charAt(0);
		while (c!=ASTERISCO) {
			do {
				System.out.println("Ingrese edad: ");
				edad = Integer.parseInt(input.nextLine());
			}while (edad<1 || edad>120);
			if (edad<menorEdad) {
				menorEdad = edad;
				nombreJoven = nombre;
			}
			System.out.println("Ingrese nombre (*=Fin): ");
			nombre = input.nextLine();
			c = nombre.charAt(0);
		}
		if (menorEdad != Integer.MAX_VALUE)
			System.out.println(nombreJoven + " es el de menor edad, con " + menorEdad + " años.");
		else
			System.out.println("No se ingresaron datos");
			
		input.close();
	}
}