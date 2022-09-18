package ejercicio_3;

import ejercicio_1.Persona;
import ejercicio_1.TipoDeLinea;
import ejercicio_2.Mascota;

public class Test {

	public static void main(String[] args) {

		Persona tete = new Persona("Ponzo", "Diego");
		Persona ari = new Persona("Gianmichael", "Ari");
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
		
		Hito hit1 = new Hito("30-08-21","Salio el Sol");
		hit1.agregarPersona(tete);
		hit1.agregarPersona(ari);

		Hito hit2 = new Hito("30-08-21","Se metio el Sol");
		hit2.agregarPersona(tete);

		
		tete.mostrarTodo();
		ari.mostrarTodo();

	}

}
