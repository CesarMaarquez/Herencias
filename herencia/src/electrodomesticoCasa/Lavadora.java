package electrodomesticoCasa;

public class Lavadora extends Electrodomestico{

	protected double carga;
	
	public static final double CargaPorDefecto=5;

	public Lavadora(double precioBase, Colores color, consumosEnergeticos consumoEnergetico, double peso,
			double carga) {
		super(precioBase, color, consumoEnergetico, peso);
		this.carga = carga;
	}

	public Lavadora() {
		super();
		this.carga = CargaPorDefecto;
	}

	public Lavadora(double precioBase, double peso) {
		super(precioBase, peso);
		this.carga=CargaPorDefecto;
	}

	public double getCarga() {
		return carga;
	}

	@Override
	public double precioFinal() {
		double total=super.precioFinal();
		if (this.carga>30) {
			total+=50;
			return total;
		}
		return total;
	}

	
	
}
