package PRUEBAS;

import java.util.Scanner;

public class AptoPruebaMaraton {

	final static float PROMEDIOAPTO = 18;
	final static int MINIMOTIEMPO = 15;
	final static int MAXIMOTIEMPO = 20;
	final static int DIASENTRENAMIENTO = 10;

	final static int MINUTOS_MIN = 1;
	final static int MINUTOS_MAX = 100;

	private static Scanner input = new Scanner(System.in);

	public static void main(String[] args) {

		boolean apto = false;
		int dia = 1, minutosRecorridos, totalRecorrido = 0, menorTiempo = 100, diaMinimoTiempo = 0;
		float promedio = 0;
		System.out.println("PROGRAMA CONTROL DE TIEMPO RECORRIDO");

		do {
			do {
				System.out.println("Ingrese tiempo recorrido en minutos (0 a 100) para el dia " + dia);
				minutosRecorridos = Integer.parseInt(input.nextLine());
			}while(minutosRecorridos < MINUTOS_MIN || minutosRecorridos > MINUTOS_MAX);

			if (minutosRecorridos < MINIMOTIEMPO)
				apto = true;

			if (minutosRecorridos < menorTiempo) {
				menorTiempo = minutosRecorridos;
				diaMinimoTiempo = dia;
			}
			totalRecorrido += minutosRecorridos;
			dia++;
		}while (minutosRecorridos < MAXIMOTIEMPO && dia <= DIASENTRENAMIENTO);

		if (minutosRecorridos > MAXIMOTIEMPO) {
			System.out.println("El corredor NO esta APTO por superar el tiempo de: " + MAXIMOTIEMPO + " minutos");
			apto = false;
		}

		else
			if (apto) {
				promedio = totalRecorrido/DIASENTRENAMIENTO;
				if (promedio<=PROMEDIOAPTO) {
					System.out.println("El corredor cumple las condiciones para estar APTO");
					System.out.println("El promedio del entrenamiento fue: " + promedio);
					System.out.println("El dia que realizo el menor tiempo fue: " + diaMinimoTiempo);
				}
				else {
					System.out.println("El corredor NO cumple las condiciones para estar APTO");
					System.out.println("Se excedio en el promedio menor " + PROMEDIOAPTO + " minutos");
				}
			}
			else{
				System.out.println("El corredor NO cumple las condiciones para estar APTO");
				System.out.println("No recorrio un dia menor a " + MINIMOTIEMPO + " minutos");
			}

		input.close();
	}
}