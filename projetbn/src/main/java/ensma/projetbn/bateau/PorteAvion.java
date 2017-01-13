package ensma.projetbn.bateau;

import edirection.EDirection;
import ensma.projetbn.bateau.exception.OutOfBounds;
import ensma.projetbn.casebateau.CaseBateau;
import ensma.projetbn.grille.GrilleJoueur;
import ensma.projetbn.tir.TirClassique;

public class PorteAvion extends Bateau{

	public PorteAvion(GrilleJoueur g, int x, int y, EDirection dir)
	throws OutOfBounds
	{
		int t=4;
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
		else{
		taille=5;
		
		grille=g;
		
		CaseBateau case1=new CaseBateau(x, y,taille,this);
		CaseBateau case2=new CaseBateau(x+ajoutX, y+ajoutY,taille,this);
		CaseBateau case3=new CaseBateau(x+ajoutX*2, y+ajoutY*2,taille,this);
		CaseBateau case4=new CaseBateau(x+ajoutX*3, y+ajoutY*3,taille,this);
		CaseBateau case5=new CaseBateau(x+ajoutX*4, y+ajoutY*4,taille,this);
		
		cases= new CaseBateau[taille];
		
		cases[0]=case1;
		cases[1]=case2;
		cases[2]=case3;
		cases[3]=case4;
		cases[4]=case5;
		
		tir=new TirClassique(this);
		
		degatAttaque=taille;
		}
	}
}
