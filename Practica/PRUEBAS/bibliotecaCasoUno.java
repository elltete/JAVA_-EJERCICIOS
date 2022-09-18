package PRUEBAS;

import java.util.Scanner;

public class bibliotecaCasoUno {
	
	final static int ESTANTES = 5;
	final static String FIN = "FIN";
	final static char INFANTIL = 'I';
	final static char NOVELA = 'N';
	final static char HISTORIA = 'H';
	
	private static Scanner input = new Scanner(System.in);

	public static void main(String[] args) {
		
		String nombreLibro, libroConMasPagina = null;
		int paginas, cantI=0, cantN=0, cantH=0;
		char genero;
		
		System.out.println("PROGRAMA CONTROL DE LIBROS - BIBLIOTECA");
		
		for(int i=1; i<=ESTANTES; i++) {
			System.out.println("Estante " + i + " - Ingrese nombre del libro (FIN=Final): ");
			nombreLibro = input.nextLine();
			int masPagina = Integer.MIN_VALUE;
			while (!(nombreLibro.equals(FIN))) {
				do {
					System.out.println("Ingrese genero del libro " + nombreLibro + " : ");
					genero = input.nextLine().charAt(0);
				}while ((genero != INFANTIL) && (genero != NOVELA) && (genero != HISTORIA));
				
				do {
					System.out.println("Ingrese cantidad de paginas del libro " + nombreLibro + " : ");
					paginas = Integer.parseInt(input.nextLine());
				}while (paginas <= 0);
				
				if (paginas>masPagina) {
					masPagina = paginas;
					libroConMasPagina = nombreLibro;
				}
				switch (genero) {
					case 'I': cantI++;
						break;
					case 'N': cantN++;
						break;
					case 'H': cantH++;
						break;
				}
				System.out.println("Estante " + i + " - Ingrese nombre del libro (FIN=Final): ");
				nombreLibro = input.nextLine();
			}
		
			if (masPagina != Integer.MIN_VALUE)
				System.out.println("Nombre del libro con mas paginas es " + libroConMasPagina + " con " + masPagina);
			else
				System.out.println("No se ingresaron libros");
		}
		
		System.out.println("Cantidad de libros del genero Infantil: " + cantI);
		System.out.println("Cantidad de libros del genero Novela: " + cantN);
		System.out.println("Cantidad de libros del genero Historia: " + cantH);
		System.out.println("Promedio de libros por estante: " + (float)(cantI+cantN+cantH)/ESTANTES);
		input.close();
	}
}