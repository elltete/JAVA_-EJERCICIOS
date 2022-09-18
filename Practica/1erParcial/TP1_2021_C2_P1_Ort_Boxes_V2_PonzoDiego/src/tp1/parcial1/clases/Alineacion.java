package tp1.parcial1.clases;

public class Alineacion extends Servicio implements CotizablePorManoObra {

	static final double EXTRABALANCEO = 500;

	private int horas;
	public boolean conBalanceo;

	public Alineacion(String descripcion, double porcentajeGanancia, String patente, int horas, boolean conBalanceo) {
		super(descripcion, porcentajeGanancia, patente);
		this.horas = horas;
		this.conBalanceo = conBalanceo;
	}

	@Override
	public double calcularCostoHoras() {
		return COSTOHORA * this.horas;
	}

	@Override
	public double calcularPrecioCosto() {
		double importe = 0;
		importe = calcularCostoHoras();
		if(conBalanceo) {
			importe += EXTRABALANCEO;
		}
		return importe;
	}
}
