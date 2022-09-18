package ejercicio_1;

import java.util.ArrayList;

import ejercicio_2.Mascota;
import ejercicio_3.Hito;

public class Persona {
	
	private String apellido;
	private String nombre;
	private ArrayList<NumeroTelefonico> telefonos;
	private ArrayList<Email> eMails;
	private ArrayList<Mascota> mascotas;
	private ArrayList<Hito> hitos;
	
	public Persona(String apellido, String nombre) {
		this.apellido = apellido;
		this.nombre = nombre;
		telefonos = new ArrayList<NumeroTelefonico>();
		mascotas = new ArrayList<Mascota>();
		eMails = new ArrayList<Email>();
		hitos = new ArrayList<Hito>();
	}
	
	public void agregarTelefono(int caracteristica, int numeroDeAbonado, int codigoDePais, TipoDeLinea tipoDeLinea) {
		telefonos.add(new NumeroTelefonico(caracteristica, numeroDeAbonado, codigoDePais, tipoDeLinea));
	}
	
	public void agregarEmail(String eMail) {
		eMails.add(new Email(eMail));
	}
	
	public void agregarMascota(Mascota mascota) {
		if(!existeMascota(mascota)) {
			mascotas.add(mascota);
		}else {
			System.out.println("La mascota ya esta en la lista");
		}
	}
	
	public void agregarHito(Hito hito) {
		hitos.add(hito);
	}
	
	public void eliminarMascota(Mascota mascota) {
		if(existeMascota(mascota)) {
			mascotas.remove(mascota);
		}else {
			System.out.println("La mascota no esta en la lista");
		}
	}
	
	private boolean existeMascota(Mascota mascota) {
		boolean respuesta = false;
		int i = 0;
		while(i<mascotas.size() && !respuesta) {
			if(mascotas.get(i).getNombre().equals(mascota.getNombre()) && mascotas.get(i).getTipoAnimal().equals(mascota.getTipoAnimal())) {
				respuesta = true;
			}else {
				i++;
			}
		}
		return respuesta;
	}
	
	public void mostrarTodo() {
		System.out.println(this.apellido + ", " + this.nombre);
		System.out.println("* Telefonos *");
		for(NumeroTelefonico num: telefonos) {
			System.out.println(num.getValor());
		}
		System.out.println("* Emails *");
		for(Email em: eMails) {
			System.out.println(em.getValor());
		}
		System.out.println("* Mascotas *");
		for(Mascota ma: mascotas) {
			System.out.println(ma.getValor());
		}
		System.out.println("* Hitos *");
		for(Hito hit: hitos) {
			System.out.println(hit.getValor());
		}
	}


}
