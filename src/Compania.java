import java.util.ArrayList;
import java.util.Scanner;

public class Compania {
	private String nombre;
	private ArrayList<Buque> buques;
	private ArrayList<Producto> productos;
	
	public Compania(String str) {
		nombre 		= str;
		buques 		= new ArrayList<Buque>();	
		productos	= new ArrayList<Producto>();
	}
	
	public void agregarBuque() {
		Scanner entrada = new Scanner(System.in);
		System.out.print("Ingrese el numero de buque: ");
		int numB = entrada.nextInt();
		Buque b = this.buscarBuque(numB);
		if(b != null) {
			System.out.print("El buque que desea ingresar ya existe!");
		} else {
			System.out.print("Ingrese el nombre del buque: ");
			String nom = entrada.next();
			b = new Buque(numB,nom);
			buques.add(b);
		}
	}

	public Buque buscarBuque(int numb) {
		int i = 0;
		while((i < buques.size()) && (!buques.get(i).sosBuque(numb))) {
			i++;
		}
		if(i == buques.size()) {
			return null;
		} else {
			return buques.get(i);
		}
	}
	
	public void agregarProducto() {
		Scanner entrada = new Scanner(System.in);
		System.out.print("Ingrese el numero de producto: ");
		int codB = entrada.nextInt();
		Producto p = this.buscarProducto(codB);
		if(p != null) {
			System.out.print("El producto que desea ingresar ya existe!");
		} else {
			System.out.print("Ingrese la descripcion del producto: ");
			String desc = entrada.next();
			System.out.print("Ingrese el precio unitario: ");
			float preU = entrada.nextFloat();
			p = new Producto(codB,desc,preU);
			productos.add(p);
		}
	}
	

	public Producto buscarProducto(int codB) {
		int i = 0;
		while((i < productos.size()) && (!productos.get(i).sosProducto(codB))) {
			i++;
		}
		if(i == productos.size()) {
			return null;
		} else {
			return productos.get(i);
		}
	}
	
	
	public void agregarBodegasABuque() {
		Scanner entrada = new Scanner(System.in);
		System.out.print("Ingrese el numero de buque: ");
		int numB = entrada.nextInt();
		Buque b = this.buscarBuque(numB);
		if(b == null) {
			System.out.print("El buque que desea no existe!");
		} else {
			if(b.noTieneBodegas()) {
				for(int i=0; i < 4 ; i++) {
					Producto p;
					do {
						System.out.print("Ingrese el numero de producto: ");
						int codB = entrada.nextInt();
						p = this.buscarProducto(codB);
					}while(p == null);
					System.out.print("Ingrese la carga maxima de la bodega: ");
					int cargaMa = entrada.nextInt();
					b.agregarBodega(p, cargaMa);
				}	
			}
		}
	}
	
	
}
