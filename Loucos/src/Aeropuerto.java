import java.util.ArrayList;
public class Aeropuerto {
	public Aeropuerto (ArrayList<Vuelo> losVuelos) {
			this.losVuelos = losVuelos;
		}
		
ArrayList<Vuelo> losVuelos = new ArrayList<>();	
		
	public ArrayList<Vuelo> lowCost(){
		for(Vuelo v: losVuelos) {
			if(v.menosde100Pasajeros() == true && v.estaDemorado() == true) {
					losVuelos.add(v);
				}
			}
		return losVuelos;
		}
	public float recaudacionTotal() {
		for(Vuelo v: losVuelos) {
				return (v.costoVuelo());
			}
			return 1;
		}
	}

