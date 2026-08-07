
public class Corral {
		private Ave[] lasaves;
		private int Superficie;
		private float capacidad = Superficie/2;
		
		public Corral(Ave [] lasaves, int Superficie, float capacidad) {
			this.lasaves = lasaves;
			this.Superficie = Superficie;
			this.capacidad = capacidad;
		}
		
		//separo los corrales que tienen avestruces de los corrales que tienen gallinas
/*		
		public Ave[] corralsingallinas() {
			for(Ave a: lasaves) {
			
			}
		}
	*/	
		public float cantidadProduccion() {
			return 1;
		}
		
		
		public float getCapacidad() {
			return capacidad;
		}
		public void setCapacidad(float capacidad) {
			this.capacidad = capacidad;
		}
		public Ave[] getLasaves() {
			return lasaves;
		}
		public void setLasaves(Ave[] lasaves) {
			this.lasaves = lasaves;
		}
}
