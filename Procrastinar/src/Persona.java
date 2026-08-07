
public class Persona {
	private String nombre;
	int tareaPendiente;
	static final int maximoTarea = 30;
	//
	//En el caso de que hayan mas de un constructor en el mismo programa existirá una sobrecarga
	public Persona (int tareaPendiente) {
		this.tareaPendiente = tareaPendiente;
	}
	
		public Persona (String nombre) {
		this.nombre = nombre;
	}
	
	
	public Persona (String nombre, int tareaPendiente)
	{
		this.nombre =  nombre;
		this.tareaPendiente = tareaPendiente;

		
	}
	
	public boolean cumplidora () {
		if(tareaPendiente == 0) {
			
		return true;
			
		}
		else {
			return false;
		}
			
	}
	public boolean procrastinadora () {
		if (tareaPendiente > maximoTarea * 0.8) {
			return true;
		}
		else {
			return false;
		}
	}
	public void agendartarea(int sumarletareas) {
		if ((tareaPendiente + sumarletareas)<= maximoTarea) {
			tareaPendiente += sumarletareas;
		}
	}
	
	public String getNombre() {
		return nombre;
	}
	
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	
	public int gettareaPendiente() {
		return tareaPendiente;
	}
	
	public void settareaPendiente (int tareaPendiente) {
		this.tareaPendiente = tareaPendiente;
	}
}
