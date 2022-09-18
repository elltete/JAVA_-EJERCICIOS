package tp1_act3;

import java.util.Scanner;

public class ejercicio_38 {
	
	private static Scanner input = new Scanner(System.in);
	
	public static final String USER = "admin";
	public static final String PASS = "123456";

	public static void main(String[] args) {
		
		int contBloqueo=0;
		String inputUser, inputPass;
		
		do {
			System.out.println("Ingrese Usuario: ");
			inputUser = input.nextLine();
			System.out.println("Ingrese Password: ");
			inputPass = input.nextLine();
		
			if (!(inputUser.equals(USER)) || !(inputPass.equals(PASS))) {
				contBloqueo = contBloqueo + 1;
				System.out.println("Usuario o Password incorrecta");
			}
		} while (!(inputUser.equals(USER)) && !(inputPass.equals(PASS)) && (contBloqueo<3));
		
		if (contBloqueo == 3)
			System.out.println("Usuario Bloqueado. Contacte con el Administrador.");
		else
			System.out.println("Acceso concedido");
		
		input.close();
	}
}