package Ejercicio_08;

public class Producto {
	private String nombre;
	private int cantidad;
	private Fecha fechaVencimiento;
	
	public Producto(String nombre, int cantidad, Fecha fechaVencimiento) {
		this.nombre = nombre;
		this.cantidad = cantidad;
		this.fechaVencimiento = fechaVencimiento;
	}

	@Override
	public String toString() {
		return "Producto [nombre=" + nombre + ", cantidad=" + cantidad + ", fechaVencimiento=" + fechaVencimiento + "]";
	}

	public String getNombre() {
		return nombre;
	}

	public int getCantidad() {
		return cantidad;
	}

	public Fecha getFechaVencimiento() {
		return fechaVencimiento;
	}
	
	
}
