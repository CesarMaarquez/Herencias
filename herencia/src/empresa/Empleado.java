package empresa;

public class Empleado extends Staff{

	public Empleado(String dni, String nombre, long telefono, float sueldo) {
		super(dni, nombre, telefono, sueldo);
		// TODO Auto-generated constructor stub
	}

	@Override
	public String toString() {
		return "Empleado [sueldo=" + sueldo + ", dni=" + dni + ", nombre=" + nombre + ", telefono=" + telefono + "]";
	}
	



}
