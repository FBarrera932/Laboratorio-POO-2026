package Recorridos;

public class RecorridoFacil extends Recorrido {

	public RecorridoFacil(float distancia, float puntos) {
		super(distancia, puntos);
		this.puntos = puntos;
	}
	
	public float tiempoEstimadoFacil() {
		setDistancia(100);
		return distancia / 30; 
	}
	
	public float puntosFacil() {
		setPuntos(1);
		return getPuntos();
	}
}
