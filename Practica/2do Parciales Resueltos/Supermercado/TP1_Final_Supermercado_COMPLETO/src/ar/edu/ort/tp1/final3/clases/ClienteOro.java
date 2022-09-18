package ar.edu.ort.tp1.final3.clases;

public class ClienteOro extends Cliente{

	public ClienteOro(String nombre, int edad, double saldo) {
		super(nombre, edad, saldo);
	}

	@Override
	public double realizarDescuento(double precio) {
		return precio * 0.5;
	}

	@Override
	public boolean tieneDescuento(double precio) {
		return true;
	}
	

}
