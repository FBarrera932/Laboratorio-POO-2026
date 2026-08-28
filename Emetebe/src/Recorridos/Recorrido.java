package Recorridos;

public abstract class Recorrido {
	protected float distancia;
	protected float puntos;
	
	
	
	public Recorrido(float distancia, float puntos) {
		this.distancia = distancia;
		this.puntos = puntos;
		
	}
	
	
	
	public float getDistancia() {
		return distancia;
	}

	public void setDistancia(float distancia) {
		this.distancia = distancia;
	}



	public float getPuntos() {
		return puntos;
	}



	public void setPuntos(float puntos) {
		this.puntos = puntos;
	}
	
	
}
