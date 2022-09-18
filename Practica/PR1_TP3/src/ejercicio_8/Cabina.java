package ejercicio_8;

public class Cabina {
	
	private static int idUnico = 1;
	private final int MANANAHORAPICO1=6;
	private final int MANANAHORAPICO2=10;
	private final int TARDEHORAPICO1=17;
	private final int TARDEHORAPICO2=20;
	private final double INCREMENTOHORAPICO=0.08;

	private final int HORA_ACTUAL=18;
	
	private int id;
	private MedioDePago medioDePago;
	
	public Cabina(MedioDePago medioDePago) {
		id = idUnico++;
		this.medioDePago = medioDePago;
	}
	
	public MedioDePago getMedioDePago() {
		return this.medioDePago;
	}
	
	
	public double cobrar(Vehiculo vehiculo) {
		double importe = 0;
		importe = vehiculo.getTarifaBase() * (1 - medioDePago.descuentoAAplicar());
		if(esHorarioPico()) {
			importe *= (1 + INCREMENTOHORAPICO);
		}
		return importe;
	}
	
	private boolean esHorarioPico() {
		boolean salida = false;
		if((HORA_ACTUAL > MANANAHORAPICO1 && HORA_ACTUAL < MANANAHORAPICO2) || (HORA_ACTUAL > TARDEHORAPICO1 && HORA_ACTUAL < TARDEHORAPICO2)) {
			salida = true;
		}
		return salida;
	}
	
	public boolean aceptaPagoEnEfectivo() {
		return (medioDePago instanceof Efectivo);
	}
	
	public boolean aceptaPagoElectronico() {
		return (medioDePago instanceof SUBE) || (medioDePago instanceof PASE);
	}

	@Override
	public String toString() {
		return "[id=" + id + "]";
	}
	
	

}
