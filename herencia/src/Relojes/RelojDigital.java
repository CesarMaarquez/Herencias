 package Relojes;

import java.time.LocalDate;
import java.time.LocalTime;

public class RelojDigital implements Reloj{
	
 
	@Override
	public String getHora() {
		String resultado="";
		resultado+=LocalDate.now();
		return resultado; 
	}
	
	
}
