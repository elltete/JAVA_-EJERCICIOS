package ejercicio_12;

import java.util.ArrayList;

public class LenguajeProgramacion extends Fuente implements Calificable {

	private ArrayList<Metodo> conjuntoMetodos;
	
	public LenguajeProgramacion(String nombre, String ubicacion) {
		super(nombre, ubicacion);
		conjuntoMetodos = new ArrayList<Metodo>();
	}
	
	public void agregarMetodo(Metodo metodo) {
		conjuntoMetodos.add(metodo);
	}

	@Override
	public double indiceCalidad() {
		double promedio = 0;
		double sumaIndice = 0;
		for(Metodo m: conjuntoMetodos) {
			sumaIndice =+ m.indiceCalidad();
		}
		if (conjuntoMetodos.size() != 0) {
			promedio = sumaIndice/conjuntoMetodos.size();
		}
		return promedio;
	}
	
	public Metodo devuelveMetodo(String nombreMetodo) {
		int i = 0;
		Metodo metodoRespuesta = null;
		while (i<conjuntoMetodos.size() && metodoRespuesta == null) {
			if(conjuntoMetodos.get(i).getNombre().equals(nombreMetodo)) {
				metodoRespuesta = conjuntoMetodos.get(i);
			} else {
				i++;
			}
		}
		return metodoRespuesta;
	}
	
}
