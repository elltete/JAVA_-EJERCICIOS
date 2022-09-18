package ejercicio_6;

import java.util.ArrayList;

public class Empresa {
	
	private final int CANT_VENDEDORES = 20;
	
	private Vendedor vendedores[];
	private ArrayList<Cliente> clientes;
	private ArrayList<Pedido> pedidos;
	
	public Empresa() {
		this.vendedores = new Vendedor[CANT_VENDEDORES];
		this.clientes = new ArrayList<Cliente>();
		this.pedidos = new ArrayList<Pedido>();
	}
	
	public void informarCantPedidos() {
		int[][] matrizVendedorXPais = new int[vendedores.length][Pais.values().length];
		int posVendedor, posPais;
		for(Pedido p: pedidos) {
			posVendedor = p.getIdVendedor();
			posPais = this.buscarPosicionPais(p.getCUIT());
			matrizVendedorXPais[posVendedor][posPais]++;
		}
		this.imprimirMatriz(matrizVendedorXPais);
	}
	
	public void clientesPorPais() {
		int[] arrayCantXPais = new int[Pais.values().length];
		for(Cliente clie: clientes) {
			arrayCantXPais[clie.getPais().ordinal()]++;
		}
		this.imprimirVector(arrayCantXPais);
	}
	
	public String paisMasRentable() {
		int[] vectorRecaudacionPorPais = new int[Pais.values().length];
		int posPaisMayorRecaudado;
		double montoPedido = 0;
		int posPais;
		for(Pedido p: pedidos) {
			montoPedido = p.calcularMonto();
			posPais = this.buscarPosicionPais(p.getCUIT());
			vectorRecaudacionPorPais[posPais] += montoPedido;
		}
		posPaisMayorRecaudado = this.buscarMayor(vectorRecaudacionPorPais);
		return Pais.values()[posPaisMayorRecaudado].name();
	}
	
	private int buscarPosicionPais(String CUIT) {
		Cliente cliente = this.buscarCliente(CUIT);
		return cliente.getPais().ordinal();
	}
	
	private Cliente buscarCliente(String CUIT) {
		int i = 0;
		Cliente cliente = null;
		while(i < clientes.size() && cliente == null) {
			if(clientes.get(i).getCUIT().equals(CUIT)) {
				cliente = clientes.get(i);
			}else {
				i++;
			}
		}
		return cliente;
	}
	
	private void imprimirMatriz(int[][] matriz) {
		for(int i=0; i<matriz.length; i++) {
			System.out.println("Vendedor : " + this.vendedores[i].getNombre());
			for(int j=0; j<matriz[i].length; j++) {
				System.out.println("Pais : " + Pais.values()[j].name() + " - Cantidad: " + matriz[i][j]);
			}
		}
	}
	
	private void imprimirVector(int[] vector) {
		for(int i=0; i<vector.length; i++) {
				System.out.println("Pais : " + Pais.values()[i].name() + " - Cantidad: " + vector[i]);
		}		
	}
	
	private int buscarMayor(int[] vector) {
		double montoMayor = 0;
		int posPais = 0;
		for(int i=0; i<vector.length; i++) {
			if(vector[i] > montoMayor) {
				montoMayor = vector[i];
				posPais = i;
			}
		}
		return posPais;
	}
	
	public void agregarVendedor(int id, Vendedor vendedor) {
		vendedores[id] = vendedor;
	}
	
	public void agregarCliente (Cliente cliente) {
		clientes.add(cliente);
	}

	public void agregarPedido (Pedido pedido) {
		pedidos.add(pedido);
	}
}
