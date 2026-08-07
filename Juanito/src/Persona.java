
public class Persona {

	public static void comer (int cantidadingerida, int capacidadestomago)
	{
		if (estalleno(cantidadingerida, capacidadestomago))
		{
			cantidadingerida += 1000;
			if (cantidadingerida > capacidadestomago)
			{
				cantidadingerida = capacidadestomago;
			}
		}
	}
	public static boolean estalleno(int cantidadingerida, int capacidadestomago)
	{
		if (cantidadingerida >= capacidadestomago * 0.9)
		{
			return true;
		}
		else
			return false;
		
	}
	public static void crecer(int capacidadestomago)
	{
		capacidadestomago +=10;
	}
	public static void aprende(int capacidadestomago, int cantidadingerida)
	{
		if (estalleno(capacidadestomago, cantidadingerida))
		{
			System.out.println("aprendió!");
		}
		else {
			System.out.println("No aprendió...");
		}
	}
	public static void digiere(int cantidadingerida)
	{
		cantidadingerida = 0;
	}
	
	public static void main(String[] args) {
		int capacidadestomago = 100;
		int cantidadingerida = 0;
		
		comer(cantidadingerida, capacidadestomago);
		crecer(capacidadestomago);
		estalleno(cantidadingerida, capacidadestomago);
		aprende(capacidadestomago, cantidadingerida);
		digiere(cantidadingerida);
		
	}

}

