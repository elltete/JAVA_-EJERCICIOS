package Ejercicio_08;

import java.util.ArrayList;

public class Heladera {
	private String marca;
	private ArrayList<Producto> productos;
	
	
	public Heladera(String marca) {
		this.marca = marca;
		productos = new ArrayList<>();
	}
	
	public void agregar(String nombre, int cantidad, Fecha fechaVencimiento) {
		this.productos.add(new Producto(nombre, cantidad, fechaVencimiento));
	}
	
	public void mostrar() {
		for (Producto producto: this.productos) {
			System.out.println(producto);
		}
	}

	public ArrayList<Producto> getProductos() {
		return productos;
	}
	
	
	public Ingrediente verificarStockProducto( String nombre, int cantidad ) {
		Ingrediente ingrediente = new Ingrediente(nombre, cantidad, true); 
		for (Producto producto: this.productos) {
			if (producto.getNombre().equals(nombre) && !producto.getFechaVencimiento().estaVencido()) {
				ingrediente.setCantidad(ingrediente.getCantidad() - producto.getCantidad());
			}
		}
		
		return ingrediente;
	}
}
