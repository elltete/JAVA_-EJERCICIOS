package ar.edu.ort.tp1.final3.clases;

import edu.ort.tp1.u5.tda.Pila;
import edu.ort.tp1.u5.tda.nodos.PilaNodos;

public abstract class Cliente implements ClienteDescontable {
	private static final String NOMBRE_INVALIDO = "El nombre no puede ser nulo ni vacio";
	private static final String EDAD_INVALIDO = "La edad no puede ser menor a 18 años";
	private static final String SALDO_INVALIDO = "El saldo no puede ser negativo";
	private static final String PRODUCTO_INVALIDO = "El producto ya se encuentra 2 veces en el carrito";

	private String nombre;
	private int edad;
	private double saldo;
	private Pila<Producto> carrito;

	public Cliente(String nombre, int edad, double saldo) {
		setNombre(nombre);
		setEdad(edad);
		setSaldo(saldo);
		carrito = new PilaNodos<Producto>();
	}

	public void agregarProducto(Producto producto) {
		Pila<Producto> carritoAux = new PilaNodos<Producto>();
		Producto productoAux = null;
		int contador = 0;
		while (!carrito.isEmpty() && contador < 3) {
			productoAux = carrito.pop();
			carritoAux.push(productoAux);
			if (productoAux.getNombre().equals(producto.getNombre())) {
				contador++;
			}
		}

		while (!carritoAux.isEmpty()) {
			carrito.push(carritoAux.pop());
		}

		if (contador > 1) {
			throw new IllegalArgumentException(PRODUCTO_INVALIDO);
		}

		carrito.push(producto);

	}

	public boolean puedeComprar(double total) {
		return saldo >= total;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		if (nombre == null || nombre.isEmpty()) {
			throw new IllegalArgumentException(NOMBRE_INVALIDO);
		}
		this.nombre = nombre;
	}

	public int getEdad() {
		return edad;
	}

	public void setEdad(int edad) {
		if (edad < 18) {
			throw new IllegalArgumentException(EDAD_INVALIDO);
		}
		this.edad = edad;
	}

	public double getSaldo() {
		return saldo;
	}

	public void setSaldo(double saldo) {
		if (saldo < 0) {
			throw new IllegalArgumentException(SALDO_INVALIDO);
		}
		this.saldo = saldo;
	}

	public Pila<Producto> getCarrito() {
		return carrito;
	}

	public void setCarrito(Pila<Producto> carrito) {
		this.carrito = carrito;
	}
	
	

}
