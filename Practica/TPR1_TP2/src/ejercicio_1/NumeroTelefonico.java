package ejercicio_1;

public class NumeroTelefonico {
	
	private int caracteristica;
	private int numeroDeAbonado;
	private int codigoDePais;
	private TipoDeLinea tipoDeLinea;
	
	public NumeroTelefonico(int caracteristica, int numeroDeAbonado, int codigoDePais, TipoDeLinea tipoDeLinea) {
		this.caracteristica = caracteristica;
		this.numeroDeAbonado = numeroDeAbonado;
		this.codigoDePais = codigoDePais;
		this.tipoDeLinea = tipoDeLinea;
	}
	
	public String getValor() {
		return this.tipoDeLinea + "(+" + this.codigoDePais + ") " + this.caracteristica + "-" + this.numeroDeAbonado;
	}

}
