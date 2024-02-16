package cartes;

public class Parade extends Bataille {

	public Parade(int nombre, Type t) {
		super(nombre, t);
		// TODO Auto-generated constructor stub
	}
	
	public String toString() {
		String parade = "";
		switch (getType()) {
		case FEU:
			parade = ("Feu Vert");
			break;
		case ESSENCE:
			parade = ("Essence");
			break;
		case CREVAISON:
			parade = ("Roue de Secours");
			break;
		case ACCIDENT:
			parade = ("Réparations");
			break;
		default:
			break;
		}
		return parade;
	}

}
