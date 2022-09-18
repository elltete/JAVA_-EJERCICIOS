package ar.edu.ort.tp1.exfinal.clases;

public class Podcast extends Item{

	public Podcast(String nombreDelTema, String nombreDelArtista, int anioLanzamiento) {
		super(nombreDelTema, nombreDelArtista, anioLanzamiento);
	}

	@Override
	public void reproducir() {
		System.out.println("Reproduciendo el Podcast: " + this.getNombreDelTema());
	}

	@Override
	public void detener() {
		System.out.println("No implementado, se detendrá la reproducción en curso");
	}

}
