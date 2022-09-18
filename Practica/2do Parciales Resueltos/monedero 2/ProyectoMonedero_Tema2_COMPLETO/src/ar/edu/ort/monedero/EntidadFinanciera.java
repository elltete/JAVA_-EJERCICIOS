package ar.edu.ort.monedero;

import edu.ort.tp1.u5.tda.ListaOrdenada;

public class EntidadFinanciera implements Detallable {
	private final String MSG_CANT_CLIENTES = "La cantidad de clientes no puede ser menor o igual a cero";
	private String nombre;
	private Cliente[] clientes;

	public EntidadFinanciera(String nombre, int cantClientes) {
		if (cantClientes <= 0) {
			throw new IllegalArgumentException(MSG_CANT_CLIENTES);
		}		
		this.nombre = nombre;
		clientes = new Cliente[cantClientes];
	}

	public void agregarCliente(String nombre, int edad) {
		int pos = verificarDisponibilidad();
		if (pos != -1) {
			Cliente cliente = new Cliente(nombre, edad);
			clientes[pos] = cliente;
			System.out.println("Se ha agregado el cliente " + cliente.getNombre() + " en la posicion: " + (pos + 1));
		}
	}

	private int verificarDisponibilidad() {
		boolean disponible = false;
		int i = 0;
		int pos = -1;
		while (i < clientes.length && !disponible) {
			if (clientes[i] == null) {
				disponible = true;
				pos = i;
			} else {
				i++;
			}
		}
		return pos;
	}

	public void agregarTransaccion(int nroCliente, Moneda moneda, double valor) {
		clientes[nroCliente - 1].agregarTransaccion(moneda, valor);
	}

	public void mostrarDetalle() {
		System.out.println("Mostrando el detalle de los clientes de: "+ nombre);
		ListaOrdenada<String, Cliente> listaClientePorNombre = new ListaClientePorNombre();
		for (Cliente cliente : clientes) {
			if (cliente != null) {
				listaClientePorNombre.add(cliente);
			}
		}

		for (Cliente cliente : listaClientePorNombre) {
			System.out.println(cliente.getNombre() + " - Edad:" + cliente.getEdad());
			cliente.mostrarDetalle();
		}

	}

	public void mostrarDetalleCliente(int edad) {
		int i = 0;
		int nroCliente = -1;
		while(i<clientes.length && nroCliente < 0){
			if (clientes[i].getEdad() == edad){
				nroCliente = i;
			}
			i++;
		}
		if (nroCliente >= 0){
			System.out.println(clientes[nroCliente].getNombre() + " - " + clientes[nroCliente].getEdad());
			clientes[nroCliente].mostrarDetalle();			
		}else{
			System.out.println("Cliente no encontrado");
		}
	}

	public void cantMonedasPorCliente(String moneda) {
		System.out.println("Mostrando la cantidad de monedas " + moneda + " por cliente");
		for (int i = 0; i < clientes.length; i++) {
			System.out.print("Cliente: " + (i + 1) + " - " + clientes[i].getNombre());
			System.out.println(". Promedio del tipo " + moneda + ": " + clientes[i].cantMonedas(moneda));
		}
	}
}
