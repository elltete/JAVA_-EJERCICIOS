package PRUEBAS;

import java.util.Scanner;

public class factorial {

	private static Scanner input = new Scanner(System.in);
	
	public static void main(String[] args) {
		int num;
		do {
			System.out.println("Ingrese un numero entero: ");
			num = Integer.parseInt(input.nextLine());
		}while (num<1);
        System.out.println("El factoral de " + num + " es: " + (float)f(num));
        input.close();
	}
		//metodo factorial sin recursividad
	/*
		public static double factorial(int n){
		    double fact=1;
		    int i;
		    if (n==0)
		        fact=1;
		    else
		        for(i=1;i<=n;i++)
		            fact=fact*i;
		 return fact;
		}
	 */
		//metodo factorial con recursividad
		public static double f(int n){
		    if (n==1)
		        return 1;
		    else
		    	return n*(f(n-1));
		}
}
