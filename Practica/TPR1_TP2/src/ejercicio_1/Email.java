package ejercicio_1;

public class Email {
	
	private String cuenta;
	private String dominio;
	
	public Email(String email) {
		String[] parts = email.split("@");
		this.cuenta = parts[0];
		this.dominio = parts[1];
	}

	public String getValor() {
		return this.cuenta + "@" + this.dominio;
	}
}
