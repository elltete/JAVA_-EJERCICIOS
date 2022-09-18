package ar.edu.ort.monedero;

public class Bitcoin extends Moneda {
	
	public Bitcoin(double coeficiente){
		super(coeficiente);
	}

	@Override
	public double convertirACripto(double valor) {
		double salida = valor / getCoeficiente() - (valor / getCoeficiente() * 0.1); 
		return salida;
	}

}
