package clases;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

public class Hija_retiro extends Cajero_abs{
	
	@Override
	public void Movimientos() {
		String variable;
		DateTimeFormatter dtf = DateTimeFormatter.ofPattern("yyyy/MM/dd HH:mm:ss");
		System.out.println("Cuanto deseas retirar: ");
		Retirar();
		if(retirar <= getSaldo()) {
			movimientos = getSaldo();
			setSaldo(movimientos - retirar);
			System.out.println("-----------------------------------------");

			System.out.println("Retiraste : " + retirar);
			System.out.println("Tu saldo actual es: " + getSaldo());
			System.out.println("-----------------------------------------");
			//DateTimeFormatter dtf = DateTimeFormatter.ofPattern("yyyy/MM/dd HH:mm:ss");
	        //System.out.println(dtf.format(LocalDateTime.now())+"||| " + "Se realizo un retiro, el saldo final es de: $" + getSaldo());
	        variable = dtf.format(LocalDateTime.now()) +"||| " + "Se realizo un retiro, el saldo final es de: $" + getSaldo();
	        setFecha_hora(variable);

		} else {
			System.out.println("-----------------------------------------");
			System.out.println("Saldo insuficiente");
			System.out.println("-----------------------------------------");
			//DateTimeFormatter dtf = DateTimeFormatter.ofPattern("yyyy/MM/dd HH:mm:ss");
	        //System.out.println(dtf.format(LocalDateTime.now())+"||| " + "Se INTENTO hacer un retiro (fallido), el saldo final es de: $" + getSaldo());
	        variable = dtf.format(LocalDateTime.now())+"||| " + "Se INTENTO hacer un retiro (fallido), el saldo final es de: $" + getSaldo();
	        setFecha_hora(variable);

		}

	}
	
}
