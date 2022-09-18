package ar.edu.ort.tp1.exfinal.clases;

public abstract class Item implements Reproducible {

	private String nombreDelTema;
	private String nombreDelArtista;
	private int anioLanzamiento;
	
	public Item(String nombreDelTema, String nombreDelArtista, int anioLanzamiento) {
		this.nombreDelTema = nombreDelTema;
		this.nombreDelArtista = nombreDelArtista;
		this.anioLanzamiento = anioLanzamiento;
	}

	public String getNombreDelTema() {
		return nombreDelTema;
	}

	public String getNombreDelArtista() {
		return nombreDelArtista;
	}

	public int getAnioLanzamiento() {
		return anioLanzamiento;
	}

	@Override
	public String toString() {
		return "Item [nombreDelTema=" + nombreDelTema + ", nombreDelArtista=" + nombreDelArtista + ", anioLanzamiento="
				+ anioLanzamiento + "]";
	}
	
}
