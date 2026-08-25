package util;

import java.util.Scanner;

public abstract class Util {

	private static Scanner s = new Scanner(System.in);
	
	public static int ingresarEntero(int min, int max) {
		int ingresado=min-1;
		
		do {
			System.out.println("Ingrese entero");
			ingresado = s.nextInt();
		}while(ingresado < min || ingresado > max);
		
		return ingresado;
	}
}
