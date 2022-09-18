package ejemplo_interface_mensajeros;

public class PalomaMensajera extends Ave implements EnviadorDeMensaje {
	
	private static String TIPO = "PalomaMensajera";
	
	public void volar() {
	}
	
	@Override
	public void enviarMensaje(String texto) {
		System.out.println("Soy una " + TIPO + ", y recibi el sig: mensaje: " + texto);
	}
	
	public void responderPaloma() {
		System.out.println("Aca estoy, palomon");
	}

}
