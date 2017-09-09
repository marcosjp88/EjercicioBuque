import java.util.Scanner;

public class claseCordinadora {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Compania a = new Compania("EMPRESA MARITIMA");
		Scanner entrada = new Scanner(System.in);
		byte opc;
		do
		{
			System.out.println("\n EMPRESA MARITIMA!");
			// se visualiza cada linea independiente con un propio mensaje
			System.out.println("\nIngrese la opcion que desea realizar");
			System.out.println("\n1-> caso de uso 1" +
					"\n2-> caso de uso 2" +
					"\n3-> caso de uso 3" +
					"\n4-> caso de uso 4" +
					"\n5-> caso de uso 5" +
					"\n0->Salir.");
			// se visualiza de a una linea pero en un solo mensaje
			opc = entrada.nextByte();
			switch(opc)
			{
			case 1:
			{
				//
			}
				break;
			case 2:
			{
				//
			}
				break;
			case 3:
			{
				// 
			}
				break;
			case 4:
			{
				// 
			}
				break;	
			case 5:
			{
				// 
			}
				break;	
					
		   default:
				break;
			}
		}
		while(opc != 0);
	}

}
