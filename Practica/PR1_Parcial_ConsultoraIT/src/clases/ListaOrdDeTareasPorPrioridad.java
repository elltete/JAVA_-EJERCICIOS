package clases;

import implementaciones.ListaOrdenadaNodos;

public class ListaOrdDeTareasPorPrioridad extends ListaOrdenadaNodos<Integer, Tarea> {

	@Override
	public int compare(Tarea dato1, Tarea dato2) {
		return dato1.calcularPrioridad().ordinal()-dato2.calcularPrioridad().ordinal();
	}

	@Override
	public int compareByKey(Integer clave, Tarea elemento) {
		return clave - elemento.calcularPrioridad().ordinal();
	}

}
