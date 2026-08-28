package principal;
import Recorridos.Recorrido;

public class Ciclista {
	private float velocidadProm;
	private Recorrido susrecorridos;
	private float puntaje;
	
	
	
	

	public boolean menosde2H() {
		if((susrecorridos.getDistancia() / velocidadProm) > 2) {
			return true;
		}
		return false;
	}
	
	
	public float getVelocidadProm() {
		return velocidadProm;
	}

	public void setVelocidadProm(float velocidadProm) {
		this.velocidadProm = velocidadProm;
	}


	public Recorrido getSusrecorridos() {
		return susrecorridos;
	}


	public void setSusrecorridos(Recorrido susrecorridos) {
		this.susrecorridos = susrecorridos;
	}
	
	public float getPuntaje() {
		return puntaje;
	}


	public void setPuntaje(float puntaje) {
		this.puntaje = puntaje;
	}

	
}
