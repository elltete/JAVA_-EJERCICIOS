package ejercicio_3;

import java.util.ArrayList;

import ejercicio_1.Persona;

public class Hito {
	
	private String fecha;
	private String descripcion;
	private ArrayList<Persona> personasHitos;
	
	public Hito(String fecha, String descripcion) {
		this.fecha = fecha;
		this.descripcion = descripcion;
		personasHitos = new ArrayList<Persona>();
	}

	public void agregarPersona(Persona persona) {
		personasHitos.add(persona);
		persona.agregarHito(this);
	}
	
	public String getValor() {
		return this.fecha + ": " + this.descripcion;
	}
}
