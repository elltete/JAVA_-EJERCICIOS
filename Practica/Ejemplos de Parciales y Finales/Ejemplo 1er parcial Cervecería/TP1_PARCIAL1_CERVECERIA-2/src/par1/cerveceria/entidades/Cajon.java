/**
 * 
 */
package par1.cerveceria.entidades;

/**
 * @author Julio Sejtman
 *
 */
public class Cajon extends Contenedor {

	private static final int CANTIDAD_INICIAL_BOTELLITAS = 12;
	private int cantidadBotellitas;

	/**
	 * @param sabor
	 */
	public Cajon(Sabor sabor) {
		super(sabor);
		this.cantidadBotellitas = Cajon.CANTIDAD_INICIAL_BOTELLITAS;
	}

	@Override
	public EnvaseCerveza extraer() {

		EnvaseCerveza cerveza = null;
		if (!this.estaVacio()) {

			cantidadBotellitas--;
			cerveza = new Botella(getSabor());
		}
		return cerveza;
	}

	@Override
	public boolean estaVacio() {

		return cantidadBotellitas == 0;
	}

}
