import java.util.ArrayList;
public class Clan {
public Clan (ArrayList<Jugador> losjugadores) {
	this.losjugadores = losjugadores;
}
	ArrayList<Jugador> losjugadores = new ArrayList<>();
	
	public ArrayList<Jugador> losVeteranos(){
		for (Jugador j: losjugadores) {
			if(j.esVeterano() == true) {
				losjugadores.add(j);
			}
		}
		return losjugadores;
	}
	public ArrayList<Jugador> muchaPlata(){
		for (Jugador j: losjugadores) {
			if(j.paytoWin() == true) {
				losjugadores.add(j);
				
			}
		}
		return losjugadores;
	}
	public int losNovatos(){

		int cantidadnovatos = 0;
		for(Jugador j: losjugadores) {
			if(j.esNovato() == true) {
				cantidadnovatos++;
			}
		}
		return cantidadnovatos;
	}
	
	public ArrayList<Jugador> losTanques(){
		for(Jugador j: losjugadores) {
			if(j.esTanque() == true) {
				losjugadores.add(j);
			}
		}
		return losjugadores;
	}
	
	public boolean glassCanon() {
		for(Jugador j: losjugadores) {
			if(j.glassCanon() == true) {
				return true;
			}
		}
		return true;
	}
	
	public ArrayList<Jugador> losAsesinos(){
		for (Jugador j: losjugadores) {
			if((j.esNinja() == true || j.esStriker() == true) && j.bienPreparao() == true) {
				losjugadores.add(j);
			}
		}
		return losjugadores;
	}
}
