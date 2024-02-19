package crucero;
import java.time.LocalDate;
import java.time.LocalDateTime;

public class Prueba {

	public static void main(String[] args) {
		
		EscalaOcio o=new EscalaOcio("Atenas", LocalDateTime.parse("2024-04-16T09:00:00"), LocalDateTime.parse("2024-04-16T18:00:00"));
		EscalaCultural f=new EscalaCultural("Japón", LocalDateTime.parse("2024-06-17T19:00:00"), LocalDateTime.parse("2024-06-17T21:00:00"), 200);
		
		System.out.println(o);
		System.out.println(f);

		Crucero crucero=new Crucero("1", "Islas Griegas", "LibertyOfSeas", LocalDate.parse("2024-12-24"), LocalDate.parse("2024-12-24"));
		
		System.out.println(crucero);
	}

}
