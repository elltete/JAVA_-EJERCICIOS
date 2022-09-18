package ejercicio_3;

public class RangoDeEnteros {
	
	private static final String IGUALES = "Los limites no deben ser iguales.";
	
	private int limiteInferior;
	private int limiteSuperior;

	public RangoDeEnteros(int limiteInferior, int limiteSuperior) {
		if(limiteInferior < limiteSuperior) { 
			this.limiteInferior = limiteInferior;
			this.limiteSuperior = limiteSuperior;			
		} else if(limiteInferior > limiteSuperior) { 
			this.limiteInferior = limiteSuperior;
			this.limiteSuperior = limiteInferior;	
		} else {
			throw new IllegalArgumentException(IGUALES);
		}
	}

	public int getLimiteInferior() {
		return limiteInferior;
	}

	public int getLimiteSuperior() {
		return limiteSuperior;
	}

	public boolean incluye(int aux) {
		return (aux >= getLimiteInferior() && aux <= getLimiteSuperior());
	}

	private void setLimiteInferior(int limiteInferior) {
		this.limiteInferior = limiteInferior;
	}
	
	private void setLimiteSuperior(int limiteSuperior) {
		this.limiteSuperior = limiteSuperior;
	}

	@Override
	public String toString() {
		return "RangoDeEnteros [limiteInferior=" + limiteInferior + ", limiteSuperior=" + limiteSuperior + "]";
	}
	
}
