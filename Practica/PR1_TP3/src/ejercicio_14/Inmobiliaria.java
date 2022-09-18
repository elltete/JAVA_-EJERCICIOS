package ejercicio_14;

public class Inmobiliaria extends Cliente {
	
	private double porcentajeComision;

	public Inmobiliaria(String nombre, String eMail, double porcentajeComision) {
		super(nombre, eMail);
		this.porcentajeComision = porcentajeComision;
	}

	@Override
	public void notificacionCambioPrecio(String texto) {
		System.out.println("Hemos recibido un eMail a nuestra casilla " + super.getEMail() + ", con el mensaje: " + texto);
	}	
}