package ar.edu.ort.monedero;

public abstract class Moneda {
	private final String MSG_COEFICIENTE = "EL VALOR DEL COEFICIENTE DEBE SER MAYOR A 0";

	private double coeficiente;

	public Moneda(double coeficiente) {
		this.setCoeficiente(coeficiente);
	}

	public double getCoeficiente() {
		return coeficiente;
	}

	public abstract double convertirACripto(double valor);


	private void setCoeficiente(double coeficiente) {
		if (coeficiente < 1) {
			throw new IllegalArgumentException(MSG_COEFICIENTE);
		}
		this.coeficiente = coeficiente;
	}

}
