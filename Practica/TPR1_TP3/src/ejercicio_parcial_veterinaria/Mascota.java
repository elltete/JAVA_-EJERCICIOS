package ejercicio_parcial_veterinaria;

public abstract class Mascota implements Animal {
	
	private static String MSG_COM_FELIZ = " dice: He comido demasiado.";
	private static String MSG_COM_HAMBRIENTO = " dice: Muchas gracias tenia hambre";
	private static String MSG_COM_ENFERMO = " dice: No tenia mucha hambre, pero gracias.";
	private static int CIEN = 100;

	private String nombre;
	private double peso;
	private boolean vacuna;
	private Estado estado;

	public Mascota(String nombre, double peso, boolean vacuna, Estado estado) {
		this.nombre = nombre;
		this.peso = peso;
		this.vacuna = vacuna;
		this.estado = estado;
	}
	
	public void actualizarPeso(double porcentaje) {
		this.peso += peso * porcentaje / CIEN;
	}

	public void comer(double comida, double multiplicador) {
		this.actualizarPeso(comida * multiplicador);
		if(estado == Estado.HAMBRIENTO) {
			estado = Estado.FELIZ;
			System.out.println("gracias ya que tenia hambre.");
		} else if(estado == Estado.FELIZ) {
			estado = Estado.ENFERMO;
			System.out.println("Comi demasiado.");
		}
	}
	

	public void vacunar() {
		this.vacuna = true;
	}

	public String getNombre() {
		return nombre;
	}

	public boolean isVacuna() {
		return vacuna;
	}

	public Estado getEstado() {
		return estado;
	}

	public static String getMSG_COM_FELIZ() {
		return MSG_COM_FELIZ;
	}

	public static String getMSG_COM_HAMBRIENTO() {
		return MSG_COM_HAMBRIENTO;
	}

	public static String getMSG_COM_ENFERMO() {
		return MSG_COM_ENFERMO;
	}
	
	

	
}
