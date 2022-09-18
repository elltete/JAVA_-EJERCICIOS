package tp1_act2;

import java.util.Scanner;

public class ejercicio_19 {
	
	private static Scanner input = new Scanner(System.in);

	public static void main(String[] args) {
		boolean esDeUnSoloDigito = false;
		boolean esImpar = false;
		boolean estaEnAmbos = false;
		boolean noEstaEnNinguno = false;
		
		System.out.println("Ingresar un numero entero: ");
		int numero = Integer.parseInt(input.nextLine());
		
		System.out.println("**************************");
		
		if ((numero >= -9) && (numero <=9)) { // VERIFICAR QUE EL NUMERO TENGA UN SOLO DIGITO
			esDeUnSoloDigito = true;
			System.out.println("El numero es de un solo digito");
		}

		if (numero%2!=0) { // VERIFICA QUE EL NUMERO SEA IMPAR
			esImpar = true;
			System.out.println("El numero es impar");
		}

		if (esDeUnSoloDigito && esImpar) {
			estaEnAmbos = true;
			if (estaEnAmbos)
				System.out.println("El numero esta en ambos grupos");
		}
		
		if ((!esDeUnSoloDigito) && (!esImpar)) {
			noEstaEnNinguno = true;
			if(noEstaEnNinguno)
				System.out.println("El numero no esta en ambos grupos");
		}	
		input.close();
	}

}