package presentacion;

import logica.Hombre;
import logica.Mujer;
import logica.TMB;

public class Principal {

	public static void main(String[] args) {
		TMB persona;
		persona = new Mujer(168, 53.5, 20);		
		System.out.println(persona.calcularTMB());
		persona = new Hombre(172, 60.2, 20);
		System.out.println(persona.calcularTMB());
		
	}
}
