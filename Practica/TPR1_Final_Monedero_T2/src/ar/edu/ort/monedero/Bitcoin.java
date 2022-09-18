package ar.edu.ort.monedero;

public class Bitcoin extends Moneda{
	
	final static double CONSTANTE = 0.1;

	public Bitcoin(double coeficiente) {
		super(coeficiente);
	}

	@Override
	public double convertirACripto(double valor) {
		return valor / this.getCoeficiente() - (valor / this.getCoeficiente() * CONSTANTE);
	}

}
