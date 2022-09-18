package ar.edu.ort.tp1.final3.clases;

public class Compra {

	private static int cantidadCompras;
	private int id;

	private double precio;
	private Cliente cliente;
	private boolean descuento;

	public Compra(double precio, Cliente cliente, boolean descuento) {
		this.precio = precio;
		this.cliente = cliente;
		this.descuento = descuento;
		this.id = cantidadCompras;
		cantidadCompras = cantidadCompras + 1;
	}

	public void mostrarTicket() {
		System.out.println("Cliente: " + cliente.getNombre() + ", precio: $" + precio + ", descuento: " + descuento);
	}

	public static int getCantidadCompras() {
		return cantidadCompras;
	}

	public static void setCantidadCompras(int cantidadCompras) {
		Compra.cantidadCompras = cantidadCompras;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public double getPrecio() {
		return precio;
	}

	public void setPrecio(double precio) {
		this.precio = precio;
	}

	public Cliente getCliente() {
		return cliente;
	}

	public void setCliente(Cliente cliente) {
		this.cliente = cliente;
	}

	public boolean isDescuento() {
		return descuento;
	}

	public void setDescuento(boolean descuento) {
		this.descuento = descuento;
	}

}
