package ejercicio_1;

import implementaciones.PilaNodos;
import interfaces.Pila;

public class Test {

	public static void main(String[] args) {
		
		Empleado diego = new Empleado("Diego");

		Pila<Libro> pilaLibro = new PilaNodos<Libro>();
		
		pilaLibro.push(new Libro("A", 200));
		pilaLibro.push(new Libro("B", 200));
		pilaLibro.push(new Libro("C", 350));
		pilaLibro.push(new Libro("D", 200));
		pilaLibro.push(new Libro("E", 250));
		
		System.out.println(diego.paginasPromedio(pilaLibro));
		
		Pila<DVD> pilaDVD = new PilaNodos<DVD>();
		
		pilaDVD.push(new DVD("LG", false));
		pilaDVD.push(new DVD("LG", true));
		pilaDVD.push(new DVD("LG", false));
		pilaDVD.push(new DVD("LG", true));
		pilaDVD.push(new DVD("LG", true));
		
		System.out.println(diego.cantDVDsRayados(pilaDVD));
		
		diego.listarObjetos(pilaDVD);
		diego.listarObjetos(pilaLibro);
	}

}
