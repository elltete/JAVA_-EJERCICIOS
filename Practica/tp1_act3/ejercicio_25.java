package tp1_act3;

import java.util.Scanner;

public class ejercicio_25 {
	
	private static Scanner input = new Scanner(System.in);

	public static void main(String[] args) {

		System.out.println("Ingrese ancho de la matriz: ");
		int ancho = Integer.parseInt(input.nextLine());

		System.out.println("Ingrese alto de la matriz: ");
		int alto = Integer.parseInt(input.nextLine());
		
		if ((ancho <= 0) || (alto <= 0)) {
			System.out.println("***** INGRESE VALORES MAYORES A CERO *****");
		}
		else {
			for (int i=1; i<=alto; i++) {
				for (int j=1; j<=ancho; j++) {
					System.out.print("* ");
				}
				System.out.println();
			}
		}
		
		input.close();
	}

}