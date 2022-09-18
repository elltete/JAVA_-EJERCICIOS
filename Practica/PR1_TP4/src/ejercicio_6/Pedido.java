package ejercicio_6;

import java.util.ArrayList;

public class Pedido {

	private int idVendedor;
	private String CUIT;
	private ArrayList<Producto> productosPedidos;

	public Pedido(int idVendedor, String CUIT) {
		this.idVendedor = idVendedor;
		this.CUIT = CUIT;
		this.productosPedidos = new ArrayList<Producto>();
	}

	public double calcularMonto() {
		double monto = 0;
		for(Producto pp: productosPedidos) {
			monto += pp.getPrecio();
		}
		return monto;
	}

	public int getIdVendedor() {
		return idVendedor;
	}

	public String getCUIT() {
		return CUIT;
	}
	
	public void agregarProducto(Producto producto) {
		this.productosPedidos.add(producto);
	}
}
