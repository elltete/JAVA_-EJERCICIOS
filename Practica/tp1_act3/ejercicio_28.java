package tp1_act3;

import java.util.Scanner;

public class ejercicio_28 {
	
	private static Scanner input = new Scanner(System.in);

	public static void main(String[] args) {

		int cant;
		
		do {
			System.out.println("Ingrese valor para repeticion (>0 y <10): ");
			cant = Integer.parseInt(input.nextLine());
		} while ((cant <= 0 ) || (cant > 10));
		
		
		int maximoValor=0, posicion=0, num;
		
		for (int i=1; i<=cant; i++) {
			System.out.println("Ingrese valor " + i + ": ");
			num = Integer.parseInt(input.nextLine());
			if (num>maximoValor) {
				maximoValor = num;
				posicion = i;
			}
		}
		
		System.out.println("Mayor valor es: " +  maximoValor + ", ingresado en la posicion " + posicion);
		
		input.close();
		}
}