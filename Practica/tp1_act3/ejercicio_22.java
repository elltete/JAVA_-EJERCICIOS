package tp1_act3;

public class ejercicio_22 {

	public static void main(String[] args) {
		System.out.println("*****USANDO WHILE******");
		int i=1;
		while (i<=5) {
			System.out.println("Valor: " + i);
			i++;
		}
		System.out.println("************");
		int j=1;
		while (j<=5) {
			System.out.println("Valor: " + (6-j));
			j++;
		}	
		System.out.println("*****USANDO FOR*******");

		for (int k=1 ; k<=5; k++) {
			System.out.println("Valor: " + k);
		}
		
		System.out.println("************");

		for (int m=1 ; m<=5; m++) {
			System.out.println("Valor: " + (6-m));
		}
	}

}
