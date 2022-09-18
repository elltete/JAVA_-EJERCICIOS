package ejercicio_9;

public abstract class EmbarcacionDeportiva extends Barco {
	
	public final double INDICEPOTENCIA = 0.35;
	
	private int potenciaHP;
	private int factorAerodinamico;

	public EmbarcacionDeportiva(String matricula, int eslora, int anioFabricacion, String nombreDuenio, int factorAerodinamico, int potenciaHP) {
		super(matricula, eslora, anioFabricacion, nombreDuenio);
		this.factorAerodinamico = factorAerodinamico;
		this.potenciaHP = potenciaHP;
	}

	public int getPotenciaHP() {
		return potenciaHP;
	}

	public int getFactorAerodinamico() {
		return factorAerodinamico;
	}

	public abstract double calcularConsumo();
	
	public int valorAdicional() {
		return getPotenciaHP()/2;
	}

	@Override
	public String toString() {
		return "EmbarcacionDeportiva [potenciaHP=" + potenciaHP + ", factorAerodinamico=" + factorAerodinamico + "]" + super.toString();
	}

	
	
}
