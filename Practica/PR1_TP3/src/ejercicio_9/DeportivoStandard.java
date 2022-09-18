package ejercicio_9;

public class DeportivoStandard extends EmbarcacionDeportiva {

	public DeportivoStandard(String matricula, int eslora, int anioFabricacion, String nombreDuenio,
			int factorAerodinamico, int potenciaHP) {
		super(matricula, eslora, anioFabricacion, nombreDuenio, factorAerodinamico, potenciaHP);
	}

	@Override
	public double calcularConsumo() {
		return (super.getPotenciaHP() / super.getFactorAerodinamico() * super.INDICEPOTENCIA);
	}

//	@Override
//	public int valorAdicional() {
//		return super.getPotenciaHP()/2;
//	}
	
	@Override
	public String toString() {
		return super.toString();
	}

}
