package electrodomesticos;

public class Television extends Electrodomestico{

	protected int resolucion;
	protected boolean smartTV;
	
	public static final int RESOLUCION_POR_DEFECTO=20;
	public static final boolean SMARTTV_POR_DEFECTO=false;
	public Television(float precioBase, Colores color, CategoriaEnergetica consumoEnergetico, int peso, int resolucion,
			boolean smartTV) {
		super(precioBase, color, consumoEnergetico, peso);
		this.resolucion = resolucion;
		this.smartTV = smartTV;
	}
	public Television(float precioBase, int peso) {
		super(precioBase, peso);
		this.resolucion=RESOLUCION_POR_DEFECTO;
		this.smartTV=SMARTTV_POR_DEFECTO;
	}
	public Television() {
		super();
		this.resolucion=RESOLUCION_POR_DEFECTO;
		this.smartTV=SMARTTV_POR_DEFECTO;
	}
	public int getResolucion() {
		return resolucion;
	}
	public boolean isSmartTV() {
		return smartTV;
	}
	@Override
	public float precioFinal() {
		if (this.resolucion>=40 && !this.smartTV) {
			return super.precioFinal()*1.3F;
		}
		else if (this.smartTV && this.resolucion<40) {
			return super.precioFinal()+50;
		}
		else if (this.resolucion>40 && this.smartTV) {
			return super.precioFinal()*1.3F+50;
		}
		return super.precioFinal();
	}
	
	
	
	
	
}
