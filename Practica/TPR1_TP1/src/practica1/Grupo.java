package practica1;

import java.util.ArrayList;

public class Grupo {

	private String nombreDelGrupo;
	private ArrayList<String> integrantes;

	public Grupo(String nombreDelGrupo) {
		this.nombreDelGrupo = nombreDelGrupo;
		integrantes = new ArrayList<String>();
	}

	public String getNombre() {
		return this.nombreDelGrupo;
	}

	private void setNombre(String nombreDelGrupo) {
		this.nombreDelGrupo = nombreDelGrupo;
	}

	public void modificarNombre(String string) {
		this.setNombre(string);
	}

	public int getCantidadIntegrantes() {
		return integrantes.size();
	}

	public void agregarIntegrante(String nombreIntegrante) {
		if (buscarIntegrante(nombreIntegrante) == null) {
			integrantes.add(nombreIntegrante);
		}
	}

	public String buscarIntegrante(String nombreIntegrante) {
		String respuesta = null;
		int i=0;
		while (i<integrantes.size() && respuesta == null) {
			if(integrantes.get(i).equals(nombreIntegrante)) {
				respuesta = nombreIntegrante;
			} else {
				i++;
			}
		}
		return respuesta;
	}

	private int obtenerPosicionIntegrante(String nombreIntegrante) {
		int respuesta = -1;
		int i=0;
		while (i<integrantes.size() && respuesta == -1) {
			if(integrantes.get(i).equals(nombreIntegrante)) {
				respuesta = i;
			} else {
				i++;
			}
		}
		return respuesta;
	}

	public String obtenerIntegrante(int posicion) {
		String respuesta = null;
		if(posicion > 0 && posicion <= this.integrantes.size() ) {
			respuesta = integrantes.get(posicion-1);
		}
		return respuesta;
	}

	public String removerIntegrante(String nombreIntegrante) {
		String respuesta = null;
		int posicion = obtenerPosicionIntegrante(nombreIntegrante);
		if(posicion != -1) {
			respuesta = integrantes.remove(posicion);
		}
		return respuesta;
	}

	private void mostrarIntegrantes() {
		int size = this.integrantes.size();
		if (size == 0 ) {
			System.out.println("Lista de integrantes vacia");
		} else {
			System.out.println("Cantidad de integantes: " + this.integrantes.size());
			System.out.println(integrantes);
		}
	}
	
	public void mostrar() {
		System.out.println("Nombre del Grupo: " + getNombre());
		mostrarIntegrantes();
	}
	
	public void vaciar() {
		this.integrantes.clear();
	}

	@Override
	public String toString() {
		return "Grupo [integrantes=" + integrantes + "]";
	}
}
