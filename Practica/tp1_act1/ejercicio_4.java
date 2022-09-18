package tp1_act1;

import java.util.Scanner;

public class ejercicio_4 {
	
	private static Scanner input = new Scanner(System.in);

	public static void main(String[] args) {
		float valorHora, horasTrabajadas;
		
		System.out.println("Ingrese valor de la hora de trabajo: ");
		valorHora = Float.parseFloat(input.nextLine());
		
		System.out.println("Ingrese horas trabajas por dia: ");
		horasTrabajadas = Float.parseFloat(input.nextLine());
		
		System.out.println("El salario semanal es ARS " + valorHora*horasTrabajadas*5.5);
	}

}