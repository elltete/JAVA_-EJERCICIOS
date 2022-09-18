package ar.edu.ort.tp1.pacial2.clases;

public class Tradicional extends Pizza {

	private TipoDeMasa tipoDeMasa;
	
	public Tradicional(String nombre, float costoDeProduccion, float porcentajeGanancia, TipoDeMasa tipoDeMasa) {
		super(nombre, costoDeProduccion, porcentajeGanancia);
		this.tipoDeMasa = tipoDeMasa;
	}

	@Override
	public void mostrar() {
		System.out.println("Pizza Tradicional [PrecioDeVenta= " + getPrecioDeVenta() + ", Nombre= " + getNombre() + "]");
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
