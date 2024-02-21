package logica;

public abstract class TMB {
	protected int centimetros;
	protected double kgramos;
	protected int edad;

	
	public TMB(int centimetros, double kgramos, int edad) {
		this.centimetros = centimetros;
		this.kgramos = kgramos;
		this.edad = edad;
	}

	public void setCentimetros(int centimetros) {
		this.centimetros = centimetros;
	}
	
	public void setEdad(int edad) {
		this.edad = edad;
	}

	public void setKGramos(float kgramos) {
		this.kgramos = kgramos;
	} 
	
	public int getCentimetros() {
		return centimetros;
	}
	
	public int getEdad() {
		return edad;
	}
		
	public double getKGramos() {
		return kgramos;
	}
	
	public abstract float calcularTMB();
}
