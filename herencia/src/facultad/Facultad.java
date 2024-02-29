package facultad;

import java.util.ArrayList;

public class Facultad {

	private ArrayList<Persona> personas;

	public Facultad(ArrayList<Persona> personas) {
		super();
		this.personas = personas;
	}

	public Facultad() {
		super();
		this.personas=new ArrayList<Persona>();
	}

	public ArrayList<Persona> getPersonas() {
		return personas;
	}

	public void setPersonas(ArrayList<Persona> personas) {
		this.personas = personas;
	}

	@Override
	public String toString() {
		return "Facultad [personas=" + personas + "]";
	}
	
	public void add() {
		
	}
	
	
	
}
