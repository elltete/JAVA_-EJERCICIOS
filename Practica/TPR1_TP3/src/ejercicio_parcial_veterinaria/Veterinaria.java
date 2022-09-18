package ejercicio_parcial_veterinaria;

import java.util.ArrayList;

public class Veterinaria implements Mostrable{
	
	private static String TXT_INGRESO = "Ingresando a %s a la veterinaria \n";
	private static String TXT_CANTIDADES = "Han sido ingresados: %s conejos, %d, gatos y %d perros ";
	
	private String nombre;
	private Doctor doctor;
	private ArrayList<Mascota> animalesIngresados;
	
	public Veterinaria(String nombre, Doctor doctor) {
		this.nombre = nombre;
		this.doctor = doctor;
		animalesIngresados = new ArrayList<Mascota>();
	}
	
	public void admitirMascota(Mascota mascota) {
		animalesIngresados.add(mascota);
		System.out.printf(TXT_INGRESO, mascota.getNombre());
	}

	public Mascota buscarMascota(String nombreMascota) {
		Mascota mascotaEncontrada = null;
		int i = 0;
		while(i < animalesIngresados.size() && mascotaEncontrada == null ) {
			if(animalesIngresados.get(i).getNombre().equals(nombreMascota)) {
				mascotaEncontrada = animalesIngresados.get(i);
			} else {
				i++;
			}
		}
		return mascotaEncontrada;
	}	
	
	public void vacunar() {
		int cant = 0;
		for(Mascota m: animalesIngresados) {
			if(!m.isVacuna()) {
				m.vacunar();
				cant++;
			}
		}
		System.out.println("Vacunas aplicadas : " + cant);
	}
	
	private void cantidadDeAnimales() {
		int cantidadDeConejos = 0;
		int cantidadDeGatos = 0;
		int cantidadDePerros = 0;
		for(Mascota m: animalesIngresados) {
			if(m instanceof Conejo) {
				cantidadDeConejos++;
			}else if(m instanceof Gato) {
				cantidadDeGatos++;
			}else if(m instanceof Perro) {
				cantidadDePerros++;
			}
		}
		System.out.printf(TXT_CANTIDADES, cantidadDeConejos, cantidadDeGatos, cantidadDePerros);	
	}

	@Override
	public void mostrar() {
		System.out.println("Veterinaria: " + this.nombre);
		System.out.println("Doctor de turno: " + this.doctor.getNombre());
		this.cantidadDeAnimales();
	
	}
}
