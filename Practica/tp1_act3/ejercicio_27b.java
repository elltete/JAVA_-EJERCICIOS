package tp1_act3;

import java.util.Scanner;

public class ejercicio_27b {
	
	private static Scanner input = new Scanner(System.in);

	public static void main(String[] args) {

		System.out.println("***** EL SIST LE PEDIRA INGRESO DE 5 EDADES *****");
		
		int sumaEdad=0, cant=0;
		int [] arrayEdad = new int[5]; 
		
		for (int i=0; i<=4; i++) {
			System.out.println("Ingrese edad persona " + (i+1) + ": ");
			arrayEdad[i] = Integer.parseInt(input.nextLine());
		}	
		
		for (int i=0; i<=4; i++) {
			sumaEdad = sumaEdad + arrayEdad[i];
			if ((arrayEdad[i]%2 != 0 ) && (arrayEdad[i] > 18))
				cant++;
		}
		System.out.println("Promedio de edades: " +  sumaEdad/5);
		System.out.println("Cant de edades impares mayores a 18: " + cant);
		
		input.close();
		}
}