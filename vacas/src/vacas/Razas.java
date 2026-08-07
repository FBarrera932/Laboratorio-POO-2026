package vacas;

public enum Razas {
	PROPAGANDA(1),
	PASTOREO(2),
	PURA(5);
	
	int multiProduccion;
	
	Razas(int multiProduccion){
		this.multiProduccion = multiProduccion;
	}
	
}
