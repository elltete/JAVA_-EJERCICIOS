package ejercicio_8;

public class SUBE extends MedioDePago {

	private final double DESCUENTO = 0.1;
	private final int CANTDIASDEMORACOBRO = 3;
	
	public SUBE(String descripcion) {
		super(descripcion);
	}
	
	public int getCantDiasDemoraCobro() {
		return this.CANTDIASDEMORACOBRO;
	}
	
	public double descuentoAAplicar() {
		return DESCUENTO;
	}

	@Override
	public String toString() {
		return this.descripcion;
	}
	
	
}
