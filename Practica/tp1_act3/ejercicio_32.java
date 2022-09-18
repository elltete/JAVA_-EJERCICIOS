package tp1_act3;

import java.util.Scanner;

public class ejercicio_32 {
	
	private static Scanner input = new Scanner(System.in);

	public static void main(String[] args) {
		
		int nota=0;
		
		while (((nota<4) || (nota>10)) && (nota!=2)) {
			System.out.println("Ingrese nota: ");
			nota = Integer.parseInt(input.nextLine());
		}
		
		if (nota==2)
				System.out.println("Reprobado.");
		else
				System.out.println("Aprobado.");
		input.close();
	}
}