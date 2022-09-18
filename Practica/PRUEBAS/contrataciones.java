package PRUEBAS;

import java.util.Scanner;

public class contrataciones {
	
	public static final String DESTINO_PROMOCIONAL = "DISNEY";
	public static final String PAQUETE1 = "BRASIL";
	public static final double PRECIO_UNITARIO1 = 6000;
	public static final String PAQUETE2 = "CARIBE";
	public static final double PRECIO_UNITARIO2 = 15000;
	public static final String PAQUETE3 = "DISNEY";
	public static final double PRECIO_UNITARIO3 = 35000;
	public static final String PAQUETE4 = "EUROPA";
	public static final double PRECIO_UNITARIO4 = 70000;	
	
	public static double cantPaquetesVendidos = 0;
	public static double totalRecaudado = 0;
	public static double paquetesDisney = 0;
	public static double mayorMonto = -999999999;
	public static String paqueteMayorMonto;
	public static String clienteMayorMonto;
	
	public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
		System.out.printf("Bienvenido!\n\n");

        int paquete = menu(); 
        
		while (paquete !=0) {
			String nombreCliente = ingresarNombre();
			int pasajeros = ingresarPasajeros();
			precioDelPaquete(paquete,pasajeros,nombreCliente);
			paquete = menu(); 
		}
		if (cantPaquetesVendidos==0)
			System.out.println("NO SE REALIZADO NINGUNA VENTA!");			
		else {
			System.out.println("Total de Paquetes hoy: " + cantPaquetesVendidos);	
			System.out.println("Total recuadado: " + totalRecaudado);	
			System.out.println("Paquete de mayor monto: " + paqueteMayorMonto + " por:  " + mayorMonto + " a nombre de: " + clienteMayorMonto);
			System.out.println("Monto invertido por pasajero: " + totalRecaudado/cantPaquetesVendidos);	
			System.out.println("Cantidad de pasajes vendidos a Disney: " + paquetesDisney + " (" + (cantPaquetesVendidos/paquetesDisney) + ")");
		}
        input.close();
	}
	
    public static int menu(){
        Scanner input = new Scanner(System.in);
        int valor;
        do {
	    	System.out.printf("\n");
	    	System.out.printf("*** Destinos y precios ***\n");
	        System.out.printf("1 - Brasil ($6000.0)\n");
	        System.out.printf("2 - Caribe ($15000.0)\n");
	        System.out.printf("3 - Disney ($35000.0)\n");
	        System.out.printf("4 - Europa ($70000.0)\n");
	        System.out.printf("0 - TERMINAR CARGA\n");
	        System.out.printf("Atencion: precio promocional a " + DESTINO_PROMOCIONAL + " \n");
	        System.out.printf("Elija el Paquete que desea adquirir: ");
			valor = Integer.parseInt(input.nextLine());
        } while ((valor < 0) || (valor > 4));
	    input.close();
	    return valor;
    }
    
    public static String ingresarNombre(){
        Scanner input = new Scanner(System.in);
        String nombre;
        do {
	        System.out.printf("Ingrese el nombre del cliente: ");
			nombre = input.nextLine();
        } while (nombre.isEmpty());
	    input.close();
	    return nombre;
    }
    
    public static int ingresarPasajeros(){
        Scanner input = new Scanner(System.in);
        int a;
        do {
	        System.out.printf("Cantidad de pasajeros: ");
			a = Integer.parseInt(input.nextLine());
        } while (a<1);
	    input.close();
	    return a;
	    
    }
    
    public static void precioDelPaquete(int a, int b, String c){
    	double monto;
    	switch (a) {
    	 	case 1:
    	 		System.out.printf("\n");
    	 		System.out.println("Destino del paquete: " + PAQUETE1);
    	 		System.out.println("Cantidad de pasajeros: " + b);
    	 		monto = PRECIO_UNITARIO1*b;
    	 		System.out.println("Monto total del pasaje: " + monto);
    	 		System.out.printf("\n");
    	 		cantPaquetesVendidos++;
    	 		totalRecaudado = totalRecaudado + monto;
    	 		if (monto > mayorMonto) {
    	 			mayorMonto = monto;
    	 			paqueteMayorMonto = "BRASIL";
    	 			clienteMayorMonto = c;
    	 		}
    	 		break;
    	 	case 2:
    	 		System.out.printf("\n");
    	 		System.out.println("Destino del paquete: " + PAQUETE2);
    	 		System.out.println("Cantidad de pasajeros: " + b);    	 		
    	 		monto = PRECIO_UNITARIO2*b;
    	 		System.out.println("Monto total del pasaje: " + monto);
    	 		System.out.printf("\n");
    	 		cantPaquetesVendidos++;
    	 		totalRecaudado = totalRecaudado + monto;
    	 		if (monto > mayorMonto) {
    	 			mayorMonto = monto;
    	 			paqueteMayorMonto = "CARIBE";
    	 			clienteMayorMonto = c;
    	 		}
    	 		break;
    	 	case 3:
    	 		System.out.printf("\n");
    	 		System.out.println("Destino del paquete: " + PAQUETE3);
    	 		System.out.println("Cantidad de pasajeros: " + b);    	 		
    	 		monto = PRECIO_UNITARIO3*b;
    	 		System.out.println("Monto total del pasaje: " + monto);
    	 		System.out.printf("\n");
    	 		cantPaquetesVendidos++;
    	 		totalRecaudado = totalRecaudado + monto;
    	 		if (monto > mayorMonto) {
    	 			mayorMonto = monto;
    	 			paqueteMayorMonto = "DISNEY";
    	 			clienteMayorMonto = c;
    	 		}
    	 		paquetesDisney++;
    	 		break;
    	 	case 4:
    	 		System.out.printf("\n");
    	 		System.out.println("Destino del paquete: " + PAQUETE4);
    	 		System.out.println("Cantidad de pasajeros: " + b);    	 		
    	 		monto = PRECIO_UNITARIO4*b;
    	 		System.out.println("Monto total del pasaje: " + monto);
    	 		System.out.printf("\n");
    	 		cantPaquetesVendidos++;
    	 		totalRecaudado = totalRecaudado + monto;
    	 		if (monto > mayorMonto) {
    	 			mayorMonto = monto;
    	 			paqueteMayorMonto = "EUROPA";
    	 			clienteMayorMonto = c;
    	 		}
    	 		break;
    	 }
    	
    }
    
}
