package tp1.parcial1.clases;

public class CambioAceite extends Servicio implements CotizablePorManoObra, CotizablePorMateriales {
	
	private int horas;
	
	public CambioAceite(String descripcion, double porcentajeGanancia, String patente, int horas) {
		super(descripcion, porcentajeGanancia, patente);
		this.horas = horas;
	}

	@Override
	public double calcularCostoMateriales() {
		return COSTOMATERIAL1 + COSTOMATERIAL2;
	}

	@Override
	public double calcularCostoHoras() {
		return this.COSTOHORA * this.horas;
	}

	@Override
	public double calcularPrecioCosto() {
		return calcularCostoMateriales() + calcularCostoHoras();
	}

}
