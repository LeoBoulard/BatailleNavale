package ensma.projetbn.bateau;

import ensma.projetbn.bateau.exception.OutOfBounds;
import ensma.projetbn.casebateau.CaseBateau;
import ensma.projetbn.grille.GrilleJoueur;
import ensma.projetbn.tir.TirNul;

public class Voilier extends Bateau{
	
	
	public Voilier(GrilleJoueur g, int x,int y) 
			throws OutOfBounds
	{
		if (x>=g.getTaille()||x<0||
				y>=g.getTaille()||y<0)
		{
			throw new OutOfBounds();
		}
		else 
		{
		
		taille=1;
		
		grille=g;
		
		CaseBateau case1=new CaseBateau(x, y,4,this);
	
		
		cases= new CaseBateau[taille];
		
		cases[0]=case1;


		tir=new TirNul(this);
		
		degatAttaque=0;
		
		}
}
}
