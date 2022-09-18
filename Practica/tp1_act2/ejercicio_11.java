package tp1_act2;

import java.util.Scanner;

public class ejercicio_11 {
	
	private static Scanner input = new Scanner(System.in);

	public static void main(String[] args) {
		int num1;
		
		System.out.println("Ingrese valor de un numero entero: ");
		num1 = Integer.parseInt(input.nextLine());
		
		
		System.out.println("CALCULANDO VALORES");
		
		if (num1%2 == 0){
			System.out.println("El valor ingresado es PAR");
		} else {
			System.out.println("El valor ingresado es IMPAR");
		}
		input.close();
	}

}