package ar.edu.ort.tp1.exfinal.clases;

public class Cancion extends Item {

	public Cancion(String nombreDelTema, String nombreDelArtista, int anioLanzamiento) {
		super(nombreDelTema, nombreDelArtista, anioLanzamiento);
	}

	@Override
	public void reproducir() {
		System.out.println("Reproduciendo la Cancion: " + this.getNombreDelTema());
		
	}

	@Override
	public void detener() {
		System.out.println("No implementado, se detendrá la reproducción en curso");
	}
	
}
