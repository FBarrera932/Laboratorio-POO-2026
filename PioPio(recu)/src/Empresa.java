import java.util.ArrayList;

public class Empresa {
	private ArrayList<Corral> loscorrales = new ArrayList<>();
	
	public Empresa(ArrayList<Corral> loscorrales) {
		this.loscorrales = loscorrales;
	}        
	 
	 public Corral mostrarAreadeCorralconAreaMaxima(){
		 Corral corralSupremo = null; //creo un corral temporal de area maxima area
		 
		 for(Corral c: loscorrales) {
			 corralSupremo = loscorrales.get(0); //lo establezco en la posicion 0 de la ArrayList "loscorrales"
			 if(c.getCapacidad() > corralSupremo.getCapacidad()) { // si la capacidad del corral temporal es
				 //menor a la de algún otro corral, se intercalan los roles y se renombra un nuevo "corralSupremo"
				 c = corralSupremo;
			 }
		 }
		 return corralSupremo;
	 }
	 public float conseguirProdRecaudada() {
		 for(Corral c: loscorrales) {
			  	
		 }
		return 1;
		
	 }
	 public int cantidaddeAvestrucesTotales() {
		 int cuantasAvestruces = 0;
		 for(Corral c: loscorrales) {
			 
		 }
		 return cuantasAvestruces;
	 }
	 
}
