package ejercicio_8;

public class Efectivo extends MedioDePago {
	
	private final int CANTDIASDEMORACOBRO = 0;
	
	private final double DESCUENTO = 0.1;
	
	public Efectivo(String descripcion) {
		super(descripcion);
	}
	
	public double descuentoAAplicar() {
		return DESCUENTO;
	}

	@Override
	public int getCantDiasDemoraCobro() {
		return 0;
	}

	@Override
	public String toString() {
		return this.descripcion;
	}
	
	

}
