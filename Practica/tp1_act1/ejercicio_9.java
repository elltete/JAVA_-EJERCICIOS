package tp1_act1;

import java.util.Scanner;

public class ejercicio_9 {
	
	private static Scanner input = new Scanner(System.in);

	public static void main(String[] args) {
		float num1, num2;
		
		System.out.println("Ingrese grado de un angulo interior del triangulo: ");
		num1 = Float.parseFloat(input.nextLine());
		
		System.out.println("Ingrese grado de otro angulo interior del triangulo: ");
		num2 = Float.parseFloat(input.nextLine());
		
		System.out.println("CALCULANDO VALORES");
		
		if ((num1 <= 0) || (num2 <= 0) || ((num1+num2) >= 180)){
			System.out.println("Se ingresaron datos erroneos");
		} else {
			System.out.println("El valor del tercer angulo es " + (180-num1-num2));
		}
	}

}