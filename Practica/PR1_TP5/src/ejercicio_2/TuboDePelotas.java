package ejercicio_2;

import implementaciones.PilaNodos;
import interfaces.Pila;

public class TuboDePelotas {

	private Pila<Pelota> tubo;

	public TuboDePelotas() {
		tubo = new PilaNodos<Pelota>();
	}
	
	public TuboDePelotas(Pelota pelota1) {
		tubo = new PilaNodos<Pelota>();
		tubo.push(pelota1);
	}
	
	public TuboDePelotas(Pelota pelota1, Pelota pelota2) {
		tubo = new PilaNodos<Pelota>();
		tubo.push(pelota1);
		tubo.push(pelota2);
	}
	
	public TuboDePelotas(Pelota pelota1, Pelota pelota2, Pelota pelota3) {
		tubo = new PilaNodos<Pelota>();
		tubo.push(pelota1);
		tubo.push(pelota2);
		tubo.push(pelota3);
	}
	
	public Pila<Pelota> getTubo() {
		return tubo;
	}
	
}
