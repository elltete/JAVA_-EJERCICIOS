package ejercicio_ejemplo_interfaces;

public class Test {

	public static void main(String[] args) {
		
		Accion accion = new Accion();

		Persona per = new Persona();
		Perro can = new Perro();
		Gallina gal = new Gallina();
		
		Corredor g = gal;
		Corredor c = can;
		Corredor p = per;
		
		accion.agregarCorredor(g);
		accion.agregarCorredor(c);
		accion.agregarCorredor(p);
		
		accion.correr();
		System.out.println("+++++++++++");
		accion.correrRapido();
		

	}

}
