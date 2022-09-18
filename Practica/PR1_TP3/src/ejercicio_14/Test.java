package ejercicio_14;

public class Test {

	public static void main(String[] args) {

		Inmueble inmueble = new Inmueble("Blanco Encalada", 45, 2, 100000);
		
		inmueble.agregarInteresado(new Inmobiliaria("Remax", "remax@remax.com", 3));
		inmueble.agregarInteresado(new Inmobiliaria("Guariniello", "Guariniello@Guariniello.com", 3));
		inmueble.agregarInteresado(new Inmobiliaria("Santos", "Santos@Santos.com", 3));
		inmueble.agregarInteresado(new Persona("Diego", "diego@hotmail.com", "4444-4444"));
		inmueble.agregarInteresado(new Persona("Pedro", "pedro@hotmail.com", "5555-5555"));		
		inmueble.agregarInteresado(new Persona("Pablo", "pablo@hotmail.com", "6666-6666"));
		
		inmueble.setPrecio(95000);
		

	}

}
