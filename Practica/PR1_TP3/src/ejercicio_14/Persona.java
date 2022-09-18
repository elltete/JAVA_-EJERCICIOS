package ejercicio_14;

public class Persona extends Cliente {
	
	private String telefono;

	public Persona(String nombre, String eMail, String telefono) {
		super(nombre, eMail);
		this.telefono = telefono;
	}

	@Override
	public void notificacionCambioPrecio(String texto) {
		System.out.println("He recibido un SMS en mi telefono " + this.telefono + ", con el mensaje: " + texto);
	}	

}
