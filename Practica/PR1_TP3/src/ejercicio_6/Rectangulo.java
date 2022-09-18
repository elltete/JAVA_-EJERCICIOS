package ejercicio_6;

public class Rectangulo extends Figura {
	
	private double longitud;
	private double ancho;
	
	public Rectangulo (double longitud, double ancho) {
		this.longitud = longitud;
		this.ancho = ancho;
	}

	@Override
	public double area() {
		return this.longitud * this.ancho;
	}

	@Override
	public double perimetro() {
		return (this.longitud * 2) + (this.ancho * 2);
	}

	@Override
	public String toString() {
		return "Rectangulo [longitud=" + longitud + ", ancho=" + ancho + " color=" + super.toString() + "]";
	}
	
	

}
