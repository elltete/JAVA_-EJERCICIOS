package ejercicios_opcionales;

public class UtilArrays {

	public static void mostrarSinRepetidos(char[] elementos) {
		for(int i = 0; i < elementos.length; i++) {
			if(!estaRepetido(elementos, i, elementos[i])) {
				System.out.println(elementos[i]);
			}
		}

	}
	
	private static boolean estaRepetido(char[] arreglo, int posicion, char valor) {
		boolean repetido = false;
		int i = 0;
		while(i < posicion && !repetido) {
			if(arreglo[posicion-1] == valor) {
				repetido = true;
			} else {
				posicion--; 
			}
		}
		return repetido;
	}
	
	private static int cantidadRepeticiones(char[] arreglo, int inicio, char valor) {
		int cantidad = 0;
		for(int i = inicio; i < arreglo.length; i++) {
			if(arreglo[i] == valor) {
				cantidad++;
			}
		}
		return cantidad;
	}
	
	public static boolean esPalindromo(char[] arreglo) {
		boolean respuesta = true;
		int inicio = 0;
		int fin = arreglo.length-1;
		while(inicio <= fin && respuesta) {
			if(arreglo[inicio] == arreglo[fin]) {
				inicio++;
				fin--;
			} else {
				respuesta = false;
			}
		}
		return respuesta;
	}
	
	public static void invertir(char[] arreglo) {
		char aux;
		int inicio = 0;
		int fin = arreglo.length-1;
		while(inicio <= fin) {
			aux = arreglo[inicio];
			arreglo[inicio] = arreglo[fin];
			arreglo[fin] = aux;
			inicio++;
			fin--;
		}
		imprimir(arreglo);
	}
	
	private static void imprimir(char[] arreglo) {
		for(int i = 0; i < arreglo.length; i++) {
			System.out.print(arreglo[i]);
		}
	}
}
