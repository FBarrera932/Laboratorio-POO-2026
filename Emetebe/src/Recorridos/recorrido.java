package Recorridos;

public abstract class recorrido {
	protected float distancia;
	protected int puntaje;
	
	
	
	public recorrido(float distancia, int puntaje) {
		this.distancia = distancia;
		this.puntaje = puntaje;
	}
	
	
	
	public float getDistancia() {
		return distancia;
	}

	public void setDistancia(float distancia) {
		this.distancia = distancia;
	}



	public int getPuntaje() {
		return puntaje;
	}



	public void setPuntaje(int puntaje) {
		this.puntaje = puntaje;
	}
	
}
