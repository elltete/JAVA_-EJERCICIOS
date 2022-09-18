package ejercicio_2;

import ejercicio_1.Asalariado;
import ejercicio_1.Subcontratado;

public class Test {

	public static void main(String[] args) {

		Asalariado asa = new Asalariado((float) 200.00,"pepe", 20);
		Subcontratado sub = new Subcontratado("Diego", 33, 10, 30);
		Vendedor ven = new Vendedor("Diego", 33, 10, 30, 1);
		
		System.out.println(asa.calcularPago());
		System.out.println(sub.calcularPago());	
		System.out.println(ven.calcularPago());			

	}

}
