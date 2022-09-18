package ejercicio_1;

import implementaciones.ListaOrdenadaNodos;

public class TuboOrdenadoPorUso extends ListaOrdenadaNodos<Integer, PelotaDeTenis> {

	@Override
	public int compare(PelotaDeTenis pelota1, PelotaDeTenis pelota2) {
		return pelota1.getUsos() - pelota2.getUsos();
	}

	@Override
	public int compareByKey(Integer clave, PelotaDeTenis pelota) {
		return clave - pelota.getUsos();
	}

	
	
}
