package Ejercicio_11;

public class Producto {
	private String nombre;
	private Fecha fechaAlmacenamiento;
	private int cantidadDiasConiderableFresco;
	
	public Producto(String nombre, Fecha fechaAlmacenamiento, int cantidadDiasConiderableFresco) {
		this.nombre = nombre;
		this.fechaAlmacenamiento = fechaAlmacenamiento;
		this.cantidadDiasConiderableFresco = cantidadDiasConiderableFresco;
	}

	@Override
	public String toString() {
		return "Producto [nombre=" + nombre + ", fechaAlmacenamiento=" + fechaAlmacenamiento
				+ ", cantidadDiasConiderableFresco=" + cantidadDiasConiderableFresco + "]";
	}
	
	public boolean estaFresco() {
		return (Fecha.convertirEnDias(fechaAlmacenamiento) + cantidadDiasConiderableFresco) > Fecha.convertirEnDias(Fecha.fechaHoy);
	}

	public String getNombre() {
		return nombre;
	}

	
}
