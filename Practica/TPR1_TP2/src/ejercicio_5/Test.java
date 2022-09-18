package ejercicio_5;

import ejercicio_4.Direccion;
import ejercicio_4.Mueble;
import ejercicio_4.Persona;
import ejercicio_4.Vivienda;

public class Test {

	public static void main(String[] args) {

		Edificio BE = new Edificio();
		Persona diego = new Persona("Diego", "Ponzo", 47);
		Persona santi = new Persona("Santiago", "Ponzo", 11);
		Direccion dir = new Direccion("BE", 3020, 2, 'B');
		Vivienda viv = new Vivienda(dir);
		Direccion dir2 = new Direccion("BE", 3020, 2, 'A');
		Vivienda viv2 = new Vivienda(dir2);
		BE.agregarVivienda(viv2);
		BE.agregarVivienda(viv);
		
		viv.agregarPersona(santi);
		viv.agregarPersona(diego);
		Mueble mesa = new Mueble("mesa", "madera", "marron");
		viv.agregarMueble(mesa);
		Mueble cama = new Mueble("cama", "sommier", "blanco");
		viv.agregarMueble(cama);
		Mueble silla = new Mueble("silla", "madera", "marron");
		viv.agregarMueble(mesa);
		
		BE.mostrarTodo();
		
		BE.realizarMudanza(2, 'B', 2, 'A');
		
		BE.mostrarTodo();

	}

}
