package muebles;

import enumeradores.Calidad;
import enumeradores.Material;
import enumeradores.habilidades.Habilidad;
import util.Posicion;

public abstract class MuebleEjercicio extends Mueble{

	private Habilidad habilidadAEntrenar;
	protected float multiplicadorCalidad;
	
	public MuebleEjercicio(Posicion pos, String nombre, Material materialPrincipal, Calidad calidad, Habilidad habilidadAEntrenar) {
		super(pos, nombre, materialPrincipal, calidad);
		determinarMultiplicador();

	}
	
	
	private void determinarMultiplicador() {
		switch (calidad) {
		case MALA: {
			multiplicadorCalidad = 0.9f;
		}
		case BUENA:{
			multiplicadorCalidad = 1;
		}
		case EXCELENTE:{
			multiplicadorCalidad = 1.1f;
		}

	}
}
}
