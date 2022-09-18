package tp1_act2;

import java.util.Scanner;

public class ejercicio_20 {
	
	private static Scanner input = new Scanner(System.in);

	public static void main(String[] args) {
		
		System.out.println("Ingrese un numero: ");
		float valor1 = Float.parseFloat(input.nextLine());

		System.out.println("Ingrese otro numero: ");
		float valor2 = Float.parseFloat(input.nextLine());
		
		System.out.println("Ingrese operacion a realizar (+ - * /): ");
		char operacion = input.next().charAt(0); //toma solo el caracter cero (el primero)
		
		System.out.println("*********************");
		
		
		switch (operacion) {
			case '+':
				System.out.println("La suma de " + valor1 + " y " + valor2 + " es " + (valor1+valor2));
				break;
			case '-':
				System.out.println("La resta de " + valor1 + " y " + valor2 + " es " + (valor1-valor2));
				break;
			case '*':
				System.out.println("La multiplicacion de " + valor1 + " y " + valor2 + " es " + (valor1*valor2));
				break;
			case '/':
				if (valor2 > 0)
					System.out.println("La division de " + valor1 + " y " + valor2 + " es " + (valor1/valor2));
				else
					System.out.println("La division por cero no es posible");
				break;
			default:
				System.out.println("Operacion ingresada es invalida");
		}
		input.close();
	}
}