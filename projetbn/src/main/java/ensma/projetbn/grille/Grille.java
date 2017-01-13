package ensma.projetbn.grille;

import ensma.projetbn.joueur.Joueur;

public abstract class Grille {

	protected int taille=10;
	protected Joueur joueur;

	public int getTaille() {
		return taille;
	}

	public Joueur getJoueur() {
		return joueur;
	}

	public void setJoueur(Joueur joueur) {
		this.joueur = joueur;
	}

	public void setTaille(int taille) {
		this.taille = taille;
	}
	
}
