package sate;

public final class Pampa32 extends SateliteComunicacion{

	public Pampa32(String metodoDePropulsion, int cantAntenas, double capacidadCarga, Posicion posicion, int masaBase,
			TipoPanel panel) {
		super(metodoDePropulsion, cantAntenas, capacidadCarga, posicion, masaBase, panel);
		cargarDatos();
	}
	public void cargarDatos() {
		this.cantAntenas=7;
		this.metodoDePropulsion="retropropulsor plasmático";
		this.posicion= new Posicion(35,56,200);
		this.panel=TipoPanel.ANTIPARALELO;
		this.capacidadCarga=4246861544f;
	}
}
