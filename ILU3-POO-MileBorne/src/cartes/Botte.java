package cartes;

public class Botte extends Probleme {

	public Botte(int nombre, Type t) {
		super(nombre, t);
		// TODO Auto-generated constructor stub
	}
	
	public String toString() {
		String botte = "";
		switch (getType()) {
		case FEU:
			botte = ("Vehicule Prioritaire");
			break;
		case ESSENCE:
			botte = ("Citerne d'Essence");
			break;
		case CREVAISON:
			botte = ("Increvable");
			break;
		case ACCIDENT:
			botte = ("As du Volant");
			break;
		default:
			break;
		}
		return botte;
	}

}
