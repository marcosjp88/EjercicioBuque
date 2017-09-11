import java.util.ArrayList;

public class Buque {
	private int cod;
	private String nombre;
	private ArrayList<Bodega> bodegas;

	public Buque(int val, String str) {
		cod 	= val;
		nombre 	= str;
		bodegas = new ArrayList<Bodega>();
	}
	
	public boolean sosBuque(int codB) {
		return codB == cod;
	}
	
	public void agregarBodega(Producto prod, int val) {
		Bodega b = new Bodega(prod,val);
		bodegas.add(b);
	}
	
	public boolean noTieneBodegas() {
		return bodegas.isEmpty();
	}
}