package ejercicio_ejemplo_interfaces;

public class Gallina implements Corredor, Volador {

	@Override
	public void correr() {
		System.out.println("Puedo Correr - Gallina");
	}

	@Override
	public void volar() {
		System.out.println("Puedo Volar");
	}

	@Override
	public void correrRapido() {
		System.out.println("Puedo correr rapido - Gallina");
	}

	
}
