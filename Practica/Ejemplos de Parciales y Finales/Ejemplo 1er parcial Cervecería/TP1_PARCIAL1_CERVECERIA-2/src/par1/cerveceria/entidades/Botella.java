/**
 * 
 */
package par1.cerveceria.entidades;

/**
 * @author Julio Sejtman
 *
 */
public class Botella extends EnvaseCerveza {

	/**
	 * @param sabor
	 */
	public Botella(Sabor sabor) {
		super(sabor);
	}

	@Override
	public void setPrecioVenta(double precio) {
		super.precioVenta = precio;
	}

	@Override
	public String getTipo() {

		return "Botella";
	}

}
