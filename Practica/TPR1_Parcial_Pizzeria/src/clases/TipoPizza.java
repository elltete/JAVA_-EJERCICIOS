package clases;

public enum TipoPizza {
	ESPECIAL("Especial"), TRADICIONAL("Tradicional"), RECTANGULAR("Rectangular");

	private String 	descripcion;

	private TipoPizza(String descripcion) {
		this.descripcion = descripcion;
	}

	public String getDescripcion() {
		return descripcion;
	}
}
