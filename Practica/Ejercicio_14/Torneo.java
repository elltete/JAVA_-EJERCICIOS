package Ejercicio_14;

import java.util.ArrayList;

public class Torneo {
	private ArrayList<HoyoTorneo> hoyos;
	private ArrayList<Golfista> golfistas;
	
	public Torneo() {
		hoyos = new ArrayList<>();
		golfistas = new ArrayList<>();
	}
	
	private HoyoTorneo buscarHoyo(int numero) {
		HoyoTorneo hoyo = null;
		int index = 0;
		
		while (hoyo == null && index < hoyos.size())  {
			if (hoyos.get(index).getNumero() == numero) {
				hoyo = hoyos.get(index);
			}
			else {
				index++;
			}
		}
		return hoyo;
	}
	
	public boolean altaHoyo(int numero, int golpesPar) {
		boolean pudoAgregar = true;
		
		if (buscarHoyo(numero) == null) {
			hoyos.add(new HoyoTorneo(numero, golpesPar));
		}
		else {
			pudoAgregar = false;
		}
		
		return pudoAgregar;
	}
	
	public void mostrarHoyos() {
		for (HoyoTorneo hoyo: hoyos) {
			System.out.println(hoyo);
		}
	}

	private Golfista buscarGolfista(int numero) {
		Golfista golfista = null;
		int index = 0;
		
		while (golfista == null && index < golfistas.size())  {
			if (golfistas.get(index).getNumero() == numero) {
				golfista = golfistas.get(index);
			}
			else {
				index++;
			}
		}
		return golfista;
	}

	
	public boolean altaGolfista(int numero, String nombre, String apellido) {
		boolean pudoAgregar = true;
		
		if (buscarGolfista(numero) == null) {
			golfistas.add(new Golfista(numero, nombre, apellido));
		}
		else {
			pudoAgregar = false;
		}
		
		return pudoAgregar;
	}

	public void mostrarGolfistas() {
		for (Golfista golfista: golfistas) {
			System.out.println(golfista);
		}
	}
	
	public boolean jugar(int numeroJugador, int numeroHoyo, int golpes) {
		boolean pudoJugar = true;
		Golfista golfista = buscarGolfista(numeroJugador);
		HoyoTorneo hoyo = buscarHoyo(numeroHoyo);
		
		if ( golfista == null || hoyo == null) {
			pudoJugar = false;
		}
		else {
			pudoJugar = golfista.jugar(numeroHoyo, golpes);
		}
		
		if (pudoJugar) {
			hoyo.jugar(numeroJugador);
		}
		return pudoJugar;
	}
	
	private int obtenerPuntajeGolfista(int numero) {
		int puntaje = 0;
		Golfista golfista = buscarGolfista(numero);
		HoyoTorneo hoyoTorneo;
		if (golfista != null) {
			for (Hoyo hoyo: golfista.getHoyos()) {
				hoyoTorneo = buscarHoyo(hoyo.getNumero());
				puntaje += hoyo.getGolpes() - hoyoTorneo.getGolpesPar();
			}
		}
		return puntaje;
	}
	
	private int obtenerMayorPuntaje() {
		int mayorPuntaje = Integer.MAX_VALUE;
		for (Golfista golfista: golfistas) {
			if (obtenerPuntajeGolfista(golfista.getNumero()) < mayorPuntaje) {
				mayorPuntaje = obtenerPuntajeGolfista(golfista.getNumero());
			}
		}
		return mayorPuntaje;
	}
	
	public void listarLideres() {
		int mayorPuntaje = obtenerMayorPuntaje();
		System.out.println("Los líderes son los siguientes con puntaje " + mayorPuntaje);
		for (Golfista golfista: golfistas) {
			if (obtenerPuntajeGolfista(golfista.getNumero()) == mayorPuntaje) {
				System.out.println(golfista);;
			}
		}
	}
	
	public void listarHoyosNoVisitados() {
		System.out.println("Hoyos aún no visitados");
		for (HoyoTorneo hoyo: hoyos) {
			if (hoyo.getCantidadGolfistas() == 0) {
				System.out.println(hoyo.getNumero());
			}
		}
	}
	
}
