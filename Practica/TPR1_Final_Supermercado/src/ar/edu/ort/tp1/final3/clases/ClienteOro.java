package ar.edu.ort.tp1.final3.clases;

public class ClienteOro extends Cliente{
	
	private static final double DESCUENTO = 0.5;
	private static final double MONTO_PARA_DTO = 0;

	public ClienteOro(String nombre, int edad, double importeAGastar) {
		super(nombre, edad, importeAGastar);
	}

	@Override
	public double realizarDescuento(double precio) {
		return precio*DESCUENTO;
	}

	@Override
	public boolean tieneDescuento(double precio) {
		return true;
	}
	
	

}
