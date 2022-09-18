package ejercicio_1;

public class Test {

	public static void main(String[] args) {

		Persona tete = new Persona("Ponzo", "Diego");
		tete.agregarEmail("diegoponzo@gmail.com");
		tete.agregarTelefono(11,43434343, 54, TipoDeLinea.CELULAR);
		tete.agregarEmail("diegoponzo@yahoo.com.ar");
		tete.agregarTelefono(11,43434343, 54, TipoDeLinea.FIJO);
		tete.agregarEmail("diegoponzo@hotmail.com");
		
		tete.mostrarTodo();
	}

}
