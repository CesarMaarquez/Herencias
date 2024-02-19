package crucero;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.ArrayList;

public class Crucero {

	private String codigo;
	private String nombreComercial;
	private String nombreBarco;
	private LocalDate fechaPartida;
	private LocalDate fechaRegreso;
	private ArrayList<Escala> escalas;
	
	public Crucero(String codigo, String nombreComercial, String nombreBarco, LocalDate fechaPartida,
			LocalDate fechaRegreso, ArrayList<Escala> escalas) {
		super();
		this.codigo = codigo;
		this.nombreComercial = nombreComercial;
		this.nombreBarco = nombreBarco;
		this.fechaPartida = fechaPartida;
		this.fechaRegreso = fechaRegreso;
		this.escalas = escalas;
	}

	public Crucero(String codigo, String nombreComercial, String nombreBarco, LocalDate fechaPartida,
			LocalDate fechaRegreso) {
		super();
		this.codigo = codigo;
		this.nombreComercial = nombreComercial;
		this.nombreBarco = nombreBarco;
		this.fechaPartida = fechaPartida;
		this.fechaRegreso = fechaRegreso;
		this.escalas = new ArrayList<Escala>();
	}

	public String getCodigo() {
		return codigo;
	}

	public void setCodigo(String codigo) {
		this.codigo = codigo;
	}

	public String getNombreComercial() {
		return nombreComercial;
	}

	public void setNombreComercial(String nombreComercial) {
		this.nombreComercial = nombreComercial;
	}

	public String getNombreBarco() {
		return nombreBarco;
	}

	public void setNombreBarco(String nombreBarco) {
		this.nombreBarco = nombreBarco;
	}

	public LocalDate getFechaPartida() {
		return fechaPartida;
	}

	public void setFechaPartida(LocalDate fechaPartida) {
		this.fechaPartida = fechaPartida;
	}

	public LocalDate getFechaRegreso() {
		return fechaRegreso;
	}

	public void setFechaRegreso(LocalDate fechaRegreso) {
		this.fechaRegreso = fechaRegreso;
	}

	public ArrayList<Escala> getEscalas() {
		return escalas;
	}

	public void setEscalas(ArrayList<Escala> escalas) {
		this.escalas = escalas;
	}
	
	public void add(Escala e) {
		this.escalas.add(e);
	}
	
	public void remove(Escala e) {
		this.escalas.remove(e); 
	}

	@Override
	public String toString() {
		DateTimeFormatter dtfi=DateTimeFormatter.ofPattern("dd/MM/yyyy");
		return "Crucero [codigo=" + codigo + ", nombreComercial=" + nombreComercial + ", nombreBarco=" + nombreBarco
				+ ", fechaPartida=" + fechaPartida.format(dtfi) + ", fechaRegreso=" + fechaRegreso.format(dtfi) + ", escalas=" + escalas + "]";
	}
	
	
	public int coste() {
		int total=600;
		for (Escala escala : escalas) {
			if (escala instanceof EscalaOcio) {
				total+=100;
			}
			else if (escala instanceof EscalaCultural) {
				total+=((EscalaCultural) escala).getPrecioGuia()+100;
			}
		}
		return total;
	}
	
	

}
