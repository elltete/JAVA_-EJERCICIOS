package ar.edu.ort.monedero;

import edu.ort.tp1.u5.tda.Pila;
import edu.ort.tp1.u5.tda.nodos.PilaNodos;

public class Cliente implements Detallable{

	private int edad;
	private String nombre;
	private Pila<Transaccion> transacciones;
	
	
	public Cliente(String nombre, int edad){
		this.edad = edad;
		this.nombre = nombre;
		transacciones = new PilaNodos<Transaccion>();
	}
	
	public int getEdad() {
		return edad;
	}

	public String getNombre() {
		return nombre;
	}

	public void agregarTransaccion(Moneda moneda, double valor){
		transacciones.push(new Transaccion(moneda, valor));
	}	
	

	public double cantMonedas(String moneda){
		Transaccion transaccionEnCurso = null;
		double salida = 0;
		Pila<Transaccion> pilaAuxiliar = new PilaNodos<Transaccion>();
		while(!transacciones.isEmpty()) {
			transaccionEnCurso = transacciones.pop();
			if(transaccionEnCurso.getNombreMoneda().equals(moneda)) {
				salida += transaccionEnCurso.getValor();
			}
			pilaAuxiliar.push(transaccionEnCurso);
		}
		while(!pilaAuxiliar.isEmpty()) {
			transacciones.push(pilaAuxiliar.pop());
		}
		return salida;
	}

	@Override
	public void mostrarDetalle() {
		Transaccion t = null;
		int i = 0;
		Pila<Transaccion> pilaAux = new PilaNodos<>();
		while(!transacciones.isEmpty()){
			t = transacciones.pop();
			System.out.print("Transaccion: " +(i+1)+"- Moneda: "+ t.getNombreMoneda() + " ");
			System.out.println(", Cantidad: "+t.getValor());
			i++;
			pilaAux.push(t);
		}
		while(!pilaAux.isEmpty()){
			transacciones.push(pilaAux.pop());
		}
		
	}
	
	
}
