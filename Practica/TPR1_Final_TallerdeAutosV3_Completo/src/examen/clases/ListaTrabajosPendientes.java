package examen.clases;

import ort.tp1.tdas.implementaciones.ListaOrdenadaNodos;

public class ListaTrabajosPendientes extends ListaOrdenadaNodos<Integer, Trabajo> implements Reportable {

	@Override
	public int compare(Trabajo dato1, Trabajo dato2) {
		return dato1.getCodigo() - dato2.getCodigo();
	}

	@Override
	public int compareByKey(Integer codigo, Trabajo dato) {
		return codigo - dato.getCodigo();
	}

	@Override
	public String reportar() {
		for (Trabajo trabajo : this) {
			System.out.println(trabajo.reportar());
		}
		return null;
	}
}
