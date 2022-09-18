package parcial_LicenciasConducir;

import java.util.ArrayList;

public class ExamenMoto extends Examen {
	
	private static int CILINDRADALIMITE = 150;
	private static int TIEMPOMAX = 120;
	private Moto moto;
	private ArrayList<Circuito> circuitos;

	public ExamenMoto(String fecha, Persona persona, Moto moto) {
		super(fecha, persona);
		this.moto = moto;
		this.circuitos = new ArrayList<Circuito>();
	}

	public void agregarCircuitos(Circuito circuito1) {
		this.circuitos.add(circuito1);

	}
	
	public void agregarCircuitos(Circuito circuito1, Circuito circuito2) {
		this.circuitos.add(circuito1);
		this.circuitos.add(circuito2);
	}
	
	public void agregarCircuitos(Circuito circuito1, Circuito circuito2, Circuito circuito3) {
		this.circuitos.add(circuito1);
		this.circuitos.add(circuito2);
		this.circuitos.add(circuito3);

	}
	
	public void agregarCircuitos(Circuito circuito1, Circuito circuito2, Circuito circuito3, Circuito circuito4) {
		this.circuitos.add(circuito1);
		this.circuitos.add(circuito2);
		this.circuitos.add(circuito3);
		this.circuitos.add(circuito4);
	}

	@Override
	public boolean aprobado() {
		return circuitosAprobados() == circuitos.size() && aprobadoSegunCilindrada();
	}

	private int circuitosAprobados() {
		int i = 0;
		boolean respuesta = true;
		while(i < circuitos.size() && respuesta) {
			respuesta = circuitos.get(i).aprobado();
			i++;
		}
		return i-1;
	}
	
	private boolean aprobadoSegunCilindrada() {
		boolean respuesta = false;
		if(moto.getCilindrada() > this.CILINDRADALIMITE) {
			respuesta = this.circuitosAprobados() == circuitos.size();
		} else {
			respuesta = this.circuitosAprobados() > circuitos.size()-1 && this.tiempoMenor();
		}
		return respuesta;
	}
	
	private boolean tiempoMenor() {
		int i = 0;
		boolean respuesta = false;
		int tiempo = 0;
		while(i < circuitos.size() && !respuesta) {
			tiempo += circuitos.get(i).getTiempoSegundos();
			respuesta = tiempo < TIEMPOMAX;
			i++;
		}
		return respuesta;
	}
	
}
