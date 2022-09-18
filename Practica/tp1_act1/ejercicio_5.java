package tp1_act1;

import java.util.Scanner;

public class ejercicio_5 {
	
	private static Scanner input = new Scanner(System.in);

	public static void main(String[] args) {
		int num1, num2, aux;
		
		System.out.println("Ingrese valor para num1: ");
		num1 = Integer.parseInt(input.nextLine());
		
		System.out.println("Ingrese valor para num2: ");
		num2 = Integer.parseInt(input.nextLine());
		
		System.out.println("Valor ingresado para num1: " + num1);
		System.out.println("Valor ingresado para num2: " + num2);
		
		System.out.println("INTERCAMBIANDO VALORES");
		aux = num1;
		num1 = num2;
		num2 = aux;
		
		System.out.println("Valor ingresado para num1: " + num1);
		System.out.println("Valor ingresado para num2: " + num2);
		
	}

}