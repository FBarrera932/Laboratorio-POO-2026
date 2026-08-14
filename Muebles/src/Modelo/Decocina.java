package Modelo;

public abstract class Decocina extends Mueble {
	

	
	public Decocina(float posicionX, float posicionY, float posicionZ, Nombre nombre, float vida, int cantidadPersonas, float temperatura, Estado estado, float suciedad) {
		super(posicionX, posicionY, posicionZ, nombre, vida, temperatura, estado, suciedad);
	}
	
	
}