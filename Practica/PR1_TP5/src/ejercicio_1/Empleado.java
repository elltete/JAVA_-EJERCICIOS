package ejercicio_1;

import implementaciones.PilaNodos;
import interfaces.Pila;

public class Empleado {
	
	private String nombre;

	public Empleado(String nombre) {
		this.nombre = nombre;
	}

	public String getNombre() {
		return nombre;
	}

	@Override
	public String toString() {
		return "Empleado [nombre=" + nombre + "]";
	}
	
	public int cantDVDsRayados(Pila<DVD> pilaDVD) {
		Pila pilaAux = new PilaNodos<>();
		int cont = 0;
		while(!pilaDVD.isEmpty()) {
			DVD dvd = pilaDVD.pop();
			pilaAux.push(dvd);
			if(dvd.isEstaRayado()) {
				cont++;	
			}
		}
		volverAOriginal(pilaAux, pilaDVD);
		return cont;
	}
	
	public double paginasPromedio(Pila<Libro> pilaLibro) {
		Pila pilaAux = new PilaNodos<>();
		int cantLibros = 0, cantPaginas = 0;
		double retorno;
		while(!pilaLibro.isEmpty()) {
			Libro libro = pilaLibro.pop();
			cantPaginas+=libro.getPaginas();		
			pilaAux.push(libro);
			cantLibros++;
		}
		volverAOriginal(pilaAux, pilaLibro);
		return (cantLibros != 0) ? cantPaginas/cantLibros : 0.0;
	}
	
	public void listarObjetos(Pila pila) {
		while(!pila.isEmpty()) {
			System.out.println(pila.pop());
		}
	}
	
	private void volverAOriginal(Pila pilaAux, Pila pilaOriginal) {
		while(!pilaAux.isEmpty()) {
			pilaOriginal.push(pilaAux.pop());
		}
	}
}
