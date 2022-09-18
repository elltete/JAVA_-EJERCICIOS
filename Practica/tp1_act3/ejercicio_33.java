package tp1_act3;

import java.util.Scanner;

public class ejercicio_33 {
	
	private static Scanner input = new Scanner(System.in);

	public static void main(String[] args) {
		
		int valor, maximo=-999999999, minimo=999999999;
		
		System.out.println("Ingrese valor (0=Fin): ");
		valor = Integer.parseInt(input.nextLine());
		
		while (valor!=0) {
			if (valor>maximo)
				maximo=valor;
			if (valor<minimo)
				minimo=valor;
			System.out.println("Ingrese valor (0=Fin): ");
			valor = Integer.parseInt(input.nextLine());
		}
		System.out.println("Numero Maximo: " + maximo + ". Numero Minimo: " + minimo + ".");
		input.close();
	}
}