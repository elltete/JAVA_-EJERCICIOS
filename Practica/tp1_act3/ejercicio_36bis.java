package tp1_act3;

import java.util.Scanner;

public class ejercicio_36bis {
	
	private static Scanner input = new Scanner(System.in);

	public static void main(String[] args) throws Exception {
		
		int cant=0, num, sumaNum=0;
		int medium = 0;
		
		System.out.println("Ingrese valores: ");
		
		while (medium<20){
			num = Integer.parseInt(input.nextLine());
			sumaNum += num;
			cant++;
			medium = sumaNum/cant;
			System.out.println("Promedio hasta ahora: " + medium);
		}		
		System.out.println("Cantidad de valores leidos " + cant);
		input.close();
	}
}