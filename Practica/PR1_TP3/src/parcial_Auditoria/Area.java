package parcial_Auditoria;

import java.util.ArrayList;

public class Area {
	
	private String nombre;
	private int cantEmpleados;
	private Responsable responsable;
	private ArrayList<Observacion> observaciones;
	
	public Area(String nombre, int cantEmpleados, Responsable responsable) {
		this.nombre = nombre;
		this.cantEmpleados = cantEmpleados;
		this.responsable = responsable;
		this.observaciones = new ArrayList<Observacion>();
	}
	
	public void agregarObservacion(Observacion obs) {
		this.observaciones.add(obs);
	}
	
	public int obtenerCantObservacionesInternas() {
		int cantidad = 0;
		for(Observacion obs: observaciones) {
			if(obs instanceof ObservacionInterna) {
				cantidad++;
			}
		}
		return cantidad;
	}
	
	public ArrayList<Observacion> obtenerObservacionesVencidas(){
		ArrayList<Observacion> listado = new ArrayList<Observacion>();
		for(Observacion obs: observaciones) {
			if(obs.estaVencida()) {
				listado.add(obs);
			}
		}
		return listado;
	}

}
