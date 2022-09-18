/**
 * 
 */
package ort.tp1.parcial1.entidades;

/**
 * Línea de un pedido, incluye el producto y la cantidad del mismo
 */
public class LineaPedido implements Mostrable {

	private Producto producto;
	private int cantidad;

	/**
	 * Constructor de la entidad
	 * 
	 * @param producto {@link Producto} contenido en la línea.
	 * @param cantidad {@link Integer} representando la cantidad de producto de la
	 *                 línea
	 */
	public LineaPedido(Producto producto, int cantidad) {
		super();
		this.setProducto(producto);
		this.setCantidad(cantidad);
	}

	/**
	 * Setter privado.
	 * 
	 * @param producto the producto to set
	 */
	private void setProducto(Producto producto) {
		this.producto = producto;
	}

	/**
	 * Setter privado
	 * 
	 * @param cantidad the cantidad to set
	 */
	private void setCantidad(int cantidad) {
		this.cantidad = cantidad;
	}

	/**
	 * Getter de {@link Producto} contenido en la línea
	 * 
	 * @return the {@link Producto}
	 */
	public Producto getProducto() {
		return producto;
	}

	/**
	 * Getter de la cantidad de producto de la línea.
	 * 
	 * @return the cantidad - {@link Integer}
	 */
	public int getCantidad() {
		return cantidad;
	}

	@Override
	public void mostrar() {
		System.out.printf(Mostrable.FORMATO_PRECIO_RENGLON_CONSOLA, this.getCantidad());
		//Llamado polimórfico para que el producto se muestre como el sabe hacerlo
		this.getProducto().mostrar();
		System.out.println();

	}

	/**
	 * Devuelve le precio de una linea de pedido
	 * 
	 * @param tipo {@link TipoPedido} para calular el precio
	 * @return {@link Float} con el precio de la línea
	 */
	public float getPrecioLineaPedido(TipoPedido tipo) {
		return this.producto.getPrecio(tipo) * this.cantidad;
	}

	/**
	 * Agraga la cantidad indicada de producto a la {@link LineaPedido}
	 * 
	 * @param cantidad {@link Integer} con la cantidad a agregar (debe ser positivo,
	 *                 si no, no agrega)
	 */
	public void adicionarCantidad(int cantidad) {
		if (cantidad >= 0) {
			this.cantidad += cantidad;
		}
	}
}
