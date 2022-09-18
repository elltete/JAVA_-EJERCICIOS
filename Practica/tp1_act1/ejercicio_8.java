package tp1_act1;

import java.util.Scanner;

public class ejercicio_8 {
	
	private static Scanner input = new Scanner(System.in);

	public static void main(String[] args) {
		int num1, num2;
		
		System.out.println("Ingrese numero1: ");
		num1 = Integer.parseInt(input.nextLine());
		
		System.out.println("Ingrese numero2: ");
		num2 = Integer.parseInt(input.nextLine());
		
		System.out.println("CALCULANDO VALORES");
		
		System.out.println("La suma es: " + (num1 + num2));
		System.out.println("La resta es: " + (num1 - num2));
		System.out.println("La multiplicacion es: " + (num1 * num2));
		
		if (num2 != 0) {
			System.out.println("La division es: " + (num1 / num2));
		} else {
			System.out.println("No se puede dividir por cero");
		}
	}

}