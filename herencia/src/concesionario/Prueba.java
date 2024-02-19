package concesionario;

import java.util.ArrayList;

public class Prueba {

	public static void main(String[] args) {
		
		Coche c1=new Coche("BMW", "M3", 60000, "Negro", 3000, "Gasolina", 5);
		Coche c2=new Coche("VOLKSWAGEN", "GTD", 50000, "Gris", 2800, "Diésel", 3);
		
		Moto m1=new Moto("Kawasaki","Ninja" , 35000, "Verde", 1800, "Gasolina", "Carretera");
		
		Bicicleta b1=new Bicicleta("Giant", "Extreme", 1500, "Roja", "Montaña", 6);
		
		ArrayList<Vehiculo> lista=new ArrayList<Vehiculo>();
		
		lista.add(m1);
		lista.add(c2);
		lista.add(c1);
		lista.add(b1);
		
		System.out.println(lista);
		
		System.out.println("Precio total de la lista: "+ precioTotal(lista));
		System.out.println("Cuantos de gasolina: "+cuantosdeGasolina(lista));

	}
	
	public static int precioTotal(ArrayList<Vehiculo> lista) {
		int total=0;
		for (Vehiculo vehiculo : lista) {
			total+=vehiculo.getPrecio();
		}
		return total;
	}
	
	public static int cuantosdeGasolina(ArrayList<Vehiculo> lista) {
		int total=0;
		for (Vehiculo vehiculo : lista) {
			
			if (vehiculo instanceof VehiculosConMotor) {   //si es un vehiculo con motor le pregunto si usa gasolina
				if (((VehiculosConMotor) vehiculo).getCombustible().equals("Gasolina")) {
					total++;
				}
			}
			
		}
		return total;
	}

}
