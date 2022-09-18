package ejemplo_Excepcion;

import java.util.Scanner;

public class Test {

	private static Scanner input = new Scanner(System.in);
	
	public static void main(String[] args) {

		double i = 0;
		int temp = 0;
		try {
			temp = Integer.parseInt("1");  // RuntimeException
			i = 9/1;						// ArithmeticException
			// solo se puede generar una a mano
			throw new ArithmeticException("Es una ArithmeticException creada a proposito"); // Aca se genera una ArithmeticException
			//throw new RuntimeException("Es una RuntimeException"); // Aca se genera una RuntimeException			
			//throw new Exception("Es una Exception"); // Aca se genera una Exception
		} catch (ArithmeticException e) {
			System.out.println(e.getMessage());
		} catch (RuntimeException e) {
			System.out.println(e.getMessage());
		} catch (Exception e) {
			System.out.println(e.getMessage());
		}
		finally { // codigo que se ejecuta al finalizar los try/catch (igualemente es opcional)
			System.out.println("Cerrar scanner");			
		}

		System.out.println("temp: " + temp);	
		System.out.println("i: " + i);

		int edad = 0;
		do {
			try {
				System.out.println("Ingrese edad");
				edad = Integer.parseInt(input.nextLine());
			}catch (Exception e) {
				System.out.println("Valor incorrecto para la edad.");
			}
		} while (edad == 0);

	}

}
