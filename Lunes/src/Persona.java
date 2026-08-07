
public class Persona {
		private int probabilidadLluvia;
		private int minutosDormidos;
		
		public Persona (int minutosDormidos, int probabilidadLluvia) {
			this.minutosDormidos = minutosDormidos;
			this.setProbabilidadLluvia(probabilidadLluvia);
		}
		
		public boolean sigodurmiendo(int probabilidadLluvia) {
			return probabilidadLluvia>=90;
			
		}
		public void aplazarAlarma (int minutosDurmiendo) {
			minutosDormidos += minutosDurmiendo;
		}
		
		public boolean masLunesImposible (int sigoDurmiendo) {
				return (minutosDormidos < 120); 
				
		}
		public int getminutosDormidos() {
			return minutosDormidos;
		}

		public int getProbabilidadLluvia() {
			return probabilidadLluvia;
		}

		public void setProbabilidadLluvia(int probabilidadLluvia) {
			this.probabilidadLluvia = probabilidadLluvia;
		}
		
		
}
