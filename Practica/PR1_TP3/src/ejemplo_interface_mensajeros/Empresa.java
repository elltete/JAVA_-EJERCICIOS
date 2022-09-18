package ejemplo_interface_mensajeros;

import java.util.ArrayList;
import java.util.Collections;

public class Empresa {
	
	private ArrayList<EnviadorDeMensaje> mensajeros;
	
	public Empresa() {
		this.mensajeros = new ArrayList<EnviadorDeMensaje>();
	}

	public void agregarMensajero(EnviadorDeMensaje mensajero) {
		mensajeros.add(mensajero);
		Collections.shuffle(mensajeros);
	}

	public void hacerCampania(String texto) {
		for(EnviadorDeMensaje em: mensajeros) {
			em.enviarMensaje(texto);
		}
	}
	
	public void hacerCampaniaAPalomas(String texto) {
		for(EnviadorDeMensaje em: mensajeros) {
			if(em instanceof PalomaMensajera) {
				em.enviarMensaje(texto);
			}
		}
	}
	
	public void hacerCampaniaAMoviles(String texto) {
		for(EnviadorDeMensaje em: mensajeros) {
			if(em instanceof TelefonoMovil) {
				em.enviarMensaje(texto);
			}
		}
	}
	
	public void hacerCampania() {
		for(EnviadorDeMensaje em: mensajeros) {
			if(em instanceof TelefonoMovil) {
				((TelefonoMovil) em).responderMovil();
			}else {
				((PalomaMensajera) em).responderPaloma();
			}
		}
	}
	

}
