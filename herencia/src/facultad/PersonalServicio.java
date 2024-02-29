package facultad;

public class PersonalServicio extends Persona{

	public enum Secciones {biblioteca, decanato, secretaría}
	
	private int nDespacho;
	private int añoIncorporacion;
	private Secciones seccion;
	
	public PersonalServicio(String nombre, String apellidos, String dni, int nDespacho, int añoIncorporacion,
			Secciones seccion) {
		super(nombre, apellidos, dni);
		this.nDespacho = nDespacho;
		this.añoIncorporacion = añoIncorporacion;
		this.seccion = seccion;
	}
	public int getnDespacho() {
		return nDespacho;
	}
	public void setnDespacho(int nDespacho) {
		this.nDespacho = nDespacho;
	}
	public int getAñoIncorporacion() {
		return añoIncorporacion;
	}
	public void setAñoIncorporacion(int añoIncorporacion) {
		this.añoIncorporacion = añoIncorporacion;
	}
	public Secciones getSeccion() {
		return seccion;
	}
	public void setSeccion(Secciones seccion) {
		this.seccion = seccion;
	}
	@Override
	public String toString() {
		return "PersonalServicio [nDespacho=" + nDespacho + ", añoIncorporacion=" + añoIncorporacion + ", seccion="
				+ seccion + ", nombre=" + nombre + ", apellidos=" + apellidos + ", dni=" + dni + "]";
	}
	
	
	
}
