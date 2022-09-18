package ejercicio_12;

public class LenguajeDeMarcado extends Fuente implements Calificable {

	private int tamanioArchivo;
	
	public LenguajeDeMarcado(String nombre, String ubicacion, int tamanioArchivo) {
		super(nombre, ubicacion);
		this.tamanioArchivo = tamanioArchivo;
	}

	@Override
	public double indiceCalidad() {
		return 450 / tamanioArchivo;
	}

}
