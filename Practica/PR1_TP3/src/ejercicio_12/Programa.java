package ejercicio_12;

import java.util.ArrayList;

import ejercicio_9.Barco;
import ejercicio_9.EmbarcacionDeportiva;

public class Programa implements Calificable {
	
	private int id;
	private String nombre;
	private String nombreResponsable;
	private boolean pruebasOk;
	private ArrayList<Fuente> fuentes;
	
	public Programa(int id, String nombre, String nombreResponsable, boolean pruebasOk) {
		this.id = id;
		this.nombre = nombre;
		this.nombreResponsable = nombreResponsable;
		this.pruebasOk = false;
		fuentes = new ArrayList<Fuente>();
	}
	
	public boolean isPruebasOk() {
		return pruebasOk;
	}

	public void agregarFuente(Fuente fuente) {
		fuentes.add(fuente);
	}

	public double indiceCalidad() {
		double retorno = 0;
		if(!isPruebasOk()) {
			retorno = promedioIndiceFuentes();
		}
		return retorno;
	} 
	
	public void mostrarDetalleDeMetodo(String nombreMetodo) {
		int i = 0;
		Metodo metodo = null;
		while (i < fuentes.size() && metodo == null) {
			if(fuentes.get(i) instanceof LenguajeProgramacion) {
				metodo = ((LenguajeProgramacion) fuentes.get(i)).devuelveMetodo(nombreMetodo);
			}
			i++;
		}
		if(metodo != null) {
			System.out.println(metodo.toString());
		}else {
			System.out.println("Nombre del metodo no encontrado");
		}	
	}
	
	
	public ArrayList<Fuente> listadoFuentesMayoresAlPromedio() {
		
		return new ArrayList<Fuente>();
	}
	
	private double promedioIndiceFuentes() {
		double promedio = 0;
		double sumaIndice = 0;
		for(Fuente f: fuentes) {
			sumaIndice =+ f.indiceCalidad();
		}
		if (fuentes.size() != 0) {
			promedio = sumaIndice/fuentes.size();
		}
		return promedio;
	}
	
	public boolean calidadPorDebajoDe(double valor) {
		boolean respuesta = false;
		if(indiceCalidad() < valor) {
			respuesta = true;
		}
		return respuesta;
	}

	@Override
	public String toString() {
		return "Programa [nombre=" + nombre + "]";
	}
	
	

}
