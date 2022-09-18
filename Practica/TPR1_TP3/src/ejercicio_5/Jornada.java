package ejercicio_5;

import java.util.ArrayList;

public class Jornada {
	
	private ArrayList<Partido> Partidos;
	private int fecha;//1,2...n

	public Jornada() {
		// Completar
	}
	
	public Jornada(int fecha) {
		// Completar
	}
	
	public void agregarPartido(Partido partido) {
		// Completar
	}
	
	public void eliminarPartido(Partido partido) {
		// Completar
	}
	
	public ArrayList<Partido> getPartidos() {
		return new ArrayList<Partido>();
	}

	public int getFecha() {
		return fecha;
	}

	public void setFecha(int fecha) {
		this.fecha = fecha;
	}
}