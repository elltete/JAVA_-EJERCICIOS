package PRUEBAS;

import java.util.Scanner;

public class bibliotecaRecuentoLibros {

	public static final char FIN = 'Z';
	public static final char INFANTIL = 'I';
	public static final char NOVELA = 'N';
	public static final char HISTORIA = 'H';

	private static Scanner input = new Scanner(System.in);

	public static void main(String[] args) {

		char estante, genero;
		String nombreLibro, libroConMasPagina = null;
		int paginas, cantLibros, masPagina = Integer.MIN_VALUE, cantEstantes = 0, cantI = 0, cantN = 0, cantH = 0;

		System.out.println("PROGRAMA RECUENTO DE LIBROS - BIBLIOTECA");
		System.out.println("Ingrese letra del Estante (Z=Fin): ");
		estante = input.nextLine().charAt(0);

		while (estante != FIN) {
			cantEstantes++;
			do {
				System.out.println("Ingrese cantidad de libros para el estante " + estante + ": ");
				cantLibros = Integer.parseInt(input.nextLine());
				if (cantLibros < 0)
					System.out.println("Ingrese cantidad mayor a 0.");
			} while (cantLibros < 0);
			masPagina = Integer.MIN_VALUE;
			for (int i = 1; i <= cantLibros; i++) {
				do {
					System.out.println("Estante Letra " + estante + " - Ingrese nombre del libro " + i + ": ");
					nombreLibro = input.nextLine();
					if (nombreLibro.isEmpty())
						System.out.println("Ingrese un nombre para el libro.");
				} while (nombreLibro.isEmpty());

				do {
					System.out.println("Ingrese genero del libro " + nombreLibro + " (I,N,H): ");
					genero = input.nextLine().toUpperCase().charAt(0);
					if ((genero != INFANTIL) && (genero != NOVELA) && (genero != HISTORIA))
						System.out.println("Ingrese un dato valido.");
				} while ((genero != INFANTIL) && (genero != NOVELA) && (genero != HISTORIA));

				do {
					System.out.println("Ingrese cantidad de paginas del libro " + nombreLibro + " : ");
					paginas = Integer.parseInt(input.nextLine());
					if (paginas < 1)
						System.out.println("Ingrese cantidad mayor a 0.");
				} while (paginas < 1);

				if (paginas > masPagina) {
					masPagina = paginas;
					libroConMasPagina = nombreLibro;
				}

				switch (genero) {
				case INFANTIL:
					cantI++;
					break;
				case NOVELA:
					cantN++;
					break;
				case HISTORIA:
					cantH++;
					break;
				}
			}
			if (masPagina != Integer.MIN_VALUE)
				System.out.println("Nombre del libro con mas paginas es " + libroConMasPagina + " con " + masPagina);
			else
				System.out.println("No se ingresaron libros");

			System.out.println("Ingrese letra del Estante (Z=Fin): ");
			estante = input.nextLine().charAt(0);
		}

		if (cantEstantes != 0) {
			System.out.println("Cantidad de libros del genero Infantil: " + cantI);
			System.out.println("Cantidad de libros del genero Novela: " + cantN);
			System.out.println("Cantidad de libros del genero Historia: " + cantH);
			System.out.println("Promedio de libros por estante: " + (float) (cantI + cantN + cantH) / cantEstantes);
		} else
			System.out.println("No se ingresaron Estantes");

		input.close();
	}
}
