package ensma.projetbn.grille;

import ensma.projetbn.bateau.Bateau;
import ensma.projetbn.cases.CaseJoueur;
import ensma.projetbn.joueur.Joueur;

public class GrilleJoueur extends Grille {

	private CaseJoueur[][] cases;
	private Bateau[] bateaux;
	
	public GrilleJoueur(Joueur j)
	{
		cases= new CaseJoueur[taille][taille];
		joueur=j;
	}
	
	
	
	public void draw()
	{
	}

	public CaseJoueur[][] getCases() {
		return cases;
	}

	public void setCases(CaseJoueur[][] cases) {
		this.cases = cases;
	}

	public Bateau[] getBateaux() {
		return bateaux;
	}

	public void setBateaux(Bateau[] bateaux) {
		this.bateaux = bateaux;
	}
	
	
	
}
