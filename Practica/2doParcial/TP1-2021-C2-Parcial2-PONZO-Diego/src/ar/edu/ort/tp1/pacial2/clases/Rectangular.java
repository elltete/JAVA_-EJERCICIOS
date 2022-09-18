package ar.edu.ort.tp1.pacial2.clases;

public class Rectangular extends Pizza {

	private long largo;
	private long ancho; 
	private AdicionalQueso adicionalQueso;
	
	public Rectangular(String nombre, float costoDeProduccion, float porcentajeGanancia, long largo, long ancho, AdicionalQueso adicionalQueso) {
		super(nombre, costoDeProduccion, porcentajeGanancia);
		this.largo = largo;
		this.ancho = ancho;
		this.adicionalQueso = adicionalQueso;
	}

	@Override
	public void mostrar() {
		System.out.println("Pizza Especial [PrecioDeVenta= " + getPrecioDeVenta() + ", Nombre= " + getNombre() + "]");
	}

	@Override
	public float getPrecioDeCosto() {
		return this.getCostoDeProduccion() + (this.largo * this.ancho) * this.getPrecioPorcion();
	}

	@Override
	public float getPrecioDeVenta() {
		return this.getCostoDeProduccion() * this.getPorcentajeGanancia();
	}

}
