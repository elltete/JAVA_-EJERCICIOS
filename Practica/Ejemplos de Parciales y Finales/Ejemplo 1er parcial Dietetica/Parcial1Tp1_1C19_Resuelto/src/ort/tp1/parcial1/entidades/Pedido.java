/**
 * 
 */
package ort.tp1.parcial1.entidades;

import java.util.ArrayList;

/**
 * Clase que contiene un pedido generado.
 */
public class Pedido implements Certificable, Mostrable {

	/*
	 * Atributos que alojan la lista de productos y sus cantidades A completar
	 */
	private ArrayList<Producto> productosList;
	private ArrayList<Integer> cantidadList;

	private TipoPedido tipo;

	public Pedido(TipoPedido tipo) {
		// A completar
		this.productosList = new ArrayList<>();
		this.cantidadList = new ArrayList<>();
		this.tipo = tipo;
	}

	@Override
	public boolean isCertificadoSinTACC() {
		// A completar
		boolean certificadoSinTac = true;
		int i = 0;
		while (i < this.productosList.size() && certificadoSinTac) {
			if (this.productosList.get(i) instanceof ProductoConTacc) {
				certificadoSinTac = false;
			}
			i++;
		}
		return certificadoSinTac;
	}

	/**
	 * Permite agregar un producto al pedido
	 * 
	 * @param producto El {@link Producto} a agregar.
	 * @param cantidad La cantidadd del {@link Producto} a agregar
	 */
	public void agregarProducto(Producto producto, Integer cantidad) {

		// buscar si el producto esta sumar cantidades
//		si no esta agregarlo

		int idx = this.buscarProducto(producto);
		if (idx == -1) {
			this.productosList.add(producto);
			this.cantidadList.add(cantidad);
		} else {
			this.cantidadList.set(idx, this.cantidadList.get(idx) + cantidad);
		}
	}

	/**
	 * Saca un producto del pedido.
	 * 
	 * @param producto El {@link Producto} a sacar del pedido
	 * @param cantidad Cantidad del {@link Producto} a sacar del pedido
	 */
	public void sacarProducto(Producto producto, int cantidadASacar) {
//Completar
		int saldo = 0;
		int idx = this.buscarProducto(producto);
		if (idx != -1) {
			int cantidad = this.cantidadProducto(producto);
			if (cantidadASacar < cantidad) {
				saldo = cantidad - cantidadASacar;
			}
			if (saldo == 0) {
				this.cantidadList.remove(idx);
				this.productosList.remove(idx);
			} else {
				this.cantidadList.set(idx, cantidad);
			}
		}
	}

	/**
	 * Devuelve el indice del producto buscado en la lista.
	 * 
	 * @param p {@link Producto}
	 * @return El indice >= 0 si encuentra el producto y - si no lo encuentra
	 */
	private int buscarProducto(Producto p) {
//completar
		int idx = -1;
		int i = 0;
		while (i < this.productosList.size() && idx == -1) {

			// Esto se podría haber resuelto invocando el método .equals(Object o) del
			// producto de haber estado implementado
//			Lo mismo, podría haberse usado el metodo List.contains(Object o) 
//			para verificar la existencia en la lista del producto, 
//			pero también requiere tener implementado el método equals
			if (this.productosList.get(i).getNombre().equals(p.getNombre())
					&& this.productosList.get(i).getFamiliaProducto().equals(p.getFamiliaProducto())) {
				idx = i;
			}
			i++;
		}

		return idx;
	}

	/**
	 * Indica la cantidad del producto dado.
	 * 
	 * @param producto {@link Producto} cuya cantidad se desea averiguar
	 * @return {@link Integer} conteniendo la cantidad del producto en el pedido
	 */
	private int cantidadProducto(Producto producto) {

		int idx = this.buscarProducto(producto);

		return idx == -1 ? idx : this.cantidadList.get(idx);
	}

	/**
	 * Devuelve una estructura conteniendo las lineas del pedido
	 * 
	 * @return un la estructura conteniendo {@link LineaPedido}s
	 */
	private LineaPedido[] getTablaProductosPedidos() {
//Completar
		LineaPedido[] lista = new LineaPedido[this.cantidadList.size()];

		for (int i = 0; i < productosList.size(); i++) {
			lista[i] = new LineaPedido(productosList.get(i), cantidadList.get(i));
		}

		return lista;
	}

	/**
	 * // * Calcula el importe del pedido
	 * 
	 * @return {@link Float} conteniendo el importe del pedido
	 */
	private float calcularImportePedido() {

		// Completar
		float importe = 0;
		for (int i = 0; i < this.getTablaProductosPedidos().length; i++) {
			importe += this.getTablaProductosPedidos()[i].getPrecioLineaPedido(tipo);
		}
		return importe;
	}

	/**
	 * Debe mostrar los productos y sus cantidades en forma de tabla e indicar si el
	 * pedido está certificado como libre de tacc (todos sus productos son sin TACC)
	 * debe utilizar el metodo
	 */
	@Override
	public void mostrar() {
		// Muestro la tabla de productos y sus cantidades
//		System.out
//				.println("Cantidad \t\t Nombre\\t\tTipo De Producto\tPrecio Unitario\tTipo De Producto\tCertificadora ");
		System.out.printf(Mostrable.FORMATO_ENCABEZADO_CONSOLA, "Cantidad", "Nombre", "Tipo De Producto",
				"Precio Unitario", "Tipo De Producto", "tCertificadora");
		for (LineaPedido lp : this.getTablaProductosPedidos()) {
//			La linea del pedido sabe como mostrarse
			lp.mostrar();
		}
		System.out.println("----------------------------------------------------------");
		// Muestro si es certificado o no
		if (this.isCertificadoSinTACC()) {
			System.out.println("El pedido es certificado sin TACC");
		} else {
			System.out.println("El pedido NO es certificado sin TACC");
		}
		System.out.println("----------------------------------------------------------");
		// Muestro el precio total
		System.out.printf("El precio total del pedido es: $ %5.2f\n", this.calcularImportePedido());
	}
}
