package ensma.projetbn.bateau;

import edirection.EDirection;
import ensma.projetbn.bateau.exception.OutOfBounds;
import ensma.projetbn.casebateau.CaseBateau;
import ensma.projetbn.grille.GrilleJoueur;
import ensma.projetbn.tir.TirClassique;
public class SousMarin extends Bateau{

	
	public SousMarin(GrilleJoueur g, int x,int y,EDirection dir) throws OutOfBounds
	{

		int t=1;
		int ajoutX=0;
		int ajoutY=0;
		if (dir==EDirection.haut)ajoutX=-1;
		if (dir==EDirection.bas) ajoutX=1;
		if (dir==EDirection.gauche) ajoutY=-1;
		if (dir==EDirection.droite) ajoutY=1;
		
		if (x>=g.getTaille()||x<0||
				y>=g.getTaille()||y<0||
				x+ajoutX*t>=g.getTaille()||x+ajoutX*t<0||
				y+ajoutY*t>=g.getTaille()||y+ajoutY*t<0
			)
		{
			throw new OutOfBounds();
		}
		else
		{
		
		taille=2;
		
		grille=g;
		
		CaseBateau case1=new CaseBateau(x, y,taille,this);
		CaseBateau case2=new CaseBateau(x+ajoutX, y+ajoutY,taille,this);
	
		
		cases= new CaseBateau[taille];
		
		cases[0]=case1;
		cases[1]=case2;
	
	
		tir=new TirClassique(this);
		
		degatAttaque=taille;
			
		}
}
}
