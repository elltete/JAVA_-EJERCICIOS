package cuadroMagico;

public class Test {

	public static void main(String[] args) {

		int[][] matriz = new int[][] {	{6,1,8},
										{7,5,3},
										{2,9,4}};

			System.out.println(esCuadroMagico(matriz));
	}

	private static boolean esCuadroMagico(int[][] matriz) {
		boolean resultado = false;
		int suma = 0;
		if(matriz.length == 3 && matriz[0].length == 3) {
			suma = matriz[0][0] + matriz[0][1] + matriz[0][2];
			resultado =(((matriz[1][0] + matriz[1][1] + matriz[1][2]) == suma) &&
					((matriz[2][0] + matriz[2][1] + matriz[2][2]) == suma) &&
					((matriz[0][0] + matriz[1][0] + matriz[2][0]) == suma) &&
					((matriz[0][1] + matriz[1][1] + matriz[2][1]) == suma) &&
					((matriz[0][2] + matriz[1][2] + matriz[2][2]) == suma) &&
					((matriz[0][0] + matriz[1][1] + matriz[2][2]) == suma) &&
					((matriz[0][2] + matriz[1][1] + matriz[2][0]) == suma));
		}else {
			System.out.println("Debe ingresar una matriz de 3x3");
		}
		return resultado;
	}

}
