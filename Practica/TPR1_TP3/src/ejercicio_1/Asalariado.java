package ejercicio_1;

public class Asalariado extends Empleado {
	
	private float sueldo;

	public Asalariado() {
		sueldo = 0;
	}

	public Asalariado(float sueldo, String nombre, int edad) {
		super(nombre, edad);
		this.sueldo = sueldo;
	}

	@Override
	public String toString() {
		return "Asalariado [sueldo=" + sueldo + "]";
	}
	
	@Override
	public float calcularPago() {
		return sueldo;
	}
	

}
