package ar.edu.ort.tp1.final2.clases;

import edu.ort.tp1.u5.tda.Cola;
import edu.ort.tp1.u5.tda.nodos.ColaNodos;

public abstract class Buzo implements BuceoProfundo, Bitacorado<Buceo> {

	private static final String NOMBRE_INVALIDO = "Nombre invalido";
	private static final String NACIONALIDAD_INVALIDA = "Nacionalidad invalida";
	private static final String EDAD_INVALIDA = "Un buzo no puede ser menor de edad";
	private static final int EDAD_MINIMA = 18;
	private String nombre;
	private String nacionalidad;
	private int edad;
	private Cola<Buceo> bitacora;

	public Buzo(String nombre, String nacionalidad, int edad) {
		this.setEdad(edad);
		this.setNacionalidad(nacionalidad);
		this.setNombre(nombre);
		bitacora = new ColaNodos<Buceo>();
	}
	
	private void setNombre(String nombre) {
		if (nombre == null || nombre.isEmpty()) {
			throw new IllegalArgumentException(NOMBRE_INVALIDO);
		}
		this.nombre = nombre;
	}

	private void setNacionalidad(String nacionalidad) {
		if (nacionalidad == null || nacionalidad.isEmpty()) {
			throw new IllegalArgumentException(NACIONALIDAD_INVALIDA);
		}
		this.nacionalidad = nacionalidad;
	}

	private void setEdad(int edad) {
		if (edad < EDAD_MINIMA) {
			throw new IllegalArgumentException(EDAD_INVALIDA);
		}
		this.edad = edad;
	}

	public String getNombre() {
		return nombre;
	}

	public String getNacionalidad() {
		return nacionalidad;
	}

	public int getEdad() {
		return edad;
	}

	@Override
	public String toString() {
		return "Buzo [nombre=" + nombre + ", nacionalidad=" + nacionalidad + ", edad=" + edad + "]";
	}

	@Override
	public int cantidadDeEventos() {
		int contador = 0;
		Buceo centinela = null;
		bitacora.add(centinela);
		Buceo aux = bitacora.remove();
		while(aux != centinela) {
			bitacora.add(aux);
			contador++;
			aux = bitacora.remove();			
		}
		return contador;
	}

	public abstract boolean habilitado(int metros);

	@Override
	public void agregarABitacora(Buceo buceo) {
		bitacora.add(buceo);
	}
}
