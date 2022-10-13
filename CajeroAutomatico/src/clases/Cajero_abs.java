package clases;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;


public abstract class Cajero_abs {
	protected int movimientos, retirar;
	private static int saldo;
	private static String fecha_hora;
	protected static ArrayList<String> registros = new ArrayList<String>(Arrays.asList());

	Scanner entrada = new Scanner(System.in);

	public void Operaciones() {
		int bandera = 0;
		int opcion = 0;
		int password;
		int intento = 0;
		do {
			intento++;
			System.out.println("Introduce porfavor tu clave de acceso CORRECTA: ");
			password = comprobar();
			if (password == 1235) {
				break;
			}

		} while (intento < 3);

		if (password == 1235 || intento < 3) {
			do {
				do {
					System.out.println("Seleccione una opción :)");
					System.out.println("	1. Consutar saldo");
					System.out.println("	2. Retirar saldo");
					System.out.println("	3. Histórico de movimientos");
					System.out.println("	4. Salir");
					opcion = comprobar();

					if (opcion >= 1 && opcion <= 4) {
						bandera = 1;
					} else {
						System.out.println("-----------------------------------------");
						System.out.println("Opción no disponible");
						System.out.println("-----------------------------------------");

					}
				} while (bandera == 0);

				if (opcion == 1) {
					Cajero_abs nota = new Hija_consulta();
					nota.Movimientos();
				} else if (opcion == 2) {
					Cajero_abs nota = new Hija_retiro();
					nota.Movimientos();
				} else if (opcion == 3) {
					Cajero_abs nota = new Hija_movimientos();
					nota.Movimientos();
				} else if (opcion == 4) {
					System.out.println("-----------------------------------------");
					System.out.println("Gracias, se ha terminado el programa");
					System.out.println("-----------------------------------------");
					bandera = 2;
				}
			} while (bandera != 2);
		} else {
			System.out.println("Se ha terminado el programa");
		}

	}
	
	public int comprobar() {
		int entero;
		try {
			entero = entrada.nextInt();
			}
			catch(Exception e) {
			  System.out.println("Error -> Digite correctamente los valores numéricos ENTEROS (no alphanuméricos, no  con decimales, no símbolos)");
			  entero= 0 ;
			  entrada.next();
			}
		return entero;
	}
	// Método para retirar
	public void Retirar() {
		retirar = comprobar();//entrada.nextInt();
	}
	

	public void Consultar() {
		System.out.println("El saldo que tienes de: " + saldo);
	}

	public void Registros() {
		System.out.println("El saldo que tienes de: " + saldo);

	}

	// Método abstracto
	public abstract void Movimientos();

	// Métodos Setter y Getter
	public int getSaldo() {
		return saldo;
	}

	public void setSaldo(int saldo) {
		this.saldo = saldo;
	}

	public static String getFecha_hora() {
		return fecha_hora;
	}

	public static void setFecha_hora(String fecha_hora) {
		Cajero_abs.fecha_hora = fecha_hora;
		registros.add(fecha_hora);
	}

	public static ArrayList<String> getRegistros() {
		return registros;
	}

	public static void setRegistros(ArrayList<String> registros) {
		Cajero_abs.registros = registros;
		registros.add("");
	}

}
