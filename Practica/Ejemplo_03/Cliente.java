package Ejemplo_03;

public class Cliente {
	public String nombre;
	
	public Cliente (String nombre) {
		this.nombre = nombre;
	}

	@Override
	public String toString() {
		return "Cliente [nombre=" + nombre + "]";
	}
	
	
}
