package PRUEBAS;

public class OrdenarArray {

	public static void main(String[] args) {

		int [] vector = {8,0,3,15,4,20};
		int aux;
		System.out.println("Vector Original");		
		
		for (int i=0; i<vector.length; i++) {
			System.out.println(vector[i]);
		}

		System.out.println("Vector Ordenado");		
		for (int i=0; i<vector.length; i++) {
			for (int j=i+1; j<vector.length; j++) {
				if (vector[i]<vector[j]) {
					aux=vector[i];
					vector[i]=vector[j];
					vector[j]=aux;
				}
			}
		}
		for (int i=0; i<vector.length; i++) {
			System.out.println(vector[i]);
		}

	}
}
