package restaurante;

import restaurante.Carne.gradoCocion;

public class Prueba {

	public static void main(String[] args) {
		
		
		Carne c=new Carne("carne", 100, gradoCocion.CARBONIZADA);
		
		System.out.println(c);
		
		Comanda d = new Comanda(14, 6);
		
		d.addPlato(new Primero("Jamón serrano", 25.00F, true));
		d.addPlato(new Carne("Solomillo", 16.00F, gradoCocion.AL_PUNTO));
		d.addPlato(new Pescado("Lubina", 14.00F));
		d.addPlato(new Postre("Tiramisú", 8.99F, true));
		d.addPlato(new Postre("Brownie", 6.99F, false));
		
		System.out.println(d);
	}

}
