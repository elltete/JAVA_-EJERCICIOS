package clases;

public class Especial extends Pizza {
	
	int cantidadFainas;
	TamanioDePizza tamanioDePizza;

	public Especial(String nombre, float costoDeProduccion, float porcentajeGanancia, int cantidadFainas, TamanioDePizza tamanioDePizza) {
		super(nombre, costoDeProduccion, porcentajeGanancia);
		this.cantidadFainas = cantidadFainas;
		this.tamanioDePizza = tamanioDePizza;
	}

	@Override
	public void mostrar() {
		System.out.println("Especial - " + getNombre() + " - " + tamanioDePizza.getDescripcion() 
		+ " - precio de venta: $ " + getPrecioDeVenta() + " - " + cantidadFainas + " fainas");
	}

	@Override
	public float getPrecioDeCosto() {
		return this.getCostoDeProduccion() * tamanioDePizza.getPorcentaje() + (this.cantidadFainas * this.getPrecioFaina());
	}

	@Override
	public float getPrecioDeVenta() {
		return this.getCostoDeProduccion() * this.getPorcentajeGanancia();
	}

}
