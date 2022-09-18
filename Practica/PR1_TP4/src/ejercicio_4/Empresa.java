package ejercicio_4;

import java.util.ArrayList;

public class Empresa {
	
	private final int PRECIO_POR_ESTACION = 50;
	private final double DTO_POR_CABECERAS = 0.20;
	
	private ArrayList<Reserva> reservas;

	public Empresa() {
		reservas = new ArrayList<Reserva>();
	}
	
	public void agregarReserva(Reserva reserva) {
		reservas.add(reserva);
	}
	
	public double recaudacionTotal() {
		double recaudacion = 0;
		int cantEstaciones, importeReserva;
		for(Reserva r: reservas) {
			cantEstaciones = r.estacionesRecorridas();
			importeReserva = r.getCantPersonas() * PRECIO_POR_ESTACION;
			if(Math.abs(importeReserva) == Estacion.values().length-1) {
				importeReserva *= (1-DTO_POR_CABECERAS);
			}
			recaudacion += importeReserva;
		}
		return recaudacion;
	}
	
	public int cantVecesRecorrida(Estacion estacion) {
		int cantidad = 0;
		for(Reserva r: reservas) {
			if(r.recorreEstacion(estacion)) {
				cantidad += r.getCantPersonas();
			}
		}
		return cantidad;
	}

}
