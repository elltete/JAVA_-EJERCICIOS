package ejercicio_10;

import java.util.ArrayList;

public class Comercio {
	
	private ArrayList<Facturable> historialDeOperaciones;
	
	public Comercio() {
		historialDeOperaciones = new ArrayList<Facturable>();
	}
	
	public void agregarALista(Facturable f) {
		historialDeOperaciones.add(f);
	}
	
	public double montoTotalFacturado() {
		double total = 0;
		for(Facturable f: historialDeOperaciones) {
			total += f.montoFacturado();
		}
		return total;
	}
	
	public int cantServiciosSimples() {
		int cantidad = 0;
		for(Facturable f: historialDeOperaciones) {
			if(f instanceof ServicioDeReparacion) {
				ServicioDeReparacion temp = (ServicioDeReparacion) f;
				if(temp.getDificultad() < 2) {
				cantidad++;
				}
			}
		}
		return cantidad;
	}
	
}
