package concesionario;

public abstract class VehiculoSinMotor extends Vehiculo{

	public VehiculoSinMotor(String marca, String modelo, int precio, String color) {
		super(marca, modelo, precio, color);
		// TODO Auto-generated constructor stub
	}

	@Override
	public String toString() {
		return "VehiculoSinMotor [marca=" + marca + ", modelo=" + modelo + ", precio=" + precio + ", color=" + color
				+ "]";
	}
	
	
	
}
