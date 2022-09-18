package ejercicio_1;

public class Subcontratado extends Empleado {
	
	private float cantHoras;
	private float precioHora;
	
	public Subcontratado() {
		this.cantHoras = 0;
		this.precioHora = 0;
	}

	public Subcontratado(String nombre, int edad, float cantHoras, float precioHora) {
		super(nombre, edad);
		this.cantHoras = cantHoras;
		this.precioHora = precioHora;
	}

	@Override
	public String toString() {
		return "Subcontratado [cantHoras=" + cantHoras + ", precioHora=" + precioHora + "]";
	}

	@Override
	public float calcularPago() {
		return cantHoras * precioHora;
	}
	


}
