/**
 * 
 */
package ort.tp1.parcial1.entidades;

/**
 * Un producto
 */
public abstract class Producto implements Mostrable {

	/**
	 * Atributos, Completar
	 */
	private static final float DESCUENTO_POR_MAYOR = 0.9f;
	private FamiliaProducto familiaProducto;
	private String nombre;
	private float precio;

	/**
	 * Constructor del pedido, recibe sus atributos como parámetro
	 * 
	 * @param familiaProducto {@link FamiliaProducto}
	 * @param nombre          {@link String} con el nombre
	 * @param precio          {@link Float} con su precio
	 */
	public Producto(FamiliaProducto familiaProducto, String nombre, float precio) {
		// completar
		this.setFamiliaProducto(familiaProducto);
		this.setNombre(nombre);
		this.setPrecio(precio);
	}

	public float getPrecio(TipoPedido tipoPedido) {

		// Completar
		float precio = Float.MAX_VALUE;

		switch (tipoPedido) {
		case POR_MAYOR:
			precio = this.precio * Producto.DESCUENTO_POR_MAYOR;
			break;

		case POR_MENOR:
			precio = this.precio;
			break;
		}

		return precio;
	}

	/**
	 * @param familiaProducto the familiaProducto to set
	 */
	private void setFamiliaProducto(FamiliaProducto familiaProducto) {
		this.familiaProducto = familiaProducto;
	}

	/**
	 * @param nombre the nombre to set
	 */
	private void setNombre(String nombre) {
		this.nombre = nombre;
	}

	/**
	 * @param precio the precio to set
	 */
	private void setPrecio(float precio) {
		this.precio = precio;
	}

	/**
	 * @return the familiaProducto
	 */
	public FamiliaProducto getFamiliaProducto() {
		return familiaProducto;
	}

	/**
	 * @return the nombre
	 */
	public String getNombre() {
		return nombre;
	}

	/**
	 * @return the precio
	 */
	public float getPrecio() {
		return precio;
	}

}
