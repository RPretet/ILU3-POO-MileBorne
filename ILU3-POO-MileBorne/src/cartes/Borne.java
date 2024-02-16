package cartes;

public class Borne extends Carte {
	private int km;

	public Borne(int nombre, int km) {
		super(nombre);
		// TODO Auto-generated constructor stub
	}
	
	public int getKm() {
		return km;
	}

	public String toString() {
		String borne = (km + " Bornes");
		return borne;
	}

}
