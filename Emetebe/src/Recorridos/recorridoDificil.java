package Recorridos;

public class recorridoDificil extends recorrido {
	protected int obstaculos = 20;

	public recorridoDificil(float distancia, int puntaje) {
		super(distancia, puntaje);

	}
	
	public float tiempoEstimadoDificil() {
		setDistancia(400);
		return (getDistancia() / 20) * obstaculos;
	}
	
	public double puntajeDificil() {
		return getDistancia() * 0.5;
	}
}
