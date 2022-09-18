package tp1_act1;

import java.util.Scanner;

public class ejercicio_10 {
	
	private static Scanner input = new Scanner(System.in);

	public static void main(String[] args) {
		double aporte1, aporte2, aporte3, capitalSocial;
		String nombreSocio1, nombreSocio2, nombreSocio3;
		
		System.out.println("Ingrese nombre del Socio 1: ");
		nombreSocio1 = input.nextLine();
		System.out.println("Ingrese capital aportado por " + nombreSocio1 + ": ");
		aporte1 = Double.parseDouble(input.nextLine());
		
		System.out.println("Ingrese nombre del Socio 2: ");
		nombreSocio2 = input.nextLine();
		System.out.println("Ingrese capital aportado por " + nombreSocio2 + ": ");
		aporte2 = Double.parseDouble(input.nextLine());
		
		System.out.println("Ingrese nombre del Socio 3: ");
		nombreSocio3 = input.nextLine();
		System.out.println("Ingrese capital aportado por " + nombreSocio3 + ": ");
		aporte3 = Double.parseDouble(input.nextLine());
		
		capitalSocial = aporte1 + aporte2 + aporte3;
		
		System.out.println("CALCULANDO VALORES");
		
		System.out.println("Valor aportado por " + nombreSocio1 + " es ARS " + aporte1 + ". El porcentaje aportado es " + aporte1/capitalSocial*100);
		System.out.println("Valor aportado por " + nombreSocio2 + " es ARS " + aporte2 + ". El porcentaje aportado es " + aporte2/capitalSocial*100);
		System.out.println("Valor aportado por " + nombreSocio3 + " es ARS " + aporte3 + ". El porcentaje aportado es " + aporte3/capitalSocial*100);

		
	}

}