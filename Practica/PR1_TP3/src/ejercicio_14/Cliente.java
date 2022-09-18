package ejercicio_14;

public abstract class Cliente implements Interesado {
	
	private String nombre;
	private String eMail;
	
	public Cliente(String nombre, String eMail) {
		this.nombre = nombre;
		this.eMail = eMail;
	}
	
	public String getEMail() {
		return eMail;
	}

	public abstract void notificacionCambioPrecio(String texto);

}
