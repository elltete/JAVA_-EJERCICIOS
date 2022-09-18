package ejercicio_ejemplo_interfaces;

import java.util.ArrayList;

public class Accion {
	
	private ArrayList<Corredor> corredores; 
	
	public Accion() {
		corredores = new ArrayList<Corredor>(); 
	}
	
	public void agregarCorredor(Corredor c) {
		this.corredores.add(c);
	}

	public void correr() {
		for(Corredor c: corredores) {
			c.correr();
		}
	}
		
	public void correrRapido() {
		for(Corredor c: corredores) {
			c.correrRapido();
		}	
	}
	
}
