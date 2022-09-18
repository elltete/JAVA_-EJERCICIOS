package ar.edu.ort.monedero;

public class Ethereum extends Moneda{
	
	final static double CONSTANTE = 0.1234;

	public Ethereum(double coeficiente) {
		super(coeficiente);
	}

	@Override
	public double convertirACripto(double valor) {
		return valor / super.getCoeficiente() * CONSTANTE;
	}

}
