package ejercicio_12;

public class Metodo implements Calificable {
	
	private String nombre;
	private int cantParametros;
	private int cantInstrucciones;
	private int cantRamificacionesFlujo;
	
	public Metodo(String nombre, int cantParametros, int cantInstrucciones, int cantRamificacionesFlujo) {
		this.nombre = nombre;
		this.cantParametros = cantParametros;
		this.cantInstrucciones = cantInstrucciones;
		this.cantRamificacionesFlujo = cantRamificacionesFlujo;
	}
	
	@Override
	public double indiceCalidad() {

		return (5 / (cantParametros + 1) + 20 / cantInstrucciones + 3 / (cantRamificacionesFlujo + 1));
	}

	public String getNombre() {
		return nombre;
	}

	@Override
	public String toString() {
		return "Metodo [nombre=" + nombre + ", cantParametros=" + cantParametros + ", cantInstrucciones="
				+ cantInstrucciones + ", cantRamificacionesFlujo=" + cantRamificacionesFlujo + ", indiceCalidad()="
				+ indiceCalidad() + "]";
	}
	
	

}
