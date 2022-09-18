package tp1_act2;

import java.util.Scanner;

public class ejercicio_18 {
	
	private static Scanner input = new Scanner(System.in);

	public static void main(String[] args) {
		int valor1, valor2;
		
		System.out.println("Ingrese un numero: ");
		valor1 = Integer.parseInt(input.nextLine());

		System.out.println("Ingrese otro numero: ");
		valor2 = Integer.parseInt(input.nextLine());
		
		System.out.println("*********************");
		
		if (valor1 == valor2)
			System.out.println("Ambos numeros ingresados son iguales.");
		else
			if (valor1>valor2)
				if (valor1%valor2 == 0)
					System.out.println("El primer numero es mayor y es divisible por el otro.");
				else
					System.out.println("El primer numero es mayor pero no es divisible por el otro.");
			else
				if (valor2%valor1 == 0)
					System.out.println("El segundo numero es mayor y es divisible por el otro.");
				else
					System.out.println("El segundo numero es mayor pero no es divisible por el otro.");
		input.close();
	}
}