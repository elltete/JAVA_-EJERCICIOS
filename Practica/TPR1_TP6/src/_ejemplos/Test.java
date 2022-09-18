package _ejemplos;

import implementaciones.ColaNodos;
import implementaciones.PilaNodos;
import interfaces.Cola;
import interfaces.Pila;

public class Test {

	public static void main(String[] args) {

		System.out.println("EJEMPLOS DE PILA");
		
		Pila<String> tubo = new PilaNodos<>();
		
		tubo.push("A");
		tubo.push("L");
		tubo.push("T");
		tubo.push("E");
		tubo.push("G");
		
		System.out.println(tubo.pop());
		System.out.println(tubo.peek());	
		System.out.println(tubo.pop());
		
		Pila<String> tubo2 = new PilaNodos<String>();
		
		tubo2.push(tubo.pop());
		tubo2.push(tubo.pop());
		
		System.out.println(tubo.pop());
		System.out.println(tubo2.pop());

		System.out.println();
		System.out.println("EJEMPLOS DE COLA");
		Cola<String> cola1 = new ColaNodos<>();
		
		cola1.add("B");
		cola1.add("T");
		cola1.add("O");
		cola1.add("E");
		
		cola1.add(cola1.remove());
		System.out.println(cola1.remove());
		System.out.println(cola1.remove());
		System.out.println(cola1.remove());
		System.out.println(cola1.remove());
		
		if(!cola1.isEmpty()) {
			System.out.println(cola1.get());
		}else {
			System.out.println("Esta vacia");
		}
		
	}

}
