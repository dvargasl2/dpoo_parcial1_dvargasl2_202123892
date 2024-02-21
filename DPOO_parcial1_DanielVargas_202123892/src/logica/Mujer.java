package logica;

public class Mujer extends TMB {
	
	public Mujer(int centimetros, double kgramos, int edad) {
		super(centimetros, kgramos, edad);
		
	}

	@Override
	public float calcularTMB() {
		float tmb = (float) (447.362 + (9.247 * this.kgramos)+(3.098*this.centimetros)-(4.33*this.edad));
		return (float) tmb;
	}

}
