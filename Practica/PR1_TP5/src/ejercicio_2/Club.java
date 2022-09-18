package ejercicio_2;

import implementaciones.PilaNodos;
import interfaces.Pila;

public class Club {
	
	
	public boolean esTuboUsado(Pila<Pelota> tubo) {
		boolean esUsado = false;
		int cant = 0;
		Pila<Pelota> tuboAux = new PilaNodos<Pelota>();
		while(!tubo.isEmpty() && !esUsado) {
			Pelota pelota = tubo.pop();
			if(pelota.getCantDeUsos() != 0) {
				esUsado = true;
			}
			tuboAux.push(pelota);
			cant++;
		}
		volverAOriginal(tuboAux,tubo);
		return (cant != 3 && esUsado);
	}
	
	private void volverAOriginal(Pila pilaAux, Pila pilaOriginal) {
		while(!pilaAux.isEmpty()) {
			pilaOriginal.push(pilaAux.pop());
		}
	}
	
}
