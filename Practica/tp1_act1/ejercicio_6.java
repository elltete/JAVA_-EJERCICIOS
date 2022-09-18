package tp1_act1;

import java.util.Scanner;

public class ejercicio_6 {
	
	private static Scanner input = new Scanner(System.in);
	
	public static final double PORCENTAJEVENTAS = 0.14;
	public static final double SUELDOBASICO = 44000;

	public static void main(String[] args) {
		double ventasMensual;
		
		System.out.println("Ingresar monto total mensual de ventas del vendedor: ");
		ventasMensual = Float.parseFloat(input.nextLine());
		
		System.out.println("Monto total a cobrar: " + (SUELDOBASICO + ventasMensual * PORCENTAJEVENTAS));
		
	}

}