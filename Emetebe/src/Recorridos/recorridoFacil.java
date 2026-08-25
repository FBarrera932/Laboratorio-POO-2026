package Recorridos;

public class recorridoFacil extends recorrido {

	public recorridoFacil(float distancia, int puntaje) {
		super(distancia, puntaje);
		
	}
	
	public float tiempoEstimadoFacil() {
		setDistancia(100);
		return distancia / 30; 
	}
	
	public void puntajeFacil() {
		setPuntaje(1);
		return;
	}
	
}
