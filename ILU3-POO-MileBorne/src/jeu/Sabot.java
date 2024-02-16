package jeu;

import cartes.Carte;

public class Sabot {
	private int nbCartes;
	private Carte[] sabot;
	
	public Sabot(int nbCartes, Carte[] sabot) {
		this.nbCartes = nbCartes;
		sabot = sabot;
	}
	
	public boolean estVide() {
		return nbCartes==0;
	}
	
	private void ajouterCarte(Carte carte) {
		sabot[nbCartes] = carte;
		nbCartes++;
	}
	
	public void ajouterFamilleCarte(Carte carte) {
		
	}

}
