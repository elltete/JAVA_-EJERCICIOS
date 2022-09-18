package Ejemplo_01;

import java.util.ArrayList;

public class Agenda {
	private ArrayList<Persona> contactos;

	public Agenda() {
		contactos = new ArrayList<>();
	}
	
	public void agregarContacto(String nombre, String telefono) {
		Persona persona = this.buscar(nombre);
		if (persona != null) {
			System.out.println("El contacto " + nombre + " ya existe con el teléfono " + persona.getNumeroTelefonico());
		}
		else {
			this.contactos.add(new Persona(nombre, telefono));
		}
	}
	
	public void agregarContacto(int posicion, String nombre, String telefono) {
		this.contactos.add(posicion, new Persona(nombre, telefono));
	}
	
	public int cantidadContactos() {
		return this.contactos.size();
	}
	
	
	public void mostrarForTradicional() {
		for (int i=0; i<this.cantidadContactos(); i++) {
			System.out.println(contactos.get(i));
		}
	}
	
	public void mostrar() {
		System.out.println("\nListado de contactos\n");
		for (Persona persona: this.contactos) {
			System.out.println(persona);
		}
	}
	
	public void borrar(int posicion) {
		this.contactos.remove(posicion);
	}
	
	public void borrar (String nombre) {
		Persona persona = this.buscar(nombre);
		
		if (persona == null) {
			System.out.println(nombre + " no encontrado");
		}
		else {
			this.contactos.remove(this.buscar(nombre));
			System.out.println(nombre + " borrado");
		}
	}
	
	public Persona buscar ( String nombre ) {
		Persona persona = null;
		int index = 0;
		
		while (persona == null && index < this.cantidadContactos()) {
			if (this.contactos.get(index).getNombre().equals(nombre)) {
				persona = this.contactos.get(index);
			}
			index++;
		}
			
		return persona;
	}
	
	public void reempazar (int index, Persona persona) {
		System.out.println("\nReemplazando a " + this.contactos.get(index) + " por " + persona + "\n");
		this.contactos.set(index, persona);
	}
	
	public void reemplazarTelefono (String nombre, String telefono) {
		Persona persona = this.buscar(nombre);
		
		System.out.println("Reemplazando a " + nombre + " con el telefono " + telefono);
		if ( persona == null ) {
			System.out.println(nombre + " no encontrado");
		}
		else {
			persona.setNumeroTelefonico(telefono);
		}
	}
	
	public void llamar(String nombre, Fecha fecha) {
		Persona persona = this.buscar(nombre);
		
		if ( persona != null ) {
			persona.agregarLlamada(fecha);
		}	
	}
	
	public void mostrarLlamadas(String nombre) {
		Persona persona = this.buscar(nombre);
		
		if ( persona != null ) {
			System.out.println("\nListado de llamadas realizadas a " + nombre);
			for (Fecha fecha: persona.getLlamadas()) {
				System.out.println(fecha);
			}
		}
	}
	
}
