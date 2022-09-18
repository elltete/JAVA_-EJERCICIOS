package ar.edu.ort.tp1.final3.clases;

public class ClientePlata extends Cliente{

	public ClientePlata(String nombre, int edad, double saldo) {
		super(nombre, edad, saldo);
	}

	@Override
	public double realizarDescuento(double precio) {
		return precio * 0.8;
	}

	@Override
	public boolean tieneDescuento(double precio) {
		return precio >= 300;
	}
	

}
