package ar.edu.ort.tp1.final3.clases;

public class ClientePlata extends Cliente{
	
	private static final double DESCUENTO = 0.2;
	private static final double MONTO_PARA_DTO = 300;

	public ClientePlata(String nombre, int edad, double importeAGastar) {
		super(nombre, edad, importeAGastar);
	}

	@Override
	public double realizarDescuento(double precio) {
		return precio*DESCUENTO;
	}

	@Override
	public boolean tieneDescuento(double precio) {
		return precio >= MONTO_PARA_DTO;
	}
	
	

}
