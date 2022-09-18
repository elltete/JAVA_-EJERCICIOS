package tp1_act2;

import java.util.Scanner;

public class ejercicio_13 {
	
	private static Scanner input = new Scanner(System.in);

	public static void main(String[] args) {
		int num1, num2, num3;
		
		System.out.println("Ingrese valor de un numero entero 1: ");
		num1 = Integer.parseInt(input.nextLine());

		System.out.println("Ingrese valor de un numero entero 2: ");
		num2 = Integer.parseInt(input.nextLine());

		System.out.println("Ingrese valor de un numero entero 3: ");
		num3 = Integer.parseInt(input.nextLine());
		
		System.out.println("CALCULANDO VALORES");
		
		if (num1>num2)
			if (num1>num3)
				System.out.println("El valor mayor es el primero: " + num1);
			else 
				System.out.println("El valor mayor es el tercero: " + num3);
		else if (num2>num3)
				System.out.println("El valor mayor es el segundo: " + num2);
			else
				System.out.println("El valor mayor es el tercero: " + num3);
		input.close();
	}

}