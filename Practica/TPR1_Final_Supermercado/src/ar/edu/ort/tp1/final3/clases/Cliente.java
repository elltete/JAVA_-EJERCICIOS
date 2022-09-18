package ar.edu.ort.tp1.final3.clases;

import edu.ort.tp1.u5.tda.Pila;
import edu.ort.tp1.u5.tda.nodos.PilaNodos;

public abstract class Cliente implements ClienteDescontable {
	
	private static final String MSG_MENOR_DE_EDAD = "El cliente no puede ser menor de edad";
	private static final String MSG_SALDO_NEGATIVO = "El saldo no puede ser negativo";
	private static final String MSG_NOMBRE_NULO = "El nombre no puede ser nulo ni vacio";
	private static final String PRODUCTO_INVALIDO = "El producto ya se encuentra 2 veces en el carrito";
	private static final int MENOR_DE_EDAD = 18;

	private String nombre;
	private int edad;
	private double importeAGastar;
	private Pila<Producto> carrito;
	
	public Cliente(String nombre, int edad, double importeAGastar) {
		setNombre(nombre);
		setEdad(edad);
		setSaldo(importeAGastar);
		carrito = new PilaNodos<Producto>();
	}
	
	private void setNombre(String nombre) {
		if(nombre == null || nombre.isEmpty()) {
			throw new IllegalArgumentException(MSG_MENOR_DE_EDAD);
		}
		this.nombre = nombre;
	}
	
	private void setEdad(int edad) {
		if(edad<MENOR_DE_EDAD){
			throw new IllegalArgumentException(MSG_NOMBRE_NULO);
		}
		this.edad = edad;
	}
	
	private void setSaldo(double saldo) {
		if(saldo<0) {
			throw new IllegalArgumentException(MSG_SALDO_NEGATIVO);
		}
		this.importeAGastar = saldo;
	}
	
	public void agregarProducto(Producto producto) {
		if(sePuedeAgregarAlCarrito(producto)) {
			carrito.push(producto);
		}else {
			throw new IllegalArgumentException("PRODUCTO_INVALIDO");
		}
	}
	
	private boolean sePuedeAgregarAlCarrito(Producto producto) {
		boolean sePuede = true;
		Pila<Producto> carritoAux = new PilaNodos<Producto>();
		while(!carrito.isEmpty() && sePuede) {
			if(carrito.peek() == producto) {
//			if(carrito.peek().getNombre().equals(producto.getNombre()))
				sePuede = false;
			}else {
				carritoAux.push(carrito.pop());
			}
		}
		while(!carritoAux.isEmpty()) {
			carrito.push(carritoAux.pop());
		}
		return sePuede;
	}

	public boolean puedeComprar(double total) {
		return importeAGastar <= total;
	}

}
