package restaurante;

import java.util.Arrays;

public class Carne extends Plato{

//	protected String [] gradoCocion = new String []{"Poco hecho","Al punto","Muy hecho","Carbonizado"};
	
	public enum gradoCocion {POCO_HECHA, AL_PUNTO, MUY_HECHA, CARBONIZADA};
	protected gradoCocion cocion;
	public Carne(String nombre, float precio, gradoCocion cocion) {
		super(nombre, precio);
		this.cocion = cocion;
	}
	public gradoCocion getCocion() {
		return cocion;
	}
	public void setCocion(gradoCocion cocion) {
		this.cocion = cocion;
	}
	
	@Override
	public String toString() {
		return "Carne [cocion=" + cocion + ", nombre=" + nombre + ", precio=" + precio + "]";
	}

	
	
	
}
