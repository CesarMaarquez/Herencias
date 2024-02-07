package empresa;

import java.util.ArrayList;

public class Prueba {

	public static void main(String[] args) {
		Cliente c=new Cliente("8743542S", "jose", 635486354, 1);
		Empleado e=new Empleado("873465P", "Joselito", 654643654, 6000);
		Jefe j=new Jefe("4252352L", "Juan Carlos", 653654654, 54544, "8765ZZG");
		
		System.out.println(c.toString()); 
		System.out.println(e.toString());
		System.out.println(j.toString());
		
		ArrayList<Persona> gente=new ArrayList<Persona>();
		
		gente.add(e);
		gente.add(j);
		gente.add(c);
		
		for (Persona persona : gente) {
			System.out.println(persona);
		} 
		
//		Persona p=new Persona("876342786", "Carlos", 665786934);  NO SE PUEDE HACER POR EL ABSTRACT (CLASE NO INSTANCIABLE)
		
		
	}

}
