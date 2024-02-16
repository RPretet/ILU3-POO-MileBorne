package cartes;

public class Attaque extends Bataille {

	public Attaque(int nombre, Type t) {
		super(nombre, t);
		// TODO Auto-generated constructor stub
	}
	
	public String toString() {
		String attaque ="";
		switch (getType()) {
		case FEU:
			attaque = ("Feu Rouge");
			break;
		case ESSENCE:
			attaque = ("Panne d'Essence");
			break;
		case CREVAISON:
			attaque = ("Crevaison");
			break;
		case ACCIDENT:
			attaque = ("Accident");
			break;
		default:
			break;
		}
		return attaque;
	}

}
