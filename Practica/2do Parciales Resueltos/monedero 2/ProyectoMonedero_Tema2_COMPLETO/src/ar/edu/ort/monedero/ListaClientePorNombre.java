package ar.edu.ort.monedero;

import edu.ort.tp1.u5.tda.nodos.ListaOrdenadaNodos;

public class ListaClientePorNombre extends ListaOrdenadaNodos<String, Cliente> {

	@Override
	public int compare(Cliente dato1, Cliente dato2) {
		return dato1.getNombre().compareTo(dato2.getNombre());
	}

	@Override
	public int compareByKey(String clave, Cliente elemento) {
		return clave.compareTo(elemento.getNombre());
	}

}
