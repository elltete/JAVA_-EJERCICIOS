package tp1_act3;

import java.util.Scanner;

public class ejercicio_31b {
	
	private static Scanner input = new Scanner(System.in);

	public static void main(String[] args) {
		
		char op=' ';
		
		do  {
			System.out.println("Desea continuar [S/N]: ");
			op = input.next().charAt(0);
		} while ((op!='s') && (op!='S') && (op!='n') && (op!='N'));
		
		if ((op=='s') || (op=='S'))
				System.out.println("Ingreso Continuar.");
		else
			if ((op=='n') || (op=='N'))
				System.out.println("Ingreso No Continuar.");

		input.close();
	}
}