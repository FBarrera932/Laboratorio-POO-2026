
public class Prueba1 {
	public static void main(String [] args) {
		int [] [] m1 = new int[15] [4];
		int aux = 0;
		for (int x = 0; x < 4; x++) {
			aux = aux + m1[1][x];
			for (int y = 0; y < 15; y++) {
				aux = aux + m1[x][y];
				
			}	
		}
		
		
	}
}
