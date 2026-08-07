import java.util.ArrayList;

public class Heroe {
	private String nombre;
	private float presupuestoMens;
	private ArrayList<Asistente> asistentes = new ArrayList<>();
	

	public Heroe(String nombre, float presupuestoMens) {
		this.nombre = nombre;
		this.presupuestoMens = presupuestoMens;
	}
	
	
	public boolean masdeTres() {
		return true;
		
	}
	
	public boolean llegaaFindeMesoNo() {
		return true;
	}
	
	public boolean asistentesBienPagados() {
		for(Asistente a: asistentes) {
			if(a.buenSueldo()) {
			}
		}
		return true;
	}
	
	public String getNombre() {
		return nombre;
	}


	public void setNombre(String nombre) {
		this.nombre = nombre;
	}


	public float getPresupuestoMens() {
		return presupuestoMens;
	}


	public void setPresupuestoMens(float presupuestoMens) {
		this.presupuestoMens = presupuestoMens;
	}


	public ArrayList<Asistente> getAsistentes() {
		return asistentes;
	}


	public void setAsistentes(ArrayList<Asistente> asistentes) {
		this.asistentes = asistentes;
	}



	
	

	
	
}
