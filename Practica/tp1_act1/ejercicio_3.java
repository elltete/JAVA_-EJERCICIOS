package tp1_act1;

import java.util.Scanner;

public class ejercicio_3 {
	
	private static Scanner input = new Scanner(System.in);

	public static void main(String[] args) {
		int num;
		
		System.out.println("Ingrese un numero entero: ");
		num = Integer.parseInt(input.nextLine());
		
		System.out.println("El numero multiplicado por 5 es: " + num*5);
		System.out.println("El numero dividido por 2 es: " + num/2);
	}

}