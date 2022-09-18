package ar.edu.ort.monedero;

import java.util.Scanner;

public class Test {

	public static void main(String[] args) {
		
		EntidadFinanciera e = crearEntidad("a",0);

		EntidadFinanciera f = crearEntidad("",1);
		
		EntidadFinanciera entidad = crearEntidad("EntidadVirtual", 3);
		entidad.agregarCliente("Jose Perez", 55);
		entidad.agregarCliente("Alejandra Gonzalez", 30);
		entidad.agregarCliente("Carlos Garcia", 27);

		Moneda bitcoin = new Bitcoin(40000);
		Moneda ethereum = new Ethereum(32500);

		entidad.agregarTransaccion(1, bitcoin, 14000);
		entidad.agregarTransaccion(1, ethereum, 12000);
		entidad.agregarTransaccion(2, ethereum, 78000);
		entidad.agregarTransaccion(2, bitcoin, 62000);
		entidad.agregarTransaccion(3, bitcoin, 178000);
		
		entidad.agregarTransaccion(3, ethereum, 8000);
		entidad.agregarTransaccion(3, ethereum, 1000);
		entidad.agregarTransaccion(1, ethereum, 46000);
		entidad.agregarTransaccion(2, bitcoin, 56500);
		entidad.agregarTransaccion(2, bitcoin, 6120);
		entidad.agregarTransaccion(1, bitcoin, 7443);
		
		
		System.out.println("----------------------");
		entidad.mostrarDetalle();
		System.out.println("----------------------");
		entidad.cantMonedasPorCliente("Bitcoin");
		System.out.println("----------------------");
		mostrarInfoCliente(entidad);
		System.out.println("----------------------");
	
	}

	public static EntidadFinanciera crearEntidad(String nombre, int cantClientes){
		EntidadFinanciera ef = null;
		try {
			ef = new EntidadFinanciera(nombre, cantClientes);
		}catch(IllegalArgumentException e) {
			System.out.println(e.getMessage());
		}
		return ef;
	}
	
	public static void mostrarInfoCliente(EntidadFinanciera e){
		Scanner input = new Scanner(System.in);
		boolean numeroValido = false;
		int edad = -1;
		do{
			try{
				System.out.println("Ingrese la edad de un cliente:");
				edad = Integer.parseInt(input.nextLine());
				e.mostrarDetalleCliente(edad);
				numeroValido = true;
			}catch (NumberFormatException ex) {
				System.out.println("Por favor ingrese un numero");
			}
		}while(!numeroValido);
		
		input.close();
	}
}
