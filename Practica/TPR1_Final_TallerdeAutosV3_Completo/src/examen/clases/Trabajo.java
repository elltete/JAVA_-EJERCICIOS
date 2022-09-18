package examen.clases;

public class Trabajo implements Reportable {
	private Servicio servicio;
	private Vehiculo vehiculo;
	private float importe;

	public Trabajo(Vehiculo vehiculo, Servicio trabajo) {
		if (vehiculo == null || trabajo == null) {
			throw new IllegalArgumentException("El trabajo debe crearse con vehiculo y servicio asignados.");
		}
		this.importe = 0;
		this.vehiculo = vehiculo;
		this.servicio = trabajo;
	}

	public int getCodigo() {
		return servicio.getCodigo();
	}

	public Servicio getService() {
		return servicio;
	}

	@Override
	public String reportar() {
		return "[" + vehiculo.getClass().getSimpleName() + " patente " + vehiculo.getPatente() + " servicio a realizar "
				+ servicio.getDesc() + "]";
	}

	public void aplicarPrecioHora(float precioHora) {
		importe = servicio.getHoras() * precioHora;
	}

	public float getImporte() {
		return importe;
	}

	@Override
	public String toString() {
		return "Trabajo [servicio=" + servicio + ", vehiculo=" + vehiculo + ", importe=" + importe + "]";
	}

}
