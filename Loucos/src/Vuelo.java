
public class Vuelo {
	
	private int capacidadPasajeros;
	private int consumoCombustible;
	private Persona[] vueloconPasajeros = new Persona[capacidadPasajeros];
	
	public Vuelo (int capacidadPasajeros, int consumoCombustible) {
		this.capacidadPasajeros = capacidadPasajeros;
		this.consumoCombustible = consumoCombustible;
	}
	public Vuelo() {
		
	}
	
	public float costoVuelo() {
		return 1;
	}
	
	public int getcapacidadPasajeros() {
		return capacidadPasajeros;
	}
	
	public int getconsumoCombustible() {
		return consumoCombustible;
	}

	public boolean masde60Minutos() {
		
		for (Persona p: vueloconPasajeros) {
			if(p.getMinutosEspera() > 60) {
				return true;
			}
			
		}
		return false;
	
	}
	public boolean 	menosde100Pasajeros() {
		if (capacidadPasajeros < 100) {
			return true;
		}
		else return false;
	}
	
	public boolean estaDemorado() {
		if(masde60Minutos() == true) {
			return true;
		}
		else {
			return false;
		}
	}
	
	
	
	
}	
