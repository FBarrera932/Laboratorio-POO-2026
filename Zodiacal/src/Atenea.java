import java.util.ArrayList;
public class Atenea {
	private ArrayList<Caballero> caballeros = new ArrayList<>();
	
	
	public void cargarCaballeros(Caballero caballero) {
		
	}
	
	public Caballero posibleHades(){
		Caballero caballeroMaligno = caballeros.get(0);
		for(Caballero c: caballeros) {
			if(c.getNivelMaldad() < caballeroMaligno.getNivelMaldad()) {
				caballeroMaligno = c;
			}
		}
		return caballeroMaligno;
	}
	
	public float porcentajePrecoz() {
		int contador = 0;
		for(Caballero c: caballeros) {
			if(c.esPrecoz() == true) {
				contador ++;
			}
		}
		return((contador * 100) / caballeros.size());
	}
	
	
	public ArrayList<Caballero> caballerosPoderosos(){
		
		ArrayList<Caballero> caballerosdeDorado = new ArrayList<>();
		
		for(Caballero c: caballeros) {
			if(c.esDorado() == true && c.esPrecoz() == true) {
				caballerosdeDorado.add(c);
			}
		}
		return caballerosdeDorado;
	}
	
	
	public ArrayList<Caballero> getCaballeros() {
		return caballeros;
	}


	public void setCaballeros(ArrayList<Caballero> caballeros) {
		this.caballeros = caballeros;
	}
	
}
