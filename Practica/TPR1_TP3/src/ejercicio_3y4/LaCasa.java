package ejercicio_3y4;

import java.util.ArrayList;
import java.util.Scanner;

public class LaCasa {
	
	private static Scanner input = new Scanner(System.in);

	private ArrayList<Producto> productos;

	public LaCasa() {
		productos = new ArrayList<Producto>();
	}

	public void agregarProducto(Producto producto) {
		productos.add(producto);
	}

	public void mostrarMenu(Cliente clie) {
		ArrayList<Producto> productosElegidos = new ArrayList<Producto>();
		int opcion, total=0;
		do {
			System.out.println("*** LISTA DE PRODCUTOS DISPONIBLES ***");
			int i = 1;
			for(Producto prd: productos) {
				System.out.println(i + " " + prd.listadoMenu());
				i++;
			}
			System.out.println("Elija un producto (0 para salir): ");			
			opcion = Integer.parseInt(input.nextLine());
			if(opcion!=0 && opcion>0 && opcion<i) {
				productosElegidos.add(productos.get(opcion-1));
			}
		}while(opcion != 0);
		clie.crearTicket();
		System.out.println("**************************************");
		System.out.println("*** LISTA DE PRODCUTOS ELEGIDOS ***");
		for(Producto prd: productosElegidos) {
			System.out.println(prd.listadoProdElegidos());
			total += prd.getPrecio();
			clie.getTicket().agregarPoducto((Producto) prd);
		}
		System.out.println("Total: $" + total);
	}
}
