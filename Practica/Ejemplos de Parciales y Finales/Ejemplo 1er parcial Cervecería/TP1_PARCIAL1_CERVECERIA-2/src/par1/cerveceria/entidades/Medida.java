package par1.cerveceria.entidades;

public enum Medida {
	GRANDE(3000), MEDIANA(1500), CHICA(750);

	private int cantidadContenida;

	private Medida(int cantidadContenida) {

		this.cantidadContenida = cantidadContenida;
	}

	/**
	 * @return the cantidadContenida
	 */
	public int getCantidadContenida() {
		return cantidadContenida;
	}

}
