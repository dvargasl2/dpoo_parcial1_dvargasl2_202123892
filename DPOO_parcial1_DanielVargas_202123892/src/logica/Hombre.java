package logica;

public class Hombre extends TMB {
	
	public Hombre(int centimetros, double kgramos, int edad) {
		super(centimetros, kgramos, edad);
	}

	@Override
	public float calcularTMB() {
		float tmb = (float)(88.362 + (13.397 * this.kgramos)+(4.799*this.centimetros)-(5.677*this.edad));
		return (float) tmb;
	}

}
