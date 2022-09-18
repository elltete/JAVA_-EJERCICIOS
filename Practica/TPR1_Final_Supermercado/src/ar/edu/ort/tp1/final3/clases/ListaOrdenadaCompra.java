package ar.edu.ort.tp1.final3.clases;

import edu.ort.tp1.u5.tda.nodos.ListaOrdenadaNodos;

public class ListaOrdenadaCompra extends ListaOrdenadaNodos<Double, Compra> {

	@Override
	public double compare(Compra dato1, Compra dato2) {
		return dato1.getPrecio()-dato2.getPrecio();
	}

	@Override
	public int compareByKey(Double clave, Compra elemento) {
		return (int) (clave - elemento.getPrecio());
	}

}
