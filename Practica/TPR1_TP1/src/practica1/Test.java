package practica1;

public class Test {

	public static void main(String[] args) {

		Grupo grupo1 = new Grupo("Grupo Numero 1");
		Grupo grupo2 = new Grupo("Grupo Numero 2");
		Grupo grupo3 = new Grupo("Grupo Numero 3");	
		
		System.out.println("Nombre del grupo: " + grupo1.getNombre());
		System.out.println("Nombre del grupo: " + grupo2.getNombre());

		grupo1.modificarNombre("Grupo 1");
		grupo2.modificarNombre("Grupo 2");
		
		System.out.println("Nuevo nombre del grupo: " + grupo1.getNombre());
		System.out.println("Nuevo nombre del grupo: " + grupo2.getNombre());
		
		grupo1.agregarIntegrante("Diego");
		grupo1.agregarIntegrante("Martin");
		grupo1.agregarIntegrante("Martin");
		grupo2.agregarIntegrante("Pablo");
		grupo2.agregarIntegrante("Pablo");
		grupo2.agregarIntegrante("Pablo");
		
		System.out.println("Cantidad de integrantes del " + grupo1.getNombre() + ": " + grupo1.getCantidadIntegrantes());
		System.out.println("Cantidad de integrantes del " + grupo2.getNombre() + ": " + grupo2.getCantidadIntegrantes());
		
		//System.out.println(grupo1.obtenerPosicionIntegrante("Martin"));
		
		System.out.println(grupo1.obtenerIntegrante(2));
		
		System.out.println(grupo1.removerIntegrante("Martin"));
		
		grupo1.mostrar();
		grupo2.mostrar();
		grupo3.mostrar();
		
		grupo1.vaciar();
		grupo1.mostrar();
		
		
		
	}

}
