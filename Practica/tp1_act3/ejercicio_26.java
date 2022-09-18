package tp1_act3;

import java.util.Scanner;

public class ejercicio_26 {
	
	private static Scanner input = new Scanner(System.in);

	public static void main(String[] args) {

		System.out.println("Ingrese numero entero > 0: ");
		int num = Integer.parseInt(input.nextLine());
		if (num <= 0)
			System.out.println("***** INGRESE VALOR MAYOR A CERO *****");
		else {
			for (int i=1; i<=num; i++) {
					if ((i*num%5) != 0)
					System.out.println(i*num);
				}
			}
		input.close();
		}
}

