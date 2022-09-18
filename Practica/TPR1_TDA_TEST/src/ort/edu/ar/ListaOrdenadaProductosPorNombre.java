package ort.edu.ar;

import edu.ort.tp1.u5.tda.nodos.ListaOrdenadaNodos;

public class ListaOrdenadaProductosPorNombre extends ListaOrdenadaNodos<String, Producto>{

	@Override
	public double compare(Producto dato1, Producto dato2) {
		return dato1.getNombre().compareTo(dato2.getNombre());  // SI QUIERO QUE SEA DE MAYOR A MENOR CAMBIO LA POSICION DE LOS DATOS
	}

	@Override
	public int compareByKey(String clave, Producto elemento) {
		return clave.compareTo(elemento.getNombre());
	}

}
