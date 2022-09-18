package ort.edu.ar;

public class MainListaOrdenadaNumero {

	public static void main(String[] args) {
		ListaOrdenadaProductosPorPrecio lista = new ListaOrdenadaProductosPorPrecio();
		lista.add(new Producto(400, "Papas"));
		lista.add(new Producto(350, "Chocolate"));
		lista.add(new Producto(100, "Gaseosa"));
		lista.add(new Producto(100, "Oreo"));
		lista.add(new Producto(490, "Papel"));

		for (Producto producto : lista) {
			System.out.println(producto.getNombre() + " $" + producto.getPrecio());
		}

		System.out.println("---------------------------");
		
		ListaOrdenadaProductosPorNombre listaNombres = new ListaOrdenadaProductosPorNombre();
		listaNombres.add(new Producto(400, "Papas"));
		listaNombres.add(new Producto(350, "Chocolate"));
		listaNombres.add(new Producto(100, "Gaseosa"));
		listaNombres.add(new Producto(100, "Oreo"));
		listaNombres.add(new Producto(490, "Papel"));

		for (Producto producto : listaNombres) {
			System.out.println(producto.getNombre() + " $" + producto.getPrecio());
		}

	}

}
