package Recorridos;

public class recorridoMedio extends recorrido {
	protected boolean descendiente;
	protected boolean ascendente;
	protected double indice;
	
	public recorridoMedio(float distancia, int puntaje, float indice) {
		super(distancia, puntaje);
		this.indice = indice;
	}
	
	
	public boolean esDescendiente() {
		if(descendiente == true && ascendente == false) {
			return true;
		}
		return false;
	}
	
	public boolean esAscendente() {
		if(descendiente == false && ascendente == true) {
			return true;
		}
		return false;
	}
	
	public double puntajeMedioAsc() {
		setPuntaje(1);
		setIndice(1.5);
		return getPuntaje() + indice; 
	}
	
	
	public double puntajeMedioDesc() {
		setPuntaje(1);
		setIndice(0.5);
		return getPuntaje() + indice; 
	}
	
	public double tiempoEstimadoMedioAsc() {
		setDistancia(250);
		return (getDistancia() / 25) * indice;
	}
	
	public double getIndice() {
		return indice;
	}
	public void setIndice(double d) {
		this.indice = d;
	}
}
