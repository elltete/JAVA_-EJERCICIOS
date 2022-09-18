package ar.edu.ort.tp1.exfinal.clases;

import edu.ort.tp1.u5.tda.nodos.ListaOrdenadaNodos;

public class ListaDeItems extends ListaOrdenadaNodos<String, Item> {

	@Override
	public double compare (Item dato1, Item dato2) {
		return dato1.getNombreDelTema().compareTo(dato2.getNombreDelTema());
	}
	
	@Override
	public int compareByKey (String clave, Item dato1) {
		return clave.compareTo(dato1.getNombreDelTema());
	}

}
