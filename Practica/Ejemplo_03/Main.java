package Ejemplo_03;

import java.util.ArrayList;

public class Main {

	public static void mostrar (String lista, ArrayList<Cliente> clientes) {
		System.out.println(lista);
		for (Cliente cliente: clientes) {
			System.out.println(cliente);
		}
	}
	
	public static Cliente buscar(String nombre, ArrayList<Cliente> clientes) {
		Cliente cliente = null;
		int index = 0;
		
		while (cliente == null && index < clientes.size()) {
			if (clientes.get(index).nombre.equals(nombre)) {
				cliente = clientes.get(index);
			}
			else {
				index++;
			}
		}
		
		return cliente;
	}
	
	public static void main(String[] args) {
		ArrayList<Cliente> clientes = new ArrayList<>();
		ArrayList<Cliente> deudores = new ArrayList<>();
		
		Cliente cliente;
		
		clientes.add(new Cliente("c1"));
		clientes.add(new Cliente("c2"));
		clientes.add(new Cliente("c3"));
		
		
		cliente = buscar ("c2" , clientes);
		
		deudores.add(cliente);
		//clientes.remove(cliente);
		
		cliente.nombre = "c10";
		
		mostrar("Clientes", clientes);
		mostrar("Deudores", deudores);

	}

}
