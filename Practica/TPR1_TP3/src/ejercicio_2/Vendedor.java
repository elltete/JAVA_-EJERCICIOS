package ejercicio_2;

import ejercicio_1.Subcontratado;

public class Vendedor extends Subcontratado {
	
	private float porcentaje;

	public Vendedor() {
		super();
		this.porcentaje = 0;
	}

	public Vendedor(String nombre, int edad, float cantHoras, float precioHora, float porcentaje) {
		super(nombre, edad, cantHoras, precioHora);
		this.porcentaje = porcentaje;
	}

	@Override
	public float calcularPago() {
		return super.calcularPago() * (1 + porcentaje);
	}

}
