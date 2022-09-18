package ejercicio_3y4;

import java.util.ArrayList;

public class Ticket implements Imprimible {

	private ArrayList<Producto> productos;
	
	public Ticket() {
		productos =  new ArrayList<Producto>();
	}
	
	public void agregarPoducto(Producto producto) {
		productos.add(producto);
	}
	
	@Override
	public void imprimir() {
		double total = 0;
		System.out.println("**** Informacion de la compra **** ");
		for(Producto p: productos) {
			p.imprimir();
			total += p.getPrecio();
		}
		System.out.println("Total a pagar: $" + total);		
	}

	
	
}
