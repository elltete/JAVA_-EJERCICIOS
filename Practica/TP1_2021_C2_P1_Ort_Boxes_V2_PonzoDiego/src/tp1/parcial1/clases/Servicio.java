package tp1.parcial1.clases;

public abstract class Servicio implements Detallable {

	private String Descripcion;
	private double porcentajeGanancia;
	private String patente;

	public Servicio(String descripcion, double porcentajeGanancia, String patente) {
		this.Descripcion = descripcion;
		this.porcentajeGanancia = porcentajeGanancia;
		this.patente = patente;
	}

	public String getPatente() {
		return patente;
	}

	public String getDescripcion() {
		return Descripcion;
	}

	public abstract double calcularPrecioCosto();

	public double calcularPrecioVenta() {
		double costo = this.calcularPrecioCosto();
		return costo+(this.porcentajeGanancia*costo/100);
	}

	public void detallar() {
		System.out.println("Serivio de " + this.getClass().getName());
		System.out.println("Patente: " + this.getPatente() + " Precio: " + this.calcularPrecioVenta());	
	}

}
