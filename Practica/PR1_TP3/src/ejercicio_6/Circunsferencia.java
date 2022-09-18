package ejercicio_6;

public class Circunsferencia extends Figura {
	
	private double radio;
	
	public Circunsferencia(double radio) {
		this.radio = radio;
	}

	@Override
	public double area() {
		return Math.PI * Math.pow(this.radio, 2);
	}

	@Override
	public double perimetro() {
		return 2 * Math.PI * this.radio;
	}

	@Override
	public String toString() {
		return "Circunsferencia [radio=" + radio + " color=" + super.toString() + "]";
	}

	

}
