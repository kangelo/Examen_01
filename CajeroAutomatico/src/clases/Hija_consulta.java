package clases;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
public class Hija_consulta extends Cajero_abs{
	
	@Override
	public void Movimientos() {
		String variable;
		System.out.println("-----------------------------------------");
		System.out.println("Tu saldo actual es :" + getSaldo());
		System.out.println("-----------------------------------------");
        DateTimeFormatter dtf = DateTimeFormatter.ofPattern("yyyy/MM/dd HH:mm:ss");
        //System.out.println(dtf.format(LocalDateTime.now())+"||| " + "Se consulto saldo, el saldo final es de: $" + getSaldo());
        variable = dtf.format(LocalDateTime.now())+"||| " + "Se consulto saldo, el saldo final es de: $" + getSaldo();
        setFecha_hora(variable);

        
	}
}
