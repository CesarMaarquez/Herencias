package restaurante;

public class Primero extends Plato{

	protected boolean esCompartido;

	public Primero(String nombre, float precio, boolean esCompartido) {
		super(nombre, precio);
		this.esCompartido = esCompartido;
	}

	public boolean isEsCompartido() {
		return esCompartido;
	}

	public void setEsCompartido(boolean esCompartido) {
		this.esCompartido = esCompartido;
	}

	@Override
	public String toString() {
		return "Primero [esCompartido=" + esCompartido + ", nombre=" + nombre + ", precio=" + precio + "]";
	}
	
	
	
}
