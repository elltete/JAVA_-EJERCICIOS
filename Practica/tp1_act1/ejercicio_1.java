package tp1_act1;

import java.util.Scanner;

public class ejercicio_1 {
	
	private static Scanner input = new Scanner(System.in);

	public static void main(String[] args) {
		System.out.println("Ingrese su nombre: ");
		String nombre;
		nombre = input.nextLine();
		System.out.println("Bienvenido " + nombre);
	}

}
