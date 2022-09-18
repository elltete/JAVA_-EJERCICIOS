package ejercicio_4;

import java.util.ArrayList;

public class Vivienda {

	private Direccion direccion;
	private ArrayList<Persona> personas;
	private ArrayList<Mueble> muebles;
	
	public Vivienda(Direccion direccion) {
		this.direccion = direccion;
		this.personas = new ArrayList<Persona>();
		this.muebles = new ArrayList<Mueble>();
	}
	
	public void mostraDatos() {
		System.out.println("* Datos de la Vivienda *");
		System.out.println("Direccion: " + this.direccion.getValor());
		System.out.println("* Personas *");
		for(Persona per: personas) {
			System.out.println(per.getValor());
		}
		System.out.println("* Muebles *");
		for(Mueble mue: muebles) {
			System.out.println(mue.getValor());
		}
	}
	
	public void agregarPersona(Persona persona) {
		personas.add(persona);
	}
	
	public void agregarMueble(Mueble mueble) {
		muebles.add(mueble);
	}	
	
	public boolean estaOcupada() {
		return personas.size() > 0;
	}

	public Direccion getDireccion() {
		return direccion;
	}
	
	public void mudarseA(Vivienda vivNueva) {
		while(personas.size()!=0) {
			vivNueva.agregarPersona(personas.remove(0));
		}
		while(muebles.size()!=0) {
			vivNueva.agregarMueble(muebles.remove(0));
		}
	}	
	
}
