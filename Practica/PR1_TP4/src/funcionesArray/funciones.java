package funcionesArray;

public class funciones {
	
	public int cantidadRepeticionesChar(char[] arreglo, int inicio, char valor) {
		int cantidad = 0;
		if(inicio < arreglo.length) {
			for(int i = inicio; i < arreglo.length; i++) {
				if(arreglo[i] == valor) {
					cantidad++;
				}
			}
		}
		return cantidad;
	}

}
