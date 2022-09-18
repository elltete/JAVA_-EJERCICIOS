package tp1_act3;

import java.util.Scanner;

public class ejercicio_36 {
	
	private static Scanner input = new Scanner(System.in);

	public static void main(String[] args) {
		
		int cant=0, num, sumaNum=0;
		
		do {
			System.out.println("Ingrese numero: ");
			num = Integer.parseInt(input.nextLine());
			sumaNum += num;
			cant++;
			System.out.println("Promedio hasta ahora " + sumaNum/cant);
		} while ((sumaNum/cant)<20);
		
		System.out.println("Cantidad de valores leidos " + cant);
		input.close();
	}
}