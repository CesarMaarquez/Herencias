package empresa;

public class Cliente extends Persona{   //LA CLASE HEREDA TODO LO DE LA PERSONA 

	protected int numeroSocio;

	public Cliente(String dni, String nombre, long telefono, int numeroSocio) {
		super(dni, nombre, telefono);
		this.numeroSocio = numeroSocio;
	}

	public int getNumeroSocio() {
		return numeroSocio;
	}

	public void setNumeroSocio(int numeroSocio) {
		this.numeroSocio = numeroSocio;
	}

	@Override
	public String toString() {
		return "Cliente [numeroSocio=" + numeroSocio + ", dni=" + dni + ", nombre=" + nombre + ", telefono=" + telefono
				+ "]";
	}
	
	
	
	

}
