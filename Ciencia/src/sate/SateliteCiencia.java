package sate;

public abstract class SateliteCiencia extends Satelite{
	
	public SateliteCiencia(String metodoDePropulsion, int cantAntenas, double capacidadCarga, Posicion posicion,
			int masaBase, TipoPanel panel, int medidorCiencia) {
		super(metodoDePropulsion, cantAntenas, capacidadCarga, posicion, masaBase, panel);
		this.medidorCiencia = medidorCiencia;
	}
	protected int medidorCiencia;
	
	public int getMedidorCiencia() {
		return medidorCiencia;
	}
	public void setMedidorCiencia(int medidorCiencia) {
		this.medidorCiencia = medidorCiencia;
	}
	public boolean estaExperimiento() {
		return medidorCiencia>1000000000f && estaHibernando()==false;
	}
	@Override
	public double cargarEnergia() {
		if(estaExperimiento()==true) {
			return  (1000000000f*multiPanel())*0.4f;
		}
		else {
			return 1000000000f*multiPanel();
		}
	}
}
