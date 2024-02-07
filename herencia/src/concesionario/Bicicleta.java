package concesionario;

public class Bicicleta extends VehiculoSinMotor{

	protected String tipo;
	protected int marchas;
	public Bicicleta(String marca, String modelo, int precio, String color, String tipo, int marchas) {
		super(marca, modelo, precio, color);
		this.tipo = tipo;
		this.marchas = marchas;
	}
	public String getTipo() {
		return tipo;
	}
	public void setTipo(String tipo) {
		this.tipo = tipo;
	}
	public int getMarchas() {
		return marchas;
	}
	public void setMarchas(int marchas) {
		this.marchas = marchas;
	}
	@Override
	public String toString() {
		return "Bicicleta [tipo=" + tipo + ", marchas=" + marchas + ", marca=" + marca + ", modelo=" + modelo
				+ ", precio=" + precio + ", color=" + color + "]";
	}
	
	
	
}
