
public class Caballero {
	private String Nombre;
	private int Edad;
	private int nivelMaldad;
	private Constelacion constelaciones;
	
	
	public Caballero(String Nombre, int Edad, int nivelMaldad, Constelacion constelaciones) {
		this.setNombre(Nombre);
		this.Edad = Edad;
		this.setNivelMaldad(nivelMaldad);
		this.constelaciones = constelaciones;
	}
	public boolean esPrecoz() {
		if (Edad < 12) {
			return true;
		}
		else {
			return false;
		}
	}
	
	public boolean esDorado() {
		if(constelaciones.estaenCeleste() == true) {
			return true;
		}
		else {
			return false;
		}
	}
	
	
	
	public int getNivelMaldad() {
		return nivelMaldad;
	}
	public void setNivelMaldad(int nivelMaldad) {
		this.nivelMaldad = nivelMaldad;
	}
	public String getNombre() {
		return Nombre;
	}
	public void setNombre(String nombre) {
		Nombre = nombre;
	}
	

}
