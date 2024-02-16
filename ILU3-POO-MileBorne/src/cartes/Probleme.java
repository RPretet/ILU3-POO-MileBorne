package cartes;

public abstract class Probleme extends Carte {
	
	private Type type;
	public static enum Type {
		FEU,ESSENCE,CREVAISON,ACCIDENT
	}

	public Probleme(int nombre, Type t) {
		super(nombre);
		// TODO Auto-generated constructor stub
	}

	public Type getType() {
		return type;
	}
	
	

}
