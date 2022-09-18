package tp1_act3;

import java.util.Scanner;

public class ejercicio_27 {
	
	private static Scanner input = new Scanner(System.in);

	public static void main(String[] args) {

		System.out.println("***** EL SIST LE PEDIRA INGRESO DE 5 EDADES *****");
		
		int sumaEdad=0, cant=0, edad;
		
		for (int i=1; i<=5; i++) {
			do {
				System.out.println("Ingrese edad persona " + i + ": ");
				edad = Integer.parseInt(input.nextLine());
			}while(edad<1 || edad>120);
			sumaEdad = sumaEdad + edad;
			if ((edad%2 != 0 ) && (edad > 18))
				cant++;
		}
		
		System.out.println("Promedio de edades: " +  sumaEdad/5);
		System.out.println("Cant de edades impares mayores a 18: " + cant);
		
		input.close();
		}
}