package ar.edu.ort.monedero;

public class Ethereum extends Moneda{
	public Ethereum(double coeficiente){
		super(coeficiente);
	}

	@Override
	public double convertirACripto(double valor) {
		double salida = valor / getCoeficiente() * 0.1234; 
		return salida;
	}

}
