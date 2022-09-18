package ejercicio_14;

import java.util.ArrayList;

public class Inmueble {
	
	private String domicilio;
	private int superficie;
	private int cantAmbientes;
	private double precio;
	private ArrayList<Interesado> interesados;
	
	public Inmueble(String domicilio, int superficie, int cantAmbientes, double precio) {
		this.domicilio = domicilio;
		this.superficie = superficie;
		this.cantAmbientes = cantAmbientes;
		this.precio = precio;
		interesados = new ArrayList<Interesado>();
	}
	
	public void agregarInteresado(Cliente cliente) {
		interesados.add(cliente);
	}
	
	public void setPrecio(double nuevoPrecio) {
		for(Interesado i: interesados) {
			i.notificacionCambioPrecio("El " + this.toString() + " por el que ha demostrado interes, cambio su precio de " 
										+ this.precio + " a " + nuevoPrecio);
		}
		this.precio = nuevoPrecio;
	}

	@Override
	public String toString() {
		return "Inmueble [domicilio=" + domicilio + ", superficie=" + superficie + ", cantAmbientes=" + cantAmbientes + "]";
	}
	
	

}
