package ejercicio_3;

public class Test {

	private static Saludador saludador;
	
	public static void main(String[] args) {
		saludador = new Saludador("ES");
		saludador.run();
		
		cambiarIdiomaYEjecutar("EN");
		cambiarIdiomaYEjecutar("FR");
	}

	private static void cambiarIdiomaYEjecutar(String idioma) {
		try {
			saludador.elegirIdioma(idioma);
			saludador.run();
		} catch (RuntimeException re) {
			System.out.println("Upss... hubo un error:");
			System.out.println(re.getMessage());
		}
	}
}