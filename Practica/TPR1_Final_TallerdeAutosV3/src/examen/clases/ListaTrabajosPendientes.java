package examen.clases;

import ort.tp1.tdas.implementaciones.ListaOrdenadaNodos;

public class ListaTrabajosPendientes extends ListaOrdenadaNodos<Integer, Trabajo> implements Reportable{

	@Override
	public int compare(Trabajo dato1, Trabajo dato2) {
		return (int) (dato1.getService().getHoras() - dato2.getService().getHoras());
	}

	@Override
	public int compareByKey(Integer clave, Trabajo elemento) {
		return (int) (clave - elemento.getService().getHoras());
	}

	@Override
	public String reportar() {
		for (Trabajo trabajo : this) {
			System.out.println(trabajo.reportar());
		}
		return null;
	}

}
