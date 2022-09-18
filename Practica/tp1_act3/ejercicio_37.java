package tp1_act3;

import java.util.Scanner;

public class ejercicio_37 {
	
	private static Scanner input = new Scanner(System.in);

	public static void main(String[] args) {
		
		int mes=1;
		float salario, montoAnual=0;
		
		do {
			System.out.printf("Ingrese salario del mes %s : ",mes);
			salario = Float.parseFloat(input.nextLine());
			montoAnual = montoAnual + salario;
			mes++;
		} while (salario>0 && mes<=12);
		
		System.out.printf("Salario anual: %5.1f",montoAnual);
		input.close();
	}
}