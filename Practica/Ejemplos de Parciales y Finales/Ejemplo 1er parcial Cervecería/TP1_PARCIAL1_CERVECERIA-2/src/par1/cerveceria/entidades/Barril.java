/**
 * 
 */
package par1.cerveceria.entidades;

/**
 * @author Julio Sejtman
 *
 */
public class Barril extends Contenedor {

	private final static int CONTENIDO_INICIAL = 30000;

	private int contenido;

	/**
	 * @param sabor
	 */
	public Barril(Sabor sabor) {
		super(sabor);
		this.contenido = Barril.CONTENIDO_INICIAL;
	}

	@Override
	public EnvaseCerveza extraer() {

		return this.extraer(Medida.MEDIANA);
	}

	public EnvaseCerveza extraer(Medida medida) {

		EnvaseCerveza cerveza = null;
		if (!this.estaVacio() && this.contenido > medida.getCantidadContenida()) {

			contenido -= medida.getCantidadContenida();
			cerveza = new Garrafa(getSabor(), medida);
		}
		return cerveza;
	}

	@Override
	public boolean estaVacio() {
		return this.contenido == 0;
	}
}
