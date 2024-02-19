package contadores;

public class Prueba {

	public static void main(String[] args) {
		
		ContadorEntero ce=new ContadorEntero(0);
		ContadorDecimales cd=new ContadorDecimales(0);
		ContadorLetras cl=new ContadorLetras('a');
		
		ce.incrementar();
		cd.incrementar();
		cd.incrementar();
		cl.incrementar();
		cl.incrementar();
		
		System.out.println(ce);
		System.out.println(cd);
		System.out.println(cl);
		
		cl.decrementar();
		cl.decrementar();
		cl.decrementar();
		System.out.println(cl);
		
	}

}
