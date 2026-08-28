package Recorridos;

public class RecorridoMedio extends Recorrido {
	protected boolean descendiente;
	protected boolean ascendente;
	protected double indice;
	
	public RecorridoMedio(float distancia, float puntos, float indice) {
		super(distancia, puntos);
		this.indice = indice;
	}
	//Verificar si es Ascendente o descendiente
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
	//----------------------------------------------------------
	
	//Asignarle valor a los indices de Ascendente y Descendiente
	public double indiceAsc() {
		setIndice(1.5);
		return indice;
	}
	
	public double indiceDesc() {
		setIndice(0.5);
		return indice;
	}
	//------------------------------
	
	//Calcular los puntos de Ascendente y Descendiente
	public double puntajeMedioAsc() {
		setPuntos(1);
		return getPuntos() + indiceAsc();
	}
	
	public double puntajeMedioDesc() {
		 setPuntos(1);
		 return getPuntos() + indiceDesc();
	}
	//----------------------------------------------------
	
	//Calcular el tiempo estimado de Ascendente y Descendiente
	public double tiempoEstimadoMedioAsc() {
		return (getDistancia() / 25) * indiceAsc();
	}
	
	public double tiempoEstimadoMedioDesc() {
		return (getDistancia() / 25) * indiceDesc();
	}
	//--------------------------------------------------------
	
	public double getIndice() {
		return indice;
	}
	public void setIndice(double d) {
		this.indice = d;
	}
}
