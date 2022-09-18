package ejemplo_interface_mensajeros;

public class TelefonoMovil extends Ave implements EnviadorDeMensaje {
	
	private static String TIPO = "TelefonoMovil";

	public void encender() {	
	}
	
	@Override
	public void enviarMensaje(String texto) {
		System.out.println("Soy un " + TIPO + ", y recibi el sig: mensaje: " + texto);
	}
	
	public void responderMovil() {
		System.out.println("Aca estoy, mobile");
	}

}
