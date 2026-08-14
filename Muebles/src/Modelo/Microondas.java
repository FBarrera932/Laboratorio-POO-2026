package Modelo;

public class Microondas extends Decocina{

	public Microondas(float posicionX, float posicionY, float posicionZ, Nombre nombre, float vida,
			int cantidadPersonas, float temperatura, Estado estado, float suciedad) {
		super(posicionX, posicionY, posicionZ, nombre, vida, cantidadPersonas, temperatura, estado, suciedad);
		// TODO Auto-generated constructor stub
	}
	
	
	public boolean esMicroondas() {
		return getNombre() == Nombre.MICROONDAS;
	}
	
	public float temperaturaMaxima() {
		setTemperatura(150);
		return getTemperatura();
	}
	
	public float temperaturaMinima() {
		setTemperatura(5);
		return getTemperatura();
	}
	
	public void moverMicroondasenX() {
		if(moverMuebleenX()) {
			
		}
	}
	
	public void explosionFisica() {
		if(usarMueble()) {
			setVida(0);
		}
	}
	
	public void explosionElectrica() {
		if(getTemperatura() > temperaturaMaxima()) {
			setVida(0);
		}
	}
}