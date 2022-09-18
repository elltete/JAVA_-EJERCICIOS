package ejercicio_6;

public abstract class Figura {
	
	private String color="Negro";
	
	public abstract double area();
	
	public abstract double perimetro();
	
	public String getColor() {
		return this.color;
	}

	@Override
	public String toString() {
		return color;
	}
	
	

}
