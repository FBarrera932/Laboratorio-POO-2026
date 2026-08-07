
public enum Tipoave {
	POLLITO(0),
	GALLINA(2),
	AVESTRUZ(20);
	// enumerador complejo
	int multiProduccion;
	
	Tipoave (int multiproduccion) {
		this.multiProduccion = multiproduccion;
	}
}
