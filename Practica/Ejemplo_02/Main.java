package Ejemplo_02;

import java.util.ArrayList;

public class Main {

	public static void main(String[] args) {
		ArrayList<Persona> personas = new ArrayList<>();
		personas.add(new Persona("p1"));
		personas.add(new Persona("p2"));
		personas.add(new Persona("p3"));
		personas.add(new Persona("p4"));
		
		
		//int cantidad = personas.size();
		
		/*
		for (int i=0; 0<personas.size(); i++ ) {
			System.out.println("Borrando " + personas.get(0).nombre + " size " + personas.size());
			personas.remove(0);	
			System.out.println("i=" + i + " size=" + personas.size());
		}
		*/
		
		while (personas.size()>0) {
			System.out.println("Borrando " + personas.get(0).nombre + " size " + personas.size());
			personas.remove(0);	
		}
		
		
		
		for (Persona persona: personas) {
			System.out.println(persona);
		}
		
		
		
	}

}
