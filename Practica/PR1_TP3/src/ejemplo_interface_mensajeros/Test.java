package ejemplo_interface_mensajeros;

public class Test {

	public static void main(String[] args) {

		Empresa empresa = new Empresa();
		empresa.agregarMensajero(new PalomaMensajera());
		empresa.agregarMensajero(new PalomaMensajera());
		empresa.agregarMensajero(new PalomaMensajera());
		empresa.agregarMensajero(new PalomaMensajera());
		empresa.agregarMensajero(new PalomaMensajera());
		empresa.agregarMensajero(new TelefonoMovil());
		empresa.agregarMensajero(new TelefonoMovil());
		empresa.agregarMensajero(new TelefonoMovil());
		empresa.agregarMensajero(new TelefonoMovil());
		empresa.agregarMensajero(new TelefonoMovil());
		empresa.agregarMensajero(new TelefonoMovil());
		
		empresa.hacerCampania("Mensaje enviado a todos los mensajeros disponibles");
		empresa.hacerCampaniaAMoviles("Promocion 2x1 en SMS");
		empresa.hacerCampaniaAPalomas("Llego la primavera");
		
		empresa.hacerCampania();
	}

}
