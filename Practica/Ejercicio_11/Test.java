package Ejercicio_11;

public class Test {
	private static Cheff cheff;
	
	private static void cargarProductos () {

		cheff.agregarProducto("Tomate", new Fecha(1,6,2021), 2, true);
		
		cheff.agregarProducto("Papa", new Fecha(1,6,2021), 1, false);
	}
	
	private static void mostrarProductosParaExtraer() {
		System.out.println("Listado de productos para extraer");
		for (Producto producto: cheff.extraerProductosVencidos()) {
			System.out.println(producto);
		}
	}
	
	public static void main(String[] args) {
		
		cheff = new Cheff();
		
		cargarProductos();

		cheff.mostrarProductos();
		
		mostrarProductosParaExtraer();
	}

}
