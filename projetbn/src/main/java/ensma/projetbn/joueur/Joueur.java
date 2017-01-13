package ensma.projetbn.joueur;

import ensma.projetbn.grille.GrilleAdverse;
import ensma.projetbn.grille.GrilleJoueur;

public abstract class Joueur {

	protected Joueur adversaire;
	protected GrilleJoueur grilleJoueur;
	protected GrilleAdverse grilleAdverse;
	protected int nombreTourAPasser=0;
	protected int nbEchecConsecutifs=0;
	
	
	public Joueur()
	{
		grilleJoueur= new GrilleJoueur(this);
		grilleAdverse= new  GrilleAdverse(this);
	}
	
	
	public GrilleJoueur getGrilleJoueur() {
		return grilleJoueur;
	}
	public void setGrilleJoueur(GrilleJoueur grilleJoueur) {
		this.grilleJoueur = grilleJoueur;
	}
	public GrilleAdverse getGrilleAdverse() {
		return grilleAdverse;
	}
	public void setGrilleAdverse(GrilleAdverse grilleAdverse) {
		this.grilleAdverse = grilleAdverse;
	}
	public Joueur getAdversaire() {
		return adversaire;
	}
	public void setAdversaire(Joueur adversaire) {
		this.adversaire = adversaire;
	}
	

	
}
