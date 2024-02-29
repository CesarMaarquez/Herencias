package facultad;

public class Profesor extends Persona{
	
	public enum Departamento {lenguajes, matemáticas, arquitectura, sistemas};

	private int nDespacho;
	private int añoIncorporacion;
	private Departamento departamento;
	
	
	public Profesor(String nombre, String apellidos, String dni, int nDespacho, int añoIncorporacion,
			Departamento departamento) {
		super(nombre, apellidos, dni);
		this.nDespacho = nDespacho;
		this.añoIncorporacion = añoIncorporacion;
		this.departamento = departamento;
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
	public Departamento getDepartamento() {
		return departamento;
	}
	public void setDepartamento(Departamento departamento) {
		this.departamento = departamento;
	}
	@Override
	public String toString() {
		return "Profesor [nDespacho=" + nDespacho + ", añoIncorporacion=" + añoIncorporacion + ", departamento="
				+ departamento + ", nombre=" + nombre + ", apellidos=" + apellidos + ", dni=" + dni + "]";
	}
	
	
	
}
