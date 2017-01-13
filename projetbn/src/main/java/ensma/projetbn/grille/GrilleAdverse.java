package ensma.projetbn.grille;

import ensma.projetbn.cases.CaseAdverse;
import ensma.projetbn.joueur.Joueur;

public class GrilleAdverse extends Grille {

	
	private CaseAdverse[][] cases;
	
	public GrilleAdverse(Joueur j)
	{
		cases=new CaseAdverse[taille][taille];
		joueur=j;
	}
	
	public void draw()
	{
		
	}
}
