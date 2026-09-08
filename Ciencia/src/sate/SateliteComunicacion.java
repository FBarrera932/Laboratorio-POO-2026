package sate;

public abstract class SateliteComunicacion extends Satelite {
	
	
	public SateliteComunicacion(String metodoDePropulsion, int cantAntenas, double capacidadCarga, Posicion posicion,
			int masaBase, TipoPanel panel) {
		super(metodoDePropulsion, cantAntenas, capacidadCarga, posicion, masaBase, panel);
	}

	public double enrutarComunicaciones() {
		return capacidadCarga/10000000000f;
	}
	
	@Override
	public double cargarEnergia() {
		return 1000000000f*multiPanel();
	}
}
