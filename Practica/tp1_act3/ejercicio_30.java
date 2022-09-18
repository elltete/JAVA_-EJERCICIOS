package tp1_act3;

import java.util.Scanner;

public class ejercicio_30 {
	
	private static Scanner input = new Scanner(System.in);

	public static void main(String[] args) {
		
		int valor1, valor2;
		char op;		
		
		System.out.println("Ingrese operacion a realizar (+ - * /) - F para salir: ");
		op = input.nextLine().charAt(0); //toma solo el caracter cero (el primero)
		
		while ((op=='+') || (op=='-') || (op=='*') || (op=='/') || (op=='F') || (op=='f')) {
			if ((op=='F') || (op=='f')) {
				System.out.println("Gracias por usar la calculadora.");
				break;
			}
			else { 
				System.out.println("Ingrese numero 1: ");
				valor1 = Integer.parseInt(input.nextLine());
		
				System.out.println("Ingrese numero 2: ");
				valor2 = Integer.parseInt(input.nextLine());
				
				switch (op) {
					case '+':
						System.out.println("Operacion " + valor1 + op + valor2 + " es " + suma(valor1,valor2));
						break;
					case '-':
						System.out.println("La resta de " + valor1 + " y " + valor2 + " es " + resta(valor1,valor2));
						break;
					case '*':
						System.out.println("La multiplicacion de " + valor1 + " y " + valor2 + " es " + multiplicacion(valor1,valor2));
						break;
					case '/':
						if (valor2 != 0)
							System.out.println("La division de " + valor1 + " y " + valor2 + " es " + division(valor1,valor2));
						else
							System.out.println("La division por cero no es posible");
						break;
				}
			}
				System.out.println("Ingrese operacion a realizar (+ - * /) - F para salir: ");
				op = input.nextLine().charAt(0); //toma solo el caracter cero (el primero)
				System.out.println("*********************");
		}
		input.close();
	}

	public static double suma(int a, int b){
		return (a+b);
	}
	public static double resta(int a, int b){
		return (a-b);
	}
	public static double multiplicacion(int a, int b){
		return (a*b);
	}
	public static double division(int a, int b){
		return (a/b);
	}
}