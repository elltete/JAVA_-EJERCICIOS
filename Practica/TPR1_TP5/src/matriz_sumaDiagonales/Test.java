package matriz_sumaDiagonales;

public class Test {

	public static void main(String[] args) {

		int[][] matriz = new int[][] {	{06,04, 8,02,12,23},
										{07,05,03,45,72,31},
										{02, 9,04,05,12,62},
										{29,21,61,15,36,28},
										{27,02,38,49,06,38},
										{11,19,17, 9,32,22}};

		procesarSumaDiagonalPrincipal(matriz);
		procesarSumaDiagonalOpuesta(matriz);
										
	}

	private static void procesarSumaDiagonalPrincipal(int[][] matriz) {
		int suma = 0;
		if(matriz.length == matriz[0].length) {
			for(int i=0; i<matriz.length; i++) {
				suma += matriz[i][i];
			}
			System.out.println("La suma de la diagonal principal es: " + suma);
		}else {
			System.out.println("Debe ingresar una matriz cuadrada.");
		}
	}
	
	private static void procesarSumaDiagonalOpuesta(int[][] matriz) {
		int suma = 0;
		if(matriz.length == matriz[0].length) {
			for(int i=0; i<matriz.length; i++) {
				suma += matriz[i][matriz.length-1-i];
			}
			System.out.println("La suma de la diagonal opuesta es: " + suma);
		}else {
			System.out.println("Debe ingresar una matriz cuadrada.");
		}
	}

}
