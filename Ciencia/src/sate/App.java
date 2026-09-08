package sate;

import java.util.Scanner;

public class App {
	
	
	public static void main(String[] args) {
		Scanner teclado = new Scanner(System.in);
		InfraestructuraEspacial in1 = new InfraestructuraEspacial();
		int iniciador=0;
		while(iniciador!=1) {
			System.out.println("Bienvenido a la insfraestructura");
			System.out.println("Opciones a realizar");
			System.out.println("1. Energia Total de satelites");

			System.out.println("2. Salir");
			int opcion1 =teclado.nextInt();
			switch (opcion1) {
			case 1:
				System.out.println("La energia total Es: "+in1.calcularEnergiaTotal());
				System.out.println("Presione enter para salir al menu...");
				break;
			case 2:
				iniciador=1;
				System.out.println("Saliendo");
				int salir= teclado.nextInt();
				System.out.println("presione cualquier cosa para salir");
				break;
			
			default:
			break;
			}
		}
	}

}
