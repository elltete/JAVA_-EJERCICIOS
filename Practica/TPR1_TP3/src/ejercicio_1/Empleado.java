package ejercicio_1;

public abstract class Empleado {
	
	private String nombre;
	private int edad;

	public Empleado() {
		this.nombre = "";
		this.edad = 0;		
	}
	
	public Empleado(String nombre, int edad) {
		this.nombre = nombre;
		this.edad = edad;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public void setEdad(int edad) {
		this.edad = edad;
	}

	public String getNombre() {
		return nombre;
	}

	public int getEdad() {
		return edad;
	}

	@Override
	public String toString() {
		return "Empleado [nombre=" + nombre + ", edad=" + edad + "]";
	}
	
	public abstract float calcularPago();

}
