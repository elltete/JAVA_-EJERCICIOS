/**
 * 
 */
package par1.cerveceria.entidades;

/**
 * @author Julio Sejtman
 *
 */
public class Garrafa extends EnvaseCerveza {

	private Medida medida;

	/**
	 * @param sabor
	 */
	public Garrafa(Sabor sabor, Medida medida) {
		super(sabor);
		this.medida = medida;
	}

	/**
	 * @return the medida
	 */
	public Medida getMedida() {
		return medida;
	}

	@Override
	public void setPrecioVenta(double precio) {
		super.precioVenta = precio;
	}

	@Override
	public String getTipo() {
		return "Garrafa " + medida.toString();
	}

}
