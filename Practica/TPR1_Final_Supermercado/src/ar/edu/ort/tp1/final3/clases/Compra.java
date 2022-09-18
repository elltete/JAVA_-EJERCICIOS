package ar.edu.ort.tp1.final3.clases;

public class Compra {

	private static int cantidadCompras;
	private int id;
	private double precio;
	private Cliente cliente;
	private boolean descuento;

	public Compra(double precio, Cliente cliente, boolean descuento) {
		this.id = cantidadCompras++;
		this.cliente = cliente;
		this.descuento = descuento;
		this.precio = precio;
	}

	public int getId() {
		return id;
	}

	public double getPrecio() {
		return precio;
	}

	public Cliente getCliente() {
		return cliente;
	}

	public boolean isDescuento() {
		return descuento;
	}
	
	


}
