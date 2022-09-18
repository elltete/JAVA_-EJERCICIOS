package ejercicio_2;

import java.util.Scanner;

import ejercicio_3.LectorEnteros;
import ejercicio_3.RangoDeEnteros;

public class Ejercicio_2 {

	public static void main(String[] args) {

		//Scanner input = new Scanner(System.in);
		//LectorEnteros lector = new LectorEnteros(input);
		
		Alumno alu = null;
		int dni = 24000000, anioNacimiento = 2000;
		String nombreCompleto = "Pepe";

		try {
			while (alu == null) {
				alu = new Alumno(nombreCompleto, anioNacimiento, dni);
			}
		} catch (Exception e) {
			System.out.println(e.getMessage());
		}
		
		//input.close();
		
		if (alu != null) {
			System.out.println(alu.toString());

			if (alu.vive()) {
				System.out.println("La persona vive");
			} else {
				System.out.println("La persona no vive");
		}
			
		System.out.println("Su edad es " + alu.edad() + " años.");
}
		/*
		try {
			Alumno alumno1 = new Alumno(null, 2021, 24000000);
			Alumno alumno2 = new Alumno("Juan", 2000, 9000000);		
			Alumno alumno3 = new Alumno("Pedro", 2000, 100000000);				
		} catch (RuntimeException e) {
			System.out.println(e.getMessage());
		}
		*/
			
	}
}