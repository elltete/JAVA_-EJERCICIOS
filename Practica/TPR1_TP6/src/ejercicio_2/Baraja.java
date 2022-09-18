package ejercicio_2;

import java.util.ArrayList;
import implementaciones.PilaNodos;
import interfaces.Cola;
import interfaces.Pila;

public abstract class Baraja {

	protected Pila<Naipe> naipes;

	public Baraja(boolean mezclado) {
		naipes = new PilaNodos<Naipe>();
		cargarNaipes();
		if (mezclado) {
			mezclar();
		}
	}

	public void agregar(ArrayList<Naipe> nuevosNaipes) {
		while (!nuevosNaipes.isEmpty()) {
			naipes.push(nuevosNaipes.remove(0));			
		}
	}

	public void agregar(Cola<Naipe> nuevosNaipes) {
		while (!nuevosNaipes.isEmpty()) {
			naipes.push(nuevosNaipes.remove());			
		}
	}

	public void agregar(Naipe naipe) {
		naipes.push(naipe);
	}

	public void agregar(Pila<Naipe> nuevosNaipes) {
		while (!nuevosNaipes.isEmpty()) {
			naipes.push(nuevosNaipes.pop());			
		}
	}

	protected abstract void cargarNaipes();

	public Naipe extraer() {
		return naipes.pop();
	}

	public Cola<Naipe> extraer(int cuantos) {
		// TODO IMPLEMENTAR
		
		
		return null;
	}

	public int getCantidadNaipes() {
		return naipes.size();
	}

	/**
	 * Explicar aca que hace y como funciona
	 */
	protected void mezclar() {                   //El metodo Mezclar
		Urna<Naipe> mezclador = new Urna<>();    //Genera una Urna para mezclar las cartas
		while (!naipes.isEmpty()) {              //En un ciclo..
			mezclador.add(naipes.pop());         //Agrega todos los naipes del mazo a la Urna
		}
		while (!mezclador.isEmpty()) {			 //En un ciclo..
			naipes.push(mezclador.remove());     //Se pasan los naipes de la Urna la mazo
												 //El metodo remove de Urna, toma al azar un naipe
												 //De esta manera el metodo cumple la funcion de mezclar
		}
	}
}