package electrodomesticoCasa;

public class Electrodomestico {

	public enum Colores {blanco, negro, rojo, azul, gris}
	public enum consumosEnergeticos {A, B, C, D, E, F}
	
	protected double precioBase;
	protected Colores color;
	protected consumosEnergeticos consumoEnergetico;
	protected double peso;
	
	public static final Colores ColoresPorDefecto=Colores.blanco;
	public static final consumosEnergeticos ConsumoEnergeticoPorDefecto=consumosEnergeticos.F;
	public static final double PrecioBasePorDefecto=100;
	public static final double PesoPorDefecto=5;
	
	public Electrodomestico() {
		super();
		this.precioBase = PrecioBasePorDefecto;
		this.color = ColoresPorDefecto;
		this.consumoEnergetico = ConsumoEnergeticoPorDefecto;
		this.peso = PesoPorDefecto;
	}

	public Electrodomestico(double precioBase, double peso) {
		super();
		this.precioBase = precioBase;
		this.color = ColoresPorDefecto;
		this.consumoEnergetico = ConsumoEnergeticoPorDefecto;
		this.peso = peso;
	}

	public Electrodomestico(double precioBase, Colores color, consumosEnergeticos consumoEnergetico, double peso) {
		super();
		this.precioBase = precioBase;
		this.color = color;
		this.consumoEnergetico = consumoEnergetico;
		this.peso = peso;
	}

	public double getPrecioBase() {
		return precioBase;
	}

	public Colores getColor() {
		return color;
	}

	public consumosEnergeticos getConsumoEnergetico() {
		return consumoEnergetico;
	}

	public double getPeso() {
		return peso;
	}
	
	public double precioFinal() {
		double total=this.precioBase;
		if (this.peso>0 && this.peso<=19) {
			total+=10;
		}
		else if (this.peso>19 && this.peso<=49) {
			total+=50;
		}
		else if (this.peso>49 && this.peso<=79) {
			total+=80;
		}
		else {
			total+=100;
		}
		
		switch (this.consumoEnergetico) {
		case A:
			total+=100;
			break;
		case B:
			total+=80;
			break;
		case C:
			total+=60;
			break;
		case D:
			total+=50;
			break;
		case E:
			total+=30;
			break;
		case F:
			total+=10;
			break;

		}
		return total;
	}
	
	
}
