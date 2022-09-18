package PRUEBAS;

import java.util.Scanner;

public class zoologico {

	public static final int TANDASPORDIA = 3;
	public static final char SI = 'S';
	public static final char NO = 'N';

	private static Scanner input = new Scanner(System.in);

	public static void main(String[] args) {

		int kg, cantTotalKg = 0, maxKg = Integer.MIN_VALUE, maxTanda = 0, kgPorTanda;
		char seguir;

		System.out.println("PROGRAMA INGESTA DE COMIDA DEL LEON - ZOOLOGICO");

		for (int i = 1; i <= TANDASPORDIA; i++) {
			kgPorTanda = 0;
			do { // SEGUIR
				do { // KG
					System.out.println("Kilogramos de alimento ingerido en tanda " + i + " : ");
					kg = Integer.parseInt(input.nextLine());
					if (kg < 0)
						System.out.println("Ingrese un valor positivo.");
				} while (kg < 0);

				kgPorTanda += kg;
				cantTotalKg += kg;

				do { // SEGUIR
					System.out.println("Desea seguir cominedo (S/N): ");
					seguir = input.nextLine().toUpperCase().charAt(0);
					if (seguir != SI && seguir != NO)
						System.out.println("Ingrese un valor S/N.");
				} while (seguir != SI && seguir != NO);

			} while (seguir == SI);

			if (kgPorTanda > maxKg) {
				maxKg = kgPorTanda;
				maxTanda = i;
			}
		}

		System.out.println("La tanda que mas comio fue: " + maxTanda + " con cantidad en kg: " + maxKg);
		System.out.println("Total de comida ingerida: " + cantTotalKg + " kg");
		System.out.println("Promedio de alimento por tanda: " + (cantTotalKg / TANDASPORDIA) + " kg");
		input.close();
	}
}