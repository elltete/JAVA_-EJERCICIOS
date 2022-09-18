package ar.edu.ort.tp1.final3.clases;

import edu.ort.tp1.u5.tda.Cola;
import edu.ort.tp1.u5.tda.ListaOrdenada;
import edu.ort.tp1.u5.tda.Pila;
import edu.ort.tp1.u5.tda.nodos.ColaNodos;
import edu.ort.tp1.u5.tda.nodos.PilaNodos;

public class Supermercado {

	private static final String TIPO_CLIENTE_NO_ENCONTRADO = "El tipo de cliente que ha ingresado no se encuentra disponible";
	private static final String SALDO_INSUFICIENTE = "El saldo que posee no alcanza para realizar esta compra";

	private Cola<Cliente> fila;
	private ListaOrdenadaCompra listaCompra;

	public Supermercado() {
		fila = new ColaNodos<Cliente>();
		listaCompra = new ListaOrdenadaCompra();
	}

	public Cliente crearCliente(Clientes tipo, String nombre, int edad, double dinero) {
		Cliente clienteAux = null;
		try {
			switch (tipo) {
			case COBRE:
				clienteAux = new ClienteCobre(nombre, edad, dinero);
				break;

			case PLATA:
				clienteAux = new ClientePlata(nombre, edad, dinero);
				break;

			case ORO:
				clienteAux = new ClienteOro(nombre, edad, dinero);
				break;
			case DIAMANTE:
				throw new IllegalArgumentException(TIPO_CLIENTE_NO_ENCONTRADO);
			default:
				break;
			}
		} catch (Exception e) {
			System.out.println(e.getMessage());
		}

		return clienteAux;
	}

	public void agregarAlCarrito(Cliente cliente, Producto producto) {
		if (cliente != null) {
			try {
				cliente.agregarProducto(producto);
			} catch (Exception e) {
				System.out.println(e.getMessage());
			}
		}
	}

	public void agregarAFila(Cliente cliente) {
		if (cliente != null) {
			fila.add(cliente);
		}
	}

	public void atenderCaja() {
		while (!fila.isEmpty()) {
			try {
				realizarCompra(fila.remove());
			} catch (Exception e) {
				System.out.println(e.getMessage());
			}
		}
	}

	public void realizarCompra(Cliente cliente) {
		double total = verPrecioCarrito(cliente.getCarrito());
		boolean descuento = cliente.tieneDescuento(total);
		if (descuento) {
			total = cliente.realizarDescuento(total);
		}

		if (!cliente.puedeComprar(total)) {
			throw new IllegalArgumentException(SALDO_INSUFICIENTE);
		}

		listaCompra.add(new Compra(total, cliente, descuento));

	}

	public double verPrecioCarrito(Pila<Producto> carrito) {
		double total = 0;
		Pila<Producto> carritoAux = new PilaNodos<Producto>();
		while (!carrito.isEmpty()) {
			total += carrito.peek().getPrecio();
			carritoAux.push(carrito.pop());
		}

		while (!carritoAux.isEmpty()) {
			carrito.push(carritoAux.pop());
		}

		return total;
	}

	public void mostrarCompras() {
		System.out.println("Las compras son");
		for (Compra compra : listaCompra) {
			compra.mostrarTicket();
		}
	}

}
