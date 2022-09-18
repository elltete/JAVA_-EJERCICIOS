package ejercicio_6;

public class Producto {
	
	private int codigo;
	private String nombre;
	private double precio;
	
	public Producto(int codigo, String nombre, double precio) {
		this.codigo = codigo;
		this.nombre = nombre;
		this.precio = precio;
	}

	public double getPrecio() {
		return precio;
	}

}
