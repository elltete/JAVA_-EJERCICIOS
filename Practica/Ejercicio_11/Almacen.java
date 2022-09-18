package Ejercicio_11;

import java.util.ArrayList;

public class Almacen {
	private ArrayList<Producto> productos;
	private double temperatura;
	
	public Almacen() {
		productos = new ArrayList<>();
	}
	
	public void agregar (String nombre, Fecha fechaAlmacenamiento, int cantidadDiasConiderableFresco) {
		productos.add(new Producto(nombre, fechaAlmacenamiento, cantidadDiasConiderableFresco));
	}
	
	public void mostrar() {
		for (Producto producto: productos) {
			System.out.println(producto);
		}
	}
	
	public Producto buscar(String nombre) {
		Producto producto = null;
		int index = 0;
		
		while (producto == null && index < productos.size()) {
			if (productos.get(index).getNombre().equals(nombre)) {
				producto = productos.get(index);
			}
			else {
				index++;
			}
		}
		
		return producto;
	}
	
		
	public void extraerProductosVencidos (ArrayList<Producto> productosVencidos) {
		for (Producto producto: productos) {
			if (!producto.estaFresco()) {
				productosVencidos.add(producto);
			}
			
		}
	}
}
