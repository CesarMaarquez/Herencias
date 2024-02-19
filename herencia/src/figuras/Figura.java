package figuras;

public abstract class Figura {

	protected String color;

	public Figura(String color) {
		super();
		this.color = color;
	}

	public String getColor() {
		return color;
	}

	public void setColor(String color) {
		this.color = color;
	}

	@Override
	public String toString() {
		return "Figura [color=" + color + "]";
	}
	
	
	//dos metodos que todas las clases tendran que tener, les ponemos abstractos porque no sabemos implementarlos todavia
	//las clases que hereden de Figura, tendrán la OBLIGACIÓN de terminarlos
	
	public abstract double area();
	
	public abstract double perimetro();
		
}
