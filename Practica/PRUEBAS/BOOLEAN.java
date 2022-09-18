package PRUEBAS;

import java.util.Scanner;

public class BOOLEAN {

	public static final char IMPERIAL = 'I';
	public static final char COMUN = 'C';
	public static final char FERIADO = 'F';
	public static final char HABIL = 'H';
	public static final char CORTO = 'C';
	public static final char MEDIANO = 'M';
	public static final char LARGO = 'L';
	public static final char FIN = 'F';
	
	private static Scanner input = new Scanner(System.in);

	public static void main(String[] args) {

		int cantidad, edad;
		//String fechaReserva;
		char tipoDeDia, nombreSalon, distancia;
	
		System.out.println("OPERADORES BOOLEANOS");
		
		do {
			System.out.println("DO-WHILE: Ingresa distancia (C)orto (M)ediano (L)argo (F)in: ");
			distancia = input.nextLine().toUpperCase().charAt(0);
		}while(distancia!=CORTO && distancia!=MEDIANO && distancia!=LARGO && distancia!=FIN);		

		do {
			System.out.println("DO WHILE: Ingresar cantidad mayor a 0 (Fin:-1):");
			cantidad = Integer.parseInt(input.nextLine());
		}while(cantidad < -1 || cantidad == 0);
		System.out.println("Salio del DO WHILE con un valor mayor a 0");
		
		
		do {
			System.out.println("DO WHILE: Ingresar edad entre (18 y 120): ");
			edad = Integer.parseInt(input.nextLine());
		}while(edad < 18 || edad > 120);
		System.out.println("Salio del DO WHILE pedido de edad");		
		

		do {
			System.out.println("DO WHILE: Ingrese dia (H)abil o (F)eriado");
			tipoDeDia = input.nextLine().toUpperCase().charAt(0);
		}while(tipoDeDia!=HABIL || tipoDeDia!=FERIADO);
		System.out.println("Saio del DO WHILE: Ingrese dia (H)abil o (F)eriado");
		
		do {
			System.out.println("Ingresa nombre del Salon (I)mperial o (C)omun:");
			nombreSalon = input.nextLine().toUpperCase().charAt(0);
		}while(nombreSalon!=IMPERIAL && nombreSalon!=COMUN);


		input.close();
	}
}
