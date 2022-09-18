package Ejercicio_08;

public class Ingrediente {
	private String producto;
	private int cantidad;
	private boolean esRefrigerado;
	
	public Ingrediente(String producto, int cantidad, boolean esRefrigerado) {
		this.producto = producto;
		this.cantidad = cantidad;
		this.esRefrigerado = esRefrigerado;
	}

	@Override
	public String toString() {
		return "Ingrediente [producto=" + producto + ", cantidad=" + cantidad + ", esRefrigerado=" + esRefrigerado
				+ "]";
	}

	public String getProducto() {
		return producto;
	}

	public int getCantidad() {
		return cantidad;
	}

	public boolean isEsRefrigerado() {
		return esRefrigerado;
	}

	public void setCantidad(int cantidad) {
		this.cantidad = cantidad;
	}
	
	
}
