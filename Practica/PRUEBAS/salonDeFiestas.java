package PRUEBAS;

import java.util.Scanner;

public class salonDeFiestas {

	public static final double INCREMENTOFERIADO = 0.1;
	public static final double HORATEMPRANA = 0.1;	
	public static final double PORCCANTPERSONASCOMUN = 0.2;
	public static final double PORCCANTPERSONASIMPERIAL = 0.2;
	public static final double PORCENTAJESEÑACOMUN = 0.2;
	public static final double PORCENTAJESEÑAIMPERIAL = 0.3;

	public static final int CANTPERSONASCOMUN = 100;
	public static final int CANTPERSONASIMPERIAL = 150;
	public static final int VALORPERSONACOMUN = 1000;
	public static final int VALORPERSONAIMPERIAL = 1500;

	public static final char IMPERIAL = 'I';
	public static final char COMUN = 'C';
	public static final char FERIADO = 'F';
	public static final char HABIL = 'H';

	private static Scanner input = new Scanner(System.in);

	public static void main(String[] args) {

		int cantDePersonas, cantSalonImperialYFeriado=0, recaudacionSalonImperial=0, recaudacionSalonComun=0;
		int horaReserva, costoTotalImperial, costoTotalComun;
		//String fechaReserva;
		char tipoDeDia, nombreSalon;

		System.out.println("SISTEMA DE RESERVAS DE SALONES");

		do {
			System.out.println("Para la reserva ingresar cantidad de personas (Fin:-1):");
			cantDePersonas = Integer.parseInt(input.nextLine());
		}while(cantDePersonas < -1 || cantDePersonas == 0);

		while (cantDePersonas != -1) {
			System.out.println("Ingrese Fecha de reserva: ");
			//fechaReserva = input.nextLine();
			
			System.out.println("Ingresa Hora de reserva");
			horaReserva = Integer.parseInt(input.nextLine());

			do {
				System.out.println("Ingrese dia (H)abil o (F)eriado");
				tipoDeDia = input.nextLine().toUpperCase().charAt(0);
			}while(tipoDeDia!=HABIL && tipoDeDia!=FERIADO);

			do {
				System.out.println("Ingresa nombre del Salon (I)mperial o (C)omun:");
				nombreSalon = input.nextLine().toUpperCase().charAt(0);
			}while(nombreSalon!=IMPERIAL && nombreSalon!=COMUN);

			costoTotalComun=0;
			costoTotalImperial=0;

			if (nombreSalon==IMPERIAL) {
				costoTotalImperial = cantDePersonas * VALORPERSONAIMPERIAL;
				if(cantDePersonas>=CANTPERSONASIMPERIAL) 
					costoTotalImperial *= (1-PORCCANTPERSONASIMPERIAL);
				if(horaReserva<20)
					costoTotalImperial *= (1-HORATEMPRANA);
				if(tipoDeDia==FERIADO) {
					costoTotalImperial *= (1+INCREMENTOFERIADO);
					if(horaReserva>20)
						costoTotalImperial *= (1+HORATEMPRANA);
				}
				System.out.println("Valor de la Seña: " + (costoTotalImperial * PORCENTAJESEÑAIMPERIAL));
				System.out.println("Costo total de la fiesta: " + costoTotalImperial);
				recaudacionSalonImperial *= costoTotalImperial;	
			}
			else{
				costoTotalComun = cantDePersonas * VALORPERSONACOMUN;
				if(cantDePersonas>=CANTPERSONASCOMUN) 
					costoTotalComun *= (1-PORCCANTPERSONASCOMUN);
				if(horaReserva<20)
					costoTotalComun *= (1-HORATEMPRANA);
				if(tipoDeDia==FERIADO) {
					costoTotalComun *= (1+INCREMENTOFERIADO);
					if(horaReserva>20)
						costoTotalComun *= (1+HORATEMPRANA);
				}
				System.out.println("Valor de la Seña: " + (costoTotalComun * PORCENTAJESEÑACOMUN));
				System.out.println("Costo total de la fiesta: " + costoTotalComun);
				recaudacionSalonComun *= costoTotalComun;						
			}

			if(nombreSalon==IMPERIAL && nombreSalon==FERIADO)
				cantSalonImperialYFeriado++;

			do {
				System.out.println("Para la reserva ingresar cantidad de personas (Fin:-1):");
				cantDePersonas = Integer.parseInt(input.nextLine());
			}while(cantDePersonas < -1 || cantDePersonas == 0);
		}


		System.out.println("Cantidad de fiestas en el salon Imperial y dias Feriados: " + cantSalonImperialYFeriado);
		System.out.println("Recaudacion total de señas del Salon Imperial: " + recaudacionSalonImperial);
		System.out.println("Recaudacion total de señas del Salon Comun: " + recaudacionSalonComun);


		if(recaudacionSalonImperial>recaudacionSalonComun)
			System.out.println("Salon Imperial es el que mas recaudo");
		else
			if (recaudacionSalonImperial==recaudacionSalonComun)
				System.out.println("Ambos salones recaudaron lo mismo");
			else
				System.out.println("Salon Comun es el que mas recaudo");


		input.close();
	}
}
