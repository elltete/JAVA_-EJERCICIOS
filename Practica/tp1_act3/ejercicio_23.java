package tp1_act3;

import java.util.Scanner;

public class ejercicio_23 {
	
	private static Scanner input = new Scanner(System.in);

	public static void main(String[] args) {

		System.out.println("Ingrese un numero: ");
		float n = Float.parseFloat(input.nextLine());
		
		System.out.println("Tabla de multiplicar del numero " + n);
		
		System.out.println("***** CON FOR *****");
		
		for (int i =1 ; i <= 10; i++) {
		    System.out.println(n + " * " + i + " = " + n * i);
		}
		
		System.out.println("***** CON WHILE *****");
		
		int k=1;
		while (k<=10) {
	    	System.out.println(n + " * " + k + " = " + n * k);
	    	k++;
		}
		
		System.out.println("***** CON DO WHILE *****");
		int j=1;
		do {
	    	System.out.println(n + " * " + j + " = " + n * j);
	    	j++;
		}while (j<=10);
		
		input.close();
	}

}
