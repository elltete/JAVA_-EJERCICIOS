package tp1_act3;

import java.util.Scanner;

public class ejercicio_34 {
	
	private static Scanner input = new Scanner(System.in);

	public static void main(String[] args) {
		
		float estatura, totalEstatura=0;
		int cant=0;
		
		estatura = ingreso();
		
		while (estatura!=0) {
			totalEstatura = totalEstatura + estatura;
			cant++;
			estatura = ingreso();
		}
		System.out.println("Estatura promedio del equipo: " + (totalEstatura/cant));
		input.close();
	}
	
	public static float ingreso() {
		System.out.println("Ingrese estatura (0=Fin): ");
		float estatura = Float.parseFloat(input.nextLine());
		return estatura;
	}
}