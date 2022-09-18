package ejercicio_4;

public class Mueble {
	
	private String nombre;
	private String material;
	private String color;
	
	public Mueble(String nombre, String material, String color) {
		this.nombre = nombre;
		this.material = material;
		this.color = color;
	}
	
	public String getValor() {
		return this.nombre + " de " + this.material + " de color " + this.color;
	}

}
