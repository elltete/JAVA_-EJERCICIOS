package Ejercicio_14;

import java.util.ArrayList;

public class Golfista {
	private int numero;
	private String nombre;
	private String apellido;
	private ArrayList<Hoyo> hoyos;
	
	public Golfista(int numero, String nombre, String apellido) {
		this.numero = numero;
		this.nombre = nombre;
		this.apellido = apellido;
		hoyos = new ArrayList<>();
	}
	
	private Hoyo buscar(int numero) {
		Hoyo hoyo = null;
		int index = 0;
		
		while (hoyo == null && index < hoyos.size()) {
			if (hoyos.get(index).getNumero() == numero) {
				hoyo = hoyos.get(index);
			}
			else {
				index++;
			}
		}
		
		return hoyo;
	}

	public boolean jugar(int numeroHoyo, int golpes) {
		boolean pudoJugar = true;
		if (buscar(numeroHoyo) == null) {
			hoyos.add(new Hoyo(numeroHoyo, golpes));
		}
		else {
			pudoJugar = false;
		}
		return pudoJugar;
	}
	
	@Override
	public String toString() {
		return "Golfista [numero=" + numero + ", nombre=" + nombre + ", apellido=" + apellido + ", hoyos=" + hoyos
				+ "]";
	}

	public int getNumero() {
		return numero;
	}

	public ArrayList<Hoyo> getHoyos() {
		return hoyos;
	}
	
	
	
}
