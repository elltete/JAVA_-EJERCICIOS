package tp1_act1;

import java.util.Scanner;

public class ejercicio_7 {
	
	private static Scanner input = new Scanner(System.in);

	public static void main(String[] args) {
		double ancho, largo, valorMetro2;
		
		System.out.println("Ingrese ancho del terreno: ");
		ancho = Double.parseDouble(input.nextLine());
		
		System.out.println("Ingrese largo del terreno: ");
		largo = Double.parseDouble(input.nextLine());
		
		System.out.println("Ingrese valor del metro cuadrado: ");
		valorMetro2 = Double.parseDouble(input.nextLine());
		
		System.out.println("CALCULANDO VALORES");
		
		System.out.println("Valor total del terreno:: " + (ancho * largo * valorMetro2));
		System.out.println("Cant de metro de alambre: " + (ancho + largo ) *6);
		
	}

}