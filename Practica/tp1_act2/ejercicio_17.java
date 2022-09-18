package tp1_act2;

import java.util.Scanner;

public class ejercicio_17 {
	
	private static Scanner input = new Scanner(System.in);

	public static void main(String[] args) {
		byte edad;
		char sexo;
		boolean flagEdad = false;
		boolean flagSexo = false;
		
		System.out.println("Ingresar edad entre 1 y 120 años: ");
		edad = Byte.parseByte(input.nextLine());

		System.out.println("Ingrese sexo (F o M): ");
		sexo = input.nextLine().charAt(0);
		
		System.out.println("CALCULANDO VALORES");
		
		if (edad >= 1 && edad <= 120)
			flagEdad = true;
		else
			System.out.println("Edad ingresada fuera de rango");

		if (sexo == 'F' || sexo == 'M')
			flagSexo = true;
		else
			System.out.println("Sexo ingresado incorrecto");
		
		if (flagEdad && flagSexo)
			if ((sexo == 'M' && edad >= 65) || (sexo == 'F' && edad >= 60))
				System.out.println("Esta en edad de jubilarse");
			else
				System.out.println("No esta en edad de jubilarse");
		input.close();
	}

}