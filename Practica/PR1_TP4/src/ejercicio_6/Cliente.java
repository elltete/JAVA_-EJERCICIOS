package ejercicio_6;

public class Cliente {
	
	private String razonSocial;
	private String CUIT;
	private String telefono;
	private Pais pais;
	
	public Cliente(String razonSocial, String CUIT, String telefono, Pais pais) {
		this.razonSocial = razonSocial;
		this.CUIT = CUIT;
		this.telefono = telefono;
		this.pais = pais;
	}

	public String getCUIT() {
		return CUIT;
	}

	public Pais getPais() {
		return pais;
	}

}
