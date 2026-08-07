import java.util.Scanner;
public class App {

	public static int sumar(int valor1, int valor2)
	{
		Scanner lectura = new Scanner(System.in);
		System.out.println("ingrese el valor 1: ");
		valor1 = lectura.nextInt();
		System.out.println("ingrese el valor 2: ");
		valor2 = lectura.nextInt();
		
		int suma;
		suma = valor1 + valor2;
		return(suma);
		
	}
	public static int restar(int valor1, int valor2)
	{
		Scanner lectura = new Scanner(System.in);
		System.out.println("Ingrese el valor 1: ");
		valor1 = lectura.nextInt();
		System.out.println("Ingrese el valor 2:");
		valor2 = lectura.nextInt();
		
		int resta;
		resta = valor1 - valor2;
		return(resta);
	}
	
	public static int multiplicacion(int valor1, int valor2)
	{
		Scanner lectura = new Scanner(System.in);
		System.out.println("Ingrese el valor1: ");
		valor1 = lectura.nextInt();
		System.out.println("Ingrese el valor2: ");
		valor2 = lectura.nextInt();
		
		int multiplicacion;
		multiplicacion = valor1 * valor2;
		return(multiplicacion);
	}
	
	public static int division(int valor1, int valor2)
	{
		Scanner lectura = new Scanner(System.in);
		valor1 = lectura.nextInt();
		valor2 = lectura.nextInt();
		
		int division;
		division = valor1 / valor2;
		return(division);
	}
	
	public static int modulo(int valor1, int valor2)
	{
		Scanner lectura = new Scanner(System.in);
		valor1 = lectura.nextInt();
		valor2 = lectura.nextInt();
		
		int modulo;
		modulo = valor1 % valor2;
		return(modulo);
	}

	
	public static void main(String[] args)
	{
		}	
		
		
		/*
		String  nombre = "Francisco";
		int edad = 16;
		double altura = 1.73;
		boolean gusto = true;
		char inicial = 'F';
		
		System.out.println("Mi nombre es " + nombre);
		System.out.println("Mi edad es " + edad);
		System.out.println("Mi altura es " + altura);
		System.out.println("Mi gusto es " + gusto);
		System.out.println("Mi inicial es " + inicial);
		*/

}
