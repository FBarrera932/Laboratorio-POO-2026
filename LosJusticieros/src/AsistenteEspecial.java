
public class AsistenteEspecial extends Asistente {

	public AsistenteEspecial(String nombre, float sueldoBase) {
		super(nombre, sueldoBase);
	}
	
	
	public float sueldo() {
		return getSueldoBase() * 1.2f;
	}
}
