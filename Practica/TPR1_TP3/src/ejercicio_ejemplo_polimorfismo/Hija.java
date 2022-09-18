package ejercicio_ejemplo_polimorfismo;

public class Hija extends Padre{

	private int edad;
	
	public Hija(String nombre, int edad) {
		super(nombre);
		this.edad=edad;
	}

	public void mostrarEdad() {
		System.out.println("Mi edad es " + this.edad);
	}
	
	public void decirHola() {
		System.out.println(" esta diciendo hola de la clase hija");
	}
	
	
}
