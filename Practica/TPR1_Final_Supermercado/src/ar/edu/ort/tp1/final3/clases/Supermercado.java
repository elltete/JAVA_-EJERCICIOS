package ar.edu.ort.tp1.final3.clases;

import edu.ort.tp1.u5.tda.Cola;
import edu.ort.tp1.u5.tda.ListaOrdenada;
import edu.ort.tp1.u5.tda.Pila;
import edu.ort.tp1.u5.tda.nodos.ColaNodos;
import edu.ort.tp1.u5.tda.nodos.PilaNodos;

public class Supermercado {

	private static final String TIPO_CLIENTE_NO_ENCONTRADO = "El tipo de cliente que ha ingresado no se encuentra disponible";

	private Cola<Cliente> fila;
	private ListaOrdenadaCompra listaCompra;

	public Supermercado() {
		fila = new ColaNodos<Cliente>();
		listaCompra = new ListaOrdenadaCompra();
	}
	
	
	public Cliente crearCliente(Clientes tipo, String nombre, int edad, double dinero) {
		Cliente cliente = null;
		try {
			switch(tipo) {
			case COBRE:
				cliente = new ClienteCobre(nombre, edad, dinero);
				break;
			case PLATA:
				cliente = new ClientePlata(nombre, edad, dinero);
				break;				
			case ORO:
				cliente = new ClienteOro(nombre, edad, dinero);
				break;
			default:
				throw new IllegalArgumentException(TIPO_CLIENTE_NO_ENCONTRADO);
			}
		}catch(Exception e) {
			System.out.println(e.getMessage());
		}
		return cliente;
	}


	public void agregarAlCarrito(Cliente cliente, Producto producto) {
		if(cliente!=null) {
			try {
				cliente.agregarProducto(producto);
			}catch(Exception e) {
				System.out.println(e.getMessage());
			}
		}
	}

	public void agregarAFila(Cliente cliente) {
	}

	public void atenderCaja() {
	}

	public void realizarCompra(Cliente cliente) {
	}

	public double verPrecioCarrito(Pila<Producto> carrito) {
		return 0;
	}

	public void mostrarCompras() {
	}

}
