package ejercicio_8;

public class PASE extends MedioDePago {
	
	
	private final int CANTDIASDEMORACOBRO = 8;
	private final double DESCUENTO1 = 0.15;
	private final double DESCUENTO2 = 0.12;
	
	public PASE(String descripcion) {
		super(descripcion);
	}
	
	public int getCantDiasDemoraCobro() {
		return this.CANTDIASDEMORACOBRO;
	}
	
	public double descuentoAAplicar() {
		double retorno = 0;
		if (CANTDIASDEMORACOBRO < 5) {
			retorno = DESCUENTO1;
		}else {
			retorno = DESCUENTO2;			
		}
		return retorno;
	}

	@Override
	public String toString() {
		return this.descripcion;
	}
	
	

}
