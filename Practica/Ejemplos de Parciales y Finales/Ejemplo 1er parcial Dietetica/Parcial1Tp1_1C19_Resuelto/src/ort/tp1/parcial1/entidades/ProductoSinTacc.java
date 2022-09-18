/**
 * 
 */
package ort.tp1.parcial1.entidades;

/**
 *
 */
public class ProductoSinTacc extends Producto {

	private static final String NOMBRE_MOSTRABLE = "Producto Sin TACC";

	private String certificadoraSinTac;

	/**
	 * Constructor del {@link ProductoSinTacc}
	 * 
	 * @param familiaProducto {@link FamiliaProducto} a la que pertenece el
	 *                        producto.
	 * @param nombre          {@link String} con el nombre del producto
	 * @param precio          {@link Float} con su precio unitario
	 */
	public ProductoSinTacc(FamiliaProducto familiaProducto, String nombre, float precio, String certificadoraSinTac) {
		super(familiaProducto, nombre, precio);
		this.setCertificadoraSinTac(certificadoraSinTac);
	}

	/**
	 * @return the certificadoraSinTac
	 */
	public String getCertificadoraSinTac() {
		return certificadoraSinTac;
	}

	/**
	 * @param certificadoraSinTac the certificadoraSinTac to set
	 */
	private void setCertificadoraSinTac(String certificadoraSinTac) {
		this.certificadoraSinTac = certificadoraSinTac;
	}

	//Hago uso de los getters para evitar romper el encapsulamiento
	@Override
	public void mostrar() {
		System.out.printf(Mostrable.FORMATO_RENGLON_CONSOLA, getNombre(), getFamiliaProducto(), getPrecio(),
				ProductoSinTacc.NOMBRE_MOSTRABLE, getCertificadoraSinTac());
	}

}
