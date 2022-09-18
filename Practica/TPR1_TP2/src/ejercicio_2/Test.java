package ejercicio_2;

import ejercicio_1.Persona;
import ejercicio_1.TipoDeLinea;

public class Test {

	public static void main(String[] args) {

		Persona tete = new Persona("Ponzo", "Diego");
		tete.agregarEmail("diegoponzo@gmail.com");
		tete.agregarTelefono(11,43434343, 54, TipoDeLinea.CELULAR);
		tete.agregarEmail("diegoponzo@yahoo.com.ar");
		tete.agregarTelefono(11,43434343, 54, TipoDeLinea.FIJO);
		tete.agregarEmail("diegoponzo@hotmail.com");
		
		Mascota m1 = new Mascota("Lola", "Caniche");
		tete.agregarMascota(m1);
		Mascota m2 = new Mascota("Cuqui", "Salchica");
		tete.agregarMascota(m2);
		
		tete.mostrarTodo();
		
		tete.eliminarMascota(m2);
		
		tete.mostrarTodo();

	}

}
