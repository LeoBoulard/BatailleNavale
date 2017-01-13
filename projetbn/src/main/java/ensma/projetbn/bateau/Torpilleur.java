package ensma.projetbn.bateau;

import ensma.projetbn.casebateau.CaseBateau;
import ensma.projetbn.grille.GrilleJoueur;
import ensma.projetbn.tir.TirClassique;
import ensma.projetbn.bateau.exception.*;

public class Torpilleur extends Bateau{

	
	public Torpilleur(GrilleJoueur g, int x,int y) 
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
		
		CaseBateau case1=new CaseBateau(x, y,taille,this);
	
		
		cases= new CaseBateau[taille];
		
		cases[0]=case1;


		tir=new TirClassique(this);
		
		degatAttaque=taille;
		
		}
}
}
