package tp1_act3;

import java.util.Scanner;

public class ejercicio_24b {
	
	private static Scanner input = new Scanner(System.in);

	public static void main(String[] args) {

		System.out.println("Ingrese numero1: ");
		int num1 = Integer.parseInt(input.nextLine());

		System.out.println("Ingrese numero2 (mayor o igual al 1ro)1: ");
		int num2 = Integer.parseInt(input.nextLine());
				
		if (num1>num2)
			System.out.println("***** NO CUMPLE LA CONSIGNA *****");
		else {
			System.out.println("***** EXCLUYENDO LOS NUMEROS *****");
			
			num1++;
			//System.out.println("***** CON WHILE *****");
			while (num1<num2) {
		    	System.out.println(num1);
		    	num1++;
			}
		}
		
		input.close();
	}

}