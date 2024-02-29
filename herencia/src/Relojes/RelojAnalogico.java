package Relojes;

import java.time.LocalTime;

public class RelojAnalogico implements Reloj{

	@Override
	public String getHora() {
		LocalTime horadelSistema=LocalTime.now();
		int hora=horadelSistema.getHour();
		int minuto=horadelSistema.getMinute();
		
		String resultado="";
		
		if (minuto>30) {
			if (hora==12) {
				
			} else {

			}
		} else {

		}
		return null;

	
	}
}
