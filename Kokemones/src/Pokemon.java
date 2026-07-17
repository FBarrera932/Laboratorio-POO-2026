
public abstract class Pokemon {
	public float vida;
	public int def;
	public int nivel;
	
	
	public Pokemon(float vida, int def, int nivel) {
		this.def = def;
		this.nivel = nivel;
		this.vida = vida;
	}
	
	public void evolucionar() {
		System.out.println("!Tu pokemon está evolucionando!");
	}
	public void atacar() {
		System.out.println("Atacar");
	}
	

}
