package Ejemplo_01;

import java.util.ArrayList;

public class Persona {
	private String nombre;
	private String numeroTelefonico;
	private ArrayList<Fecha> llamadas;

	public Persona(String nombre, String numeroTelefonico) {
		this.nombre = nombre;
		this.numeroTelefonico = numeroTelefonico;
		llamadas = new ArrayList<>();
	}

	@Override
	public String toString() {
		return "nombre=" + nombre + ", telefono=" + numeroTelefonico;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public String getNumeroTelefonico() {
		return numeroTelefonico;
	}

	public void setNumeroTelefonico(String numeroTelefonico) {
		this.numeroTelefonico = numeroTelefonico;
	}
	
	public void agregarLlamada(Fecha fecha) {
		this.llamadas.add(fecha);
	}

	public ArrayList<Fecha> getLlamadas() {
		return llamadas;
	}
	
	
}
