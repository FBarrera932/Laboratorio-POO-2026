import java.util.ArrayList;

	public class SalonJusticia {
		private ArrayList<Heroe> salon = new ArrayList<>();

	public ArrayList<Heroe> heroesmasdeTres(){
		ArrayList<Heroe> heroesmasdetres = new ArrayList<>();
		for(Heroe h: salon) {
			if(h.masdeTres()) {
				heroesmasdetres.add(h);
			}
		}
		return heroesmasdetres;
	}
	
	public ArrayList<Heroe> heroesquenoLlegan(){
		ArrayList<Heroe> heroesquenoLlegan = new ArrayList<>();
		
		for(Heroe h: salon) {
			if(h.llegaaFindeMesoNo()) {
				heroesquenoLlegan.add(h);
			}
		}
		return heroesquenoLlegan;
	}
		
	public ArrayList<Heroe> asistentesconPlata(){
		ArrayList<Heroe> asistentesconPlata = new ArrayList<>();
		
		for(Heroe h: salon) {
			if(h.asistentesBienPagados()) {
				asistentesconPlata.add(h);
			}
		}
		return asistentesconPlata;
	}
		
		public float presupuestoTotal() {
			for(Heroe h: salon) {
				if()
			}
		}
		
		
		public ArrayList<Heroe> getSalon() {
			return salon;
		}

		public void setSalon(ArrayList<Heroe> salon) {
			this.salon = salon;
		}
}
