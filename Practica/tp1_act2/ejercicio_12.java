package tp1_act2;

import java.util.Scanner;

public class ejercicio_12 {
	
	private static Scanner input = new Scanner(System.in);

	public static void main(String[] args) {
		int num1, num2;
		
		System.out.println("Ingrese valor de un numero entero: ");
		num1 = Integer.parseInt(input.nextLine());

		System.out.println("Ingrese valor de otro numero entero: ");
		num2 = Integer.parseInt(input.nextLine());
		
		System.out.println("CALCULANDO VALORES");
		
		if (num1>num2)
			System.out.println("El valor " + num1 + " es mayor que el valor " + num2);
		else if (num2>num1)
			System.out.println("El valor " + num2 + " es mayor que el valor " + num1);
		else
			System.out.println("Ambos valores son iguales");
		input.close();
	}

}