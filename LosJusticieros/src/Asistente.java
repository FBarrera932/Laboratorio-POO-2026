
public abstract class Asistente {
	private String nombre;
	private float sueldoBase;
	
	public Asistente(String nombre, float sueldoBase) {
		this.nombre = nombre;
		this.sueldoBase = sueldoBase;
	}
	public float sueldo() {
		return sueldoBase;
	}
	
	public boolean buenSueldo() {
		if(sueldoBase > 600000) {
			return true;
		}
		else
			return false;
	}
	
	
	
	public String getNombre() {
		return nombre;
	}
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	public float getSueldoBase() {
		return sueldoBase;
	}
	public void setSueldoBase(float sueldoBase) {
		this.sueldoBase = sueldoBase;
	}
}
