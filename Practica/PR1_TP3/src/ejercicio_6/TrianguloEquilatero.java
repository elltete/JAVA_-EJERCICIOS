package ejercicio_6;

public class TrianguloEquilatero extends Figura {
	
	private double lado;
	
	public TrianguloEquilatero(double lado){
		this.lado = lado;
	}

	@Override
	public double area() {
		return Math.pow(this.lado, 2) * Math.sqrt(3) / 4;
	}

	@Override
	public double perimetro() {
		return this.lado * 3;
	}

	@Override
	public String toString() {
		return "TrianguloEquilatero [lado=" + lado + " color=" + super.toString() + "]";
	}

	
	
}
