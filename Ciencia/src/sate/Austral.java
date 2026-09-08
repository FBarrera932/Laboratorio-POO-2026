package sate;

public final class Austral extends SateliteCiencia{

	public Austral(String metodoDePropulsion, int cantAntenas, double capacidadCarga, Posicion posicion, int masaBase,
			TipoPanel panel, int medidorCiencia) {
		super(metodoDePropulsion, cantAntenas, capacidadCarga, posicion, masaBase, panel, medidorCiencia);
		cargarDatos();
	}
	public void cargarDatos() {
		this.cantAntenas=4;
		this.metodoDePropulsion="ciclo ottoo espacial";
		this.posicion= new Posicion(4000,3400,700);
		this.panel=TipoPanel.PSEUDOTRANSFERENCIA;
		this.capacidadCarga=5781464416f;
	}
}
