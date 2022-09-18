package ejercicio_ejemplo_interfaces;

public class Perro implements Corredor {
	
	@Override
	public void correr() {
		System.out.println("Estoy corriendo con mis patitas");
	}

	@Override
	public void correrRapido() {
		System.out.println("Estoy corriendo rapido con mis patitas");
	}

}
