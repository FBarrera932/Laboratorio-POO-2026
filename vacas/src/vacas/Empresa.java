package vacas;

import java.util.ArrayList;

public class Empresa {
	private ArrayList<Tambo> lostambos = new ArrayList<>();

	
	public Empresa() {
		
	}
	//Método que devuelve el tambo con máxima area 
	public Tambo AreadeTamboMaxima() {
		Tambo tamboSupremo = lostambos.get(0); 
		for(Tambo t: lostambos) {
			if(t.getCapacidad() < tamboSupremo.getCapacidad()) {
				tamboSupremo = t;
			}
		}
		System.out.println(tamboSupremo.getCapacidad());
		return tamboSupremo;
	}
	//Método que devuelve la vaca mayor productora de todos los tambos
	public Tambo VacaMayorProductora() {
		Tambo tamboMasProductor = lostambos.get(0); //creamos el tambo más productor y lo posicionamos en la posicion 0
		for(Tambo t: lostambos) {
			// en el caso de que haya un tambo que produzca más que el ya establecido como "más productor", se intercalan los roles
			if(t.VacamasProductora().producirLeche() < tamboMasProductor.VacamasProductora().producirLeche()) { 
				tamboMasProductor = t;
			}
		}
		return tamboMasProductor;
	}
	

	
	public ArrayList<Tambo> getLostambos() {
		return lostambos;
	}

	public void setLostambos(ArrayList<Tambo> lostambos) {
		this.lostambos = lostambos;
	}
	
	
}
