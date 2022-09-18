package ejercicio_ejemplo_polimorfismo;

public class Padre {
	
	private String nombre;

	public Padre(String nombre) {
		this.nombre = nombre;
	}
	
	public void decirHola() {
		System.out.println(nombre + " esta diciendo hola de la clase padre");
	}

}
