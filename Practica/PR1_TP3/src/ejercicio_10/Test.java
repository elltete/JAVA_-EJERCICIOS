package ejercicio_10;

public class Test {

	public static void main(String[] args) {

		Comercio comercio = new Comercio();
		
		comercio.agregarALista(new Insumo("A", TipoInsumo.HARDWARE, 0.10, 100));
		comercio.agregarALista(new Insumo("B", TipoInsumo.LIMPIEZA, 0.15, 50));
		comercio.agregarALista(new Insumo("C", TipoInsumo.PERIFERICO, 0.20, 70));
		
		comercio.agregarALista(new ServicioDeArmado(4));
		comercio.agregarALista(new ServicioDeArmado(10));
		comercio.agregarALista(new ServicioDeArmado(20));
								
		comercio.agregarALista(new ServicioDeReparacion(4,1));
		comercio.agregarALista(new ServicioDeReparacion(5,2));
		comercio.agregarALista(new ServicioDeReparacion(6,3));
		comercio.agregarALista(new ServicioDeReparacion(5,4));
		comercio.agregarALista(new ServicioDeReparacion(5,5));
		comercio.agregarALista(new ServicioDeReparacion(6,1));

		System.out.println(comercio.montoTotalFacturado());
		System.out.println(comercio.cantServiciosSimples());
		
	}

}
