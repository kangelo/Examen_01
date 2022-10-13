package clases;

public class Hija_movimientos extends Cajero_abs{
	@Override
	public void Movimientos() {
		System.out.println("-----------------------------------------");
		System.out.println("Tus movimientos al día han sido los siguientes:");
        for (String number: registros) {
        	System.out.println(number);
          }
		System.out.println("-----------------------------------------");


	}

}
