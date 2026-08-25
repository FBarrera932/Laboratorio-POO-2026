package principal;
import enumeradores.Zona;
import enumeradores.habilidades.Habilidad;

public class Jugador {

	private float fuerza;
	private float resistencia;
	private float inteligencia;
	private float social;
	private Zona zona;
	
	public Jugador(float fuerza, float resistencia, float inteligencia, float social) {
		this.fuerza = fuerza;
		this.resistencia = resistencia;
		this.inteligencia = inteligencia;
		this.social = social;
	}
	
	public float getFuerza() {
		return fuerza;
	}

	public void setFuerza(float fuerza) {
		System.out.println("Se modifica la fuerza");
		this.fuerza = fuerza;
	}

	public float getResistencia() {
		return resistencia;
	}

	public void setResistencia(float resistencia) {
		this.resistencia = resistencia;
	}

	public float getInteligencia() {
		return inteligencia;
	}

	public void setInteligencia(float inteligencia) {
		this.inteligencia = inteligencia;
	}

	public float getSocial() {
		return social;
	}

	public void setSocial(float social) {
		this.social = social;
	}
	
}
