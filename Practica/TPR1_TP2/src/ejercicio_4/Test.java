package ejercicio_4;

public class Test {

	public static void main(String[] args) {

		Persona diego = new Persona("Diego", "Ponzo", 47);
		Persona santi = new Persona("Santiago", "Ponzo", 11);
		Direccion dir = new Direccion("BE", 3020, 2, 'C');
		Vivienda viv = new Vivienda(dir);
		viv.agregarPersona(santi);
		viv.agregarPersona(diego);
		Mueble mesa = new Mueble("mesa", "madera", "marron");
		viv.agregarMueble(mesa);
		Mueble cama = new Mueble("cama", "sommier", "blanco");
		viv.agregarMueble(cama);
		Mueble silla = new Mueble("silla", "madera", "marron");
		viv.agregarMueble(mesa);
		
		viv.mostraDatos();
	}

}
