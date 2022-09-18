package Ejercicio_11;

import java.util.ArrayList;

public class Cheff {
	private Almacen refrigerados;
	private Almacen noRefrigerados;

	public Cheff() {
		refrigerados = new Almacen();
		noRefrigerados = new Almacen();
	}

	public void agregarProducto(String nombre, Fecha fechaAlmacenamiento, int cantidadDiasConiderableFresco,
			boolean esRefrigerado) {
		if (esRefrigerado) {
			refrigerados.agregar(nombre, fechaAlmacenamiento, cantidadDiasConiderableFresco);
		} else {
			noRefrigerados.agregar(nombre, fechaAlmacenamiento, cantidadDiasConiderableFresco);
		}
	}

	public EstadoProducto chequearProducto(String nombre, boolean esRefrigerado) {
		EstadoProducto estadoProducto = EstadoProducto.FRESCO;
		Producto producto;

		if (esRefrigerado) {
			producto = refrigerados.buscar(nombre);
		} else {
			producto = noRefrigerados.buscar(nombre);
		}

		if (producto == null) {
			estadoProducto = EstadoProducto.NO_ENCONTRADO;
		} else if (!producto.estaFresco()) {
			estadoProducto = EstadoProducto.PARA_DESCARTE;
		}

		return estadoProducto;
	}

	public void mostrarProductos() {
		System.out.println("Refrigerados");
		refrigerados.mostrar();
		System.out.println("No refrigerados");
		noRefrigerados.mostrar();
	}
	
	public ArrayList<Producto> extraerProductosVencidos() {
		ArrayList<Producto> productosVencidos = new ArrayList<>();
		
		refrigerados.extraerProductosVencidos(productosVencidos);
		noRefrigerados.extraerProductosVencidos(productosVencidos);
		
		return productosVencidos;
	}
}
