package clases;

public class Tradicional extends Pizza {

	private TipoDeMasa tipoDeMasa;
	
	public Tradicional(String nombre, float costoDeProduccion, float porcentajeGanancia, TipoDeMasa tipoDeMasa) {
		super(nombre, costoDeProduccion, porcentajeGanancia);
		this.tipoDeMasa = tipoDeMasa;
	}

	@Override
	public void mostrar() {
		System.out.println("Tradicional - " + getNombre() + " - precio de venta: $ " + getPrecioDeVenta() + " - " +tipoDeMasa.getDescripcion());
	}

	@Override
	public float getPrecioDeCosto() {
		return this.getCostoDeProduccion() * tipoDeMasa.getPorcentaje();
	}

	@Override
	public float getPrecioDeVenta() {
		return this.getCostoDeProduccion() * this.getPorcentajeGanancia();
	}



}
