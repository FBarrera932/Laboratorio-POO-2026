package sate;

public final class Chacra extends SateliteComunicacion {

	public Chacra(String metodoDePropulsion, int cantAntenas, double capacidadCarga, Posicion posicion, int masaBase,
			TipoPanel panel) {
		super(metodoDePropulsion, cantAntenas, capacidadCarga, posicion, masaBase, panel);
		cargarDatos();
	}
	public void cargarDatos() {
		this.cantAntenas=9;
		this.metodoDePropulsion="retropropulsor plasmático";
		this.posicion= new Posicion(1080,1068,500);
		this.panel=TipoPanel.MAGNETICATEJIDA;
		this.capacidadCarga=214483648 + 1;
	}
}
