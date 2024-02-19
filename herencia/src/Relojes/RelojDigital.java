package Relojes;

import java.time.LocalDate;
import java.time.LocalTime;

public class RelojDigital implements Reloj{
	
	protected LocalTime hora;
 
	@Override
	public String getHora() {
		String resultado="";
		resultado+=LocalDate.now();
		return resultado;
	}
	
	

	
}
