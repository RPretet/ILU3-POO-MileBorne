package cartes;

public abstract class Carte {
	private int nombre;
	
	public int getNombre() {
		return nombre;
	}

	public Carte(int nombre) {
		this.nombre = nombre;
	}
}
