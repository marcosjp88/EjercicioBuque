import java.util.ArrayList;


public class Compania {
	private String nombre;
	private ArrayList<Buque> buques;
	private ArrayList<Producto> productos;
	
	public Compania(String str) {
		nombre 		= str;
		buques 		= new ArrayList<Buque>();	
		productos	= new ArrayList<Producto>();
	}
	
}
