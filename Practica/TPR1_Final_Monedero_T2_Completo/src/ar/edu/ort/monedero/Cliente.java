package ar.edu.ort.monedero;

import edu.ort.tp1.u5.tda.Pila;
import edu.ort.tp1.u5.tda.nodos.PilaNodos;

public class Cliente implements Detallable {
	private int edad;
	private String nombre;
	private Pila<Transaccion> pilaTransacciones;
	
	public Cliente(String nombre, int edad){
		this.nombre = nombre;
		this.edad = edad;
		pilaTransacciones = new PilaNodos<>();
	}	
	
	public void agregarTransaccion(Moneda moneda, double valor){
		Transaccion t = new Transaccion(moneda, valor);
		pilaTransacciones.push(t);
	}	
	
	public void mostrarDetalle(){
		Transaccion t = null;
		int i = 0;
		Pila<Transaccion> pilaAux = new PilaNodos<>();
		while(!pilaTransacciones.isEmpty()){
			t = pilaTransacciones.pop();
			System.out.print("Transaccion: " +(i+1)+"- Moneda: "+ t.getNombreMoneda() + " ");
			System.out.println(", Cantidad: "+t.getValor());
			i++;
			pilaAux.push(t);
		}
		while(!pilaAux.isEmpty()){
			pilaTransacciones.push(pilaAux.pop());
		}
	}
	
	public double cantMonedas(String moneda){
		Transaccion t = null;
		double total = 0;
		double salida = 0;
		int transacciones = 0;
		
		Pila<Transaccion> pilaAux = new PilaNodos<>();
		while(!pilaTransacciones.isEmpty()){
			t = pilaTransacciones.pop();
			if (t.getNombreMoneda().equalsIgnoreCase(moneda)){
				total += t.getValor();
				transacciones++;
			}
			pilaAux.push(t);
		}
		while(!pilaAux.isEmpty()){
			pilaTransacciones.push(pilaAux.pop());
		}
		
		if (transacciones > 0 ){
			salida = total / transacciones;
		}		
		return salida;
	}
	
	
	public String getNombre(){
		return nombre;
	}

	public int getEdad() {
		return edad;
	}	
}
