/**
 * 
 */
package ort.tp1.parcial1.entidades;

/**
 * Representa un producto con tacc que puede estar en un pedido
 */
public class ProductoConTacc extends Producto {

	private static final String NOMBRE_MOSTRABLE = "Producto Con TACC";

	/**
	 * Constructor del {@link ProductoConTacc}
	 * 
	 * @param familiaProducto {@link FamiliaProducto} a la que pertenece el
	 *                        producto.
	 * @param nombre          {@link String} con el nombre del producto
	 * @param precio          {@link Float} con su precio unitario
	 */
	public ProductoConTacc(FamiliaProducto familiaProducto, String nombre, float precio) {
		super(familiaProducto, nombre, precio);
	}

	@Override
	public void mostrar() {
		System.out.printf(Mostrable.FORMATO_RENGLON_CONSOLA, getNombre(), getFamiliaProducto(), getPrecio(),
				ProductoConTacc.NOMBRE_MOSTRABLE);
	}

}
