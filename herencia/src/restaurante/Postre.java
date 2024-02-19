package restaurante;

public class Postre extends Plato{

	protected boolean tieneAzucar;

	public Postre(String nombre, float precio, boolean tieneAzucar) {
		super(nombre, precio);
		this.tieneAzucar = tieneAzucar;
	}

	public boolean isTieneAzucar() {
		return tieneAzucar;
	}

	public void setTieneAzucar(boolean tieneAzucar) {
		this.tieneAzucar = tieneAzucar;
	}

	@Override
	public String toString() {
		return "Postre [tieneAzucar=" + tieneAzucar + ", nombre=" + nombre + ", precio=" + precio + "]";
	}	
	
	
	
}
