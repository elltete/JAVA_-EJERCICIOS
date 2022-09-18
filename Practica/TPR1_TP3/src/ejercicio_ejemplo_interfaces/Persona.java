package ejercicio_ejemplo_interfaces;

public class Persona implements Corredor {

	@Override
	public void correr() {
		System.out.println("Estoy corriendo - Persona");
	}

	@Override
	public void correrRapido() {
		System.out.println("Estoy corriendo rapido - Persona");
	}
	

}
