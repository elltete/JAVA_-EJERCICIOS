package tp1_act2;

import java.util.Scanner;

public class ejercicio_21 {
	
	private static Scanner input = new Scanner(System.in);

	public static void main(String[] args) {
		
		System.out.println("Ingrese un numero de semana (1-7): ");
		char num = input.next().charAt(0); //toma solo el caracter cero (el primero)
		
		System.out.println("*********************");
		
		
		switch (num) {
			case '1':
				System.out.println("Numero ingresado ("+ num + ")" + " pertenece al dia DOMINGO");
				break;
			case '2':
				System.out.println("Numero ingresado ("+ num + ")" + " pertenece al dia LUNES");
				break;
			case '3':
				System.out.println("Numero ingresado ("+ num + ")" + " pertenece al dia MARTES");
				break;
			case '4':
				System.out.println("Numero ingresado ("+ num + ")" + " pertenece al dia MIERCOLES");
				break;
			case '5':
				System.out.println("Numero ingresado ("+ num + ")" + " pertenece al dia JUEVES");
				break;
			case '6':
				System.out.println("Numero ingresado ("+ num + ")" + " pertenece al dia VIERNES");
				break;
			case '7':
				System.out.println("Numero ingresado ("+ num + ")" + " pertenece al dia SABADO");
				break;
			default:
				System.out.println("Numero ingresado invalido");
		}
		input.close();
	}
}