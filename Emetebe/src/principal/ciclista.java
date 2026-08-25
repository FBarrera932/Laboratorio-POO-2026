package principal;
import Recorridos.recorrido;

public class ciclista {
	private float velocidadProm;
	private recorrido susrecorridos;
	
	
	
	
	public boolean menosde2H() {
		if((susrecorridos.getDistancia() - velocidadProm) > 2) {
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


	public recorrido getSusrecorridos() {
		return susrecorridos;
	}


	public void setSusrecorridos(recorrido susrecorridos) {
		this.susrecorridos = susrecorridos;
	}
	
	
	
}
