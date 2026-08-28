package Recorridos;

public class RecorridoDificil extends Recorrido {
	protected int obstaculos = 20;

	public RecorridoDificil(float distancia, float puntos, int obstaculos) {
		super(distancia, puntos);
		this.obstaculos = obstaculos;

	}
	
	
	public float tiempoEstimadoDificil() {
		setDistancia(400);
		return (getDistancia() / 20) * obstaculos;
	}
	
	public double puntajeDificil() {
		return getDistancia() * 0.5;
	}
}
