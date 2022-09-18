package ort.edu.ar;

import edu.ort.tp1.u5.tda.nodos.ListaOrdenadaNodos;

public class ListaOrdenadaProductosPorPrecio extends ListaOrdenadaNodos<Integer, Producto>{

	@Override
	public double compare(Producto dato1, Producto dato2) {
		return dato1.getPrecio() - dato2.getPrecio();  // SI QUIERO QUE SEA DE MAYOR A MENOR CAMBIO LA POSICION DE LOS DATOS
	}

	@Override
	public int compareByKey(Integer clave, Producto elemento) {
		return clave - elemento.getPrecio();
	}

}
