package restaurante;

import java.util.ArrayList;

public class Comanda  {
	
	//si la clase no se hereda, los atributos privados
	private int numeroMesa;
	private int numeroComensales;
	private ArrayList<Plato> platos;
	
	public Comanda(int numeroMesa, int numeroComensales, ArrayList<Plato> platos) {
		super();
		this.numeroMesa = numeroMesa;
		this.numeroComensales = numeroComensales;
		this.platos = platos;
	}
	
	

	public Comanda(int numeroMesa, int numeroComensales) {
		super();
		this.numeroMesa = numeroMesa;
		this.numeroComensales = numeroComensales;
		this.platos=new ArrayList<Plato>();
	}



	public int getNumeroMesa() {
		return numeroMesa;
	}

	public void setNumeroMesa(int numeroMesa) {
		this.numeroMesa = numeroMesa;
	}

	public int getNumeroComensales() {
		return numeroComensales;
	}

	public void setNumeroComensales(int numeroComensales) {
		this.numeroComensales = numeroComensales;
	}

	public ArrayList<Plato> getPlatos() {
		return platos;
	}

	public void setPlatos(ArrayList<Plato> platos) {
		this.platos = platos;
	}
	
	public void addPlato(Plato p) {
		this.platos.add(p);
	}
	public void deletePlato(Plato p) {
		this.platos.remove(p);
	}

	@Override
	public String toString() {
		return "Comanda [numeroMesa=" + numeroMesa + ", numeroComensales=" + numeroComensales + ", platos=" + platos
				+ "]";
	}
	
	public float coste() {
		float total=0;
		for (Plato plato : platos) {
			total+=plato.getPrecio();
		}
		return total;
	}
	
	public boolean hayDiabeticosEnLaMesa() {
		for (Plato plato : platos) {
			if (plato instanceof Postre && !((Postre) plato).isTieneAzucar()) {
				return true;
			}
		}
		return false;
	}
	
	
}


