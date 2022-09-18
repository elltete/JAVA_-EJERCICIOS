package ar.edu.ort.monedero;

public class Transaccion {
	private Moneda moneda;
	private double valor;
	
	public Transaccion(Moneda moneda, double valor){
		this.moneda = moneda;
		convertir(valor);
	}
	
	public void convertir(double val){
		if (moneda != null){
			this.valor = moneda.convertirACripto(val);
		}
	}	
	
	public double getValor(){
		return valor;
	}
	
	public String getNombreMoneda(){
		return moneda.getClass().getSimpleName();
	}
}
