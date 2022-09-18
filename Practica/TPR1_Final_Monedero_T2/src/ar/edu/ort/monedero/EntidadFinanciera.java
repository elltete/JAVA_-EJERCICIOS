package ar.edu.ort.monedero;

import edu.ort.tp1.u5.tda.ListaOrdenada;

public class EntidadFinanciera implements Detallable{
	
	private final String MSG_CANT_CLIENTES = "La cantidad de clientes no puede ser menor o igual a cero";
	private final String MSG_ERROR_NOMBRE = "El nombre no debe ser nulo o vacio";
	private String nombre;
	private Cliente[] clientes;

	public EntidadFinanciera(String nombre, int cantClientes) {
		if (cantClientes <= 0) {
			throw new IllegalArgumentException(MSG_CANT_CLIENTES);
		}
		setNombre(nombre);
		clientes = new Cliente[cantClientes];
	}
	
	private void setNombre(String nombre) {
		if (nombre == null || nombre.isEmpty()) {
			throw new IllegalArgumentException(MSG_ERROR_NOMBRE);
		}
		this.nombre = nombre;
	}

	public void agregarCliente(String nombre, int edad) {
		int posicion = verificarDisponibilidad();
		if(posicion == -1) {
			System.out.println("No hay disponibilidad para agregar al cliente");
		} else {
			clientes[posicion] = new Cliente(nombre, edad);
			System.out.println("Se ha agregado el cliente " + nombre + " en la posicion " + (posicion+1));
		}
	}
	
	private int verificarDisponibilidad() {
		boolean disponible = false;
		int posicion = -1;
		int i = 0;
		while(i<clientes.length && !disponible) {
			if(clientes[i] == null) {
				disponible = true;
				posicion = i;
			}else {
				i++;
			}
		}
		return posicion;
	}

	public void agregarTransaccion(int nroCliente, Moneda moneda, double valor) {
		clientes[nroCliente-1].agregarTransaccion(moneda, valor);
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
		int nroCliente = 0;
		System.out.println("Mostrando la cantidad de monedas " + moneda +" por cliente");
		for(Cliente cli: clientes) {
			if(cli != null) {
				nroCliente++;
				System.out.println("Cliente: " + nroCliente + "- " + cli.getNombre() + 
						". Promedio del tipo " + moneda + ": " + cli.cantMonedas(moneda));
			}
		}
	}

	@Override
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
}
